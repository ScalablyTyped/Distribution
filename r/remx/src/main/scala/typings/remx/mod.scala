package typings.remx

import typings.react.mod.ComponentType
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("remx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect[T](component: ComponentType[T]): ComponentType[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[T]]
  inline def connect[TInner, TOuter](createProps: js.Function1[/* a */ TOuter, TInner]): HOC[TInner, TOuter] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(createProps.asInstanceOf[js.Any]).asInstanceOf[HOC[TInner, TOuter]]
  
  inline def getters[T /* <: js.Object */](g: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getters")(g.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def setters[T /* <: js.Object */](s: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("setters")(s.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def state[T /* <: js.Object */](s: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("state")(s.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def useConnect[T /* <: js.Object */, A /* <: js.Array[Any] */](remxFunc: js.Function1[/* a */ A, T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useConnect")(remxFunc.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useConnect[T /* <: js.Object */, A /* <: js.Array[Any] */](remxFunc: js.Function1[/* a */ A, T], dependencies: A): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useConnect")(remxFunc.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[T]
  
  type HOC[TInner, TOuter] = js.Function1[
    /* component */ ComponentType[TInner], 
    ComponentType[(Omit[TInner, /* keyof TInner */ String]) & TOuter]
  ]
}
