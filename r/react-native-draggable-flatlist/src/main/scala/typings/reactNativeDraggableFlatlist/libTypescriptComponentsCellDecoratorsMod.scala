package typings.reactNativeDraggableFlatlist

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNativeDraggableFlatlist.anon.OnActiveAnim
import typings.reactNativeDraggableFlatlist.libTypescriptHooksUseOnCellActiveAnimationMod.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsCellDecoratorsMod {
  
  @JSImport("react-native-draggable-flatlist/lib/typescript/components/CellDecorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def OpacityDecorator(param0: OpacityProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("OpacityDecorator")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ScaleDecorator(param0: ScaleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ScaleDecorator")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ShadowDecorator(param0: ShadowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ShadowDecorator")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useOnCellActiveAnimation(): OnActiveAnim = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnCellActiveAnimation")().asInstanceOf[OnActiveAnim]
  inline def useOnCellActiveAnimation(param0: Params): OnActiveAnim = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnCellActiveAnimation")(param0.asInstanceOf[js.Any]).asInstanceOf[OnActiveAnim]
  
  trait OpacityProps extends StObject {
    
    var activeOpacity: js.UndefOr[Double] = js.undefined
    
    var children: ReactNode
  }
  object OpacityProps {
    
    inline def apply(): OpacityProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpacityProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpacityProps] (val x: Self) extends AnyVal {
      
      inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
      
      inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait ScaleProps extends StObject {
    
    var activeScale: js.UndefOr[Double] = js.undefined
    
    var children: ReactNode
  }
  object ScaleProps {
    
    inline def apply(): ScaleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScaleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScaleProps] (val x: Self) extends AnyVal {
      
      inline def setActiveScale(value: Double): Self = StObject.set(x, "activeScale", value.asInstanceOf[js.Any])
      
      inline def setActiveScaleUndefined: Self = StObject.set(x, "activeScale", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait ShadowProps extends StObject {
    
    var children: ReactNode
    
    var color: js.UndefOr[String] = js.undefined
    
    var elevation: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
  }
  object ShadowProps {
    
    inline def apply(): ShadowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShadowProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShadowProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
}
