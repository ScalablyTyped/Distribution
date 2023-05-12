package typings.reactLeafletCore

import typings.leaflet.mod.FeatureGroup_
import typings.leaflet.mod.Path
import typings.leaflet.mod.PathOptions
import typings.reactLeafletCore.libElementMod.ElementHook
import typings.reactLeafletCore.libElementMod.LeafletElement
import typings.reactLeafletCore.libLayerMod.InteractiveLayerProps
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathMod {
  
  @JSImport("@react-leaflet/core/lib/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPathHook[E /* <: FeatureGroup_[Any] | Path */, P /* <: PathProps */](useElement: ElementHook[E, P]): js.Function1[/* props */ P, ReturnType[ElementHook[E, P]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPathHook")(useElement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ P, ReturnType[ElementHook[E, P]]]]
  
  inline def usePathOptions(element: LeafletElement[FeatureGroup_[Any] | Path, Any], props: PathProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePathOptions")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait PathProps
    extends StObject
       with InteractiveLayerProps {
    
    var pathOptions: js.UndefOr[PathOptions] = js.undefined
  }
  object PathProps {
    
    inline def apply(): PathProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathProps] (val x: Self) extends AnyVal {
      
      inline def setPathOptions(value: PathOptions): Self = StObject.set(x, "pathOptions", value.asInstanceOf[js.Any])
      
      inline def setPathOptionsUndefined: Self = StObject.set(x, "pathOptions", js.undefined)
    }
  }
}
