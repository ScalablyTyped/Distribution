package typings.reactDashFlipDashMove.reactDashFlipDashMoveMod.FlipMoveNs

import typings.std.CSSStyleDeclaration
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends _AnimationProp {
  var from: Partial[CSSStyleDeclaration]
  var to: Partial[CSSStyleDeclaration]
}

object Animation {
  @scala.inline
  def apply(from: Partial[CSSStyleDeclaration], to: Partial[CSSStyleDeclaration]): Animation = {
    val __obj = js.Dynamic.literal(from = from, to = to)
  
    __obj.asInstanceOf[Animation]
  }
}

