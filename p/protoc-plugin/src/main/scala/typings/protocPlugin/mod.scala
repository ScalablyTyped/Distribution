package typings.protocPlugin

import typings.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location.AsObject
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protoc-plugin", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(cb: SimplePluginCallback): js.Promise[Unit] = js.native
  def CodeGeneratorRequest(): js.Promise[typings.googleProtobuf.pluginPbMod.CodeGeneratorRequest] = js.native
  def CodeGeneratorRequest(stdin: Readable): js.Promise[typings.googleProtobuf.pluginPbMod.CodeGeneratorRequest] = js.native
  def CodeGeneratorResponse(): js.Function1[/* files */ OutputFiles, Unit] = js.native
  def CodeGeneratorResponse(stdout: Writable): js.Function1[/* files */ OutputFiles, Unit] = js.native
  def CodeGeneratorResponseError(): js.Function1[/* err */ Error, Unit] = js.native
  def CodeGeneratorResponseError(stdout: Writable): js.Function1[/* err */ Error, Unit] = js.native
  def findCommentByPath(path: js.Array[Double], locationList: js.Array[AsObject]): String = js.native
  type OutputFiles = js.Array[typings.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File.AsObject]
  type SimplePluginCallback = js.Function1[
    /* filesToGenerate */ js.Array[typings.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject], 
    OutputFiles | js.Promise[OutputFiles]
  ]
}

