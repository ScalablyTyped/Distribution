package typings.reactSketchapp.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WrappedSketchLayer extends StObject {
  
  var sketchObject: SketchLayer
}
object WrappedSketchLayer {
  
  @scala.inline
  def apply(sketchObject: SketchLayer): WrappedSketchLayer = {
    val __obj = js.Dynamic.literal(sketchObject = sketchObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedSketchLayer]
  }
  
  @scala.inline
  implicit class WrappedSketchLayerMutableBuilder[Self <: WrappedSketchLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSketchObject(value: SketchLayer): Self = StObject.set(x, "sketchObject", value.asInstanceOf[js.Any])
  }
}
