package typings.storybookStore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext * / any, 'canvasElement'> */
trait PickanycanvasElement extends StObject {
  
  var canvasElement: js.UndefOr[Any] = js.undefined
}
object PickanycanvasElement {
  
  inline def apply(): PickanycanvasElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickanycanvasElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickanycanvasElement] (val x: Self) extends AnyVal {
    
    inline def setCanvasElement(value: Any): Self = StObject.set(x, "canvasElement", value.asInstanceOf[js.Any])
    
    inline def setCanvasElementUndefined: Self = StObject.set(x, "canvasElement", js.undefined)
  }
}
