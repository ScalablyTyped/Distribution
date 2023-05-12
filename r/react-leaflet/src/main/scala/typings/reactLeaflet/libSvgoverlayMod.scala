package typings.reactLeaflet

import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.SVGOverlay_
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactLeaflet.anon.ReadonlyinstanceSVGOverla
import typings.reactLeaflet.anon.ReadonlyversionnumbermapM
import typings.reactLeafletCore.libMediaOverlayMod.MediaOverlayProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSvgoverlayMod {
  
  @JSImport("react-leaflet/lib/SVGOverlay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-leaflet/lib/SVGOverlay", "SVGOverlay")
  @js.native
  val SVGOverlay: ForwardRefExoticComponent[SVGOverlayProps & RefAttributes[SVGOverlay_]] = js.native
  
  inline def useSVGOverlay(props: SVGOverlayProps): MutableRefObject[ReadonlyinstanceSVGOverla] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSVGOverlay")(props.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[ReadonlyinstanceSVGOverla]]
  
  inline def useSVGOverlayElement(props: SVGOverlayProps, context: ReadonlyversionnumbermapM): MutableRefObject[ReadonlyinstanceSVGOverla] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSVGOverlayElement")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[ReadonlyinstanceSVGOverla]]
  
  trait SVGOverlayProps
    extends StObject
       with MediaOverlayProps {
    
    var attributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object SVGOverlayProps {
    
    inline def apply(bounds: LatLngBoundsExpression): SVGOverlayProps = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any])
      __obj.asInstanceOf[SVGOverlayProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SVGOverlayProps] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
