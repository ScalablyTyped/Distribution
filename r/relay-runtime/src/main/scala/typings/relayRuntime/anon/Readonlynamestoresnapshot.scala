package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.storeDotsnapshot
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'store.snapshot'}> */
trait Readonlynamestoresnapshot
  extends StObject
     with LogEvent {
  
  val name: storeDotsnapshot
}
object Readonlynamestoresnapshot {
  
  @scala.inline
  def apply(): Readonlynamestoresnapshot = {
    val __obj = js.Dynamic.literal(name = "store.snapshot")
    __obj.asInstanceOf[Readonlynamestoresnapshot]
  }
  
  @scala.inline
  implicit class ReadonlynamestoresnapshotMutableBuilder[Self <: Readonlynamestoresnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: storeDotsnapshot): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
