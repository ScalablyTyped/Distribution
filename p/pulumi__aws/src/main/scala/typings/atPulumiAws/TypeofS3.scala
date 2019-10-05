package typings.atPulumiAws

import org.scalablytyped.runtime.Instantiable0
import typings.awsDashSdk.awsDashSdkMod.S3.PresignedPost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofS3 extends js.Object {
  var ManagedUpload: js.Any | TypeofClassManagedUpload
  var PresignedPost: js.Any | Instantiable0[typings.awsDashSdk.awsDashSdkMod.S3.PresignedPost]
  val Types: this.type
}

object TypeofS3 {
  @scala.inline
  def apply(
    ManagedUpload: TypeofClassManagedUpload,
    PresignedPost: Instantiable0[PresignedPost],
    Types: TypeofS3
  ): TypeofS3 = {
    val __obj = js.Dynamic.literal(ManagedUpload = ManagedUpload, PresignedPost = PresignedPost, Types = Types)
  
    __obj.asInstanceOf[TypeofS3]
  }
}

