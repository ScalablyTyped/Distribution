package typings.pulumiAws.outputMod.efs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccessPointRootDirectory extends js.Object {
  
  /**
    * Single element list containing information on the creation permissions of the directory
    */
  var creationInfos: js.Array[GetAccessPointRootDirectoryCreationInfo] = js.native
  
  /**
    * Path exposed as the root directory
    */
  var path: String = js.native
}
object GetAccessPointRootDirectory {
  
  @scala.inline
  def apply(creationInfos: js.Array[GetAccessPointRootDirectoryCreationInfo], path: String): GetAccessPointRootDirectory = {
    val __obj = js.Dynamic.literal(creationInfos = creationInfos.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessPointRootDirectory]
  }
  
  @scala.inline
  implicit class GetAccessPointRootDirectoryOps[Self <: GetAccessPointRootDirectory] (val x: Self) extends AnyVal {
    
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
    def setCreationInfosVarargs(value: GetAccessPointRootDirectoryCreationInfo*): Self = this.set("creationInfos", js.Array(value :_*))
    
    @scala.inline
    def setCreationInfos(value: js.Array[GetAccessPointRootDirectoryCreationInfo]): Self = this.set("creationInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
}
