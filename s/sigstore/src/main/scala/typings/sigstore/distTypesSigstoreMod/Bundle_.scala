package typings.sigstore.distTypesSigstoreMod

import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreBundleMod`.Bundle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Bundle_ {
  
  @JSImport("sigstore/dist/types/sigstore", "Bundle")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): Bundle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[Bundle]
  
  inline def toJSON(message: Bundle): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
}
