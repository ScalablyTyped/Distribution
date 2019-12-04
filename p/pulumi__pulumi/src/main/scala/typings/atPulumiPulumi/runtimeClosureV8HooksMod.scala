package typings.atPulumiPulumi

import typings.node.inspectorMod.Runtime.ScriptId
import typings.node.inspectorMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/closure/v8Hooks", JSImport.Namespace)
@js.native
object runtimeClosureV8HooksMod extends js.Object {
  val isNodeAtLeastV11: Boolean = js.native
  def getScriptUrl(id: ScriptId): js.UndefOr[String] = js.native
  def getSessionAsync(): js.Promise[Session] = js.native
  def isInitializedAsync(): js.Promise[Unit] = js.native
}

