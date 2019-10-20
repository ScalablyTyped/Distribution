package typings.atPulumiPulumi

import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Inputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/invoke", JSImport.Namespace)
@js.native
object runtimeInvokeMod extends js.Object {
  def invoke(tok: String, props: Inputs): js.Promise[_] = js.native
  def invoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[_] = js.native
  def invokeFallbackToAsync(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[_] = js.native
}

