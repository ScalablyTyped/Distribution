package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.storeDotrestore
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'store.restore'}> */
trait Readonlynamestorerestore
  extends StObject
     with LogEvent {
  
  val name: storeDotrestore
}
object Readonlynamestorerestore {
  
  @scala.inline
  def apply(): Readonlynamestorerestore = {
    val __obj = js.Dynamic.literal(name = "store.restore")
    __obj.asInstanceOf[Readonlynamestorerestore]
  }
  
  @scala.inline
  implicit class ReadonlynamestorerestoreMutableBuilder[Self <: Readonlynamestorerestore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: storeDotrestore): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
