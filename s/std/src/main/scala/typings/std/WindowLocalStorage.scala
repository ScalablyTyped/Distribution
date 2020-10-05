package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowLocalStorage extends js.Object {
  val localStorage: Storage = js.native
}

object WindowLocalStorage {
  @scala.inline
  def apply(localStorage: Storage): WindowLocalStorage = {
    val __obj = js.Dynamic.literal(localStorage = localStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowLocalStorage]
  }
  @scala.inline
  implicit class WindowLocalStorageOps[Self <: WindowLocalStorage] (val x: Self) extends AnyVal {
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
    def setLocalStorage(value: Storage): Self = this.set("localStorage", value.asInstanceOf[js.Any])
  }
  
}

