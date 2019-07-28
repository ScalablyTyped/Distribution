package typings.reactDashSelect.srcTypesMod

import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsWithInnerRef extends js.Object {
  /** The inner reference. */
  var innerRef: Ref[_]
}

object PropsWithInnerRef {
  @scala.inline
  def apply(innerRef: Ref[_]): PropsWithInnerRef = {
    val __obj = js.Dynamic.literal(innerRef = innerRef.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PropsWithInnerRef]
  }
}

