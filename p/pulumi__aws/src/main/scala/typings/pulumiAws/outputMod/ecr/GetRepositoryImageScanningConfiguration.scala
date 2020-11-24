package typings.pulumiAws.outputMod.ecr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRepositoryImageScanningConfiguration extends js.Object {
  
  /**
    * Indicates whether images are scanned after being pushed to the repository.
    */
  var scanOnPush: Boolean = js.native
}
object GetRepositoryImageScanningConfiguration {
  
  @scala.inline
  def apply(scanOnPush: Boolean): GetRepositoryImageScanningConfiguration = {
    val __obj = js.Dynamic.literal(scanOnPush = scanOnPush.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryImageScanningConfiguration]
  }
  
  @scala.inline
  implicit class GetRepositoryImageScanningConfigurationOps[Self <: GetRepositoryImageScanningConfiguration] (val x: Self) extends AnyVal {
    
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
    def setScanOnPush(value: Boolean): Self = this.set("scanOnPush", value.asInstanceOf[js.Any])
  }
}
