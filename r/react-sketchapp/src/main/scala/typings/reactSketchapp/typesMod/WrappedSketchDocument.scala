package typings.reactSketchapp.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrappedSketchDocument extends StObject {
  
  var sketchObject: SketchDocument | SketchDocumentData = js.native
}
object WrappedSketchDocument {
  
  @scala.inline
  def apply(sketchObject: SketchDocument | SketchDocumentData): WrappedSketchDocument = {
    val __obj = js.Dynamic.literal(sketchObject = sketchObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedSketchDocument]
  }
  
  @scala.inline
  implicit class WrappedSketchDocumentMutableBuilder[Self <: WrappedSketchDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSketchObject(value: SketchDocument | SketchDocumentData): Self = StObject.set(x, "sketchObject", value.asInstanceOf[js.Any])
  }
}
