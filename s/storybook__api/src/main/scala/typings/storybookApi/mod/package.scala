package typings.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  type API = typings.storybookApi.addonsMod.SubAPI with typings.storybookApi.channelMod.SubAPI with typings.storybookApi.initProviderApiMod.SubAPI with typings.storybookApi.storiesMod.SubAPI with typings.storybookApi.layoutMod.SubAPI with typings.storybookApi.notificationsMod.SubAPI with typings.storybookApi.shortcutsMod.SubAPI with typings.storybookApi.versionsMod.SubAPI with typings.storybookApi.urlMod.SubAPI with typings.storybookApi.mod.OtherAPI
  type EventMap = org.scalablytyped.runtime.StringDictionary[typings.storybookChannels.mod.Listener]
  type OtherAPI = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Props = typings.storybookApi.mod.Children with typings.storybookRouter.routerMod.RenderData with typings.storybookApi.mod.ProviderData with typings.storybookApi.mod.DocsModeData
  type State = typings.storybookApi.mod.Other with typings.storybookApi.layoutMod.SubState with typings.storybookApi.storiesMod.SubState with typings.storybookApi.notificationsMod.SubState with typings.storybookApi.versionsMod.SubState with typings.storybookRouter.routerMod.RenderData with typings.storybookApi.shortcutsMod.SubState
  type StateMerger[S] = js.Function1[/* input */ S, S]
  type SubState = org.scalablytyped.runtime.StringDictionary[js.Any]
}
