package typings.spacePen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait View extends StObject {
  
  def bindEventHandlers(view: View): Unit
  
  def buildHtml(params: Any): Any
  
  def command(commandName: Any, selector: Any, options: Any, handler: Any): Any
  
  def end(): Any
  
  // tag end
  def initialize(view: View, args: Any): Unit
  
  def preempt(eventName: Any, handler: Any): Any
  
  def pushStack(elems: Any): Any
  
  def wireOutlets(view: View): Unit
}
object View {
  
  inline def apply(
    bindEventHandlers: View => Unit,
    buildHtml: Any => Any,
    command: (Any, Any, Any, Any) => Any,
    end: () => Any,
    initialize: (View, Any) => Unit,
    preempt: (Any, Any) => Any,
    pushStack: Any => Any,
    wireOutlets: View => Unit
  ): View = {
    val __obj = js.Dynamic.literal(bindEventHandlers = js.Any.fromFunction1(bindEventHandlers), buildHtml = js.Any.fromFunction1(buildHtml), command = js.Any.fromFunction4(command), end = js.Any.fromFunction0(end), initialize = js.Any.fromFunction2(initialize), preempt = js.Any.fromFunction2(preempt), pushStack = js.Any.fromFunction1(pushStack), wireOutlets = js.Any.fromFunction1(wireOutlets))
    __obj.asInstanceOf[View]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: View] (val x: Self) extends AnyVal {
    
    inline def setBindEventHandlers(value: View => Unit): Self = StObject.set(x, "bindEventHandlers", js.Any.fromFunction1(value))
    
    inline def setBuildHtml(value: Any => Any): Self = StObject.set(x, "buildHtml", js.Any.fromFunction1(value))
    
    inline def setCommand(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "command", js.Any.fromFunction4(value))
    
    inline def setEnd(value: () => Any): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setInitialize(value: (View, Any) => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction2(value))
    
    inline def setPreempt(value: (Any, Any) => Any): Self = StObject.set(x, "preempt", js.Any.fromFunction2(value))
    
    inline def setPushStack(value: Any => Any): Self = StObject.set(x, "pushStack", js.Any.fromFunction1(value))
    
    inline def setWireOutlets(value: View => Unit): Self = StObject.set(x, "wireOutlets", js.Any.fromFunction1(value))
  }
}
