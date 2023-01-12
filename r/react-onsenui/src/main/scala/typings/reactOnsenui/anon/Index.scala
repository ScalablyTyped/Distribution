package typings.reactOnsenui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index extends StObject {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var modifier: js.UndefOr[String] = js.undefined
  
  var onPostChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var tabbarId: js.UndefOr[String] = js.undefined
}
object Index {
  
  inline def apply(): Index = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Index]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setOnPostChange(value: () => Unit): Self = StObject.set(x, "onPostChange", js.Any.fromFunction0(value))
    
    inline def setOnPostChangeUndefined: Self = StObject.set(x, "onPostChange", js.undefined)
    
    inline def setTabbarId(value: String): Self = StObject.set(x, "tabbarId", value.asInstanceOf[js.Any])
    
    inline def setTabbarIdUndefined: Self = StObject.set(x, "tabbarId", js.undefined)
  }
}
