package typings.pulumiAws.applicationVersionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.elasticbeanstalkMod.Application
import typings.pulumiAws.s3Mod.Bucket
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationVersionArgs extends js.Object {
  
  /**
    * Name of the Beanstalk Application the version is associated with.
    */
  val application: Input[String | Application] = js.native
  
  /**
    * S3 bucket that contains the Application Version source bundle.
    */
  val bucket: Input[String | Bucket] = js.native
  
  /**
    * Short description of the Application Version.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * On delete, force an Application Version to be deleted when it may be in use
    * by multiple Elastic Beanstalk Environments.
    */
  val forceDelete: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * S3 object that is the Application Version source bundle.
    */
  val key: Input[String] = js.native
  
  /**
    * A unique name for the this Application Version.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of tags for the Elastic Beanstalk Application Version.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object ApplicationVersionArgs {
  
  @scala.inline
  def apply(application: Input[String | Application], bucket: Input[String | Bucket], key: Input[String]): ApplicationVersionArgs = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationVersionArgs]
  }
  
  @scala.inline
  implicit class ApplicationVersionArgsOps[Self <: ApplicationVersionArgs] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Input[String | Application]): Self = this.set("application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucket(value: Input[String | Bucket]): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Input[String]): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setForceDelete(value: Input[Boolean]): Self = this.set("forceDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceDelete: Self = this.set("forceDelete", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
