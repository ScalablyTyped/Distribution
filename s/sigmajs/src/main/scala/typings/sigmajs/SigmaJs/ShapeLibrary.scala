package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeLibrary extends StObject {
  
  def enumerate(): js.Any = js.native
}
object ShapeLibrary {
  
  @scala.inline
  def apply(enumerate: () => js.Any): ShapeLibrary = {
    val __obj = js.Dynamic.literal(enumerate = js.Any.fromFunction0(enumerate))
    __obj.asInstanceOf[ShapeLibrary]
  }
  
  @scala.inline
  implicit class ShapeLibraryMutableBuilder[Self <: ShapeLibrary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumerate(value: () => js.Any): Self = StObject.set(x, "enumerate", js.Any.fromFunction0(value))
  }
}
