package typings.rndm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(length: Double): String = ^.asInstanceOf[js.Dynamic].apply(length.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("rndm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def base10(length: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base10")(length.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def base36(length: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base36")(length.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def base62(length: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base62")(length.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def create(characters: String): js.Function1[/* length */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(characters.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* length */ Double, String]]
}
