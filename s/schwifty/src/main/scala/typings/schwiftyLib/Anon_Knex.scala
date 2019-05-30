package typings
package schwiftyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Knex extends js.Object {
  var knex: (knexLib.knexMod.Knex[_, js.Array[_]]) | knexLib.knexMod.Config
  var migrationsDir: java.lang.String
  var models: js.Array[schwiftyLib.schwiftyMod.ModelClass]
}

object Anon_Knex {
  @scala.inline
  def apply(
    knex: (knexLib.knexMod.Knex[_, js.Array[_]]) | knexLib.knexMod.Config,
    migrationsDir: java.lang.String,
    models: js.Array[schwiftyLib.schwiftyMod.ModelClass]
  ): Anon_Knex = {
    val __obj = js.Dynamic.literal(knex = knex.asInstanceOf[js.Any], migrationsDir = migrationsDir, models = models)
  
    __obj.asInstanceOf[Anon_Knex]
  }
}

