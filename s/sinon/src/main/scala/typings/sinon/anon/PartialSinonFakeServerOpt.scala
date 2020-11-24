package typings.sinon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<sinon.sinon.SinonFakeServerOptions> */
@js.native
trait PartialSinonFakeServerOpt extends js.Object {
  
  var autoRespond: js.UndefOr[Boolean] = js.native
  
  var autoRespondAfter: js.UndefOr[Double] = js.native
  
  var fakeHTTPMethods: js.UndefOr[Boolean] = js.native
  
  var respondImmediately: js.UndefOr[Boolean] = js.native
}
object PartialSinonFakeServerOpt {
  
  @scala.inline
  def apply(): PartialSinonFakeServerOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSinonFakeServerOpt]
  }
  
  @scala.inline
  implicit class PartialSinonFakeServerOptOps[Self <: PartialSinonFakeServerOpt] (val x: Self) extends AnyVal {
    
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
    def setAutoRespond(value: Boolean): Self = this.set("autoRespond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRespond: Self = this.set("autoRespond", js.undefined)
    
    @scala.inline
    def setAutoRespondAfter(value: Double): Self = this.set("autoRespondAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRespondAfter: Self = this.set("autoRespondAfter", js.undefined)
    
    @scala.inline
    def setFakeHTTPMethods(value: Boolean): Self = this.set("fakeHTTPMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFakeHTTPMethods: Self = this.set("fakeHTTPMethods", js.undefined)
    
    @scala.inline
    def setRespondImmediately(value: Boolean): Self = this.set("respondImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRespondImmediately: Self = this.set("respondImmediately", js.undefined)
  }
}
