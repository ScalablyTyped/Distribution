package typings.storybookComponents.sectionRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SectionRowProps extends js.Object {
  
  var colSpan: Double = js.native
  
  var initialExpanded: js.UndefOr[Boolean] = js.native
  
  var label: String = js.native
  
  var level: Level = js.native
}
object SectionRowProps {
  
  @scala.inline
  def apply(colSpan: Double, label: String, level: Level): SectionRowProps = {
    val __obj = js.Dynamic.literal(colSpan = colSpan.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionRowProps]
  }
  
  @scala.inline
  implicit class SectionRowPropsOps[Self <: SectionRowProps] (val x: Self) extends AnyVal {
    
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
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Level): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialExpanded(value: Boolean): Self = this.set("initialExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialExpanded: Self = this.set("initialExpanded", js.undefined)
  }
}
