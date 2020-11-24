package typings.storybookComponents.argsTableArgsTableMod

import typings.storybookComponents.typesMod.ArgTypes
import typings.storybookComponents.typesMod.Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgsTableRowProps extends ArgsTableProps {
  
  var args: js.UndefOr[Args] = js.native
  
  var compact: js.UndefOr[Boolean] = js.native
  
  var inAddonPanel: js.UndefOr[Boolean] = js.native
  
  var initialExpandedArgs: js.UndefOr[Boolean] = js.native
  
  var resetArgs: js.UndefOr[js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]] = js.native
  
  var rows: ArgTypes = js.native
  
  var updateArgs: js.UndefOr[js.Function1[/* args */ Args, Unit]] = js.native
}
object ArgsTableRowProps {
  
  @scala.inline
  def apply(rows: ArgTypes): ArgsTableRowProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsTableRowProps]
  }
  
  @scala.inline
  implicit class ArgsTableRowPropsOps[Self <: ArgsTableRowProps] (val x: Self) extends AnyVal {
    
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
    def setRows(value: ArgTypes): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: Args): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setInAddonPanel(value: Boolean): Self = this.set("inAddonPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInAddonPanel: Self = this.set("inAddonPanel", js.undefined)
    
    @scala.inline
    def setInitialExpandedArgs(value: Boolean): Self = this.set("initialExpandedArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialExpandedArgs: Self = this.set("initialExpandedArgs", js.undefined)
    
    @scala.inline
    def setResetArgs(value: /* argNames */ js.UndefOr[js.Array[String]] => Unit): Self = this.set("resetArgs", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResetArgs: Self = this.set("resetArgs", js.undefined)
    
    @scala.inline
    def setUpdateArgs(value: /* args */ Args => Unit): Self = this.set("updateArgs", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdateArgs: Self = this.set("updateArgs", js.undefined)
  }
}
