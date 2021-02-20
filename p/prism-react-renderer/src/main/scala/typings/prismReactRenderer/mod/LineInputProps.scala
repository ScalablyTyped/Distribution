package typings.prismReactRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineInputProps
  extends /* otherProps */ StringDictionary[js.Any] {
  
  var className: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[Key] = js.native
  
  var line: js.Array[Token] = js.native
  
  var style: js.UndefOr[StyleObj] = js.native
}
object LineInputProps {
  
  @scala.inline
  def apply(line: js.Array[Token]): LineInputProps = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineInputProps]
  }
  
  @scala.inline
  implicit class LineInputPropsMutableBuilder[Self <: LineInputProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLine(value: js.Array[Token]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineVarargs(value: Token*): Self = StObject.set(x, "line", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: StyleObj): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
