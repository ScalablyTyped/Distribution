package typings.reactElemental.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageState extends StObject {
  
  val load: String = js.native
}
object ImageState {
  
  @scala.inline
  def apply(load: String): ImageState = {
    val __obj = js.Dynamic.literal(load = load.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageState]
  }
  
  @scala.inline
  implicit class ImageStateMutableBuilder[Self <: ImageState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoad(value: String): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
  }
}
