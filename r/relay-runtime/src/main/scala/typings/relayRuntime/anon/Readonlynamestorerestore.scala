package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.storeDotrestore
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import org.scalablytyped.runtime.StObject
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
  implicit class ReadonlynamestorerestoreMutableBuilder[Self <: Readonlynamestorerestore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: storeDotrestore): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
