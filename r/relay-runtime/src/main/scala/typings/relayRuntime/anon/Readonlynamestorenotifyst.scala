package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.storeDotnotifyDotstart
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'store.notify.start'}> */
@js.native
trait Readonlynamestorenotifyst extends LogEvent {
  
  val name: storeDotnotifyDotstart = js.native
}
object Readonlynamestorenotifyst {
  
  @scala.inline
  def apply(name: storeDotnotifyDotstart): Readonlynamestorenotifyst = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamestorenotifyst]
  }
  
  @scala.inline
  implicit class ReadonlynamestorenotifystOps[Self <: Readonlynamestorenotifyst] (val x: Self) extends AnyVal {
    
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
    def setName(value: storeDotnotifyDotstart): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
