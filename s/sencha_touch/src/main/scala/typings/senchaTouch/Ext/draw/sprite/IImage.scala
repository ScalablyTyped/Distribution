package typings.senchaTouch.Ext.draw.sprite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IImage extends IRect {
  
  /** [Config Option] (String) */
  var src: js.UndefOr[String] = js.native
}
object IImage {
  
  @scala.inline
  def apply(): IImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImage]
  }
  
  @scala.inline
  implicit class IImageMutableBuilder[Self <: IImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
