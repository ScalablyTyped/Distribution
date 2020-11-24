package typings.sentryHub.interfacesMod

import typings.sentryHub.anon.Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Carrier extends js.Object {
  
  var __SENTRY__ : js.UndefOr[Extensions] = js.native
}
object Carrier {
  
  @scala.inline
  def apply(): Carrier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Carrier]
  }
  
  @scala.inline
  implicit class CarrierOps[Self <: Carrier] (val x: Self) extends AnyVal {
    
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
    def set__SENTRY__(value: Extensions): Self = this.set("__SENTRY__", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__SENTRY__ : Self = this.set("__SENTRY__", js.undefined)
  }
}
