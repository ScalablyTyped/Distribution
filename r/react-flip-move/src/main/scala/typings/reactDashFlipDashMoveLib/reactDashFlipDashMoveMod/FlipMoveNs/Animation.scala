package typings
package reactDashFlipDashMoveLib.reactDashFlipDashMoveMod.FlipMoveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends _AnimationProp {
  var from: stdLib.Partial[stdLib.CSSStyleDeclaration]
  var to: stdLib.Partial[stdLib.CSSStyleDeclaration]
}

object Animation {
  @scala.inline
  def apply(from: stdLib.Partial[stdLib.CSSStyleDeclaration], to: stdLib.Partial[stdLib.CSSStyleDeclaration]): Animation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Animation]
  }
}

