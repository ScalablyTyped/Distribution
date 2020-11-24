package typings.pulumiAws.getFileSystemMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFileSystemArgs extends js.Object {
  
  /**
    * Restricts the list to the file system with this creation token.
    */
  val creationToken: js.UndefOr[String] = js.native
  
  /**
    * The ID that identifies the file system (e.g. fs-ccfc0d65).
    */
  val fileSystemId: js.UndefOr[String] = js.native
  
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}
object GetFileSystemArgs {
  
  @scala.inline
  def apply(): GetFileSystemArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFileSystemArgs]
  }
  
  @scala.inline
  implicit class GetFileSystemArgsOps[Self <: GetFileSystemArgs] (val x: Self) extends AnyVal {
    
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
    def setCreationToken(value: String): Self = this.set("creationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationToken: Self = this.set("creationToken", js.undefined)
    
    @scala.inline
    def setFileSystemId(value: String): Self = this.set("fileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSystemId: Self = this.set("fileSystemId", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
