package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrawlerSchemaChangePolicy extends js.Object {
  
  /**
    * The deletion behavior when the crawler finds a deleted object. Valid values: `LOG`, `DELETE_FROM_DATABASE`, or `DEPRECATE_IN_DATABASE`. Defaults to `DEPRECATE_IN_DATABASE`.
    */
  var deleteBehavior: js.UndefOr[Input[String]] = js.native
  
  /**
    * The update behavior when the crawler finds a changed schema. Valid values: `LOG` or `UPDATE_IN_DATABASE`. Defaults to `UPDATE_IN_DATABASE`.
    */
  var updateBehavior: js.UndefOr[Input[String]] = js.native
}
object CrawlerSchemaChangePolicy {
  
  @scala.inline
  def apply(): CrawlerSchemaChangePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrawlerSchemaChangePolicy]
  }
  
  @scala.inline
  implicit class CrawlerSchemaChangePolicyOps[Self <: CrawlerSchemaChangePolicy] (val x: Self) extends AnyVal {
    
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
    def setDeleteBehavior(value: Input[String]): Self = this.set("deleteBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteBehavior: Self = this.set("deleteBehavior", js.undefined)
    
    @scala.inline
    def setUpdateBehavior(value: Input[String]): Self = this.set("updateBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateBehavior: Self = this.set("updateBehavior", js.undefined)
  }
}
