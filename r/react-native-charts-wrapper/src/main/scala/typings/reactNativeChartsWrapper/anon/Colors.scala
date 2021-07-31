package typings.reactNativeChartsWrapper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colors extends StObject {
  
  var colors: js.UndefOr[js.Array[typings.reactNativeChartsWrapper.mod.Color]] = js.undefined
  
  var labels: js.UndefOr[js.Array[String]] = js.undefined
}
object Colors {
  
  @scala.inline
  def apply(): Colors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Colors]
  }
  
  @scala.inline
  implicit class ColorsMutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[typings.reactNativeChartsWrapper.mod.Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: typings.reactNativeChartsWrapper.mod.Color*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
  }
}
