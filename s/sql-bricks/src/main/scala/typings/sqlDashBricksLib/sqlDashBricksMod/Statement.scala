package typings
package sqlDashBricksLib.sqlDashBricksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Statement is an abstract base class for all statements (SELECT, INSERT, UPDATE, DELETE)
  * and should never be instantiated directly. It is exposed because it can be used with the
  * instanceof operator to easily determine whether something is a SQL Bricks statement: my_var instanceof Statement.
  */
@js.native
trait Statement extends js.Object {
  /**
    * Returns an object with two properties: a parameterized text string and a values array. The values are populated with anything on the right-hand side
    * of a WHERE criteria,as well as any values passed into an insert() or update() (they can be passed explicitly with val() or opted out of with sql())
    * @param options A placeholder option of '?%d' can be passed to generate placeholders compatible with node-sqlite3 (%d is replaced with the parameter #):
    * @example
    * update('person', {'first_name': 'Fred'}).where({'last_name': 'Flintstone'}).toParams({placeholder: '?%d'});
    *    // {"text": "UPDATE person SET first_name = ?1 WHERE last_name = ?2", "values": ["Fred", "Flintstone"]}
    */
  def toParams(): SqlBricksParam = js.native
  def toParams(options: sqlDashBricksLib.Anon_Placeholder): SqlBricksParam = js.native
}

