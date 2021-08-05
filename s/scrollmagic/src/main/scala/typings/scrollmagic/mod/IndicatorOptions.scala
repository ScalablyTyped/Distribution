package typings.scrollmagic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicatorOptions extends StObject {
  
  var colorEnd: js.UndefOr[String] = js.undefined
  
  var colorStart: js.UndefOr[String] = js.undefined
  
  var colorTrigger: js.UndefOr[String] = js.undefined
  
  var indent: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var parent: js.UndefOr[ElementOrSelector] = js.undefined
}
object IndicatorOptions {
  
  inline def apply(): IndicatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicatorOptions]
  }
  
  extension [Self <: IndicatorOptions](x: Self) {
    
    inline def setColorEnd(value: String): Self = StObject.set(x, "colorEnd", value.asInstanceOf[js.Any])
    
    inline def setColorEndUndefined: Self = StObject.set(x, "colorEnd", js.undefined)
    
    inline def setColorStart(value: String): Self = StObject.set(x, "colorStart", value.asInstanceOf[js.Any])
    
    inline def setColorStartUndefined: Self = StObject.set(x, "colorStart", js.undefined)
    
    inline def setColorTrigger(value: String): Self = StObject.set(x, "colorTrigger", value.asInstanceOf[js.Any])
    
    inline def setColorTriggerUndefined: Self = StObject.set(x, "colorTrigger", js.undefined)
    
    inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: ElementOrSelector): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
