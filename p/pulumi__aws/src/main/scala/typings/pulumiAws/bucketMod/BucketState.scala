package typings.pulumiAws.bucketMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketState extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the bucket.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the bucket.
    */
  val bucket: js.UndefOr[Input[String]] = js.native
  
  /**
    * UTC creation date in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
    */
  val creationDate: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of the Outpost to contain this bucket.
    */
  val outpostId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Boolean whether Public Access Block is enabled.
    */
  val publicAccessBlockEnabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Key-value map of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object BucketState {
  
  @scala.inline
  def apply(): BucketState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketState]
  }
  
  @scala.inline
  implicit class BucketStateOps[Self <: BucketState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setBucket(value: Input[String]): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Input[String]): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    
    @scala.inline
    def setOutpostId(value: Input[String]): Self = this.set("outpostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutpostId: Self = this.set("outpostId", js.undefined)
    
    @scala.inline
    def setPublicAccessBlockEnabled(value: Input[Boolean]): Self = this.set("publicAccessBlockEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicAccessBlockEnabled: Self = this.set("publicAccessBlockEnabled", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
