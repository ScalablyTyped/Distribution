package typings.sinclairTypebox.mod

import typings.sinclairTypebox.sinclairTypeboxStrings.`7bit`
import typings.sinclairTypebox.sinclairTypeboxStrings.`8bit`
import typings.sinclairTypebox.sinclairTypeboxStrings.`quoted-printable`
import typings.sinclairTypebox.sinclairTypeboxStrings.base64
import typings.sinclairTypebox.sinclairTypeboxStrings.binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringOptions
  extends StObject
     with SchemaOptions {
  
  var contentEncoding: js.UndefOr[`7bit` | `8bit` | binary | `quoted-printable` | base64] = js.undefined
  
  var contentMediaType: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var maxLength: js.UndefOr[Double] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var pattern: js.UndefOr[String] = js.undefined
}
object StringOptions {
  
  inline def apply(): StringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringOptions] (val x: Self) extends AnyVal {
    
    inline def setContentEncoding(value: `7bit` | `8bit` | binary | `quoted-printable` | base64): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
    
    inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
    
    inline def setContentMediaType(value: String): Self = StObject.set(x, "contentMediaType", value.asInstanceOf[js.Any])
    
    inline def setContentMediaTypeUndefined: Self = StObject.set(x, "contentMediaType", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
  }
}
