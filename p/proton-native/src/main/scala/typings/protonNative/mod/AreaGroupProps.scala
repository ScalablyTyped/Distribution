package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaGroupProps
  extends StObject
     with AreaBaseProps {
  
  /**
    * Specify `width` and `height` to be able to use percentage values in transforms.
    */
  var height: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Specify `width` and `height` to be able to use percentage values in transforms.
    */
  var width: js.UndefOr[Double | String] = js.undefined
}
object AreaGroupProps {
  
  @scala.inline
  def apply(): AreaGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaGroupProps]
  }
  
  @scala.inline
  implicit class AreaGroupPropsMutableBuilder[Self <: AreaGroupProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
