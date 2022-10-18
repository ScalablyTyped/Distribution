package typings.rdflib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConvertMod {
  
  @JSImport("rdflib/lib/convert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertToJson(n3String: Any, jsonCallback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToJson")(n3String.asInstanceOf[js.Any], jsonCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def convertToNQuads(n3String: Any, nquadCallback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToNQuads")(n3String.asInstanceOf[js.Any], nquadCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
