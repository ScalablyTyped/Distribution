package typings.reactNativeSvg

import typings.reactNativeSvg.anon.ObjectmatrixArraynumberunConstructor
import typings.reactNativeSvg.libTypescriptLibExtractExtractTextMod.TextChild
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.CommonPathProps
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.FontProps
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberArray
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptElementsTspanMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/TSpan", JSImport.Default)
  @js.native
  open class default () extends TSpan
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/TSpan", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/TSpan", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TSpan
    extends typings.reactNativeSvg.libTypescriptElementsShapeMod.default[TSpanProps] {
    
    def setNativeProps(props: ObjectmatrixArraynumberunConstructor): Unit = js.native
  }
  
  trait TSpanProps
    extends StObject
       with CommonPathProps
       with FontProps {
    
    var children: js.UndefOr[TextChild] = js.undefined
    
    var dx: js.UndefOr[NumberArray] = js.undefined
    
    var dy: js.UndefOr[NumberArray] = js.undefined
    
    var inlineSize: js.UndefOr[NumberProp] = js.undefined
    
    var rotate: js.UndefOr[NumberArray] = js.undefined
  }
  object TSpanProps {
    
    inline def apply(): TSpanProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TSpanProps]
    }
    
    extension [Self <: TSpanProps](x: Self) {
      
      inline def setChildren(value: TextChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Any*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDx(value: NumberArray): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDxVarargs(value: NumberProp*): Self = StObject.set(x, "dx", js.Array(value*))
      
      inline def setDy(value: NumberArray): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setDyVarargs(value: NumberProp*): Self = StObject.set(x, "dy", js.Array(value*))
      
      inline def setInlineSize(value: NumberProp): Self = StObject.set(x, "inlineSize", value.asInstanceOf[js.Any])
      
      inline def setInlineSizeUndefined: Self = StObject.set(x, "inlineSize", js.undefined)
      
      inline def setRotate(value: NumberArray): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setRotateVarargs(value: NumberProp*): Self = StObject.set(x, "rotate", js.Array(value*))
    }
  }
}
