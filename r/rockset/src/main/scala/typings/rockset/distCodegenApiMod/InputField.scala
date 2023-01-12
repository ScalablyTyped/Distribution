package typings.rockset.distCodegenApiMod

import typings.rockset.distCodegenApiMod.InputField.IfMissingEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputField extends StObject {
  
  /**
    * The name of a field, parsed as a SQL qualified name
    * @type {string}
    * @memberof InputField
    */
  var field_name: js.UndefOr[String] = js.undefined
  
  /**
    * Define the behaviour if fieldName is missing or is null
    * @type {string}
    * @memberof InputField
    */
  var if_missing: js.UndefOr[IfMissingEnum] = js.undefined
  
  /**
    * If true, then drop fieldName from the document
    * @type {boolean}
    * @memberof InputField
    */
  var is_drop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sql parameter name
    * @type {string}
    * @memberof InputField
    */
  var param: js.UndefOr[String] = js.undefined
}
object InputField {
  
  inline def apply(): InputField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputField]
  }
  
  @js.native
  sealed trait IfMissingEnum extends StObject
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen/api", "InputField.IfMissingEnum")
  @js.native
  object IfMissingEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[IfMissingEnum & Double] = js.native
    
    @js.native
    sealed trait PASS
      extends StObject
         with IfMissingEnum
    /* 1 */ val PASS: typings.rockset.distCodegenApiMod.InputField.IfMissingEnum.PASS & Double = js.native
    
    @js.native
    sealed trait SKIP
      extends StObject
         with IfMissingEnum
    /* 0 */ val SKIP: typings.rockset.distCodegenApiMod.InputField.IfMissingEnum.SKIP & Double = js.native
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputField] (val x: Self) extends AnyVal {
    
    inline def setField_name(value: String): Self = StObject.set(x, "field_name", value.asInstanceOf[js.Any])
    
    inline def setField_nameUndefined: Self = StObject.set(x, "field_name", js.undefined)
    
    inline def setIf_missing(value: IfMissingEnum): Self = StObject.set(x, "if_missing", value.asInstanceOf[js.Any])
    
    inline def setIf_missingUndefined: Self = StObject.set(x, "if_missing", js.undefined)
    
    inline def setIs_drop(value: Boolean): Self = StObject.set(x, "is_drop", value.asInstanceOf[js.Any])
    
    inline def setIs_dropUndefined: Self = StObject.set(x, "is_drop", js.undefined)
    
    inline def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
  }
}
