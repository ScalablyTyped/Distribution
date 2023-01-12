package typings.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlashCommands[T] extends StObject {
  
  def addResponse(opts: SlashCommandOptions[T]): Unit
  
  var calls: js.Array[SlashCommandCall[T]]
  
  def reset(): Unit
  
  def send(targetUrl: SlashCommandUrl, body: T): js.Promise[Unit]
}
object SlashCommands {
  
  inline def apply[T](
    addResponse: SlashCommandOptions[T] => Unit,
    calls: js.Array[SlashCommandCall[T]],
    reset: () => Unit,
    send: (SlashCommandUrl, T) => js.Promise[Unit]
  ): SlashCommands[T] = {
    val __obj = js.Dynamic.literal(addResponse = js.Any.fromFunction1(addResponse), calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[SlashCommands[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlashCommands[?], T] (val x: Self & SlashCommands[T]) extends AnyVal {
    
    inline def setAddResponse(value: SlashCommandOptions[T] => Unit): Self = StObject.set(x, "addResponse", js.Any.fromFunction1(value))
    
    inline def setCalls(value: js.Array[SlashCommandCall[T]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    inline def setCallsVarargs(value: SlashCommandCall[T]*): Self = StObject.set(x, "calls", js.Array(value*))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSend(value: (SlashCommandUrl, T) => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
  }
}
