package typings.reactMdMenu

import typings.reactMdButton.typesFabMod.FABPosition
import typings.reactMdUtils.typesPositioningTypesMod.PositionAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsMod {
  
  @JSImport("@react-md/menu/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultAnchor(param0: DefaultAnchorOptions): PositionAnchor = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAnchor")(param0.asInstanceOf[js.Any]).asInstanceOf[PositionAnchor]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  /**
    * @remarks \@since 5.0.0
    * @internal
    */
  trait DefaultAnchorOptions extends StObject {
    
    var floating: FABPosition
    
    var horizontal: Boolean
    
    var menubar: Boolean
    
    var menuitem: Boolean
  }
  object DefaultAnchorOptions {
    
    inline def apply(horizontal: Boolean, menubar: Boolean, menuitem: Boolean): DefaultAnchorOptions = {
      val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], menubar = menubar.asInstanceOf[js.Any], menuitem = menuitem.asInstanceOf[js.Any], floating = null)
      __obj.asInstanceOf[DefaultAnchorOptions]
    }
    
    extension [Self <: DefaultAnchorOptions](x: Self) {
      
      inline def setFloating(value: FABPosition): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      inline def setFloatingNull: Self = StObject.set(x, "floating", null)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setMenubar(value: Boolean): Self = StObject.set(x, "menubar", value.asInstanceOf[js.Any])
      
      inline def setMenuitem(value: Boolean): Self = StObject.set(x, "menuitem", value.asInstanceOf[js.Any])
    }
  }
}
