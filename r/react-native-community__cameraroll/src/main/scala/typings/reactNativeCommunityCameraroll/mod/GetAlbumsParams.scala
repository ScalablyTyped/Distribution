package typings.reactNativeCommunityCameraroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAlbumsParams extends js.Object {
  
  var assetType: js.UndefOr[AssetType] = js.native
}
object GetAlbumsParams {
  
  @scala.inline
  def apply(): GetAlbumsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAlbumsParams]
  }
  
  @scala.inline
  implicit class GetAlbumsParamsOps[Self <: GetAlbumsParams] (val x: Self) extends AnyVal {
    
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
    def setAssetType(value: AssetType): Self = this.set("assetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetType: Self = this.set("assetType", js.undefined)
  }
}
