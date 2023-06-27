package typings.speechRuleEngine

import typings.speechRuleEngine.anon.Combiner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsL10nLocaleUtilMod {
  
  @JSImport("speech-rule-engine/js/l10n/locale_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combinePostfixIndex(postfix: String, index: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("combinePostfixIndex")(postfix.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def localEnclose(enclose: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("localEnclose")(enclose.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def localFont(font: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("localFont")(font.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def localRole(role: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("localRole")(role.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def localeFontCombiner(font: String): Combiner = ^.asInstanceOf[js.Dynamic].applyDynamic("localeFontCombiner")(font.asInstanceOf[js.Any]).asInstanceOf[Combiner]
  inline def localeFontCombiner(font: js.Tuple2[String, String]): Combiner = ^.asInstanceOf[js.Dynamic].applyDynamic("localeFontCombiner")(font.asInstanceOf[js.Any]).asInstanceOf[Combiner]
  
  inline def nestingToString(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nestingToString")(count.asInstanceOf[js.Any]).asInstanceOf[String]
}
