package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardEventInit
  extends StObject
     with EventModifierInit {
  
  /** @deprecated */
  /* standard dom */
  var charCode: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var code: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var isComposing: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var key: js.UndefOr[java.lang.String] = js.undefined
  
  /** @deprecated */
  /* standard dom */
  var keyCode: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var location: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var repeat: js.UndefOr[scala.Boolean] = js.undefined
}
object KeyboardEventInit {
  
  inline def apply(): KeyboardEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyboardEventInit] (val x: Self) extends AnyVal {
    
    inline def setCharCode(value: Double): Self = StObject.set(x, "charCode", value.asInstanceOf[js.Any])
    
    inline def setCharCodeUndefined: Self = StObject.set(x, "charCode", js.undefined)
    
    inline def setCode(value: java.lang.String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setIsComposing(value: scala.Boolean): Self = StObject.set(x, "isComposing", value.asInstanceOf[js.Any])
    
    inline def setIsComposingUndefined: Self = StObject.set(x, "isComposing", js.undefined)
    
    inline def setKey(value: java.lang.String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    inline def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRepeat(value: scala.Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
  }
}
