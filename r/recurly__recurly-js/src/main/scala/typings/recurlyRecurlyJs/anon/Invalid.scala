package typings.recurlyRecurlyJs.anon

import typings.recurlyRecurlyJs.elementsMod.CommonElementStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Invalid extends StObject {
  
  /**
    * Style to apply to input elements when they contain an invalid value.
    *
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#styling-the-individual-card-elements|Styling the invididual card elements}
    */
  var invalid: js.UndefOr[CommonElementStyle] = js.native
  
  /**
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/padding}
    */
  var padding: js.UndefOr[String] = js.native
  
  var placeholder: js.UndefOr[Color] = js.native
}
object Invalid {
  
  @scala.inline
  def apply(): Invalid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invalid]
  }
  
  @scala.inline
  implicit class InvalidMutableBuilder[Self <: Invalid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvalid(value: CommonElementStyle): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    @scala.inline
    def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: Color): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
  }
}
