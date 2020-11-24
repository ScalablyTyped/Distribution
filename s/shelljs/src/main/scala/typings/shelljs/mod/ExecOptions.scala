package typings.shelljs.mod

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
  implicit class ExecOptionsOps[Self <: ExecOptions] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFatal(value: Boolean): Self = this.set("fatal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFatal: Self = this.set("fatal", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
}
