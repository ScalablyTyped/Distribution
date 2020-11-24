package typings.pulumiAws.outputMod.storagegateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NfsFileShareNfsFileShareDefaults extends js.Object {
  
  /**
    * The Unix directory mode in the string form "nnnn". Defaults to `"0777"`.
    */
  var directoryMode: js.UndefOr[String] = js.native
  
  /**
    * The Unix file mode in the string form "nnnn". Defaults to `"0666"`.
    */
  var fileMode: js.UndefOr[String] = js.native
  
  /**
    * The default group ID for the file share (unless the files have another group ID specified). Defaults to `65534` (`nfsnobody`). Valid values: `0` through `4294967294`.
    */
  var groupId: js.UndefOr[Double] = js.native
  
  /**
    * The default owner ID for the file share (unless the files have another owner ID specified). Defaults to `65534` (`nfsnobody`). Valid values: `0` through `4294967294`.
    */
  var ownerId: js.UndefOr[Double] = js.native
}
object NfsFileShareNfsFileShareDefaults {
  
  @scala.inline
  def apply(): NfsFileShareNfsFileShareDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NfsFileShareNfsFileShareDefaults]
  }
  
  @scala.inline
  implicit class NfsFileShareNfsFileShareDefaultsOps[Self <: NfsFileShareNfsFileShareDefaults] (val x: Self) extends AnyVal {
    
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
    def setDirectoryMode(value: String): Self = this.set("directoryMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryMode: Self = this.set("directoryMode", js.undefined)
    
    @scala.inline
    def setFileMode(value: String): Self = this.set("fileMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileMode: Self = this.set("fileMode", js.undefined)
    
    @scala.inline
    def setGroupId(value: Double): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    
    @scala.inline
    def setOwnerId(value: Double): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("ownerId", js.undefined)
  }
}
