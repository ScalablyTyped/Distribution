package typings.reactMosaicComponent

import typings.react.mod.global.JSX.Element
import typings.reactMosaicComponent.libInternalTypesMod.MosaicDropTargetPosition
import typings.reactMosaicComponent.libTypesMod.MosaicBranch
import typings.reactMosaicComponent.libTypesMod.MosaicPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMosaicDropTargetMod {
  
  @JSImport("react-mosaic-component/lib/MosaicDropTarget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MosaicDropTarget(param0: MosaicDropTargetProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MosaicDropTarget")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait MosaicDropTargetProps extends StObject {
    
    var path: MosaicPath
    
    var position: MosaicDropTargetPosition
  }
  object MosaicDropTargetProps {
    
    inline def apply(path: MosaicPath, position: MosaicDropTargetPosition): MosaicDropTargetProps = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[MosaicDropTargetProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MosaicDropTargetProps] (val x: Self) extends AnyVal {
      
      inline def setPath(value: MosaicPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: MosaicBranch*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setPosition(value: MosaicDropTargetPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
