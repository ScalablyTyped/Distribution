package typings.reactNativeFirebase.mod.RNFirebase.firestore.Query

import typings.reactNativeFirebase.mod.RNFirebase.firestore.QuerySnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observer extends js.Object {
  
  var error: js.UndefOr[ObserverOnError] = js.native
  
  var next: ObserverOnNext = js.native
}
object Observer {
  
  @scala.inline
  def apply(next: /* querySnapshot */ QuerySnapshot => Unit): Observer = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[Observer]
  }
  
  @scala.inline
  implicit class ObserverOps[Self <: Observer] (val x: Self) extends AnyVal {
    
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
    def setNext(value: /* querySnapshot */ QuerySnapshot => Unit): Self = this.set("next", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: /* err */ SnapshotError => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
}
