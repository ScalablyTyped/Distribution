package typings.reactDashNativeDashTabDashView

import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTabBarIndicatorMod.Props
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.Route
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetAccessibilityLabel extends js.Object {
  def getAccessibilityLabel(hasRoute: Scene[Route]): js.UndefOr[String]
  def getAccessible(hasRoute: Scene[Route]): Boolean
  def getLabelText(hasRoute: Scene[Route]): js.UndefOr[String]
  def getTestID(hasRoute: Scene[Route]): js.UndefOr[String]
  def renderIndicator(props: Props[Route]): Element
}

object Anon_GetAccessibilityLabel {
  @scala.inline
  def apply(
    getAccessibilityLabel: Scene[Route] => js.UndefOr[String],
    getAccessible: Scene[Route] => Boolean,
    getLabelText: Scene[Route] => js.UndefOr[String],
    getTestID: Scene[Route] => js.UndefOr[String],
    renderIndicator: Props[Route] => Element
  ): Anon_GetAccessibilityLabel = {
    val __obj = js.Dynamic.literal(getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getAccessible = js.Any.fromFunction1(getAccessible), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), renderIndicator = js.Any.fromFunction1(renderIndicator))
  
    __obj.asInstanceOf[Anon_GetAccessibilityLabel]
  }
}

