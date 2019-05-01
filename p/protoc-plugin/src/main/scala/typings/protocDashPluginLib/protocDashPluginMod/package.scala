package typings
package protocDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object protocDashPluginMod {
  type SimplePluginCallback = js.Function1[
    /* filesToGenerate */ js.Array[
      googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProtoNs.AsObject
    ], 
    protocDashPluginLib.OutputFiles | js.Promise[protocDashPluginLib.OutputFiles]
  ]
}
