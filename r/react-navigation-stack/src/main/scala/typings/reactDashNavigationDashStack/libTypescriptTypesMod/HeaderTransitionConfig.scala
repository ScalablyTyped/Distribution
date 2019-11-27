package typings.reactDashNavigationDashStack.libTypescriptTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderTransitionConfig extends js.Object {
  var headerBackgroundInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerLayoutInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerLeftButtonInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerLeftInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerLeftLabelInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerRightInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerTitleFromLeftInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerTitleInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
}

object HeaderTransitionConfig {
  @scala.inline
  def apply(
    headerBackgroundInterpolator: /* props */ SceneInterpolatorProps => js.Any = null,
    headerLayoutInterpolator: /* props */ SceneInterpolatorProps => js.Any = null,
    headerLeftButtonInterpolator: /* props */ SceneInterpolatorProps => js.Any = null,
    headerLeftInterpolator: /* props */ SceneInterpolatorProps => js.Any = null,
    headerLeftLabelInterpolator: /* props */ SceneInterpolatorProps => js.Any = null,
    headerRightInterpolator: /* props */ SceneInterpolatorProps => js.Any = null,
    headerTitleFromLeftInterpolator: /* props */ SceneInterpolatorProps => js.Any = null,
    headerTitleInterpolator: /* props */ SceneInterpolatorProps => js.Any = null
  ): HeaderTransitionConfig = {
    val __obj = js.Dynamic.literal()
    if (headerBackgroundInterpolator != null) __obj.updateDynamic("headerBackgroundInterpolator")(js.Any.fromFunction1(headerBackgroundInterpolator))
    if (headerLayoutInterpolator != null) __obj.updateDynamic("headerLayoutInterpolator")(js.Any.fromFunction1(headerLayoutInterpolator))
    if (headerLeftButtonInterpolator != null) __obj.updateDynamic("headerLeftButtonInterpolator")(js.Any.fromFunction1(headerLeftButtonInterpolator))
    if (headerLeftInterpolator != null) __obj.updateDynamic("headerLeftInterpolator")(js.Any.fromFunction1(headerLeftInterpolator))
    if (headerLeftLabelInterpolator != null) __obj.updateDynamic("headerLeftLabelInterpolator")(js.Any.fromFunction1(headerLeftLabelInterpolator))
    if (headerRightInterpolator != null) __obj.updateDynamic("headerRightInterpolator")(js.Any.fromFunction1(headerRightInterpolator))
    if (headerTitleFromLeftInterpolator != null) __obj.updateDynamic("headerTitleFromLeftInterpolator")(js.Any.fromFunction1(headerTitleFromLeftInterpolator))
    if (headerTitleInterpolator != null) __obj.updateDynamic("headerTitleInterpolator")(js.Any.fromFunction1(headerTitleInterpolator))
    __obj.asInstanceOf[HeaderTransitionConfig]
  }
}

