package typings.rollup.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RollupError extends RollupLogProps {
  
  var parserError: js.UndefOr[Error] = js.native
  
  var stack: js.UndefOr[String] = js.native
  
  var watchFiles: js.UndefOr[js.Array[String]] = js.native
}
object RollupError {
  
  @scala.inline
  def apply(message: String): RollupError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupError]
  }
  
  @scala.inline
  implicit class RollupErrorOps[Self <: RollupError] (val x: Self) extends AnyVal {
    
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
    def setParserError(value: Error): Self = this.set("parserError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParserError: Self = this.set("parserError", js.undefined)
    
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    
    @scala.inline
    def setWatchFilesVarargs(value: String*): Self = this.set("watchFiles", js.Array(value :_*))
    
    @scala.inline
    def setWatchFiles(value: js.Array[String]): Self = this.set("watchFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchFiles: Self = this.set("watchFiles", js.undefined)
  }
}
