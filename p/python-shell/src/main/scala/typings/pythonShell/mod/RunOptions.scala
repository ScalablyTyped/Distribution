package typings.pythonShell.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunOptions extends js.Object {
  
  var args: js.UndefOr[js.Array[String]] = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
  var formatter: js.UndefOr[String] = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var parser: js.UndefOr[String] = js.native
  
  var pythonOptions: js.UndefOr[js.Array[String]] = js.native
  
  var pythonPath: js.UndefOr[String] = js.native
  
  var scriptPath: js.UndefOr[String] = js.native
}
object RunOptions {
  
  @scala.inline
  def apply(): RunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunOptions]
  }
  
  @scala.inline
  implicit class RunOptionsOps[Self <: RunOptions] (val x: Self) extends AnyVal {
    
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
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFormatter(value: String): Self = this.set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setParser(value: String): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    
    @scala.inline
    def setPythonOptionsVarargs(value: String*): Self = this.set("pythonOptions", js.Array(value :_*))
    
    @scala.inline
    def setPythonOptions(value: js.Array[String]): Self = this.set("pythonOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePythonOptions: Self = this.set("pythonOptions", js.undefined)
    
    @scala.inline
    def setPythonPath(value: String): Self = this.set("pythonPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePythonPath: Self = this.set("pythonPath", js.undefined)
    
    @scala.inline
    def setScriptPath(value: String): Self = this.set("scriptPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptPath: Self = this.set("scriptPath", js.undefined)
  }
}
