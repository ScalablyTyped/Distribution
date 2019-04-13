package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferrableSetImmediate extends DeferrableAbstract {
  /**
    * A property that will trigger an additional query at the beginning of a
    * transaction which sets the constraints to immediately.
    *
    * @param constraints An array of constraint names. Will defer all constraints by default.
    */
  def apply(constraints: js.Array[java.lang.String]): DeferrableSetImmediate = js.native
}

