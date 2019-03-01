package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Descriptors[O] extends js.Object {
  var descriptors: org.scalablytyped.runtime.StringDictionary[
    reactDashNavigationLib.reactDashNavigationMod.NavigationDescriptor[reactDashNavigationLib.reactDashNavigationMod.NavigationParams]
  ]
  var navigationConfig: O
  var screenProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object Anon_Descriptors {
  @scala.inline
  def apply[O](
    descriptors: org.scalablytyped.runtime.StringDictionary[
      reactDashNavigationLib.reactDashNavigationMod.NavigationDescriptor[reactDashNavigationLib.reactDashNavigationMod.NavigationParams]
    ],
    navigationConfig: O,
    screenProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Descriptors[O] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("descriptors")(descriptors)
    __obj.updateDynamic("navigationConfig")(navigationConfig.asInstanceOf[js.Any])
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps)
    __obj.asInstanceOf[Anon_Descriptors[O]]
  }
}

