package typings.reactNativeSqliteStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseOptionalParams extends js.Object {
  
  var createFromLocation: js.UndefOr[Double | String] = js.native
  
  // Database encryption pass phrase
  var key: js.UndefOr[String] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
}
object DatabaseOptionalParams {
  
  @scala.inline
  def apply(): DatabaseOptionalParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseOptionalParams]
  }
  
  @scala.inline
  implicit class DatabaseOptionalParamsOps[Self <: DatabaseOptionalParams] (val x: Self) extends AnyVal {
    
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
    def setCreateFromLocation(value: Double | String): Self = this.set("createFromLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateFromLocation: Self = this.set("createFromLocation", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
  }
}
