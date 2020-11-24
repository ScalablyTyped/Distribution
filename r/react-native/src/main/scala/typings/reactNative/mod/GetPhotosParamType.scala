package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPhotosParamType extends js.Object {
  
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
  implicit class GetPhotosParamTypeOps[Self <: GetPhotosParamType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFirst(value: Double): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfter(value: String): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setAssetType(value: CameraRollAssetType): Self = this.set("assetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetType: Self = this.set("assetType", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = this.set("groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("groupName", js.undefined)
    
    @scala.inline
    def setGroupTypes(value: CameraRollGroupType): Self = this.set("groupTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupTypes: Self = this.set("groupTypes", js.undefined)
    
    @scala.inline
    def setMimeTypesVarargs(value: String*): Self = this.set("mimeTypes", js.Array(value :_*))
    
    @scala.inline
    def setMimeTypes(value: js.Array[String]): Self = this.set("mimeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeTypes: Self = this.set("mimeTypes", js.undefined)
  }
}
