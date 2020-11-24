package typings.reactNavigationNative.typesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerContainerRef extends js.Object {
  
  def getCurrentOptions(): js.UndefOr[Record[String, _]] = js.native
}
object ServerContainerRef {
  
  @scala.inline
  def apply(getCurrentOptions: () => js.UndefOr[Record[String, _]]): ServerContainerRef = {
    val __obj = js.Dynamic.literal(getCurrentOptions = js.Any.fromFunction0(getCurrentOptions))
    __obj.asInstanceOf[ServerContainerRef]
  }
  
  @scala.inline
  implicit class ServerContainerRefOps[Self <: ServerContainerRef] (val x: Self) extends AnyVal {
    
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
    def setGetCurrentOptions(value: () => js.UndefOr[Record[String, _]]): Self = this.set("getCurrentOptions", js.Any.fromFunction0(value))
  }
}
