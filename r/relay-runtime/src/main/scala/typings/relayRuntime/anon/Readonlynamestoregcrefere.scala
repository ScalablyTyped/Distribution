package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.storeDotgc
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'store.gc',   references :std.Set<relay-runtime.relay-runtime/lib/util/RelayRuntimeTypes.DataID>}> */
trait Readonlynamestoregcrefere
  extends StObject
     with LogEvent {
  
  val name: storeDotgc
  
  val references: Set[DataID]
}
object Readonlynamestoregcrefere {
  
  @scala.inline
  def apply(references: Set[DataID]): Readonlynamestoregcrefere = {
    val __obj = js.Dynamic.literal(name = "store.gc", references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamestoregcrefere]
  }
  
  @scala.inline
  implicit class ReadonlynamestoregcrefereMutableBuilder[Self <: Readonlynamestoregcrefere] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: storeDotgc): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferences(value: Set[DataID]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
  }
}
