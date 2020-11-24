package typings.pulumiAws.outputMod.backup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlanRuleCopyAction extends js.Object {
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup.
    */
  var destinationVaultArn: String = js.native
  
  /**
    * The lifecycle defines when a protected resource is copied over to a backup vault and when it expires.  Fields documented above.
    */
  var lifecycle: js.UndefOr[PlanRuleCopyActionLifecycle] = js.native
}
object PlanRuleCopyAction {
  
  @scala.inline
  def apply(destinationVaultArn: String): PlanRuleCopyAction = {
    val __obj = js.Dynamic.literal(destinationVaultArn = destinationVaultArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanRuleCopyAction]
  }
  
  @scala.inline
  implicit class PlanRuleCopyActionOps[Self <: PlanRuleCopyAction] (val x: Self) extends AnyVal {
    
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
    def setDestinationVaultArn(value: String): Self = this.set("destinationVaultArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycle(value: PlanRuleCopyActionLifecycle): Self = this.set("lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycle: Self = this.set("lifecycle", js.undefined)
  }
}
