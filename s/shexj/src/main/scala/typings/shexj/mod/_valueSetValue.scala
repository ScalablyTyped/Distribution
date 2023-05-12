package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _valueSetValue extends StObject
object _valueSetValue {
  
  inline def IriStem(stem: IRIREF): typings.shexj.mod.IriStem = {
    val __obj = js.Dynamic.literal(stem = stem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IriStem")
    __obj.asInstanceOf[typings.shexj.mod.IriStem]
  }
  
  inline def IriStemRange(exclusions: js.Array[iriRangeExclusion], stem: iriRangeStem): typings.shexj.mod.IriStemRange = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IriStemRange")
    __obj.asInstanceOf[typings.shexj.mod.IriStemRange]
  }
  
  inline def Language(languageTag: LANGTAG): typings.shexj.mod.Language = {
    val __obj = js.Dynamic.literal(languageTag = languageTag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Language")
    __obj.asInstanceOf[typings.shexj.mod.Language]
  }
  
  inline def LanguageStem(stem: LANGTAG): typings.shexj.mod.LanguageStem = {
    val __obj = js.Dynamic.literal(stem = stem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LanguageStem")
    __obj.asInstanceOf[typings.shexj.mod.LanguageStem]
  }
  
  inline def LanguageStemRange(exclusions: js.Array[languageRangeExclusion], stem: languageRangeStem): typings.shexj.mod.LanguageStemRange = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LanguageStemRange")
    __obj.asInstanceOf[typings.shexj.mod.LanguageStemRange]
  }
  
  inline def LiteralStem(stem: STRING): typings.shexj.mod.LiteralStem = {
    val __obj = js.Dynamic.literal(stem = stem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LiteralStem")
    __obj.asInstanceOf[typings.shexj.mod.LiteralStem]
  }
  
  inline def LiteralStemRange(exclusions: js.Array[literalRangeExclusion], stem: literalRangeStem): typings.shexj.mod.LiteralStemRange = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LiteralStemRange")
    __obj.asInstanceOf[typings.shexj.mod.LiteralStemRange]
  }
}
