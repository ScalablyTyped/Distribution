package typings.pulumiAws.getSolutionStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSolutionStackResult extends js.Object {
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val mostRecent: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the solution stack.
    */
  val name: String = js.native
  
  val nameRegex: String = js.native
}
object GetSolutionStackResult {
  
  @scala.inline
  def apply(id: String, name: String, nameRegex: String): GetSolutionStackResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameRegex = nameRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolutionStackResult]
  }
  
  @scala.inline
  implicit class GetSolutionStackResultOps[Self <: GetSolutionStackResult] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameRegex(value: String): Self = this.set("nameRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMostRecent(value: Boolean): Self = this.set("mostRecent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMostRecent: Self = this.set("mostRecent", js.undefined)
  }
}
