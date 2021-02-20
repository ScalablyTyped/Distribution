package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldsOptions extends StObject {
  
  var fields: js.UndefOr[String] = js.native
}
object FieldsOptions {
  
  @scala.inline
  def apply(): FieldsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldsOptions]
  }
  
  @scala.inline
  implicit class FieldsOptionsMutableBuilder[Self <: FieldsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
