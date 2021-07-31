package typings.react.mod

import typings.react.reactStrings.baseline
import typings.react.reactStrings.bottom
import typings.react.reactStrings.center
import typings.react.reactStrings.char
import typings.react.reactStrings.justify
import typings.react.reactStrings.left
import typings.react.reactStrings.middle
import typings.react.reactStrings.right
import typings.react.reactStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TdHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var abbr: js.UndefOr[String] = js.undefined
  
  var align: js.UndefOr[left | center | right | justify | char] = js.undefined
  
  var colSpan: js.UndefOr[Double] = js.undefined
  
  var headers: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var rowSpan: js.UndefOr[Double] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var valign: js.UndefOr[top | middle | bottom | baseline] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object TdHTMLAttributes {
  
  @scala.inline
  def apply[T](): TdHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TdHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class TdHTMLAttributesMutableBuilder[Self <: TdHTMLAttributes[?], T] (val x: Self & TdHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAbbr(value: String): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbbrUndefined: Self = StObject.set(x, "abbr", js.undefined)
    
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
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setValign(value: top | middle | bottom | baseline): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
