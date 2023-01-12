package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldsOptions extends StObject {
  
  var fields: js.UndefOr[String] = js.undefined
}
object FieldsOptions {
  
  inline def apply(): FieldsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldsOptions] (val x: Self) extends AnyVal {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
