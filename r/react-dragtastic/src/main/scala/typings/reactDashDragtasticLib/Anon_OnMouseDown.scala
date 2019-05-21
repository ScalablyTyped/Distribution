package typings
package reactDashDragtasticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnMouseDown extends js.Object {
  var onMouseDown: reactLib.reactMod.MouseEventHandler[reactLib.Element]
  var onTouchStart: reactLib.reactMod.TouchEventHandler[reactLib.Element]
}

object Anon_OnMouseDown {
  @scala.inline
  def apply(
    onMouseDown: reactLib.reactMod.MouseEventHandler[reactLib.Element],
    onTouchStart: reactLib.reactMod.TouchEventHandler[reactLib.Element]
  ): Anon_OnMouseDown = {
    val __obj = js.Dynamic.literal(onMouseDown = onMouseDown, onTouchStart = onTouchStart)
  
    __obj.asInstanceOf[Anon_OnMouseDown]
  }
}

