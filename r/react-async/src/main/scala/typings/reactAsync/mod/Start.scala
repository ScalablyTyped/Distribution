package typings.reactAsync.mod

import typings.reactAsync.anon.Dictmeta
import typings.reactAsync.reactAsyncStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-async.react-async.AbstractAction & {  type :'start', payload (): std.Promise<void>} */
@js.native
trait Start
  extends AsyncAction[js.Any] {
  
  var meta: Dictmeta = js.native
  
  def payload(): js.Promise[Unit] = js.native
  
  var `type`: String with start = js.native
}
object Start {
  
  @scala.inline
  def apply(meta: Dictmeta, payload: () => js.Promise[Unit], `type`: String with start): Start = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = js.Any.fromFunction0(payload))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Start]
  }
  
  @scala.inline
  implicit class StartMutableBuilder[Self <: Start] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeta(value: Dictmeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: () => js.Promise[Unit]): Self = StObject.set(x, "payload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: String with start): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
