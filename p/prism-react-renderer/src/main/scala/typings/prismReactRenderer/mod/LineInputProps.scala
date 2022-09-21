package typings.prismReactRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineInputProps
  extends StObject
     with /* otherProps */ StringDictionary[Any] {
  
  var className: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[Key] = js.undefined
  
  var line: js.Array[Token]
  
  var style: js.UndefOr[StyleObj] = js.undefined
}
object LineInputProps {
  
  inline def apply(line: js.Array[Token]): LineInputProps = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineInputProps]
  }
  
  extension [Self <: LineInputProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLine(value: js.Array[Token]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineVarargs(value: Token*): Self = StObject.set(x, "line", js.Array(value*))
    
    inline def setStyle(value: StyleObj): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
