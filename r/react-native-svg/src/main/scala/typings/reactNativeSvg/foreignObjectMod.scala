package typings.reactNativeSvg

import typings.react.mod.ReactNode
import typings.reactNativeSvg.anon.X
import typings.reactNativeSvg.typesMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foreignObjectMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/ForeignObject", JSImport.Default)
  @js.native
  open class default () extends ForeignObject
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/ForeignObject", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/ForeignObject", "default.defaultProps")
    @js.native
    def defaultProps: X = js.native
    inline def defaultProps_=(x: X): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-svg/lib/typescript/elements/ForeignObject", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ForeignObject
    extends typings.reactNativeSvg.gMod.default[ForeignObjectProps]
  
  trait ForeignObjectProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var height: js.UndefOr[NumberProp] = js.undefined
    
    var width: js.UndefOr[NumberProp] = js.undefined
    
    var x: js.UndefOr[NumberProp] = js.undefined
    
    var y: js.UndefOr[NumberProp] = js.undefined
  }
  object ForeignObjectProps {
    
    inline def apply(): ForeignObjectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForeignObjectProps]
    }
    
    extension [Self <: ForeignObjectProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: NumberProp): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: NumberProp): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
