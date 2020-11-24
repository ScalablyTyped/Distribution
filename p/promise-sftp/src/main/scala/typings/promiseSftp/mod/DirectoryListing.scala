package typings.promiseSftp.mod

import typings.promiseSftp.anon.Group
import typings.promiseSftp.promiseSftpStrings.`-_`
import typings.promiseSftp.promiseSftpStrings.d
import typings.promiseSftp.promiseSftpStrings.l
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Output of `PromiseSftp#list()` */
@js.native
trait DirectoryListing extends js.Object {
  
  /** The last modified date of the entry. */
  var date: Date = js.native
  
  /** The group name or ID that this entry belongs to. *NIX only */
  var group: js.UndefOr[String] = js.native
  
  /** The name of the entry. */
  var name: String = js.native
  
  /** The user name or ID that this entry belongs to. *NIX only */
  var owner: js.UndefOr[String] = js.native
  
  /** The various permissions for this entry. *NIX only */
  var rights: js.UndefOr[Group] = js.native
  
  /** True if the sticky bit is set for this entry */
  var sticky: js.UndefOr[Boolean] = js.native
  
  /** For symlink entries, this is the symlink's target. *NIX only */
  var target: js.UndefOr[String] = js.native
  
  /** `d` for directory, `-` for file, and `l` for symlink only on *NIX. */
  var `type`: d | `-_` | l = js.native
}
object DirectoryListing {
  
  @scala.inline
  def apply(date: Date, name: String, `type`: d | `-_` | l): DirectoryListing = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryListing]
  }
  
  @scala.inline
  implicit class DirectoryListingOps[Self <: DirectoryListing] (val x: Self) extends AnyVal {
    
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
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: d | `-_` | l): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setRights(value: Group): Self = this.set("rights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRights: Self = this.set("rights", js.undefined)
    
    @scala.inline
    def setSticky(value: Boolean): Self = this.set("sticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSticky: Self = this.set("sticky", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
