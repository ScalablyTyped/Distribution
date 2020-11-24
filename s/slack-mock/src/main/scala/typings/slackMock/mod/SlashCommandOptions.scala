package typings.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlashCommandOptions[T] extends js.Object {
  
  var body: js.UndefOr[T] = js.native
  
  var headers: js.UndefOr[SlashCommandHttpHeaders] = js.native
  
  var statusCode: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[SlashCommandUrl] = js.native
}
object SlashCommandOptions {
  
  @scala.inline
  def apply[T](): SlashCommandOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlashCommandOptions[T]]
  }
  
  @scala.inline
  implicit class SlashCommandOptionsOps[Self <: SlashCommandOptions[_], T] (val x: Self with SlashCommandOptions[T]) extends AnyVal {
    
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
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setHeaders(value: SlashCommandHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
    
    @scala.inline
    def setUrl(value: SlashCommandUrl): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
