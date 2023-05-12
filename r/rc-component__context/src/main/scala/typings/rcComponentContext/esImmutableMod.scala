package typings.rcComponentContext

import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esImmutableMod {
  
  @JSImport("@rc-component/context/es/Immutable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeImmutable[T /* <: ComponentType[Any] */](Component: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeImmutable")(Component.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def makeImmutable[T /* <: ComponentType[Any] */](Component: T, shouldTriggerRender: CompareProps[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeImmutable")(Component.asInstanceOf[js.Any], shouldTriggerRender.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def responseImmutable[T /* <: ComponentType[Any] */](Component: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("responseImmutable")(Component.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def responseImmutable[T /* <: ComponentType[Any] */](Component: T, propsAreEqual: CompareProps[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("responseImmutable")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useImmutableMark(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useImmutableMark")().asInstanceOf[Double]
  
  type CompareProps[T /* <: ComponentType[Any] */] = js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
}
