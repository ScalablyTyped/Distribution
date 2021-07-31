package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.storeDotpublish
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import typings.relayRuntime.relayStoreTypesMod.RecordSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'store.publish',   source :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.RecordSource,   optimistic :boolean}> */
trait Readonlynamestorepublishs
  extends StObject
     with LogEvent {
  
  val name: storeDotpublish
  
  val optimistic: Boolean
  
  val source: RecordSource
}
object Readonlynamestorepublishs {
  
  @scala.inline
  def apply(optimistic: Boolean, source: RecordSource): Readonlynamestorepublishs = {
    val __obj = js.Dynamic.literal(name = "store.publish", optimistic = optimistic.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamestorepublishs]
  }
  
  @scala.inline
  implicit class ReadonlynamestorepublishsMutableBuilder[Self <: Readonlynamestorepublishs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: storeDotpublish): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimistic(value: Boolean): Self = StObject.set(x, "optimistic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: RecordSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
