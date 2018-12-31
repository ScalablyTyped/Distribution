package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used for Instance.destroy method
  */
trait InstanceDestroyOptions extends js.Object {
  /**
    * If set to true, paranoid models will actually be deleted
    */
  var force: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[scala.Boolean | js.Function] = js.undefined
  /**
    * Transaction to run the query in
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
}

