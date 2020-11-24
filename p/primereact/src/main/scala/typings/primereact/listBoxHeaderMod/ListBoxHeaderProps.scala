package typings.primereact.listBoxHeaderMod

import typings.primereact.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBoxHeaderProps extends js.Object {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var filter: js.UndefOr[String] = js.native
  
  var onFilter: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
}
object ListBoxHeaderProps {
  
  @scala.inline
  def apply(): ListBoxHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxHeaderProps]
  }
  
  @scala.inline
  implicit class ListBoxHeaderPropsOps[Self <: ListBoxHeaderProps] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setOnFilter(value: /* e */ Value => Unit): Self = this.set("onFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFilter: Self = this.set("onFilter", js.undefined)
  }
}
