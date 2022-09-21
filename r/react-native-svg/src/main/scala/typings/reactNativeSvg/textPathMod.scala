package typings.reactNativeSvg

import typings.reactNativeSvg.anon.ObjectmatrixArraynumberunConstructor
import typings.reactNativeSvg.extractTextMod.TextChild
import typings.reactNativeSvg.typesMod.NumberProp
import typings.reactNativeSvg.typesMod.TextPathMethod
import typings.reactNativeSvg.typesMod.TextPathMidLine
import typings.reactNativeSvg.typesMod.TextPathSpacing
import typings.reactNativeSvg.typesMod.TextSpecificProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textPathMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/TextPath", JSImport.Default)
  @js.native
  open class default () extends TextPath
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/TextPath", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/TextPath", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TextPath
    extends typings.reactNativeSvg.shapeMod.default[TextPathProps] {
    
    def setNativeProps(props: ObjectmatrixArraynumberunConstructor): Unit = js.native
  }
  
  trait TextPathProps
    extends StObject
       with TextSpecificProps {
    
    var children: js.UndefOr[TextChild] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[TextPathMethod] = js.undefined
    
    var midLine: js.UndefOr[TextPathMidLine] = js.undefined
    
    var side: js.UndefOr[String] = js.undefined
    
    var spacing: js.UndefOr[TextPathSpacing] = js.undefined
    
    var startOffset: js.UndefOr[NumberProp] = js.undefined
    
    var xlinkHref: js.UndefOr[String] = js.undefined
  }
  object TextPathProps {
    
    inline def apply(): TextPathProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextPathProps]
    }
    
    extension [Self <: TextPathProps](x: Self) {
      
      inline def setChildren(value: TextChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Any*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setMethod(value: TextPathMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMidLine(value: TextPathMidLine): Self = StObject.set(x, "midLine", value.asInstanceOf[js.Any])
      
      inline def setMidLineUndefined: Self = StObject.set(x, "midLine", js.undefined)
      
      inline def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      inline def setSpacing(value: TextPathSpacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setStartOffset(value: NumberProp): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
      
      inline def setXlinkHref(value: String): Self = StObject.set(x, "xlinkHref", value.asInstanceOf[js.Any])
      
      inline def setXlinkHrefUndefined: Self = StObject.set(x, "xlinkHref", js.undefined)
    }
  }
}
