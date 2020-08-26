package typings.pulumiAws.anon

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
  @scala.inline
  implicit class TypeofS3Ops[Self <: TypeofS3] (val x: Self) extends AnyVal {
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
    def setManagedUpload(value: TypeofManagedUpload): Self = this.set("ManagedUpload", value.asInstanceOf[js.Any])
    @scala.inline
    def setPresignedPost(value: Instantiable0[PresignedPost]): Self = this.set("PresignedPost", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypes(value: TypeofS3): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
  
}

