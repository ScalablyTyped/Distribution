package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraRollFetchParams extends StObject {
  
  var after: js.UndefOr[String] = js.native
  
  var assetType: js.UndefOr[CameraRollAssetType] = js.native
  
  var first: Double = js.native
  
  var groupName: js.UndefOr[String] = js.native
  
  var groupTypes: js.UndefOr[CameraRollGroupType] = js.native
}
object CameraRollFetchParams {
  
  @scala.inline
  def apply(first: Double): CameraRollFetchParams = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraRollFetchParams]
  }
  
  @scala.inline
  implicit class CameraRollFetchParamsMutableBuilder[Self <: CameraRollFetchParams] (val x: Self) extends AnyVal {
    
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
  }
}
