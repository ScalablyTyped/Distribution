package typings.storybookComponents.argRowMod

import typings.storybookComponents.typesMod.ArgType
import typings.storybookComponents.typesMod.Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgRowProps extends js.Object {
  
  var arg: js.Any = js.native
  
  var compact: js.UndefOr[Boolean] = js.native
  
  var expandable: js.UndefOr[Boolean] = js.native
  
  var initialExpandedArgs: js.UndefOr[Boolean] = js.native
  
  var row: ArgType = js.native
  
  var updateArgs: js.UndefOr[js.Function1[/* args */ Args, Unit]] = js.native
}
object ArgRowProps {
  
  @scala.inline
  def apply(arg: js.Any, row: ArgType): ArgRowProps = {
    val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgRowProps]
  }
  
  @scala.inline
  implicit class ArgRowPropsOps[Self <: ArgRowProps] (val x: Self) extends AnyVal {
    
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
    def setArg(value: js.Any): Self = this.set("arg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: ArgType): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setExpandable(value: Boolean): Self = this.set("expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandable: Self = this.set("expandable", js.undefined)
    
    @scala.inline
    def setInitialExpandedArgs(value: Boolean): Self = this.set("initialExpandedArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialExpandedArgs: Self = this.set("initialExpandedArgs", js.undefined)
    
    @scala.inline
    def setUpdateArgs(value: /* args */ Args => Unit): Self = this.set("updateArgs", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdateArgs: Self = this.set("updateArgs", js.undefined)
  }
}
