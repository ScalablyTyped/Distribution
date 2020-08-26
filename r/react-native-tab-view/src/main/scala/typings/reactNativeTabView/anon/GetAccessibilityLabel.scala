package typings.reactNativeTabView.anon

import typings.react.mod.global.JSX.Element
import typings.reactNativeTabView.tabBarIndicatorMod.Props
import typings.reactNativeTabView.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessibilityLabel extends js.Object {
  def getAccessibilityLabel(hasRoute: Scene[typings.reactNativeTabView.typesMod.Route]): js.UndefOr[String] = js.native
  def getAccessible(hasRoute: Scene[typings.reactNativeTabView.typesMod.Route]): Boolean = js.native
  def getLabelText(hasRoute: Scene[typings.reactNativeTabView.typesMod.Route]): js.UndefOr[String] = js.native
  def getTestID(hasRoute: Scene[typings.reactNativeTabView.typesMod.Route]): js.UndefOr[String] = js.native
  def renderIndicator(props: Props[typings.reactNativeTabView.typesMod.Route]): Element = js.native
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
  @scala.inline
  implicit class GetAccessibilityLabelOps[Self <: GetAccessibilityLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetAccessibilityLabel(value: Scene[typings.reactNativeTabView.typesMod.Route] => js.UndefOr[String]): Self = this.set("getAccessibilityLabel", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAccessible(value: Scene[typings.reactNativeTabView.typesMod.Route] => Boolean): Self = this.set("getAccessible", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLabelText(value: Scene[typings.reactNativeTabView.typesMod.Route] => js.UndefOr[String]): Self = this.set("getLabelText", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTestID(value: Scene[typings.reactNativeTabView.typesMod.Route] => js.UndefOr[String]): Self = this.set("getTestID", js.Any.fromFunction1(value))
    @scala.inline
    def setRenderIndicator(value: Props[typings.reactNativeTabView.typesMod.Route] => Element): Self = this.set("renderIndicator", js.Any.fromFunction1(value))
  }
  
}

