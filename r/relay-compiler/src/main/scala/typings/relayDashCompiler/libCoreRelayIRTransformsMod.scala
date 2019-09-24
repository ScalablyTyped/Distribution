package typings.relayDashCompiler

import typings.relayDashCompiler.libCoreGraphQLCompilerContextMod.IRTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/core/RelayIRTransforms", JSImport.Namespace)
@js.native
object libCoreRelayIRTransformsMod extends js.Object {
  val codegenTransforms: js.Array[IRTransform] = js.native
  val commonTransforms: js.Array[IRTransform] = js.native
  val fragmentTransforms: js.Array[IRTransform] = js.native
  val printTransforms: js.Array[IRTransform] = js.native
  val queryTransforms: js.Array[IRTransform] = js.native
  val schemaExtensions: js.Array[String] = js.native
}

