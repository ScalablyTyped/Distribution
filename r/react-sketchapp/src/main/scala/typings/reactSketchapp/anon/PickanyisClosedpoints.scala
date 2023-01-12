package typings.reactSketchapp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.ShapePath * / any, 'isClosed' | 'points'> */
trait PickanyisClosedpoints extends StObject {
  
  var isClosed: js.UndefOr[Any] = js.undefined
  
  var points: js.UndefOr[Any] = js.undefined
}
object PickanyisClosedpoints {
  
  inline def apply(): PickanyisClosedpoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickanyisClosedpoints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickanyisClosedpoints] (val x: Self) extends AnyVal {
    
    inline def setIsClosed(value: Any): Self = StObject.set(x, "isClosed", value.asInstanceOf[js.Any])
    
    inline def setIsClosedUndefined: Self = StObject.set(x, "isClosed", js.undefined)
    
    inline def setPoints(value: Any): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
  }
}
