package typings.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlashCommands[T] extends StObject {
  
  def addResponse(opts: SlashCommandOptions[T]): Unit = js.native
  
  var calls: js.Array[SlashCommandCall[T]] = js.native
  
  def reset(): Unit = js.native
  
  def send(targetUrl: SlashCommandUrl, body: T): js.Promise[Unit] = js.native
}
object SlashCommands {
  
  @scala.inline
  def apply[T](
    addResponse: SlashCommandOptions[T] => Unit,
    calls: js.Array[SlashCommandCall[T]],
    reset: () => Unit,
    send: (SlashCommandUrl, T) => js.Promise[Unit]
  ): SlashCommands[T] = {
    val __obj = js.Dynamic.literal(addResponse = js.Any.fromFunction1(addResponse), calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[SlashCommands[T]]
  }
  
  @scala.inline
  implicit class SlashCommandsMutableBuilder[Self <: SlashCommands[_], T] (val x: Self with SlashCommands[T]) extends AnyVal {
    
    @scala.inline
    def setAddResponse(value: SlashCommandOptions[T] => Unit): Self = StObject.set(x, "addResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalls(value: js.Array[SlashCommandCall[T]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallsVarargs(value: SlashCommandCall[T]*): Self = StObject.set(x, "calls", js.Array(value :_*))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSend(value: (SlashCommandUrl, T) => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
  }
}
