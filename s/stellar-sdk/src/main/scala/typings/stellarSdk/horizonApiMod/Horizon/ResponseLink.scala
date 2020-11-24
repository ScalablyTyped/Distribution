package typings.stellarSdk.horizonApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseLink extends js.Object {
  
  var href: String = js.native
  
  var templated: js.UndefOr[Boolean] = js.native
}
object ResponseLink {
  
  @scala.inline
  def apply(href: String): ResponseLink = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseLink]
  }
  
  @scala.inline
  implicit class ResponseLinkOps[Self <: ResponseLink] (val x: Self) extends AnyVal {
    
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
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplated(value: Boolean): Self = this.set("templated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplated: Self = this.set("templated", js.undefined)
  }
}
