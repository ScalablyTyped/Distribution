package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.storeDotsnapshot
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'store.snapshot'}> */
@js.native
trait Readonlynamestoresnapshot extends LogEvent {
  
  val name: storeDotsnapshot = js.native
}
object Readonlynamestoresnapshot {
  
  @scala.inline
  def apply(name: storeDotsnapshot): Readonlynamestoresnapshot = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamestoresnapshot]
  }
  
  @scala.inline
  implicit class ReadonlynamestoresnapshotOps[Self <: Readonlynamestoresnapshot] (val x: Self) extends AnyVal {
    
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
    def setName(value: storeDotsnapshot): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
