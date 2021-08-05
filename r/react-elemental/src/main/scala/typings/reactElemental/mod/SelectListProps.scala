package typings.reactElemental.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectListProps extends StObject {
  
  val error: js.UndefOr[String] = js.undefined
  
  val height: js.UndefOr[Double] = js.undefined
  
  val onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  
  val options: js.UndefOr[js.Array[typings.reactElemental.anon.Label]] = js.undefined
  
  val placeholder: js.UndefOr[String] = js.undefined
  
  val style: js.UndefOr[CSSProperties] = js.undefined
  
  val width: js.UndefOr[Double | String] = js.undefined
}
object SelectListProps {
  
  inline def apply(): SelectListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectListProps]
  }
  
  extension [Self <: SelectListProps](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOnChange(value: /* value */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOptions(value: js.Array[typings.reactElemental.anon.Label]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: typings.reactElemental.anon.Label*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
