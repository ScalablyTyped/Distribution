package typings.puppeteer.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tracing extends StObject {
  
  def start(options: TracingStartOptions): js.Promise[Unit]
  
  def stop(): js.Promise[Buffer]
}
object Tracing {
  
  @scala.inline
  def apply(start: TracingStartOptions => js.Promise[Unit], stop: () => js.Promise[Buffer]): Tracing = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Tracing]
  }
  
  @scala.inline
  implicit class TracingMutableBuilder[Self <: Tracing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStart(value: TracingStartOptions => js.Promise[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStop(value: () => js.Promise[Buffer]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
