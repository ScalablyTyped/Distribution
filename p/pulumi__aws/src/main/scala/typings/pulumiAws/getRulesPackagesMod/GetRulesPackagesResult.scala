package typings.pulumiAws.getRulesPackagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRulesPackagesResult extends js.Object {
  
  /**
    * A list of the AWS Inspector Rules Packages arns available in the AWS region.
    */
  val arns: js.Array[String] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
}
object GetRulesPackagesResult {
  
  @scala.inline
  def apply(arns: js.Array[String], id: String): GetRulesPackagesResult = {
    val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRulesPackagesResult]
  }
  
  @scala.inline
  implicit class GetRulesPackagesResultOps[Self <: GetRulesPackagesResult] (val x: Self) extends AnyVal {
    
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
    def setArnsVarargs(value: String*): Self = this.set("arns", js.Array(value :_*))
    
    @scala.inline
    def setArns(value: js.Array[String]): Self = this.set("arns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
