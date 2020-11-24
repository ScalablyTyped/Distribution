package typings.rcSelect.anon

import typings.rcSelect.interfaceMod.OptionData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends js.Object {
  
  var prevValueOptions: js.UndefOr[js.Array[OptionData]] = js.native
}
object `1` {
  
  @scala.inline
  def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1Ops`[Self <: `1`] (val x: Self) extends AnyVal {
    
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
    def setPrevValueOptionsVarargs(value: OptionData*): Self = this.set("prevValueOptions", js.Array(value :_*))
    
    @scala.inline
    def setPrevValueOptions(value: js.Array[OptionData]): Self = this.set("prevValueOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevValueOptions: Self = this.set("prevValueOptions", js.undefined)
  }
}
