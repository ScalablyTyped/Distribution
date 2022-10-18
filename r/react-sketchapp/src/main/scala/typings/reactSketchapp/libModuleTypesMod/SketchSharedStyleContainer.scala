package typings.reactSketchapp.libModuleTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchSharedStyleContainer extends StObject {
  
  def addSharedObject(ins: Any): Any
  
  def addSharedStyleWithName_firstInstance(name: String, ins: SketchStyle): Any
  
  def objects(): js.Array[Any]
  
  def setObjects(objects: js.Array[SketchStyle]): Unit
}
object SketchSharedStyleContainer {
  
  inline def apply(
    addSharedObject: Any => Any,
    addSharedStyleWithName_firstInstance: (String, SketchStyle) => Any,
    objects: () => js.Array[Any],
    setObjects: js.Array[SketchStyle] => Unit
  ): SketchSharedStyleContainer = {
    val __obj = js.Dynamic.literal(addSharedObject = js.Any.fromFunction1(addSharedObject), addSharedStyleWithName_firstInstance = js.Any.fromFunction2(addSharedStyleWithName_firstInstance), objects = js.Any.fromFunction0(objects), setObjects = js.Any.fromFunction1(setObjects))
    __obj.asInstanceOf[SketchSharedStyleContainer]
  }
  
  extension [Self <: SketchSharedStyleContainer](x: Self) {
    
    inline def setAddSharedObject(value: Any => Any): Self = StObject.set(x, "addSharedObject", js.Any.fromFunction1(value))
    
    inline def setAddSharedStyleWithName_firstInstance(value: (String, SketchStyle) => Any): Self = StObject.set(x, "addSharedStyleWithName_firstInstance", js.Any.fromFunction2(value))
    
    inline def setObjects(value: () => js.Array[Any]): Self = StObject.set(x, "objects", js.Any.fromFunction0(value))
    
    inline def setSetObjects(value: js.Array[SketchStyle] => Unit): Self = StObject.set(x, "setObjects", js.Any.fromFunction1(value))
  }
}
