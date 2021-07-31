package typings.reactSketchapp.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchSharedStyleContainer extends StObject {
  
  def addSharedStyleWithName_firstInstance(name: String, ins: SketchStyle): js.Any
  
  def setObjects(objects: js.Array[SketchStyle]): Unit
}
object SketchSharedStyleContainer {
  
  @scala.inline
  def apply(
    addSharedStyleWithName_firstInstance: (String, SketchStyle) => js.Any,
    setObjects: js.Array[SketchStyle] => Unit
  ): SketchSharedStyleContainer = {
    val __obj = js.Dynamic.literal(addSharedStyleWithName_firstInstance = js.Any.fromFunction2(addSharedStyleWithName_firstInstance), setObjects = js.Any.fromFunction1(setObjects))
    __obj.asInstanceOf[SketchSharedStyleContainer]
  }
  
  @scala.inline
  implicit class SketchSharedStyleContainerMutableBuilder[Self <: SketchSharedStyleContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSharedStyleWithName_firstInstance(value: (String, SketchStyle) => js.Any): Self = StObject.set(x, "addSharedStyleWithName_firstInstance", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetObjects(value: js.Array[SketchStyle] => Unit): Self = StObject.set(x, "setObjects", js.Any.fromFunction1(value))
  }
}
