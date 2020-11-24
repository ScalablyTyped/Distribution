package typings.pulumiAws.originAccessIdentityMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginAccessIdentityArgs extends js.Object {
  
  /**
    * An optional comment for the origin access identity.
    */
  val comment: js.UndefOr[Input[String]] = js.native
}
object OriginAccessIdentityArgs {
  
  @scala.inline
  def apply(): OriginAccessIdentityArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginAccessIdentityArgs]
  }
  
  @scala.inline
  implicit class OriginAccessIdentityArgsOps[Self <: OriginAccessIdentityArgs] (val x: Self) extends AnyVal {
    
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
    def setComment(value: Input[String]): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
  }
}
