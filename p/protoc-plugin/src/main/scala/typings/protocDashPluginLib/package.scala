package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object protocDashPluginLib {
  type OutputFiles = js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify pb_CodeGeneratorResponse.File.AsObject */ js.Any
  ]
  type SimplePluginCallback = js.Function1[
    /* filesToGenerate */ js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FileDescriptorProto.AsObject */ js.Any
    ], 
    OutputFiles | js.Promise[OutputFiles]
  ]
}
