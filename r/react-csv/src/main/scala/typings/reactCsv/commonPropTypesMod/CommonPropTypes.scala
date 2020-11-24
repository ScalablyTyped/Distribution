package typings.reactCsv.commonPropTypesMod

import typings.react.mod.MouseEventHandler
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonPropTypes extends js.Object {
  
  var asyncOnClick: js.UndefOr[Boolean] = js.native
  
  var data: String | Data = js.native
  
  var enclosingCharacter: js.UndefOr[String] = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[Headers] = js.native
  
  var onClick: js.UndefOr[SyncClickHandler | AsyncClickHandler] = js.native
  
  var separator: js.UndefOr[String] = js.native
  
  var uFEFF: js.UndefOr[Boolean] = js.native
}
object CommonPropTypes {
  
  @scala.inline
  def apply(data: String | Data): CommonPropTypes = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonPropTypes]
  }
  
  @scala.inline
  implicit class CommonPropTypesOps[Self <: CommonPropTypes] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: js.Object*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: String | Data): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncOnClick(value: Boolean): Self = this.set("asyncOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncOnClick: Self = this.set("asyncOnClick", js.undefined)
    
    @scala.inline
    def setEnclosingCharacter(value: String): Self = this.set("enclosingCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnclosingCharacter: Self = this.set("enclosingCharacter", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: (LabelKeyObject | String)*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setOnClickFunction2(
      value: (/* event */ MouseEventHandler[HTMLAnchorElement], /* done */ js.Function1[/* proceed */ js.UndefOr[Boolean], Unit]) => Unit
    ): Self = this.set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnClickFunction1(value: /* event */ MouseEventHandler[HTMLAnchorElement] => Boolean | Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClick(value: SyncClickHandler | AsyncClickHandler): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setUFEFF(value: Boolean): Self = this.set("uFEFF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUFEFF: Self = this.set("uFEFF", js.undefined)
  }
}
