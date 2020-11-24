package typings.reactNavigationRouters.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2`[Params /* <: js.UndefOr[js.Object] */] extends js.Object {
  
  /**
    * Params for this route
    */
  var params: js.UndefOr[Params] = js.native
}
object `2` {
  
  @scala.inline
  def apply[Params /* <: js.UndefOr[js.Object] */](): `2`[Params] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`[Params]]
  }
  
  @scala.inline
  implicit class `2Ops`[Self <: `2`[_], Params /* <: js.UndefOr[js.Object] */] (val x: Self with `2`[Params]) extends AnyVal {
    
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
    def setParams(value: Params): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
}
