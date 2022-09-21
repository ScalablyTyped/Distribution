package typings.soundexCode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("soundex-code", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def soundex(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("soundex")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def soundex(value: String, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("soundex")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
}
