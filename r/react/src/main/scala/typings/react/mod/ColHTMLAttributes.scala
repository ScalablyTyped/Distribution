package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var span: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object ColHTMLAttributes {
  
  @scala.inline
  def apply[T](): ColHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class ColHTMLAttributesMutableBuilder[Self <: ColHTMLAttributes[_], T] (val x: Self with ColHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
