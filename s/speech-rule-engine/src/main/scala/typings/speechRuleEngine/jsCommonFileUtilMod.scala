package typings.speechRuleEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsCommonFileUtilMod {
  
  @JSImport("speech-rule-engine/js/common/file_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def localePath(locale: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("localePath")(locale.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def localePath(locale: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localePath")(locale.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def makePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
}
