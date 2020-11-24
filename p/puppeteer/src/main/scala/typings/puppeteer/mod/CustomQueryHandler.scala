package typings.puppeteer.mod

import typings.std.Document
import typings.std.Element
import typings.std.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomQueryHandler extends js.Object {
  
  var queryAll: js.UndefOr[
    js.Function2[
      /* element */ Element | Document, 
      /* selector */ String, 
      js.Array[Element] | NodeListOf[Element]
    ]
  ] = js.native
  
  var queryOne: js.UndefOr[
    js.Function2[/* element */ Element | Document, /* selector */ String, Element | Null]
  ] = js.native
}
object CustomQueryHandler {
  
  @scala.inline
  def apply(): CustomQueryHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomQueryHandler]
  }
  
  @scala.inline
  implicit class CustomQueryHandlerOps[Self <: CustomQueryHandler] (val x: Self) extends AnyVal {
    
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
    def setQueryAll(
      value: (/* element */ Element | Document, /* selector */ String) => js.Array[Element] | NodeListOf[Element]
    ): Self = this.set("queryAll", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteQueryAll: Self = this.set("queryAll", js.undefined)
    
    @scala.inline
    def setQueryOne(value: (/* element */ Element | Document, /* selector */ String) => Element | Null): Self = this.set("queryOne", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteQueryOne: Self = this.set("queryOne", js.undefined)
  }
}
