package typings
package reactDashSelectLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsWithInnerRef extends js.Object {
  /** The inner reference. */
  var innerRef: reactLib.reactMod.Ref[_]
}

object PropsWithInnerRef {
  @scala.inline
  def apply(innerRef: reactLib.reactMod.Ref[_]): PropsWithInnerRef = {
    val __obj = js.Dynamic.literal(innerRef = innerRef.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PropsWithInnerRef]
  }
}

