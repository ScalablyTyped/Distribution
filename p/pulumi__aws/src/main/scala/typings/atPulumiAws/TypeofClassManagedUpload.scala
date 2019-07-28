package typings.atPulumiAws

import org.scalablytyped.runtime.Instantiable1
import typings.awsDashSdk.awsDashSdkMod.S3Ns.ManagedUpload
import typings.awsDashSdk.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.ManagedUploadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassManagedUpload extends Instantiable1[/* options */ ManagedUploadOptions, ManagedUpload] {
  /**
    * Default value: 10000
    */
  var maxTotalParts: Double = js.native
  /**
    * Returns the minimum number of bytes for an individual part upload.
    * Note: Minimum allowed size is 5 MB.
    * 1024 * 5
    */
  var minPartSize: Double = js.native
}

