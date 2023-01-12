package typings.reactNativeSvg

import typings.reactNativeSvg.anon.Cy
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.CommonPathProps
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptElementsEllipseMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/Ellipse", JSImport.Default)
  @js.native
  open class default () extends Ellipse
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/Ellipse", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/Ellipse", "default.defaultProps")
    @js.native
    def defaultProps: Cy = js.native
    inline def defaultProps_=(x: Cy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-svg/lib/typescript/elements/Ellipse", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Ellipse
    extends typings.reactNativeSvg.libTypescriptElementsShapeMod.default[EllipseProps]
  
  trait EllipseProps
    extends StObject
       with CommonPathProps {
    
    var cx: js.UndefOr[NumberProp] = js.undefined
    
    var cy: js.UndefOr[NumberProp] = js.undefined
    
    var opacity: js.UndefOr[NumberProp] = js.undefined
    
    var rx: js.UndefOr[NumberProp] = js.undefined
    
    var ry: js.UndefOr[NumberProp] = js.undefined
  }
  object EllipseProps {
    
    inline def apply(): EllipseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EllipseProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EllipseProps] (val x: Self) extends AnyVal {
      
      inline def setCx(value: NumberProp): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      inline def setCy(value: NumberProp): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      inline def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRx(value: NumberProp): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: NumberProp): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    }
  }
}
