package typings.saucelabs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cta
  extends /* key */ StringDictionary[js.Any] {
  
  var cta: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
}
object Cta {
  
  @scala.inline
  def apply(): Cta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cta]
  }
  
  @scala.inline
  implicit class CtaOps[Self <: Cta] (val x: Self) extends AnyVal {
    
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
    def setCta(value: String): Self = this.set("cta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCta: Self = this.set("cta", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
