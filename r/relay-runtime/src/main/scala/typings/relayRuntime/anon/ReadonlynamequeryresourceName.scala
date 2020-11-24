package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.queryresourceDotretain
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'queryresource.retain',   resourceID :number,   profilerContext :any}> */
@js.native
trait ReadonlynamequeryresourceName extends LogEvent {
  
  val name: queryresourceDotretain = js.native
  
  val profilerContext: js.Any = js.native
  
  val resourceID: Double = js.native
}
object ReadonlynamequeryresourceName {
  
  @scala.inline
  def apply(name: queryresourceDotretain, profilerContext: js.Any, resourceID: Double): ReadonlynamequeryresourceName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], profilerContext = profilerContext.asInstanceOf[js.Any], resourceID = resourceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlynamequeryresourceName]
  }
  
  @scala.inline
  implicit class ReadonlynamequeryresourceNameOps[Self <: ReadonlynamequeryresourceName] (val x: Self) extends AnyVal {
    
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
    def setName(value: queryresourceDotretain): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilerContext(value: js.Any): Self = this.set("profilerContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceID(value: Double): Self = this.set("resourceID", value.asInstanceOf[js.Any])
  }
}
