package typings.rockset.distCodegenApiMod

import typings.rockset.distCodegenApiMod.DocumentStatus.StatusEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentStatus extends StObject {
  
  /**
    * collection name
    * @type {string}
    * @memberof DocumentStatus
    */
  var _collection: js.UndefOr[String] = js.undefined
  
  /**
    * unique document ID
    * @type {string}
    * @memberof DocumentStatus
    */
  var _id: js.UndefOr[String] = js.undefined
  
  /**
    * error message, if any
    * @type {ErrorModel}
    * @memberof DocumentStatus
    */
  var error: js.UndefOr[ErrorModel] = js.undefined
  
  /**
    * unique id used to represent each patch request
    * @type {string}
    * @memberof DocumentStatus
    */
  var patch_id: js.UndefOr[String] = js.undefined
  
  /**
    * status, one of ADDED, REPLACED, DELETED, ERROR
    * @type {string}
    * @memberof DocumentStatus
    */
  var status: js.UndefOr[StatusEnum] = js.undefined
}
object DocumentStatus {
  
  inline def apply(): DocumentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentStatus]
  }
  
  @js.native
  sealed trait StatusEnum extends StObject
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen/api", "DocumentStatus.StatusEnum")
  @js.native
  object StatusEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StatusEnum & Double] = js.native
    
    @js.native
    sealed trait ADDED
      extends StObject
         with StatusEnum
    /* 0 */ val ADDED: typings.rockset.distCodegenApiMod.DocumentStatus.StatusEnum.ADDED & Double = js.native
    
    @js.native
    sealed trait DELETED
      extends StObject
         with StatusEnum
    /* 2 */ val DELETED: typings.rockset.distCodegenApiMod.DocumentStatus.StatusEnum.DELETED & Double = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with StatusEnum
    /* 4 */ val ERROR: typings.rockset.distCodegenApiMod.DocumentStatus.StatusEnum.ERROR & Double = js.native
    
    @js.native
    sealed trait PATCHED
      extends StObject
         with StatusEnum
    /* 3 */ val PATCHED: typings.rockset.distCodegenApiMod.DocumentStatus.StatusEnum.PATCHED & Double = js.native
    
    @js.native
    sealed trait REPLACED
      extends StObject
         with StatusEnum
    /* 1 */ val REPLACED: typings.rockset.distCodegenApiMod.DocumentStatus.StatusEnum.REPLACED & Double = js.native
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentStatus] (val x: Self) extends AnyVal {
    
    inline def setError(value: ErrorModel): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setPatch_id(value: String): Self = StObject.set(x, "patch_id", value.asInstanceOf[js.Any])
    
    inline def setPatch_idUndefined: Self = StObject.set(x, "patch_id", js.undefined)
    
    inline def setStatus(value: StatusEnum): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def set_collection(value: String): Self = StObject.set(x, "_collection", value.asInstanceOf[js.Any])
    
    inline def set_collectionUndefined: Self = StObject.set(x, "_collection", js.undefined)
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
  }
}
