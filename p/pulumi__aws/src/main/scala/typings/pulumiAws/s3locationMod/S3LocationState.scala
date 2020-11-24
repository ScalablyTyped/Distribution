package typings.pulumiAws.s3locationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.inputMod.datasync.S3LocationS3Config
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3LocationState extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the DataSync Location.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the S3 Bucket.
    */
  val s3BucketArn: js.UndefOr[Input[ARN]] = js.native
  
  /**
    * Configuration block containing information for connecting to S3.
    */
  val s3Config: js.UndefOr[Input[S3LocationS3Config]] = js.native
  
  /**
    * Prefix to perform actions as source or destination.
    */
  val subdirectory: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  val uri: js.UndefOr[Input[String]] = js.native
}
object S3LocationState {
  
  @scala.inline
  def apply(): S3LocationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3LocationState]
  }
  
  @scala.inline
  implicit class S3LocationStateOps[Self <: S3LocationState] (val x: Self) extends AnyVal {
    
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
    def setS3BucketArn(value: Input[ARN]): Self = this.set("s3BucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BucketArn: Self = this.set("s3BucketArn", js.undefined)
    
    @scala.inline
    def setS3Config(value: Input[S3LocationS3Config]): Self = this.set("s3Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Config: Self = this.set("s3Config", js.undefined)
    
    @scala.inline
    def setSubdirectory(value: Input[String]): Self = this.set("subdirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdirectory: Self = this.set("subdirectory", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setUri(value: Input[String]): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
