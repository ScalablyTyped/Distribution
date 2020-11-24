package typings.pulumiAws.inputMod.ecr

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryImageScanningConfiguration extends js.Object {
  
  /**
    * Indicates whether images are scanned after being pushed to the repository (true) or not scanned (false).
    */
  var scanOnPush: Input[Boolean] = js.native
}
object RepositoryImageScanningConfiguration {
  
  @scala.inline
  def apply(scanOnPush: Input[Boolean]): RepositoryImageScanningConfiguration = {
    val __obj = js.Dynamic.literal(scanOnPush = scanOnPush.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryImageScanningConfiguration]
  }
  
  @scala.inline
  implicit class RepositoryImageScanningConfigurationOps[Self <: RepositoryImageScanningConfiguration] (val x: Self) extends AnyVal {
    
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
    def setScanOnPush(value: Input[Boolean]): Self = this.set("scanOnPush", value.asInstanceOf[js.Any])
  }
}
