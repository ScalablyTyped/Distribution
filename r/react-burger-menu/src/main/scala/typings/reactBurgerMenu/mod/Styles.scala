package typings.reactBurgerMenu.mod

import typings.std.CSSStyleDeclaration
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Styles extends js.Object {
  var bmBurgerBars: Partial[CSSStyleDeclaration]
  var bmBurgerButton: Partial[CSSStyleDeclaration]
  var bmCross: Partial[CSSStyleDeclaration]
  var bmCrossButton: Partial[CSSStyleDeclaration]
  var bmItemList: Partial[CSSStyleDeclaration]
  var bmMenu: Partial[CSSStyleDeclaration]
  var bmMenuWrap: Partial[CSSStyleDeclaration]
  var bmMorphShape: Partial[CSSStyleDeclaration]
  var bmOverlay: Partial[CSSStyleDeclaration]
}

object Styles {
  @scala.inline
  def apply(
    bmBurgerBars: Partial[CSSStyleDeclaration],
    bmBurgerButton: Partial[CSSStyleDeclaration],
    bmCross: Partial[CSSStyleDeclaration],
    bmCrossButton: Partial[CSSStyleDeclaration],
    bmItemList: Partial[CSSStyleDeclaration],
    bmMenu: Partial[CSSStyleDeclaration],
    bmMenuWrap: Partial[CSSStyleDeclaration],
    bmMorphShape: Partial[CSSStyleDeclaration],
    bmOverlay: Partial[CSSStyleDeclaration]
  ): Styles = {
    val __obj = js.Dynamic.literal(bmBurgerBars = bmBurgerBars.asInstanceOf[js.Any], bmBurgerButton = bmBurgerButton.asInstanceOf[js.Any], bmCross = bmCross.asInstanceOf[js.Any], bmCrossButton = bmCrossButton.asInstanceOf[js.Any], bmItemList = bmItemList.asInstanceOf[js.Any], bmMenu = bmMenu.asInstanceOf[js.Any], bmMenuWrap = bmMenuWrap.asInstanceOf[js.Any], bmMorphShape = bmMorphShape.asInstanceOf[js.Any], bmOverlay = bmOverlay.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Styles]
  }
}

