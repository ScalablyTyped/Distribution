package typings.quotedPrintable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("quoted-printable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encode(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("quoted-printable", "version")
  @js.native
  val version: String = js.native
}
