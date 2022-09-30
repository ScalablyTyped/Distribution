package typings.reactMosaicComponent

import typings.react.mod.ComponentType
import typings.reactMosaicComponent.internalTypesMod.MosaicDropTargetPosition
import typings.reactMosaicComponent.typesMod.MosaicBranch
import typings.reactMosaicComponent.typesMod.MosaicPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mosaicDropTargetMod {
  
  @JSImport("react-mosaic-component/lib/MosaicDropTarget", "MosaicDropTarget")
  @js.native
  val MosaicDropTarget: ComponentType[MosaicDropTargetProps] = js.native
  
  trait MosaicDropTargetProps extends StObject {
    
    var path: MosaicPath
    
    var position: MosaicDropTargetPosition
  }
  object MosaicDropTargetProps {
    
    inline def apply(path: MosaicPath, position: MosaicDropTargetPosition): MosaicDropTargetProps = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[MosaicDropTargetProps]
    }
    
    extension [Self <: MosaicDropTargetProps](x: Self) {
      
      inline def setPath(value: MosaicPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: MosaicBranch*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setPosition(value: MosaicDropTargetPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
