package typings.regeneratorRuntime.anon

import typings.regeneratorRuntime.mod.CompletionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<regenerator-runtime.regenerator-runtime.CompletionRecord> */
@js.native
trait ReadonlyCompletionRecord extends js.Object {
  
  val arg: js.Any = js.native
  
  val `type`: CompletionType = js.native
}
object ReadonlyCompletionRecord {
  
  @scala.inline
  def apply(arg: js.Any, `type`: CompletionType): ReadonlyCompletionRecord = {
    val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyCompletionRecord]
  }
  
  @scala.inline
  implicit class ReadonlyCompletionRecordOps[Self <: ReadonlyCompletionRecord] (val x: Self) extends AnyVal {
    
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
    def setArg(value: js.Any): Self = this.set("arg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CompletionType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
