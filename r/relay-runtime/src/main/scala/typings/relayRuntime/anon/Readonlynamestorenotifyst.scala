package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.storeDotnotifyDotstart
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'store.notify.start'}> */
@js.native
trait Readonlynamestorenotifyst extends LogEvent {
  
  val name: storeDotnotifyDotstart = js.native
}
object Readonlynamestorenotifyst {
  
  @scala.inline
  def apply(name: storeDotnotifyDotstart): Readonlynamestorenotifyst = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamestorenotifyst]
  }
  
  @scala.inline
  implicit class ReadonlynamestorenotifystMutableBuilder[Self <: Readonlynamestorenotifyst] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: storeDotnotifyDotstart): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
