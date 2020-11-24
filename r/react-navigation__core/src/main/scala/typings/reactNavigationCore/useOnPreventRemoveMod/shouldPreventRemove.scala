package typings.reactNavigationCore.useOnPreventRemoveMod

import typings.reactNavigationCore.anon.`12`
import typings.reactNavigationCore.anon.`13`
import typings.reactNavigationCore.navigationBuilderContextMod.ChildBeforeRemoveListener
import typings.reactNavigationCore.typesMod.EventMapCore
import typings.reactNavigationCore.useEventEmitterMod.NavigationEventEmitter
import typings.reactNavigationRouters.typesMod.NavigationAction
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/core/lib/typescript/src/useOnPreventRemove", "shouldPreventRemove")
@js.native
object shouldPreventRemove extends js.Object {
  
  def apply(
    emitter: NavigationEventEmitter[EventMapCore[_]],
    beforeRemoveListeners: Record[String, js.UndefOr[ChildBeforeRemoveListener]],
    currentRoutes: js.Array[`12`],
    nextRoutes: js.Array[`13`],
    action: NavigationAction
  ): Boolean = js.native
}
