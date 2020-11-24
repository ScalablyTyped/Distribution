package typings.storybookComponents.tabbedArgsTableMod

import typings.std.Record
import typings.storybookComponents.argsTableArgsTableMod.ArgsTableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabbedArgsTableProps extends js.Object {
  
  var tabs: Record[String, ArgsTableProps] = js.native
}
object TabbedArgsTableProps {
  
  @scala.inline
  def apply(tabs: Record[String, ArgsTableProps]): TabbedArgsTableProps = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbedArgsTableProps]
  }
  
  @scala.inline
  implicit class TabbedArgsTablePropsOps[Self <: TabbedArgsTableProps] (val x: Self) extends AnyVal {
    
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
    def setTabs(value: Record[String, ArgsTableProps]): Self = this.set("tabs", value.asInstanceOf[js.Any])
  }
}
