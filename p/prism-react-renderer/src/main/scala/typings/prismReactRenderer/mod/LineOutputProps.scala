package typings.prismReactRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineOutputProps
  extends StObject
     with /* otherProps */ StringDictionary[Any] {
  
  var className: String
  
  var key: js.UndefOr[Key] = js.undefined
  
  var style: js.UndefOr[StyleObj] = js.undefined
}
object LineOutputProps {
  
  inline def apply(className: String): LineOutputProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineOutputProps]
  }
  
  extension [Self <: LineOutputProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setStyle(value: StyleObj): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
