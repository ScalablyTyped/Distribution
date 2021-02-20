package typings.scrollmagic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicatorOptions extends StObject {
  
  var colorEnd: js.UndefOr[String] = js.native
  
  var colorStart: js.UndefOr[String] = js.native
  
  var colorTrigger: js.UndefOr[String] = js.native
  
  var indent: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var parent: js.UndefOr[ElementOrSelector] = js.native
}
object IndicatorOptions {
  
  @scala.inline
  def apply(): IndicatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicatorOptions]
  }
  
  @scala.inline
  implicit class IndicatorOptionsMutableBuilder[Self <: IndicatorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorEnd(value: String): Self = StObject.set(x, "colorEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorEndUndefined: Self = StObject.set(x, "colorEnd", js.undefined)
    
    @scala.inline
    def setColorStart(value: String): Self = StObject.set(x, "colorStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorStartUndefined: Self = StObject.set(x, "colorStart", js.undefined)
    
    @scala.inline
    def setColorTrigger(value: String): Self = StObject.set(x, "colorTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorTriggerUndefined: Self = StObject.set(x, "colorTrigger", js.undefined)
    
    @scala.inline
    def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParent(value: ElementOrSelector): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
