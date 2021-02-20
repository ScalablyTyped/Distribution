package typings.protonNative.mod

import typings.protonNative.anon.BackgroundColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyledTextProps extends StObject {
  
  var style: js.UndefOr[BackgroundColor] = js.native
  
  /**
    * The x coordinate of the text's top left corner. (Only in a top level text component.)
    */
  var x: js.UndefOr[Double | String] = js.native
  
  /**
    * The y coordinate of the text's top left corner. (Only in a top level text component.)
    */
  var y: js.UndefOr[Double | String] = js.native
}
object StyledTextProps {
  
  @scala.inline
  def apply(): StyledTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledTextProps]
  }
  
  @scala.inline
  implicit class StyledTextPropsMutableBuilder[Self <: StyledTextProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(value: BackgroundColor): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
