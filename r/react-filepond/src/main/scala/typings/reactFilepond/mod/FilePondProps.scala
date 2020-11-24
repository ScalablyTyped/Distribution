package typings.reactFilepond.mod

import typings.filepond.mod.FilePondBaseProps
import typings.filepond.mod.FilePondCallbackProps
import typings.filepond.mod.FilePondDragDropProps
import typings.filepond.mod.FilePondHookProps
import typings.filepond.mod.FilePondLabelProps
import typings.filepond.mod.FilePondServerConfigProps
import typings.filepond.mod.FilePondStyleProps
import typings.filepond.mod.FilePondSvgIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilePondProps
  extends FilePondDragDropProps
     with FilePondServerConfigProps
     with FilePondLabelProps
     with FilePondSvgIconProps
     with FilePondCallbackProps
     with FilePondHookProps
     with FilePondStyleProps
     with FilePondBaseProps {
  
  // (Temporarily) changed to old definition, see discussion at <https://github.com/pqina/react-filepond/pull/151>
  // acceptedFileTypes?: React.InputHTMLAttributes<any>['accept'];
  var acceptedFileTypes: js.UndefOr[js.Array[String]] = js.native
}
object FilePondProps {
  
  @scala.inline
  def apply(): FilePondProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondProps]
  }
  
  @scala.inline
  implicit class FilePondPropsOps[Self <: FilePondProps] (val x: Self) extends AnyVal {
    
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
    def setAcceptedFileTypesVarargs(value: String*): Self = this.set("acceptedFileTypes", js.Array(value :_*))
    
    @scala.inline
    def setAcceptedFileTypes(value: js.Array[String]): Self = this.set("acceptedFileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptedFileTypes: Self = this.set("acceptedFileTypes", js.undefined)
  }
}
