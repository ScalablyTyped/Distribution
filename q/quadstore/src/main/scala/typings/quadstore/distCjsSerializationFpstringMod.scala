package typings.quadstore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSerializationFpstringMod {
  
  @JSImport("quadstore/dist/cjs/serialization/fpstring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encode(stringOrNumber: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(stringOrNumber.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(stringOrNumber: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(stringOrNumber.asInstanceOf[js.Any]).asInstanceOf[String]
}
