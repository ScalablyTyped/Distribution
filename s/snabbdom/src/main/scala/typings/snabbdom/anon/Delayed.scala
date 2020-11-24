package typings.snabbdom.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delayed extends js.Object {
  
  var delayed: js.UndefOr[Record[String, String]] = js.native
  
  var remove: js.UndefOr[Record[String, String]] = js.native
}
object Delayed {
  
  @scala.inline
  def apply(): Delayed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delayed]
  }
  
  @scala.inline
  implicit class DelayedOps[Self <: Delayed] (val x: Self) extends AnyVal {
    
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
    def setDelayed(value: Record[String, String]): Self = this.set("delayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayed: Self = this.set("delayed", js.undefined)
    
    @scala.inline
    def setRemove(value: Record[String, String]): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
  }
}
