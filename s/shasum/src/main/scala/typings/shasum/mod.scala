package typings.shasum

import typings.shasum.shasumStrings.base64
import typings.shasum.shasumStrings.hex
import typings.shasum.shasumStrings.latin1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(str: Any): String = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(str: Any, alg: String): String = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(str: Any, alg: String, format: hex | latin1 | base64): String = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(str: Any, alg: Null, format: hex | latin1 | base64): String = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(str: Any, alg: Unit, format: hex | latin1 | base64): String = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("shasum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
