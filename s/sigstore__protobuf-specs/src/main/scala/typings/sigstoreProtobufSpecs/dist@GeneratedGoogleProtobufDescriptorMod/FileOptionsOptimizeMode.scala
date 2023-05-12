package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileOptionsOptimizeMode extends StObject
@JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "FileOptions_OptimizeMode")
@js.native
object FileOptionsOptimizeMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileOptionsOptimizeMode & Double] = js.native
  
  /** CODE_SIZE - etc. */
  @js.native
  sealed trait CODE_SIZE
    extends StObject
       with FileOptionsOptimizeMode
  /* 2 */ val CODE_SIZE: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FileOptionsOptimizeMode.CODE_SIZE & Double = js.native
  
  /** LITE_RUNTIME - Generate code using MessageLite and the lite runtime. */
  @js.native
  sealed trait LITE_RUNTIME
    extends StObject
       with FileOptionsOptimizeMode
  /* 3 */ val LITE_RUNTIME: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FileOptionsOptimizeMode.LITE_RUNTIME & Double = js.native
  
  /** SPEED - Generate complete code for parsing, serialization, */
  @js.native
  sealed trait SPEED
    extends StObject
       with FileOptionsOptimizeMode
  /* 1 */ val SPEED: typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`.FileOptionsOptimizeMode.SPEED & Double = js.native
}
