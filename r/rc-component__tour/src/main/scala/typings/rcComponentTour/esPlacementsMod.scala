package typings.rcComponentTour

import typings.rcComponentTrigger.esInterfaceMod.BuildInPlacements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPlacementsMod {
  
  @JSImport("@rc-component/tour/es/placements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPlacements(): BuildInPlacements = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlacements")().asInstanceOf[BuildInPlacements]
  inline def getPlacements(arrowPointAtCenter: Boolean): BuildInPlacements = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlacements")(arrowPointAtCenter.asInstanceOf[js.Any]).asInstanceOf[BuildInPlacements]
  
  @JSImport("@rc-component/tour/es/placements", "placements")
  @js.native
  val placements: BuildInPlacements = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcComponentTour.rcComponentTourStrings.left
    - typings.rcComponentTour.rcComponentTourStrings.leftTop
    - typings.rcComponentTour.rcComponentTourStrings.leftBottom
    - typings.rcComponentTour.rcComponentTourStrings.right
    - typings.rcComponentTour.rcComponentTourStrings.rightTop
    - typings.rcComponentTour.rcComponentTourStrings.rightBottom
    - typings.rcComponentTour.rcComponentTourStrings.top
    - typings.rcComponentTour.rcComponentTourStrings.topLeft
    - typings.rcComponentTour.rcComponentTourStrings.topRight
    - typings.rcComponentTour.rcComponentTourStrings.bottom
    - typings.rcComponentTour.rcComponentTourStrings.bottomLeft
    - typings.rcComponentTour.rcComponentTourStrings.bottomRight
    - typings.rcComponentTour.rcComponentTourStrings.center
  */
  trait PlacementType extends StObject
  object PlacementType {
    
    inline def bottom: typings.rcComponentTour.rcComponentTourStrings.bottom = "bottom".asInstanceOf[typings.rcComponentTour.rcComponentTourStrings.bottom]
    
    inline def bottomLeft: typings.rcComponentTour.rcComponentTourStrings.bottomLeft = "bottomLeft".asInstanceOf[typings.rcComponentTour.rcComponentTourStrings.bottomLeft]
    
    inline def bottomRight: typings.rcComponentTour.rcComponentTourStrings.bottomRight = "bottomRight".asInstanceOf[typings.rcComponentTour.rcComponentTourStrings.bottomRight]
    
    inline def center: typings.rcComponentTour.rcComponentTourStrings.center = "center".asInstanceOf[typings.rcComponentTour.rcComponentTourStrings.center]
    
    inline def left: typings.rcComponentTour.rcComponentTourStrings.left = "left".asInstanceOf[typings.rcComponentTour.rcComponentTourStrings.left]
    
    inline def leftBottom: typings.rcComponentTour.rcComponentTourStrings.leftBottom = "leftBottom".asInstanceOf[typings.rcComponentTour.rcComponentTourStrings.leftBottom]
    
    inline def leftTop: typings.rcComponentTour.rcComponentTourStrings.leftTop = "leftTop".asInstanceOf[typings.rcComponentTour.rcComponentTourStrings.leftTop]
    
    inline def right: typings.rcComponentTour.rcComponentTourStrings.right = "right".asInstanceOf[typings.rcComponentTour.rcComponentTourStrings.right]
    
    inline def rightBottom: typings.rcComponentTour.rcComponentTourStrings.rightBottom = "rightBottom".asInstanceOf[typings.rcComponentTour.rcComponentTourStrings.rightBottom]
    
    inline def rightTop: typings.rcComponentTour.rcComponentTourStrings.rightTop = "rightTop".asInstanceOf[typings.rcComponentTour.rcComponentTourStrings.rightTop]
    
    inline def top: typings.rcComponentTour.rcComponentTourStrings.top = "top".asInstanceOf[typings.rcComponentTour.rcComponentTourStrings.top]
    
    inline def topLeft: typings.rcComponentTour.rcComponentTourStrings.topLeft = "topLeft".asInstanceOf[typings.rcComponentTour.rcComponentTourStrings.topLeft]
    
    inline def topRight: typings.rcComponentTour.rcComponentTourStrings.topRight = "topRight".asInstanceOf[typings.rcComponentTour.rcComponentTourStrings.topRight]
  }
}
