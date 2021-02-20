package typings.rax.mod

import typings.rax.raxStrings.center
import typings.rax.raxStrings.char
import typings.rax.raxStrings.justify
import typings.rax.raxStrings.left
import typings.rax.raxStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var align: js.UndefOr[left | center | right | justify | char] = js.native
  
  var colSpan: js.UndefOr[Double] = js.native
  
  var headers: js.UndefOr[String] = js.native
  
  var rowSpan: js.UndefOr[Double] = js.native
  
  var scope: js.UndefOr[String] = js.native
}
object ThHTMLAttributes {
  
  @scala.inline
  def apply[T](): ThHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class ThHTMLAttributesMutableBuilder[Self <: ThHTMLAttributes[_], T] (val x: Self with ThHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAlign(value: left | center | right | justify | char): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    @scala.inline
    def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
