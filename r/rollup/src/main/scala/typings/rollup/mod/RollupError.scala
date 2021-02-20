package typings.rollup.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
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
  implicit class RollupErrorMutableBuilder[Self <: RollupError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParserError(value: Error): Self = StObject.set(x, "parserError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParserErrorUndefined: Self = StObject.set(x, "parserError", js.undefined)
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setWatchFiles(value: js.Array[String]): Self = StObject.set(x, "watchFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchFilesUndefined: Self = StObject.set(x, "watchFiles", js.undefined)
    
    @scala.inline
    def setWatchFilesVarargs(value: String*): Self = StObject.set(x, "watchFiles", js.Array(value :_*))
  }
}
