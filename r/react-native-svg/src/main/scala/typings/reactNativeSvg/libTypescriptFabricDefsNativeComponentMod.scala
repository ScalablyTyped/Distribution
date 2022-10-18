package typings.reactNativeSvg

import org.scalablytyped.runtime.Shortcut
import typings.reactNative.librariesTypesCodegenTypesMod.Float
import typings.reactNative.librariesTypesCodegenTypesMod.Int32
import typings.reactNative.librariesTypesCodegenTypesMod.WithDefault
import typings.reactNative.librariesUtilitiesCodegenNativeComponentMod.NativeComponentType
import typings.reactNativeSvg.libTypescriptFabricUtilsMod.ViewProps
import typings.reactNativeSvg.reactNativeSvgDoubles.`1.0`
import typings.reactNativeSvg.reactNativeSvgInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptFabricDefsNativeComponentMod extends Shortcut {
  
  @JSImport("react-native-svg/lib/typescript/fabric/DefsNativeComponent", JSImport.Default)
  @js.native
  val default: NativeComponentType[NativeProps] = js.native
  
  trait NativeProps
    extends StObject
       with ViewProps
       with SvgNodeCommonProps
  object NativeProps {
    
    inline def apply(): NativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeProps]
    }
  }
  
  trait SvgNodeCommonProps extends StObject {
    
    var clipPath: js.UndefOr[String] = js.undefined
    
    var clipRule: js.UndefOr[WithDefault[Int32, `0`]] = js.undefined
    
    var display: js.UndefOr[String] = js.undefined
    
    var markerEnd: js.UndefOr[String] = js.undefined
    
    var markerMid: js.UndefOr[String] = js.undefined
    
    var markerStart: js.UndefOr[String] = js.undefined
    
    var mask: js.UndefOr[String] = js.undefined
    
    var matrix: js.UndefOr[js.Array[Float]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var opacity: js.UndefOr[WithDefault[Float, `1.0`]] = js.undefined
    
    var pointerEvents: js.UndefOr[String] = js.undefined
    
    var responsible: js.UndefOr[Boolean] = js.undefined
  }
  object SvgNodeCommonProps {
    
    inline def apply(): SvgNodeCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SvgNodeCommonProps]
    }
    
    extension [Self <: SvgNodeCommonProps](x: Self) {
      
      inline def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      inline def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
      
      inline def setClipRule(value: WithDefault[Int32, `0`]): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      inline def setClipRuleNull: Self = StObject.set(x, "clipRule", null)
      
      inline def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      inline def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      inline def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      inline def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMatrix(value: js.Array[Float]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
      
      inline def setMatrixVarargs(value: Float*): Self = StObject.set(x, "matrix", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOpacity(value: WithDefault[Float, `1.0`]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityNull: Self = StObject.set(x, "opacity", null)
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPointerEvents(value: String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setResponsible(value: Boolean): Self = StObject.set(x, "responsible", value.asInstanceOf[js.Any])
      
      inline def setResponsibleUndefined: Self = StObject.set(x, "responsible", js.undefined)
    }
  }
  
  type _To = NativeComponentType[NativeProps]
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptFabricDefsNativeComponentMod.foo` */
  override def _to: NativeComponentType[NativeProps] = default
}
