package typings.rockset.apiMod

import typings.rockset.apiMod.OutputField.OnErrorEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputField extends StObject {
  
  /**
    * The name of a field, parsed as a SQL qualified name
    * @type {string}
    * @memberof OutputField
    */
  var field_name: js.UndefOr[String] = js.undefined
  
  /**
    * Error in Mapping execution: 'skip' or 'fail'
    * @type {string}
    * @memberof OutputField
    */
  var on_error: js.UndefOr[OnErrorEnum] = js.undefined
  
  /**
    * The name of a sql function
    * @type {SqlExpression}
    * @memberof OutputField
    */
  var value: js.UndefOr[SqlExpression] = js.undefined
}
object OutputField {
  
  inline def apply(): OutputField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputField]
  }
  
  @js.native
  sealed trait OnErrorEnum extends StObject
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen/api", "OutputField.OnErrorEnum")
  @js.native
  object OnErrorEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OnErrorEnum & Double] = js.native
    
    @js.native
    sealed trait FAIL
      extends StObject
         with OnErrorEnum
    /* 1 */ val FAIL: typings.rockset.apiMod.OutputField.OnErrorEnum.FAIL & Double = js.native
    
    @js.native
    sealed trait SKIP
      extends StObject
         with OnErrorEnum
    /* 0 */ val SKIP: typings.rockset.apiMod.OutputField.OnErrorEnum.SKIP & Double = js.native
  }
  
  extension [Self <: OutputField](x: Self) {
    
    inline def setField_name(value: String): Self = StObject.set(x, "field_name", value.asInstanceOf[js.Any])
    
    inline def setField_nameUndefined: Self = StObject.set(x, "field_name", js.undefined)
    
    inline def setOn_error(value: OnErrorEnum): Self = StObject.set(x, "on_error", value.asInstanceOf[js.Any])
    
    inline def setOn_errorUndefined: Self = StObject.set(x, "on_error", js.undefined)
    
    inline def setValue(value: SqlExpression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
