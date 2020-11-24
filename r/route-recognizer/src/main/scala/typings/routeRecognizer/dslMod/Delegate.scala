package typings.routeRecognizer.dslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delegate extends js.Object {
  
  var contextEntered: js.UndefOr[js.Function2[/* context */ String, /* route */ MatchDSL, Unit]] = js.native
  
  var willAddRoute: js.UndefOr[js.Function2[/* context */ js.UndefOr[String], /* route */ String, String]] = js.native
}
object Delegate {
  
  @scala.inline
  def apply(): Delegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delegate]
  }
  
  @scala.inline
  implicit class DelegateOps[Self <: Delegate] (val x: Self) extends AnyVal {
    
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
    def setContextEntered(value: (/* context */ String, /* route */ MatchDSL) => Unit): Self = this.set("contextEntered", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteContextEntered: Self = this.set("contextEntered", js.undefined)
    
    @scala.inline
    def setWillAddRoute(value: (/* context */ js.UndefOr[String], /* route */ String) => String): Self = this.set("willAddRoute", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteWillAddRoute: Self = this.set("willAddRoute", js.undefined)
  }
}
