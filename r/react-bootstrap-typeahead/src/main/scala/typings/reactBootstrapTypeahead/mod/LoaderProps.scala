package typings.reactBootstrapTypeahead.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoaderProps extends js.Object {
  
  var bsSize: TypeaheadBsSizes = js.native
}
object LoaderProps {
  
  @scala.inline
  def apply(bsSize: TypeaheadBsSizes): LoaderProps = {
    val __obj = js.Dynamic.literal(bsSize = bsSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderProps]
  }
  
  @scala.inline
  implicit class LoaderPropsOps[Self <: LoaderProps] (val x: Self) extends AnyVal {
    
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
    def setBsSize(value: TypeaheadBsSizes): Self = this.set("bsSize", value.asInstanceOf[js.Any])
  }
}
