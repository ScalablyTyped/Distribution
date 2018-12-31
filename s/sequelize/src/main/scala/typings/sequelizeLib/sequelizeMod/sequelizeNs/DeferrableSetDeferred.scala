package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferrableSetDeferred extends DeferrableAbstract {
  /**
    * A property that will trigger an additional query at the beginning of a
    * transaction which sets the constraints to deferred.
    *
    * @param constraints An array of constraint names. Will defer all constraints by default.
    */
  def apply(constraints: js.Array[java.lang.String]): DeferrableSetDeferred = js.native
}

