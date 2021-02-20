package typings.promiseSftp.mod

import typings.promiseSftp.anon.Group
import typings.promiseSftp.promiseSftpStrings.`-_`
import typings.promiseSftp.promiseSftpStrings.d
import typings.promiseSftp.promiseSftpStrings.l
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Output of `PromiseSftp#list()` */
@js.native
trait DirectoryListing extends StObject {
  
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
  implicit class DirectoryListingMutableBuilder[Self <: DirectoryListing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setRights(value: Group): Self = StObject.set(x, "rights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightsUndefined: Self = StObject.set(x, "rights", js.undefined)
    
    @scala.inline
    def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: d | `-_` | l): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
