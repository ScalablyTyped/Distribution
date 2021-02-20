package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPhotosParamType extends StObject {
  
  var after: js.UndefOr[String] = js.native
  
  var assetType: js.UndefOr[CameraRollAssetType] = js.native
  
  var first: Double = js.native
  
  var groupName: js.UndefOr[String] = js.native
  
  var groupTypes: js.UndefOr[CameraRollGroupType] = js.native
  
  var mimeTypes: js.UndefOr[js.Array[String]] = js.native
}
object GetPhotosParamType {
  
  @scala.inline
  def apply(first: Double): GetPhotosParamType = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPhotosParamType]
  }
  
  @scala.inline
  implicit class GetPhotosParamTypeMutableBuilder[Self <: GetPhotosParamType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    @scala.inline
    def setAssetType(value: CameraRollAssetType): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetTypeUndefined: Self = StObject.set(x, "assetType", js.undefined)
    
    @scala.inline
    def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    @scala.inline
    def setGroupTypes(value: CameraRollGroupType): Self = StObject.set(x, "groupTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupTypesUndefined: Self = StObject.set(x, "groupTypes", js.undefined)
    
    @scala.inline
    def setMimeTypes(value: js.Array[String]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypesUndefined: Self = StObject.set(x, "mimeTypes", js.undefined)
    
    @scala.inline
    def setMimeTypesVarargs(value: String*): Self = StObject.set(x, "mimeTypes", js.Array(value :_*))
  }
}
