package typings.reactNativeSvg

import typings.reactNativeSvg.anon.ObjectpointsstringArrayNu
import typings.reactNativeSvg.anon.Points
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.CommonPathProps
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptElementsPolylineMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/Polyline", JSImport.Default)
  @js.native
  open class default () extends Polyline
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/Polyline", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/Polyline", "default.defaultProps")
    @js.native
    def defaultProps: Points = js.native
    inline def defaultProps_=(x: Points): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-svg/lib/typescript/elements/Polyline", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Polyline
    extends typings.reactNativeSvg.libTypescriptElementsShapeMod.default[PolylineProps] {
    
    def setNativeProps(props: ObjectpointsstringArrayNu): Unit = js.native
  }
  
  trait PolylineProps
    extends StObject
       with CommonPathProps {
    
    var opacity: js.UndefOr[NumberProp] = js.undefined
    
    var points: js.UndefOr[String | js.Array[NumberProp]] = js.undefined
  }
  object PolylineProps {
    
    inline def apply(): PolylineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolylineProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PolylineProps] (val x: Self) extends AnyVal {
      
      inline def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPoints(value: String | js.Array[NumberProp]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      inline def setPointsVarargs(value: NumberProp*): Self = StObject.set(x, "points", js.Array(value*))
    }
  }
}
