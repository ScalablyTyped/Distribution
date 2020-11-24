package typings.pulumiAws.getWorkspaceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWorkspaceArgs extends js.Object {
  
  /**
    * The ID of the directory for the WorkSpace. You have to specify `userName` along with `directoryId`. You cannot combine this parameter with `workspaceId`.
    */
  val directoryId: js.UndefOr[String] = js.native
  
  /**
    * The tags for the WorkSpace.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The user name of the user for the WorkSpace. This user name must exist in the directory for the WorkSpace. You cannot combine this parameter with `workspaceId`.
    */
  val userName: js.UndefOr[String] = js.native
  
  /**
    * The ID of the WorkSpace. You cannot combine this parameter with `directoryId`.
    */
  val workspaceId: js.UndefOr[String] = js.native
}
object GetWorkspaceArgs {
  
  @scala.inline
  def apply(): GetWorkspaceArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkspaceArgs]
  }
  
  @scala.inline
  implicit class GetWorkspaceArgsOps[Self <: GetWorkspaceArgs] (val x: Self) extends AnyVal {
    
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
    def setDirectoryId(value: String): Self = this.set("directoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryId: Self = this.set("directoryId", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: String): Self = this.set("workspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceId: Self = this.set("workspaceId", js.undefined)
  }
}
