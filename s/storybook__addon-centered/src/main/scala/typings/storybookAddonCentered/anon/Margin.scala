package typings.storybookAddonCentered.anon

import typings.storybookAddonCentered.storybookAddonCenteredStrings.`100Percentsign`
import typings.storybookAddonCentered.storybookAddonCenteredStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Margin extends js.Object {
  
  val margin: auto = js.native
  
  val maxHeight: `100Percentsign` = js.native
}
object Margin {
  
  @scala.inline
  def apply(margin: auto, maxHeight: `100Percentsign`): Margin = {
    val __obj = js.Dynamic.literal(margin = margin.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Margin]
  }
  
  @scala.inline
  implicit class MarginOps[Self <: Margin] (val x: Self) extends AnyVal {
    
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
    def setMargin(value: auto): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeight(value: `100Percentsign`): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
  }
}
