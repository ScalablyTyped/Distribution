package typings.sipJs.messagerOptionsMod

import typings.sipJs.anon.FromDisplayName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagerOptions extends js.Object {
  
  /** Array of extra headers added to the MESSAGE. */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  
  /** @deprecated TODO: provide alternative. */
  var params: js.UndefOr[FromDisplayName] = js.native
}
object MessagerOptions {
  
  @scala.inline
  def apply(): MessagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagerOptions]
  }
  
  @scala.inline
  implicit class MessagerOptionsOps[Self <: MessagerOptions] (val x: Self) extends AnyVal {
    
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
    def setExtraHeadersVarargs(value: String*): Self = this.set("extraHeaders", js.Array(value :_*))
    
    @scala.inline
    def setExtraHeaders(value: js.Array[String]): Self = this.set("extraHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraHeaders: Self = this.set("extraHeaders", js.undefined)
    
    @scala.inline
    def setParams(value: FromDisplayName): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
}
