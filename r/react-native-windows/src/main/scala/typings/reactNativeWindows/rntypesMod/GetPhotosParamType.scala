package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPhotosParamType extends StObject {
  
  var after: js.UndefOr[String] = js.undefined
  
  var assetType: js.UndefOr[CameraRollAssetType] = js.undefined
  
  var first: Double
  
  var groupName: js.UndefOr[String] = js.undefined
  
  var groupTypes: js.UndefOr[CameraRollGroupType] = js.undefined
  
  var mimeTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object GetPhotosParamType {
  
  inline def apply(first: Double): GetPhotosParamType = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPhotosParamType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPhotosParamType] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setAssetType(value: CameraRollAssetType): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
    
    inline def setAssetTypeUndefined: Self = StObject.set(x, "assetType", js.undefined)
    
    inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    inline def setGroupTypes(value: CameraRollGroupType): Self = StObject.set(x, "groupTypes", value.asInstanceOf[js.Any])
    
    inline def setGroupTypesUndefined: Self = StObject.set(x, "groupTypes", js.undefined)
    
    inline def setMimeTypes(value: js.Array[String]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
    
    inline def setMimeTypesUndefined: Self = StObject.set(x, "mimeTypes", js.undefined)
    
    inline def setMimeTypesVarargs(value: String*): Self = StObject.set(x, "mimeTypes", js.Array(value*))
  }
}
