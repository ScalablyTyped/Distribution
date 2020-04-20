package typings.reactNativeTabView

import typings.react.mod._Global_.JSX.Element
import typings.reactNativeTabView.tabBarIndicatorMod.Props
import typings.reactNativeTabView.typesMod.Route
import typings.reactNativeTabView.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetAccessibilityLabel extends js.Object {
  def getAccessibilityLabel(hasRoute: Scene[Route]): js.UndefOr[String]
  def getAccessible(hasRoute: Scene[Route]): Boolean
  def getLabelText(hasRoute: Scene[Route]): js.UndefOr[String]
  def getTestID(hasRoute: Scene[Route]): js.UndefOr[String]
  def renderIndicator(props: Props[Route]): Element
}

object AnonGetAccessibilityLabel {
  @scala.inline
  def apply(
    getAccessibilityLabel: Scene[Route] => js.UndefOr[String],
    getAccessible: Scene[Route] => Boolean,
    getLabelText: Scene[Route] => js.UndefOr[String],
    getTestID: Scene[Route] => js.UndefOr[String],
    renderIndicator: Props[Route] => Element
  ): AnonGetAccessibilityLabel = {
    val __obj = js.Dynamic.literal(getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getAccessible = js.Any.fromFunction1(getAccessible), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), renderIndicator = js.Any.fromFunction1(renderIndicator))
    __obj.asInstanceOf[AnonGetAccessibilityLabel]
  }
}

