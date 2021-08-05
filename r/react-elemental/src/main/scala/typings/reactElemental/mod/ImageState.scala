package typings.reactElemental.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageState extends StObject {
  
  val load: String
}
object ImageState {
  
  inline def apply(load: String): ImageState = {
    val __obj = js.Dynamic.literal(load = load.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageState]
  }
  
  extension [Self <: ImageState](x: Self) {
    
    inline def setLoad(value: String): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
  }
}
