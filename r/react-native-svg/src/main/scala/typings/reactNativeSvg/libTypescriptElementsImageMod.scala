package typings.reactNativeSvg

import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageURISource
import typings.reactNativeSvg.anon.PreserveAspectRatio
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.ClipProps
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.CommonMaskProps
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NativeProps
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.ResponderProps
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.TouchableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptElementsImageMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/Image", JSImport.Default)
  @js.native
  open class default () extends SvgImage
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/Image", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/Image", "default.defaultProps")
    @js.native
    def defaultProps: PreserveAspectRatio = js.native
    inline def defaultProps_=(x: PreserveAspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-svg/lib/typescript/elements/Image", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait ImageProps
    extends StObject
       with ResponderProps
       with CommonMaskProps
       with ClipProps
       with TouchableProps
       with NativeProps {
    
    var height: js.UndefOr[NumberProp] = js.undefined
    
    var href: js.UndefOr[ImageSourcePropType | String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var opacity: js.UndefOr[NumberProp] = js.undefined
    
    var preserveAspectRatio: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[NumberProp] = js.undefined
    
    var x: js.UndefOr[NumberProp] = js.undefined
    
    var xlinkHref: js.UndefOr[ImageSourcePropType | String] = js.undefined
    
    var y: js.UndefOr[NumberProp] = js.undefined
  }
  object ImageProps {
    
    inline def apply(): ImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageProps]
    }
    
    extension [Self <: ImageProps](x: Self) {
      
      inline def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHref(value: ImageSourcePropType | String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setHrefVarargs(value: ImageURISource*): Self = StObject.set(x, "href", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      inline def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: NumberProp): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setXlinkHref(value: ImageSourcePropType | String): Self = StObject.set(x, "xlinkHref", value.asInstanceOf[js.Any])
      
      inline def setXlinkHrefUndefined: Self = StObject.set(x, "xlinkHref", js.undefined)
      
      inline def setXlinkHrefVarargs(value: ImageURISource*): Self = StObject.set(x, "xlinkHref", js.Array(value*))
      
      inline def setY(value: NumberProp): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait SvgImage
    extends typings.reactNativeSvg.libTypescriptElementsShapeMod.default[ImageProps]
}
