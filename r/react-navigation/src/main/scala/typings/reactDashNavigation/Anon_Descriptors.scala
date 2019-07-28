package typings.reactDashNavigation

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNavigation.reactDashNavigationMod.NavigationDescriptor
import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Descriptors[O] extends js.Object {
  var descriptors: StringDictionary[NavigationDescriptor[NavigationParams]]
  var navigationConfig: O
  var screenProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object Anon_Descriptors {
  @scala.inline
  def apply[O](
    descriptors: StringDictionary[NavigationDescriptor[NavigationParams]],
    navigationConfig: O,
    screenProps: StringDictionary[js.Any] = null
  ): Anon_Descriptors[O] = {
    val __obj = js.Dynamic.literal(descriptors = descriptors, navigationConfig = navigationConfig.asInstanceOf[js.Any])
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps)
    __obj.asInstanceOf[Anon_Descriptors[O]]
  }
}

