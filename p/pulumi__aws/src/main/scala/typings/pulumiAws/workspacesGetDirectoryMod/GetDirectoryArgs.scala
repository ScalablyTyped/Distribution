package typings.pulumiAws.workspacesGetDirectoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.workspaces.GetDirectoryWorkspaceCreationProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDirectoryArgs extends js.Object {
  
  /**
    * The directory identifier for registration in WorkSpaces service.
    */
  val directoryId: String = js.native
  
  /**
    * A map of tags assigned to the WorkSpaces directory.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The default properties that are used for creating WorkSpaces. Defined below.
    */
  val workspaceCreationProperties: js.UndefOr[GetDirectoryWorkspaceCreationProperties] = js.native
}
object GetDirectoryArgs {
  
  @scala.inline
  def apply(directoryId: String): GetDirectoryArgs = {
    val __obj = js.Dynamic.literal(directoryId = directoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectoryArgs]
  }
  
  @scala.inline
  implicit class GetDirectoryArgsOps[Self <: GetDirectoryArgs] (val x: Self) extends AnyVal {
    
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
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setWorkspaceCreationProperties(value: GetDirectoryWorkspaceCreationProperties): Self = this.set("workspaceCreationProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceCreationProperties: Self = this.set("workspaceCreationProperties", js.undefined)
  }
}
