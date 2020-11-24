package typings.sailsIoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialConnectionHeaders extends js.Object {
  
  var nosession: js.UndefOr[Boolean] = js.native
}
object InitialConnectionHeaders {
  
  @scala.inline
  def apply(): InitialConnectionHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialConnectionHeaders]
  }
  
  @scala.inline
  implicit class InitialConnectionHeadersOps[Self <: InitialConnectionHeaders] (val x: Self) extends AnyVal {
    
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
    def setNosession(value: Boolean): Self = this.set("nosession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNosession: Self = this.set("nosession", js.undefined)
  }
}
