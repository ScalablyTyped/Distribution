package typings.reactAsync.mod

import typings.reactAsync.anon.Dictmeta
import typings.reactAsync.reactAsyncStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Start
  extends StObject
     with AbstractAction
     with AsyncAction[js.Any] {
  
  def payload(): js.Promise[Unit]
  
  @JSName("type")
  var type_Start: start
}
object Start {
  
  @scala.inline
  def apply(meta: Dictmeta, payload: () => js.Promise[Unit]): Start = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = js.Any.fromFunction0(payload))
    __obj.updateDynamic("type")("start")
    __obj.asInstanceOf[Start]
  }
  
  @scala.inline
  implicit class StartMutableBuilder[Self <: Start] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: () => js.Promise[Unit]): Self = StObject.set(x, "payload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: start): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
