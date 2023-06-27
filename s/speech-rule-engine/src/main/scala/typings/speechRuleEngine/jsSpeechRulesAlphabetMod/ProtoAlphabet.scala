package typings.speechRuleEngine.jsSpeechRulesAlphabetMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtoAlphabet extends StObject {
  
  var base: Base
  
  var capital: js.UndefOr[Boolean] = js.undefined
  
  var category: String
  
  var font: Font | Embellish
  
  var interval: js.Tuple2[String, String]
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var subst: StringDictionary[String | Boolean]
}
object ProtoAlphabet {
  
  inline def apply(
    base: Base,
    category: String,
    font: Font | Embellish,
    interval: js.Tuple2[String, String],
    subst: StringDictionary[String | Boolean]
  ): ProtoAlphabet = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], subst = subst.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtoAlphabet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtoAlphabet] (val x: Self) extends AnyVal {
    
    inline def setBase(value: Base): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setCapital(value: Boolean): Self = StObject.set(x, "capital", value.asInstanceOf[js.Any])
    
    inline def setCapitalUndefined: Self = StObject.set(x, "capital", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setFont(value: Font | Embellish): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: js.Tuple2[String, String]): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setSubst(value: StringDictionary[String | Boolean]): Self = StObject.set(x, "subst", value.asInstanceOf[js.Any])
  }
}
