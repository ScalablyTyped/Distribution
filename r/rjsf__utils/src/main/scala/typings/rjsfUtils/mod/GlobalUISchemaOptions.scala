package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The set of UiSchema options that can be set globally and used as fallbacks at an individual template, field or
  * widget level when no field-level value of the option is provided.
  */
trait GlobalUISchemaOptions extends StObject {
  
  /** Flag, if set to `false`, new items cannot be added to array fields, unless overridden (defaults to true) */
  var addable: js.UndefOr[Boolean] = js.undefined
  
  /** Flag, if set to `true`, array items can be copied (defaults to false) */
  var copyable: js.UndefOr[Boolean] = js.undefined
  
  /** When using `additionalProperties`, key collision is prevented by appending a unique integer to the duplicate key.
    * This option allows you to change the separator between the original key name and the integer. Default is "-"
    */
  var duplicateKeySuffixSeparator: js.UndefOr[String] = js.undefined
  
  /** Field labels are rendered by default. Labels may be omitted by setting the `label` option to `false` */
  var label: js.UndefOr[Boolean] = js.undefined
  
  /** Flag, if set to `false`, array items cannot be ordered (defaults to true) */
  var orderable: js.UndefOr[Boolean] = js.undefined
  
  /** Flag, if set to `false`, array items will not be removable (defaults to true) */
  var removable: js.UndefOr[Boolean] = js.undefined
}
object GlobalUISchemaOptions {
  
  inline def apply(): GlobalUISchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalUISchemaOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalUISchemaOptions] (val x: Self) extends AnyVal {
    
    inline def setAddable(value: Boolean): Self = StObject.set(x, "addable", value.asInstanceOf[js.Any])
    
    inline def setAddableUndefined: Self = StObject.set(x, "addable", js.undefined)
    
    inline def setCopyable(value: Boolean): Self = StObject.set(x, "copyable", value.asInstanceOf[js.Any])
    
    inline def setCopyableUndefined: Self = StObject.set(x, "copyable", js.undefined)
    
    inline def setDuplicateKeySuffixSeparator(value: String): Self = StObject.set(x, "duplicateKeySuffixSeparator", value.asInstanceOf[js.Any])
    
    inline def setDuplicateKeySuffixSeparatorUndefined: Self = StObject.set(x, "duplicateKeySuffixSeparator", js.undefined)
    
    inline def setLabel(value: Boolean): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOrderable(value: Boolean): Self = StObject.set(x, "orderable", value.asInstanceOf[js.Any])
    
    inline def setOrderableUndefined: Self = StObject.set(x, "orderable", js.undefined)
    
    inline def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
    
    inline def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
  }
}
