package typings.reactMdMenu.typesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuOrientationProps extends StObject {
  
  /**
    * Boolean if the menu should be rendered horizontally instead of vertically.
    * This will also update the `aria-orientation`.
    *
    * @defaultValue `false`
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
}
object MenuOrientationProps {
  
  inline def apply(): MenuOrientationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuOrientationProps]
  }
  
  extension [Self <: MenuOrientationProps](x: Self) {
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
  }
}
