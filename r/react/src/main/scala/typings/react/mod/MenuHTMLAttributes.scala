package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var `type`: js.UndefOr[String] = js.native
}
object MenuHTMLAttributes {
  
  @scala.inline
  def apply[T](): MenuHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class MenuHTMLAttributesMutableBuilder[Self <: MenuHTMLAttributes[_], T] (val x: Self with MenuHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
