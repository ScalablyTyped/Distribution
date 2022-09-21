package typings.rockset.apiMod

import typings.rockset.apiMod.PatchOperation.OpEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchOperation extends StObject {
  
  /**
    * JSON-Pointer referencing a location in the target document.Required for copy and move operations
    * @type {string}
    * @memberof PatchOperation
    */
  var from: js.UndefOr[String] = js.undefined
  
  /**
    * Operation to be performed in this patch
    * @type {string}
    * @memberof PatchOperation
    */
  var op: OpEnum
  
  /**
    * JSON-Pointer referencing a location in the target document where theoperation is performed
    * @type {string}
    * @memberof PatchOperation
    */
  var path: String
  
  /**
    * Value used in the patch operation. Required for add, replace and test operations
    * @type {any}
    * @memberof PatchOperation
    */
  var value: js.UndefOr[Any] = js.undefined
}
object PatchOperation {
  
  inline def apply(op: OpEnum, path: String): PatchOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchOperation]
  }
  
  @js.native
  sealed trait OpEnum extends StObject
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen/api", "PatchOperation.OpEnum")
  @js.native
  object OpEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OpEnum & Double] = js.native
    
    @js.native
    sealed trait ADD
      extends StObject
         with OpEnum
    /* 0 */ val ADD: typings.rockset.apiMod.PatchOperation.OpEnum.ADD & Double = js.native
    
    @js.native
    sealed trait COPY
      extends StObject
         with OpEnum
    /* 3 */ val COPY: typings.rockset.apiMod.PatchOperation.OpEnum.COPY & Double = js.native
    
    @js.native
    sealed trait MOVE
      extends StObject
         with OpEnum
    /* 4 */ val MOVE: typings.rockset.apiMod.PatchOperation.OpEnum.MOVE & Double = js.native
    
    @js.native
    sealed trait REMOVE
      extends StObject
         with OpEnum
    /* 2 */ val REMOVE: typings.rockset.apiMod.PatchOperation.OpEnum.REMOVE & Double = js.native
    
    @js.native
    sealed trait REPLACE
      extends StObject
         with OpEnum
    /* 1 */ val REPLACE: typings.rockset.apiMod.PatchOperation.OpEnum.REPLACE & Double = js.native
    
    @js.native
    sealed trait TEST
      extends StObject
         with OpEnum
    /* 5 */ val TEST: typings.rockset.apiMod.PatchOperation.OpEnum.TEST & Double = js.native
  }
  
  extension [Self <: PatchOperation](x: Self) {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setOp(value: OpEnum): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
