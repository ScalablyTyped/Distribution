package typings.atPulumiAws.typesOutputMod.ecr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryImageScanningConfiguration extends js.Object {
  /**
    * Indicates whether images are scanned after being pushed to the repository (true) or not scanned (false).
    */
  var scanOnPush: Boolean = js.native
}

object RepositoryImageScanningConfiguration {
  @scala.inline
  def apply(scanOnPush: Boolean): RepositoryImageScanningConfiguration = {
    val __obj = js.Dynamic.literal(scanOnPush = scanOnPush.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RepositoryImageScanningConfiguration]
  }
}

