package typings.slateReact.anon

import typings.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnUserInput extends StObject {
  
  def onUserInput(): Unit
  
  var receivedUserInput: MutableRefObject[Boolean]
}
object OnUserInput {
  
  inline def apply(onUserInput: () => Unit, receivedUserInput: MutableRefObject[Boolean]): OnUserInput = {
    val __obj = js.Dynamic.literal(onUserInput = js.Any.fromFunction0(onUserInput), receivedUserInput = receivedUserInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnUserInput]
  }
  
  extension [Self <: OnUserInput](x: Self) {
    
    inline def setOnUserInput(value: () => Unit): Self = StObject.set(x, "onUserInput", js.Any.fromFunction0(value))
    
    inline def setReceivedUserInput(value: MutableRefObject[Boolean]): Self = StObject.set(x, "receivedUserInput", value.asInstanceOf[js.Any])
  }
}
