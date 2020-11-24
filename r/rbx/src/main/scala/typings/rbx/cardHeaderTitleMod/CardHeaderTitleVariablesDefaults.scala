package typings.rbx.cardHeaderTitleMod

import typings.rbx.rbxStrings.centered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardHeaderTitleVariablesDefaults extends js.Object {
  
  var alignments: centered = js.native
}
object CardHeaderTitleVariablesDefaults {
  
  @scala.inline
  def apply(alignments: centered): CardHeaderTitleVariablesDefaults = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardHeaderTitleVariablesDefaults]
  }
  
  @scala.inline
  implicit class CardHeaderTitleVariablesDefaultsOps[Self <: CardHeaderTitleVariablesDefaults] (val x: Self) extends AnyVal {
    
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
    def setAlignments(value: centered): Self = this.set("alignments", value.asInstanceOf[js.Any])
  }
}
