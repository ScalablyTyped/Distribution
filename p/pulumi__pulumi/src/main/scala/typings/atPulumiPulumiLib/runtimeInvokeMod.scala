package typings
package atPulumiPulumiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/invoke", JSImport.Namespace)
@js.native
object runtimeInvokeMod extends js.Object {
  def invoke(tok: java.lang.String, props: atPulumiPulumiLib.outputMod.Inputs): js.Promise[_] = js.native
  def invoke(
    tok: java.lang.String,
    props: atPulumiPulumiLib.outputMod.Inputs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[_] = js.native
}

