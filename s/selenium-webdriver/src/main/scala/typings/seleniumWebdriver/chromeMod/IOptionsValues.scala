package typings.seleniumWebdriver.chromeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptionsValues extends js.Object {
  
  var args: js.Array[String] = js.native
  
  var binary: js.UndefOr[String] = js.native
  
  var detach: Boolean = js.native
  
  var extensions: js.Array[String] = js.native
  
  var localState: js.UndefOr[js.Any] = js.native
  
  var logFile: js.UndefOr[String] = js.native
  
  var prefs: js.UndefOr[js.Any] = js.native
}
object IOptionsValues {
  
  @scala.inline
  def apply(args: js.Array[String], detach: Boolean, extensions: js.Array[String]): IOptionsValues = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], detach = detach.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptionsValues]
  }
  
  @scala.inline
  implicit class IOptionsValuesOps[Self <: IOptionsValues] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetach(value: Boolean): Self = this.set("detach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinary(value: String): Self = this.set("binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    
    @scala.inline
    def setLocalState(value: js.Any): Self = this.set("localState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalState: Self = this.set("localState", js.undefined)
    
    @scala.inline
    def setLogFile(value: String): Self = this.set("logFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogFile: Self = this.set("logFile", js.undefined)
    
    @scala.inline
    def setPrefs(value: js.Any): Self = this.set("prefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefs: Self = this.set("prefs", js.undefined)
  }
}
