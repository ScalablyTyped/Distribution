package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.storeDotsnapshot
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import org.scalablytyped.runtime.StObject
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
  implicit class ReadonlynamestoresnapshotMutableBuilder[Self <: Readonlynamestoresnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: storeDotsnapshot): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
