package typings.reactNativeReanimated

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.MeasuredDimensions
import typings.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.RefObjectFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2NativeMethodsMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/NativeMethods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTag(): Null | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTag")().asInstanceOf[Null | Double]
  inline def getTag(view: Double): Null | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTag")(view.asInstanceOf[js.Any]).asInstanceOf[Null | Double]
  inline def getTag(view: Component[Any, Any, Any]): Null | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTag")(view.asInstanceOf[js.Any]).asInstanceOf[Null | Double]
  inline def getTag(view: ComponentClass[Any, ComponentState]): Null | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTag")(view.asInstanceOf[js.Any]).asInstanceOf[Null | Double]
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/NativeMethods", "measure")
  @js.native
  def measure: js.Function1[
    /* animatedRef */ RefObjectFunction[Component[js.Object, js.Object, Any]], 
    MeasuredDimensions | Null
  ] = js.native
  inline def measure_=(
    x: js.Function1[
      /* animatedRef */ RefObjectFunction[Component[js.Object, js.Object, Any]], 
      MeasuredDimensions | Null
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("measure")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/NativeMethods", "scrollTo")
  @js.native
  def scrollTo: js.Function4[
    /* animatedRef */ RefObjectFunction[Component[js.Object, js.Object, Any]], 
    /* x */ Double, 
    /* y */ Double, 
    /* animated */ Boolean, 
    Unit
  ] = js.native
  inline def scrollTo_=(
    x: js.Function4[
      /* animatedRef */ RefObjectFunction[Component[js.Object, js.Object, Any]], 
      /* x */ Double, 
      /* y */ Double, 
      /* animated */ Boolean, 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(x.asInstanceOf[js.Any])
  
  inline def setGestureState(handlerTag: Double, newState: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGestureState")(handlerTag.asInstanceOf[js.Any], newState.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
