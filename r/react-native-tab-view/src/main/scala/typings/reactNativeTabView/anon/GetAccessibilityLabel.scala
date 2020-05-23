package typings.reactNativeTabView.anon

import typings.react.mod.global.JSX.Element
import typings.reactNativeTabView.tabBarIndicatorMod.Props
import typings.reactNativeTabView.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccessibilityLabel extends js.Object {
  def getAccessibilityLabel(hasRoute: Scene[typings.reactNativeTabView.typesMod.Route]): js.UndefOr[String]
  def getAccessible(hasRoute: Scene[typings.reactNativeTabView.typesMod.Route]): Boolean
  def getLabelText(hasRoute: Scene[typings.reactNativeTabView.typesMod.Route]): js.UndefOr[String]
  def getTestID(hasRoute: Scene[typings.reactNativeTabView.typesMod.Route]): js.UndefOr[String]
  def renderIndicator(props: Props[typings.reactNativeTabView.typesMod.Route]): Element
}

object GetAccessibilityLabel {
  @scala.inline
  def apply(
    getAccessibilityLabel: Scene[typings.reactNativeTabView.typesMod.Route] => js.UndefOr[String],
    getAccessible: Scene[typings.reactNativeTabView.typesMod.Route] => Boolean,
    getLabelText: Scene[typings.reactNativeTabView.typesMod.Route] => js.UndefOr[String],
    getTestID: Scene[typings.reactNativeTabView.typesMod.Route] => js.UndefOr[String],
    renderIndicator: Props[typings.reactNativeTabView.typesMod.Route] => Element
  ): GetAccessibilityLabel = {
    val __obj = js.Dynamic.literal(getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getAccessible = js.Any.fromFunction1(getAccessible), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), renderIndicator = js.Any.fromFunction1(renderIndicator))
    __obj.asInstanceOf[GetAccessibilityLabel]
  }
}

