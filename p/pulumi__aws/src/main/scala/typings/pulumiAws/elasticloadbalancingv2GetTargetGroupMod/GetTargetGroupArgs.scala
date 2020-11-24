package typings.pulumiAws.elasticloadbalancingv2GetTargetGroupMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTargetGroupArgs extends js.Object {
  
  /**
    * The full ARN of the target group.
    */
  val arn: js.UndefOr[String] = js.native
  
  /**
    * The unique name of the target group.
    */
  val name: js.UndefOr[String] = js.native
  
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}
object GetTargetGroupArgs {
  
  @scala.inline
  def apply(): GetTargetGroupArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTargetGroupArgs]
  }
  
  @scala.inline
  implicit class GetTargetGroupArgsOps[Self <: GetTargetGroupArgs] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
