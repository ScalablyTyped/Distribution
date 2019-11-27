package typings.protocDashPlugin

import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.protocDashPlugin.protocDashPluginMod.SimplePluginCallback
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protoc-plugin", JSImport.Namespace)
@js.native
object protocDashPluginMod extends js.Object {
  def apply(cb: SimplePluginCallback): js.Promise[Unit] = js.native
  def CodeGeneratorRequest(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify pb_CodeGeneratorRequest */ _
  ] = js.native
  def CodeGeneratorRequest(stdin: Readable): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify pb_CodeGeneratorRequest */ _
  ] = js.native
  def CodeGeneratorResponse(): js.Function1[/* files */ OutputFiles, Unit] = js.native
  def CodeGeneratorResponse(stdout: Writable): js.Function1[/* files */ OutputFiles, Unit] = js.native
  def CodeGeneratorResponseError(): js.Function1[/* err */ Error, Unit] = js.native
  def CodeGeneratorResponseError(stdout: Writable): js.Function1[/* err */ Error, Unit] = js.native
  def findCommentByPath(
    path: js.Array[Double],
    locationList: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Location.AsObject */ _
    ]
  ): String = js.native
  type SimplePluginCallback = js.Function1[
    /* filesToGenerate */ js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FileDescriptorProto.AsObject */ js.Any
    ], 
    OutputFiles | js.Promise[OutputFiles]
  ]
}

