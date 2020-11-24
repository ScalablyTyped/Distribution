package typings.rcSelect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrevValueOptions[OptionsType /* <: js.Array[js.Object] */] extends js.Object {
  
  var prevValueOptions: js.UndefOr[js.Array[OptionsType]] = js.native
}
object PrevValueOptions {
  
  @scala.inline
  def apply[OptionsType /* <: js.Array[js.Object] */](): PrevValueOptions[OptionsType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrevValueOptions[OptionsType]]
  }
  
  @scala.inline
  implicit class PrevValueOptionsOps[Self <: PrevValueOptions[_], OptionsType /* <: js.Array[js.Object] */] (val x: Self with PrevValueOptions[OptionsType]) extends AnyVal {
    
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
    def setPrevValueOptionsVarargs(value: OptionsType*): Self = this.set("prevValueOptions", js.Array(value :_*))
    
    @scala.inline
    def setPrevValueOptions(value: js.Array[OptionsType]): Self = this.set("prevValueOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevValueOptions: Self = this.set("prevValueOptions", js.undefined)
  }
}
