package typings.reactBootstrapTable2Filter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomFilterProps extends js.Object {
  
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  var comparator: js.UndefOr[Comparator] = js.native
  
  var `type`: js.UndefOr[String | FILTER_TYPES] = js.native
}
object CustomFilterProps {
  
  @scala.inline
  def apply(): CustomFilterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFilterProps]
  }
  
  @scala.inline
  implicit class CustomFilterPropsOps[Self <: CustomFilterProps] (val x: Self) extends AnyVal {
    
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setComparator(value: Comparator): Self = this.set("comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    
    @scala.inline
    def setType(value: String | FILTER_TYPES): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
