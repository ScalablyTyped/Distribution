package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Manages image data._
  * @see https://docs.scriptable.app/image
  */
@js.native
trait Image extends StObject {
  
  /**
    * _Size of the image in pixels._
    * @see https://docs.scriptable.app/image/#size
    */
  var size: Size = js.native
}
object Image {
  
  @scala.inline
  def apply(size: Size): Image = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
