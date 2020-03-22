package typings.pulumiAws

import org.scalablytyped.runtime.Instantiable0
import typings.awsSdk.mod.S3.PresignedPost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofS3 extends js.Object {
  val ManagedUpload: TypeofManagedUpload = js.native
  val PresignedPost: Instantiable0[typings.awsSdk.mod.S3.PresignedPost] = js.native
  val Types: this.type = js.native
}

object TypeofS3 {
  @scala.inline
  def apply(ManagedUpload: TypeofManagedUpload, PresignedPost: Instantiable0[PresignedPost], Types: TypeofS3): TypeofS3 = {
    val __obj = js.Dynamic.literal(ManagedUpload = ManagedUpload.asInstanceOf[js.Any], PresignedPost = PresignedPost.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofS3]
  }
}

