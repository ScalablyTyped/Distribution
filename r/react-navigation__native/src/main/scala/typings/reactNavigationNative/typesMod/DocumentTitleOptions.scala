package typings.reactNavigationNative.typesMod

import typings.reactNavigationRouters.typesMod.Route
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentTitleOptions extends js.Object {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var formatter: js.UndefOr[
    js.Function2[
      /* options */ js.UndefOr[Record[String, _]], 
      /* route */ js.UndefOr[Route[String, js.UndefOr[js.Object]]], 
      String
    ]
  ] = js.native
}
object DocumentTitleOptions {
  
  @scala.inline
  def apply(): DocumentTitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTitleOptions]
  }
  
  @scala.inline
  implicit class DocumentTitleOptionsOps[Self <: DocumentTitleOptions] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFormatter(
      value: (/* options */ js.UndefOr[Record[String, _]], /* route */ js.UndefOr[Route[String, js.UndefOr[js.Object]]]) => String
    ): Self = this.set("formatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
  }
}
