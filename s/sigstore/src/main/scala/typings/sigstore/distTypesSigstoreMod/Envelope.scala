package typings.sigstore.distTypesSigstoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Envelope {
  
  @JSImport("sigstore/dist/types/sigstore", "Envelope")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): typings.sigstoreProtobufSpecs.`dist@GeneratedEnvelopeMod`.Envelope = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sigstoreProtobufSpecs.`dist@GeneratedEnvelopeMod`.Envelope]
  
  inline def toJSON(message: typings.sigstoreProtobufSpecs.`dist@GeneratedEnvelopeMod`.Envelope): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
}
