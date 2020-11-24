package typings.pulumiAws.bucketMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketArgs extends js.Object {
  
  /**
    * Name of the bucket.
    */
  val bucket: Input[String] = js.native
  
  /**
    * Identifier of the Outpost to contain this bucket.
    */
  val outpostId: Input[String] = js.native
  
  /**
    * Key-value map of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object BucketArgs {
  
  @scala.inline
  def apply(bucket: Input[String], outpostId: Input[String]): BucketArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], outpostId = outpostId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketArgs]
  }
  
  @scala.inline
  implicit class BucketArgsOps[Self <: BucketArgs] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: Input[String]): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostId(value: Input[String]): Self = this.set("outpostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
