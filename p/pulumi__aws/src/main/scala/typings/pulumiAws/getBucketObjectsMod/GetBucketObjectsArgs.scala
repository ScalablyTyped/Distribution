package typings.pulumiAws.getBucketObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketObjectsArgs extends js.Object {
  
  /**
    * Lists object keys in this S3 bucket. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified
    */
  val bucket: String = js.native
  
  /**
    * A character used to group keys (Default: none)
    */
  val delimiter: js.UndefOr[String] = js.native
  
  /**
    * Encodes keys using this method (Default: none; besides none, only "url" can be used)
    */
  val encodingType: js.UndefOr[String] = js.native
  
  /**
    * Boolean specifying whether to populate the owner list (Default: false)
    */
  val fetchOwner: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum object keys to return (Default: 1000)
    */
  val maxKeys: js.UndefOr[Double] = js.native
  
  /**
    * Limits results to object keys with this prefix (Default: none)
    */
  val prefix: js.UndefOr[String] = js.native
  
  /**
    * Returns key names lexicographically after a specific object key in your bucket (Default: none; S3 lists object keys in UTF-8 character encoding in lexicographical order)
    */
  val startAfter: js.UndefOr[String] = js.native
}
object GetBucketObjectsArgs {
  
  @scala.inline
  def apply(bucket: String): GetBucketObjectsArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketObjectsArgs]
  }
  
  @scala.inline
  implicit class GetBucketObjectsArgsOps[Self <: GetBucketObjectsArgs] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setEncodingType(value: String): Self = this.set("encodingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodingType: Self = this.set("encodingType", js.undefined)
    
    @scala.inline
    def setFetchOwner(value: Boolean): Self = this.set("fetchOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchOwner: Self = this.set("fetchOwner", js.undefined)
    
    @scala.inline
    def setMaxKeys(value: Double): Self = this.set("maxKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxKeys: Self = this.set("maxKeys", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setStartAfter(value: String): Self = this.set("startAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAfter: Self = this.set("startAfter", js.undefined)
  }
}
