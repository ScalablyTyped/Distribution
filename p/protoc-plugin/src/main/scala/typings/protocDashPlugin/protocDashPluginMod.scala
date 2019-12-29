package typings.protocDashPlugin

import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfo.Location.AsObject
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protoc-plugin", JSImport.Namespace)
@js.native
object protocDashPluginMod extends js.Object {
  def apply(cb: SimplePluginCallback): js.Promise[Unit] = js.native
  def CodeGeneratorRequest(): js.Promise[
    typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorRequest
  ] = js.native
  def CodeGeneratorRequest(stdin: Readable): js.Promise[
    typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorRequest
  ] = js.native
  def CodeGeneratorResponse(): js.Function1[/* files */ OutputFiles, Unit] = js.native
  def CodeGeneratorResponse(stdout: Writable): js.Function1[/* files */ OutputFiles, Unit] = js.native
  def CodeGeneratorResponseError(): js.Function1[/* err */ Error, Unit] = js.native
  def CodeGeneratorResponseError(stdout: Writable): js.Function1[/* err */ Error, Unit] = js.native
  def findCommentByPath(path: js.Array[Double], locationList: js.Array[AsObject]): String = js.native
  type OutputFiles = js.Array[
    typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponse.File.AsObject
  ]
  type SimplePluginCallback = js.Function1[
    /* filesToGenerate */ js.Array[
      typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProto.AsObject
    ], 
    OutputFiles | js.Promise[OutputFiles]
  ]
}

