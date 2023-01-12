package typings.reactNativeSvg

import typings.react.mod.ReactNode
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptElementsSymbolMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/Symbol", JSImport.Default)
  @js.native
  open class default () extends Symbol
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/Symbol", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/Symbol", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Symbol
    extends typings.reactNativeSvg.libTypescriptElementsShapeMod.default[SymbolProps]
  
  trait SymbolProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var opacity: js.UndefOr[NumberProp] = js.undefined
    
    var preserveAspectRatio: js.UndefOr[String] = js.undefined
    
    var viewBox: js.UndefOr[String] = js.undefined
  }
  object SymbolProps {
    
    inline def apply(): SymbolProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SymbolProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SymbolProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    }
  }
}
