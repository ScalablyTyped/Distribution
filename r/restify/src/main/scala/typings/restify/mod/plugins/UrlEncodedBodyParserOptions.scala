package typings.restify.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlEncodedBodyParserOptions extends js.Object {
  
  var bodyReader: js.UndefOr[Boolean] = js.native
  
  var mapParams: js.UndefOr[Boolean] = js.native
  
  var overrideParams: js.UndefOr[Boolean] = js.native
}
object UrlEncodedBodyParserOptions {
  
  @scala.inline
  def apply(): UrlEncodedBodyParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlEncodedBodyParserOptions]
  }
  
  @scala.inline
  implicit class UrlEncodedBodyParserOptionsOps[Self <: UrlEncodedBodyParserOptions] (val x: Self) extends AnyVal {
    
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
    def setBodyReader(value: Boolean): Self = this.set("bodyReader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyReader: Self = this.set("bodyReader", js.undefined)
    
    @scala.inline
    def setMapParams(value: Boolean): Self = this.set("mapParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapParams: Self = this.set("mapParams", js.undefined)
    
    @scala.inline
    def setOverrideParams(value: Boolean): Self = this.set("overrideParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideParams: Self = this.set("overrideParams", js.undefined)
  }
}
