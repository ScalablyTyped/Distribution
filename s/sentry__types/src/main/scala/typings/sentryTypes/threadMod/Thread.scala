package typings.sentryTypes.threadMod

import typings.sentryTypes.stacktraceMod.Stacktrace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Thread extends js.Object {
  
  var crashed: js.UndefOr[Boolean] = js.native
  
  var current: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var stacktrace: js.UndefOr[Stacktrace] = js.native
}
object Thread {
  
  @scala.inline
  def apply(): Thread = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thread]
  }
  
  @scala.inline
  implicit class ThreadOps[Self <: Thread] (val x: Self) extends AnyVal {
    
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
    def setCrashed(value: Boolean): Self = this.set("crashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrashed: Self = this.set("crashed", js.undefined)
    
    @scala.inline
    def setCurrent(value: Boolean): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStacktrace(value: Stacktrace): Self = this.set("stacktrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStacktrace: Self = this.set("stacktrace", js.undefined)
  }
}
