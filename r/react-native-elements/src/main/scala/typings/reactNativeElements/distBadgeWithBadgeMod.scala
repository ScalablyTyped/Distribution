package typings.reactNativeElements

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactPortal
import typings.reactNativeElements.distBadgeBadgeMod.BadgeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBadgeWithBadgeMod {
  
  @JSImport("react-native-elements/dist/badge/withBadge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: String): js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]]]
  inline def default(value: String, options: withBadgeOptions): js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]]]
  inline def default(value: js.Function1[/* props */ Any, ReactNode]): js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]]]
  inline def default(value: js.Function1[/* props */ Any, ReactNode], options: withBadgeOptions): js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]]]
  inline def default(value: js.Object): js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]]]
  inline def default(value: js.Object, options: withBadgeOptions): js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]]]
  inline def default(value: Boolean): js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]]]
  inline def default(value: Boolean, options: withBadgeOptions): js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]]]
  inline def default(value: Double): js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]]]
  inline def default(value: Double, options: withBadgeOptions): js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]]]
  inline def default(value: ReactElement): js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]]]
  inline def default(value: ReactElement, options: withBadgeOptions): js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]]]
  inline def default(value: ReactNodeArray): js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]]]
  inline def default(value: ReactNodeArray, options: withBadgeOptions): js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]]]
  inline def default(value: ReactPortal): js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]]]
  inline def default(value: ReactPortal, options: withBadgeOptions): js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* WrappedComponent */ ComponentType[Any], ComponentType[js.Object]]]
  
  trait withBadgeOptions
    extends StObject
       with BadgeProps {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object withBadgeOptions {
    
    inline def apply(): withBadgeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[withBadgeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: withBadgeOptions] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
