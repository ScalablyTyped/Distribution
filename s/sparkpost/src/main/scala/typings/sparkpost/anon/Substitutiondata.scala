package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Substitutiondata extends js.Object {
  
  var draft: js.UndefOr[Boolean] = js.native
  
  var substitution_data: js.UndefOr[js.Any] = js.native
}
object Substitutiondata {
  
  @scala.inline
  def apply(): Substitutiondata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Substitutiondata]
  }
  
  @scala.inline
  implicit class SubstitutiondataOps[Self <: Substitutiondata] (val x: Self) extends AnyVal {
    
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
    def setDraft(value: Boolean): Self = this.set("draft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraft: Self = this.set("draft", js.undefined)
    
    @scala.inline
    def setSubstitution_data(value: js.Any): Self = this.set("substitution_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubstitution_data: Self = this.set("substitution_data", js.undefined)
  }
}
