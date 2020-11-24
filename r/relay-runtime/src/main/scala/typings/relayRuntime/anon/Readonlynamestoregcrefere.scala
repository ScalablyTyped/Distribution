package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.storeDotgc
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'store.gc',   references :std.Set<relay-runtime.relay-runtime/lib/util/RelayRuntimeTypes.DataID>}> */
@js.native
trait Readonlynamestoregcrefere extends LogEvent {
  
  val name: storeDotgc = js.native
  
  val references: Set[DataID] = js.native
}
object Readonlynamestoregcrefere {
  
  @scala.inline
  def apply(name: storeDotgc, references: Set[DataID]): Readonlynamestoregcrefere = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamestoregcrefere]
  }
  
  @scala.inline
  implicit class ReadonlynamestoregcrefereOps[Self <: Readonlynamestoregcrefere] (val x: Self) extends AnyVal {
    
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
    def setName(value: storeDotgc): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferences(value: Set[DataID]): Self = this.set("references", value.asInstanceOf[js.Any])
  }
}
