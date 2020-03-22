package typings.reactNavigationStack.vendorTypesMod

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigationStack.reactNavigationStackStrings.float
import typings.reactNavigationStack.reactNavigationStackStrings.screen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackHeaderProps extends js.Object {
  /**
    * Safe area insets to use in the header, e.g. to apply extra spacing for statusbar and notch.
    */
  var insets: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EdgeInsets */ js.Any
  /**
    * Layout of the screen.
    */
  var layout: Layout
  /**
    * Mode of the header: `float` renders a single floating header across all screens,
    * `screen` renders separate headers for each screen.
    */
  var mode: float | screen
  /**
    * Navigation prop for the header.
    */
  var navigation: StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams]
  /**
    * Object representing the previous scene.
    */
  var previous: js.UndefOr[Scene[Route[String]]] = js.undefined
  /**
    * Object representing the current scene, such as the route object and animation progress.
    */
  var scene: Scene[Route[String]]
  /**
    * Interpolated styles for various elements in the header.
    */
  var styleInterpolator: StackHeaderStyleInterpolator
}

object StackHeaderProps {
  @scala.inline
  def apply(
    insets: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EdgeInsets */ js.Any,
    layout: Layout,
    mode: float | screen,
    navigation: StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams],
    scene: Scene[Route[String]],
    styleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle,
    previous: Scene[Route[String]] = null
  ): StackHeaderProps = {
    val __obj = js.Dynamic.literal(insets = insets.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], styleInterpolator = js.Any.fromFunction1(styleInterpolator))
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackHeaderProps]
  }
}

