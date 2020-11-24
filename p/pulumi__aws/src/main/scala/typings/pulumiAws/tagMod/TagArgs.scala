package typings.pulumiAws.tagMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagArgs extends js.Object {
  
  /**
    * The tag name.
    */
  val key: Input[String] = js.native
  
  /**
    * The ID of the EC2 resource to manage the tag for.
    */
  val resourceId: Input[String] = js.native
  
  /**
    * The value of the tag.
    */
  val value: Input[String] = js.native
}
object TagArgs {
  
  @scala.inline
  def apply(key: Input[String], resourceId: Input[String], value: Input[String]): TagArgs = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagArgs]
  }
  
  @scala.inline
  implicit class TagArgsOps[Self <: TagArgs] (val x: Self) extends AnyVal {
    
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
    def setKey(value: Input[String]): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: Input[String]): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Input[String]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
