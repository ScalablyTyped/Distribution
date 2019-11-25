package typings.atStorybookAddons.distHooksMod

import typings.atStorybookAddons.atStorybookAddonsStrings.MOUNT
import typings.atStorybookAddons.atStorybookAddonsStrings.NONE
import typings.atStorybookAddons.atStorybookAddonsStrings.UPDATE
import typings.std.Set
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addons/dist/hooks", "HooksContext")
@js.native
class HooksContext () extends js.Object {
  var currentContext: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoryContext */ js.Any) | Null = js.native
  var currentDecoratorName: String | Null = js.native
  var currentEffects: js.Array[Effect] = js.native
  var currentHooks: js.Array[Hook] = js.native
  var currentPhase: MOUNT | UPDATE | NONE = js.native
  var hasUpdates: Boolean = js.native
  var hookListsMap: WeakMap[AbstractFunction, js.Array[Hook]] = js.native
  var mountedDecorators: Set[AbstractFunction] = js.native
  var nextHookIndex: Double = js.native
  var prevEffects: js.Array[Effect] = js.native
  var prevMountedDecorators: Set[AbstractFunction] = js.native
  def addRenderListeners(): Unit = js.native
  def clean(): Unit = js.native
  def getNextHook(): Hook = js.native
  def init(): Unit = js.native
  def removeRenderListeners(): Unit = js.native
  def renderListener(): Unit = js.native
  def triggerEffects(): Unit = js.native
}

