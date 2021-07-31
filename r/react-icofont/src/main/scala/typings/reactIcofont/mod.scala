package typings.reactIcofont

import typings.react.mod.Component
import typings.reactIcofont.reactIcofontStrings.`10`
import typings.reactIcofont.reactIcofontStrings.`180`
import typings.reactIcofont.reactIcofontStrings.`1`
import typings.reactIcofont.reactIcofontStrings.`270`
import typings.reactIcofont.reactIcofontStrings.`2`
import typings.reactIcofont.reactIcofontStrings.`3`
import typings.reactIcofont.reactIcofontStrings.`4`
import typings.reactIcofont.reactIcofontStrings.`5`
import typings.reactIcofont.reactIcofontStrings.`6`
import typings.reactIcofont.reactIcofontStrings.`7`
import typings.reactIcofont.reactIcofontStrings.`8`
import typings.reactIcofont.reactIcofontStrings.`90`
import typings.reactIcofont.reactIcofontStrings.`9`
import typings.reactIcofont.reactIcofontStrings.h
import typings.reactIcofont.reactIcofontStrings.v
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-icofont", JSImport.Default)
  @js.native
  class default ()
    extends Component[IcofontProps, js.Object, js.Any]
  
  type Icofont = Component[IcofontProps, js.Object, js.Any]
  
  trait IcofontProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var flip: js.UndefOr[h | v] = js.undefined
    
    var icon: String
    
    var rotate: js.UndefOr[`90` | `180` | `270`] = js.undefined
    
    var size: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`] = js.undefined
    
    var spin: js.UndefOr[Boolean] = js.undefined
  }
  object IcofontProps {
    
    @scala.inline
    def apply(icon: String): IcofontProps = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[IcofontProps]
    }
    
    @scala.inline
    implicit class IcofontPropsMutableBuilder[Self <: IcofontProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFlip(value: h | v): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotate(value: `90` | `180` | `270`): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setSize(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSpin(value: Boolean): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
    }
  }
}
