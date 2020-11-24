package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.storeDotrestore
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'store.restore'}> */
@js.native
trait Readonlynamestorerestore extends LogEvent {
  
  val name: storeDotrestore = js.native
}
object Readonlynamestorerestore {
  
  @scala.inline
  def apply(name: storeDotrestore): Readonlynamestorerestore = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamestorerestore]
  }
  
  @scala.inline
  implicit class ReadonlynamestorerestoreOps[Self <: Readonlynamestorerestore] (val x: Self) extends AnyVal {
    
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
    def setName(value: storeDotrestore): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
