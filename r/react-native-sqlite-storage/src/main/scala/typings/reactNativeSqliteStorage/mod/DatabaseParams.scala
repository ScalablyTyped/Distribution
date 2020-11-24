package typings.reactNativeSqliteStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseParams extends DatabaseOptionalParams {
  
  /**
    * Affects iOS database file location
    * 'default': Library/LocalDatabase subdirectory - NOT visible to iTunes and NOT backed up by iCloud
    * 'Library': Library subdirectory - backed up by iCloud, NOT visible to iTunes
    * 'Documents': Documents subdirectory - visible to iTunes and backed up by iCloud
    */
  var location: Location = js.native
  
  var name: String = js.native
}
object DatabaseParams {
  
  @scala.inline
  def apply(location: Location, name: String): DatabaseParams = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseParams]
  }
  
  @scala.inline
  implicit class DatabaseParamsOps[Self <: DatabaseParams] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
