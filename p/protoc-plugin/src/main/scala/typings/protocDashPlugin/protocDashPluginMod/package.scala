package typings.protocDashPlugin

import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProtoNs.AsObject
import typings.protocDashPlugin.OutputFiles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object protocDashPluginMod {
  type SimplePluginCallback = js.Function1[/* filesToGenerate */ js.Array[AsObject], OutputFiles | js.Promise[OutputFiles]]
}
