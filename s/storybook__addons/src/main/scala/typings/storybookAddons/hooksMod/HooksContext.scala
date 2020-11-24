package typings.storybookAddons.hooksMod

import typings.std.Set
import typings.std.WeakMap
import typings.storybookAddons.storybookAddonsStrings.MOUNT
import typings.storybookAddons.storybookAddonsStrings.NONE
import typings.storybookAddons.storybookAddonsStrings.UPDATE
import typings.storybookAddons.typesMod.StoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addons/dist/hooks", "HooksContext")
@js.native
class HooksContext () extends js.Object {
  
  def addRenderListeners(): Unit = js.native
  
  def clean(): Unit = js.native
  
  var currentContext: StoryContext | Null = js.native
  
  var currentDecoratorName: String | Null = js.native
  
  var currentEffects: js.Array[Effect] = js.native
  
  var currentHooks: js.Array[Hook] = js.native
  
  var currentPhase: MOUNT | UPDATE | NONE = js.native
  
  def getNextHook(): Hook = js.native
  
  var hasUpdates: Boolean = js.native
  
  var hookListsMap: WeakMap[AbstractFunction, js.Array[Hook]] = js.native
  
  def init(): Unit = js.native
  
  var mountedDecorators: Set[AbstractFunction] = js.native
  
  var nextHookIndex: Double = js.native
  
  var prevEffects: js.Array[Effect] = js.native
  
  var prevMountedDecorators: Set[AbstractFunction] = js.native
  
  def removeRenderListeners(): Unit = js.native
  
  def renderListener(): Unit = js.native
  
  def triggerEffects(): Unit = js.native
}
