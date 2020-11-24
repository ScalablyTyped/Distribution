package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.storeDotpublish
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import typings.relayRuntime.relayStoreTypesMod.RecordSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'store.publish',   source :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.RecordSource,   optimistic :boolean}> */
@js.native
trait Readonlynamestorepublishs extends LogEvent {
  
  val name: storeDotpublish = js.native
  
  val optimistic: Boolean = js.native
  
  val source: RecordSource = js.native
}
object Readonlynamestorepublishs {
  
  @scala.inline
  def apply(name: storeDotpublish, optimistic: Boolean, source: RecordSource): Readonlynamestorepublishs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optimistic = optimistic.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamestorepublishs]
  }
  
  @scala.inline
  implicit class ReadonlynamestorepublishsOps[Self <: Readonlynamestorepublishs] (val x: Self) extends AnyVal {
    
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
    def setName(value: storeDotpublish): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimistic(value: Boolean): Self = this.set("optimistic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: RecordSource): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
