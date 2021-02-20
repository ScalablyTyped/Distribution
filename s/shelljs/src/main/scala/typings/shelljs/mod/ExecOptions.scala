package typings.shelljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecOptions
  extends typings.node.childProcessMod.ExecOptions {
  
  /**
    * Asynchronous execution.
    *
    * If a callback is provided, it will be set to `true`, regardless of the passed value.
    *
    * @default false
    */
  var async: js.UndefOr[Boolean] = js.native
  
  /**
    * Character encoding to use.
    *
    * Affects the values returned by `stdout` and `stderr`,
    * and what is written to `stdout` and `stderr` when not in silent mode
    *
    * @default "utf8"
    */
  var encoding: js.UndefOr[String] = js.native
  
  /**
    * Exit when command return code is non-zero.
    *
    * @default false
    */
  var fatal: js.UndefOr[Boolean] = js.native
  
  /**
    * Do not echo program output to the console.
    *
    * @default false
    */
  var silent: js.UndefOr[Boolean] = js.native
}
object ExecOptions {
  
  @scala.inline
  def apply(): ExecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecOptions]
  }
  
  @scala.inline
  implicit class ExecOptionsMutableBuilder[Self <: ExecOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
