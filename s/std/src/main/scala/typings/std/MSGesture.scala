package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MSGesture extends StObject {
  
  def addPointer(pointerId: Double): Unit
  
  def stop(): Unit
  
  var target: Element
}
object MSGesture {
  
  @scala.inline
  def apply(addPointer: Double => Unit, stop: () => Unit, target: Element): MSGesture = {
    val __obj = js.Dynamic.literal(addPointer = js.Any.fromFunction1(addPointer), stop = js.Any.fromFunction0(stop), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSGesture]
  }
  
  @scala.inline
  implicit class MSGestureMutableBuilder[Self <: MSGesture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddPointer(value: Double => Unit): Self = StObject.set(x, "addPointer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
