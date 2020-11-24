package typings.sentryTypes.stackframeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackFrame extends js.Object {
  
  var abs_path: js.UndefOr[String] = js.native
  
  var colno: js.UndefOr[Double] = js.native
  
  var context_line: js.UndefOr[String] = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var function: js.UndefOr[String] = js.native
  
  var in_app: js.UndefOr[Boolean] = js.native
  
  var lineno: js.UndefOr[Double] = js.native
  
  var module: js.UndefOr[String] = js.native
  
  var platform: js.UndefOr[String] = js.native
  
  var post_context: js.UndefOr[js.Array[String]] = js.native
  
  var pre_context: js.UndefOr[js.Array[String]] = js.native
  
  var vars: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object StackFrame {
  
  @scala.inline
  def apply(): StackFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackFrame]
  }
  
  @scala.inline
  implicit class StackFrameOps[Self <: StackFrame] (val x: Self) extends AnyVal {
    
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
    def setAbs_path(value: String): Self = this.set("abs_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbs_path: Self = this.set("abs_path", js.undefined)
    
    @scala.inline
    def setColno(value: Double): Self = this.set("colno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColno: Self = this.set("colno", js.undefined)
    
    @scala.inline
    def setContext_line(value: String): Self = this.set("context_line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext_line: Self = this.set("context_line", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setFunction(value: String): Self = this.set("function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunction: Self = this.set("function", js.undefined)
    
    @scala.inline
    def setIn_app(value: Boolean): Self = this.set("in_app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn_app: Self = this.set("in_app", js.undefined)
    
    @scala.inline
    def setLineno(value: Double): Self = this.set("lineno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineno: Self = this.set("lineno", js.undefined)
    
    @scala.inline
    def setModule(value: String): Self = this.set("module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setPost_contextVarargs(value: String*): Self = this.set("post_context", js.Array(value :_*))
    
    @scala.inline
    def setPost_context(value: js.Array[String]): Self = this.set("post_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePost_context: Self = this.set("post_context", js.undefined)
    
    @scala.inline
    def setPre_contextVarargs(value: String*): Self = this.set("pre_context", js.Array(value :_*))
    
    @scala.inline
    def setPre_context(value: js.Array[String]): Self = this.set("pre_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePre_context: Self = this.set("pre_context", js.undefined)
    
    @scala.inline
    def setVars(value: StringDictionary[js.Any]): Self = this.set("vars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVars: Self = this.set("vars", js.undefined)
  }
}
