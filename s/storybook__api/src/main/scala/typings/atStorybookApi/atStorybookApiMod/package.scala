package typings.atStorybookApi

import org.scalablytyped.runtime.StringDictionary
import typings.atStorybookApi.Anon_Development
import typings.atStorybookApi.distModulesAddonsMod.SubAPI
import typings.atStorybookRouter.distRouterMod.RenderData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookApiMod {
  type API = SubAPI with typings.atStorybookApi.distModulesChannelMod.SubAPI with typings.atStorybookApi.distInitDashProviderDashApiMod.SubAPI with typings.atStorybookApi.distModulesStoriesMod.SubAPI with typings.atStorybookApi.distModulesLayoutMod.SubAPI with typings.atStorybookApi.distModulesNotificationsMod.SubAPI with typings.atStorybookApi.distModulesShortcutsMod.SubAPI with typings.atStorybookApi.distModulesVersionsMod.SubAPI with typings.atStorybookApi.distModulesUrlMod.SubAPI with OtherAPI
  type Module = StoreData with RenderData with ProviderData with Anon_Development
  type OtherAPI = StringDictionary[js.Any]
  type Props = Children with RenderData with ProviderData
  type State = Other with typings.atStorybookApi.distModulesLayoutMod.SubState with typings.atStorybookApi.distModulesStoriesMod.SubState with typings.atStorybookApi.distModulesNotificationsMod.SubState with typings.atStorybookApi.distModulesVersionsMod.SubState with RenderData with typings.atStorybookApi.distModulesShortcutsMod.SubState
  type SubState = StringDictionary[js.Any]
}
