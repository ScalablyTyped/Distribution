package typings.sigstore.distTypesSigstoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TransparencyLogInstance {
  
  @JSImport("sigstore/dist/types/sigstore", "TransparencyLogInstance")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreTrustrootMod`.TransparencyLogInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreTrustrootMod`.TransparencyLogInstance]
  
  inline def toJSON(
    message: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreTrustrootMod`.TransparencyLogInstance
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
}
