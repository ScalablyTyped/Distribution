package typings.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type API = typings.storybookApi.addonsMod.SubAPI with typings.storybookApi.channelMod.SubAPI with typings.storybookApi.providerMod.SubAPI with typings.storybookApi.modulesStoriesMod.SubAPI with typings.storybookApi.refsMod.SubAPI with typings.storybookApi.globalsMod.SubAPI with typings.storybookApi.layoutMod.SubAPI with typings.storybookApi.notificationsMod.SubAPI with typings.storybookApi.shortcutsMod.SubAPI with typings.storybookApi.releaseNotesMod.SubAPI with typings.storybookApi.settingsMod.SubAPI with typings.storybookApi.versionsMod.SubAPI with typings.storybookApi.urlMod.SubAPI with typings.storybookApi.mod.Other
  
  type ArgTypes = org.scalablytyped.runtime.StringDictionary[typings.storybookApi.mod.ArgType]
  
  type Args = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type EventMap = org.scalablytyped.runtime.StringDictionary[typings.storybookChannels.mod.Listener]
  
  type ModuleFn = js.Function1[/* m */ typings.storybookApi.mod.ModuleArgs, typings.storybookApi.mod.Module]
  
  type Other = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type Parameters = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type State = typings.storybookApi.layoutMod.SubState with typings.storybookApi.modulesStoriesMod.SubState with typings.storybookApi.refsMod.SubState with typings.storybookApi.notificationsMod.SubState with typings.storybookApi.versionsMod.SubState with typings.storybookApi.urlMod.SubState with typings.storybookApi.shortcutsMod.SubState with typings.storybookApi.releaseNotesMod.SubState with typings.storybookApi.settingsMod.SubState with typings.storybookApi.globalsMod.SubState with typings.storybookRouter.routerMod.RenderData with typings.storybookApi.mod.Other
  
  type StateMerger[S] = js.Function1[/* input */ S, S]
  
  type StoryId = java.lang.String
  
  type StoryKind = java.lang.String
}
