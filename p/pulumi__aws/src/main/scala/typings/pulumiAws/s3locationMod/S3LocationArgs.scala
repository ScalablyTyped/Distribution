package typings.pulumiAws.s3locationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.inputMod.datasync.S3LocationS3Config
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3LocationArgs extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the S3 Bucket.
    */
  val s3BucketArn: Input[ARN] = js.native
  
  /**
    * Configuration block containing information for connecting to S3.
    */
  val s3Config: Input[S3LocationS3Config] = js.native
  
  /**
    * Prefix to perform actions as source or destination.
    */
  val subdirectory: Input[String] = js.native
  
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object S3LocationArgs {
  
  @scala.inline
  implicit class S3LocationArgsOps[Self <: S3LocationArgs] (val x: Self) extends AnyVal {
    
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
    def setS3BucketArn(value: Input[ARN]): Self = this.set("s3BucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Config(value: Input[S3LocationS3Config]): Self = this.set("s3Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdirectory(value: Input[String]): Self = this.set("subdirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
