package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.entrypointDotrootDotconsume
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'entrypoint.root.consume',   profilerContext :any,   rootModuleID :string}> */
@js.native
trait Readonlynameentrypointroo extends LogEvent {
  
  val name: entrypointDotrootDotconsume = js.native
  
  val profilerContext: js.Any = js.native
  
  val rootModuleID: String = js.native
}
object Readonlynameentrypointroo {
  
  @scala.inline
  def apply(name: entrypointDotrootDotconsume, profilerContext: js.Any, rootModuleID: String): Readonlynameentrypointroo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], profilerContext = profilerContext.asInstanceOf[js.Any], rootModuleID = rootModuleID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynameentrypointroo]
  }
  
  @scala.inline
  implicit class ReadonlynameentrypointrooOps[Self <: Readonlynameentrypointroo] (val x: Self) extends AnyVal {
    
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
    def setName(value: entrypointDotrootDotconsume): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilerContext(value: js.Any): Self = this.set("profilerContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootModuleID(value: String): Self = this.set("rootModuleID", value.asInstanceOf[js.Any])
  }
}
