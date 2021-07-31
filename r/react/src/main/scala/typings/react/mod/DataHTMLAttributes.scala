package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
}
object DataHTMLAttributes {
  
  @scala.inline
  def apply[T](): DataHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class DataHTMLAttributesMutableBuilder[Self <: DataHTMLAttributes[?], T] (val x: Self & DataHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
