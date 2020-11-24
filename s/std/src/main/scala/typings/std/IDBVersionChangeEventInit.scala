package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBVersionChangeEventInit extends EventInit {
  
  var newVersion: js.UndefOr[Double | Null] = js.native
  
  var oldVersion: js.UndefOr[Double] = js.native
}
object IDBVersionChangeEventInit {
  
  @scala.inline
  def apply(): IDBVersionChangeEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDBVersionChangeEventInit]
  }
  
  @scala.inline
  implicit class IDBVersionChangeEventInitOps[Self <: IDBVersionChangeEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNewVersion(value: Double): Self = this.set("newVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewVersion: Self = this.set("newVersion", js.undefined)
    
    @scala.inline
    def setNewVersionNull: Self = this.set("newVersion", null)
    
    @scala.inline
    def setOldVersion(value: Double): Self = this.set("oldVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldVersion: Self = this.set("oldVersion", js.undefined)
  }
}
