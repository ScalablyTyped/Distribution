package typings.protonNative.mod

import typings.protonNative.anon.BackgroundColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyledTextProps extends StObject {
  
  var style: js.UndefOr[BackgroundColor] = js.undefined
  
  /**
    * The x coordinate of the text's top left corner. (Only in a top level text component.)
    */
  var x: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The y coordinate of the text's top left corner. (Only in a top level text component.)
    */
  var y: js.UndefOr[Double | String] = js.undefined
}
object StyledTextProps {
  
  inline def apply(): StyledTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledTextProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyledTextProps] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: BackgroundColor): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
