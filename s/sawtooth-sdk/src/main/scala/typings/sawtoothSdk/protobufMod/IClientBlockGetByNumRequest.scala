package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientBlockGetByNumRequest extends StObject {
  
  /** ClientBlockGetByNumRequest blockNum */
  var blockNum: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) | Null
  ] = js.undefined
}
object IClientBlockGetByNumRequest {
  
  inline def apply(): IClientBlockGetByNumRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBlockGetByNumRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IClientBlockGetByNumRequest] (val x: Self) extends AnyVal {
    
    inline def setBlockNum(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
    ): Self = StObject.set(x, "blockNum", value.asInstanceOf[js.Any])
    
    inline def setBlockNumNull: Self = StObject.set(x, "blockNum", null)
    
    inline def setBlockNumUndefined: Self = StObject.set(x, "blockNum", js.undefined)
  }
}
