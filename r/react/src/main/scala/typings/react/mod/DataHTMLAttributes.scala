package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var value: js.UndefOr[String | js.Array[String] | Double] = js.native
}
object DataHTMLAttributes {
  
  @scala.inline
  def apply[T](): DataHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class DataHTMLAttributesMutableBuilder[Self <: DataHTMLAttributes[_], T] (val x: Self with DataHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
