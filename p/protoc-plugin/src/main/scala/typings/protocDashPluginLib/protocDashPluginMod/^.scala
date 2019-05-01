package typings
package protocDashPluginLib.protocDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protoc-plugin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(cb: SimplePluginCallback): js.Promise[scala.Unit] = js.native
  def CodeGeneratorRequest(): js.Promise[
    googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorRequest
  ] = js.native
  def CodeGeneratorRequest(stdin: nodeLib.streamMod.Readable): js.Promise[
    googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorRequest
  ] = js.native
  def CodeGeneratorResponse(): js.Function1[/* files */ protocDashPluginLib.OutputFiles, scala.Unit] = js.native
  def CodeGeneratorResponse(stdout: nodeLib.streamMod.Writable): js.Function1[/* files */ protocDashPluginLib.OutputFiles, scala.Unit] = js.native
  def CodeGeneratorResponseError(): js.Function1[/* err */ stdLib.Error, scala.Unit] = js.native
  def CodeGeneratorResponseError(stdout: nodeLib.streamMod.Writable): js.Function1[/* err */ stdLib.Error, scala.Unit] = js.native
  def findCommentByPath(
    path: js.Array[scala.Double],
    locationList: js.Array[
      googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfoNs.LocationNs.AsObject
    ]
  ): java.lang.String = js.native
}

