package typings
package atStorybookApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookApiMod {
  type API = atStorybookApiLib.distModulesAddonsMod.SubAPI with atStorybookApiLib.distModulesChannelMod.SubAPI with atStorybookApiLib.distInitDashProviderDashApiMod.SubAPI with atStorybookApiLib.distModulesStoriesMod.SubAPI with atStorybookApiLib.distModulesLayoutMod.SubAPI with atStorybookApiLib.distModulesNotificationsMod.SubAPI with atStorybookApiLib.distModulesShortcutsMod.SubAPI with atStorybookApiLib.distModulesVersionsMod.SubAPI with atStorybookApiLib.distModulesUrlMod.SubAPI with OtherAPI
  type Module = StoreData with atStorybookRouterLib.distRouterMod.RenderData with ProviderData with atStorybookApiLib.Anon_Development
  type OtherAPI = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Props = Children with atStorybookRouterLib.distRouterMod.RenderData with ProviderData
  type State = Other with atStorybookApiLib.distModulesLayoutMod.SubState with atStorybookApiLib.distModulesStoriesMod.SubState with atStorybookApiLib.distModulesNotificationsMod.SubState with atStorybookApiLib.distModulesVersionsMod.SubState with atStorybookRouterLib.distRouterMod.RenderData with atStorybookApiLib.distModulesShortcutsMod.SubState
  type SubState = org.scalablytyped.runtime.StringDictionary[js.Any]
}
