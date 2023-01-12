package typings.senchaTouch.Ext.draw.sprite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IImage
  extends StObject
     with IRect {
  
  /** [Config Option] (String) */
  var src: js.UndefOr[String] = js.undefined
}
object IImage {
  
  inline def apply(): IImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IImage] (val x: Self) extends AnyVal {
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
