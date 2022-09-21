package typings.reactMentions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSubstringIndexMod {
  
  @JSImport("react-mentions/lib/utils/getSubstringIndex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSubstringIndex(str: String, substr: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSubstringIndex")(str.asInstanceOf[js.Any], substr.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getSubstringIndex(str: String, substr: String, ignoreAccents: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSubstringIndex")(str.asInstanceOf[js.Any], substr.asInstanceOf[js.Any], ignoreAccents.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def normalizeString(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeString")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
