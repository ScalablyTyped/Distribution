package typings.protocDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object protocDashPluginMod {
  import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProtoNs.AsObject
  import typings.protocDashPlugin.OutputFiles

  type SimplePluginCallback = js.Function1[/* filesToGenerate */ js.Array[AsObject], OutputFiles | js.Promise[OutputFiles]]
}
