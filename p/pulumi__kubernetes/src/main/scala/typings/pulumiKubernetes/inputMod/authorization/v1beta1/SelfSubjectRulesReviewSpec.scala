package typings.pulumiKubernetes.inputMod.authorization.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelfSubjectRulesReviewSpec extends js.Object {
  
  /**
    * Namespace to evaluate rules for. Required.
    */
  var namespace: js.UndefOr[Input[String]] = js.native
}
object SelfSubjectRulesReviewSpec {
  
  @scala.inline
  def apply(): SelfSubjectRulesReviewSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfSubjectRulesReviewSpec]
  }
  
  @scala.inline
  implicit class SelfSubjectRulesReviewSpecOps[Self <: SelfSubjectRulesReviewSpec] (val x: Self) extends AnyVal {
    
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
    def setNamespace(value: Input[String]): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
  }
}
