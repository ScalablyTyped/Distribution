package typings.reactFileUtils.anon

import typings.react.mod.ReactNode
import typings.reactFileUtils.mod.FileLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accept extends js.Object {
  
  /**
    * Set accepted file types. See https://github.com/okonet/attr-accept for more information.
    * Keep in mind that mime type determination is not reliable across platforms.
    * CSV files; for example; are reported as text/plain under macOS but as application/vnd.ms-excel under Windows.
    * In some cases there might not be a mime type set at all.
    *
    * One of type: `string; string[]`
    */
  var accept: js.UndefOr[String | js.Array[String]] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  /** Enable/disable the dropzone */
  var disabled: js.UndefOr[Boolean] = js.native
  
  var handleFiles: js.UndefOr[js.Function1[/* files */ js.Array[FileLike], Unit]] = js.native
  
  /** Allow drag 'n' drop (or selection from the file dialog) of multiple files */
  var multiple: js.UndefOr[Boolean] = js.native
}
object Accept {
  
  @scala.inline
  def apply(): Accept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accept]
  }
  
  @scala.inline
  implicit class AcceptOps[Self <: Accept] (val x: Self) extends AnyVal {
    
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
    def setAcceptVarargs(value: String*): Self = this.set("accept", js.Array(value :_*))
    
    @scala.inline
    def setAccept(value: String | js.Array[String]): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setHandleFiles(value: /* files */ js.Array[FileLike] => Unit): Self = this.set("handleFiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandleFiles: Self = this.set("handleFiles", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
  }
}
