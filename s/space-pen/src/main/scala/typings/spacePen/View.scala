package typings.spacePen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait View extends StObject {
  
  def bindEventHandlers(view: View): Unit
  
  def buildHtml(params: js.Any): js.Any
  
  def command(commandName: js.Any, selector: js.Any, options: js.Any, handler: js.Any): js.Any
  
  def end(): js.Any
  
  // tag end
  def initialize(view: View, args: js.Any): Unit
  
  def preempt(eventName: js.Any, handler: js.Any): js.Any
  
  def pushStack(elems: js.Any): js.Any
  
  def wireOutlets(view: View): Unit
}
object View {
  
  inline def apply(
    bindEventHandlers: View => Unit,
    buildHtml: js.Any => js.Any,
    command: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    end: () => js.Any,
    initialize: (View, js.Any) => Unit,
    preempt: (js.Any, js.Any) => js.Any,
    pushStack: js.Any => js.Any,
    wireOutlets: View => Unit
  ): View = {
    val __obj = js.Dynamic.literal(bindEventHandlers = js.Any.fromFunction1(bindEventHandlers), buildHtml = js.Any.fromFunction1(buildHtml), command = js.Any.fromFunction4(command), end = js.Any.fromFunction0(end), initialize = js.Any.fromFunction2(initialize), preempt = js.Any.fromFunction2(preempt), pushStack = js.Any.fromFunction1(pushStack), wireOutlets = js.Any.fromFunction1(wireOutlets))
    __obj.asInstanceOf[View]
  }
  
  extension [Self <: View](x: Self) {
    
    inline def setBindEventHandlers(value: View => Unit): Self = StObject.set(x, "bindEventHandlers", js.Any.fromFunction1(value))
    
    inline def setBuildHtml(value: js.Any => js.Any): Self = StObject.set(x, "buildHtml", js.Any.fromFunction1(value))
    
    inline def setCommand(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "command", js.Any.fromFunction4(value))
    
    inline def setEnd(value: () => js.Any): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setInitialize(value: (View, js.Any) => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction2(value))
    
    inline def setPreempt(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "preempt", js.Any.fromFunction2(value))
    
    inline def setPushStack(value: js.Any => js.Any): Self = StObject.set(x, "pushStack", js.Any.fromFunction1(value))
    
    inline def setWireOutlets(value: View => Unit): Self = StObject.set(x, "wireOutlets", js.Any.fromFunction1(value))
  }
}
