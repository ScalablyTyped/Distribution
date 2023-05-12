package typings.rcComponentContext

import typings.rcComponentContext.esContextMod.Selector
import typings.rcComponentContext.esContextMod.SelectorContext
import typings.rcComponentContext.esImmutableMod.CompareProps
import typings.react.mod.ComponentType
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rc-component/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createContext[ContextProps](): SelectorContext[ContextProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")().asInstanceOf[SelectorContext[ContextProps]]
  inline def createContext[ContextProps](defaultValue: ContextProps): SelectorContext[ContextProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[SelectorContext[ContextProps]]
  
  inline def makeImmutable[T /* <: ComponentType[Any] */](Component: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeImmutable")(Component.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def makeImmutable[T /* <: ComponentType[Any] */](Component: T, shouldTriggerRender: CompareProps[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeImmutable")(Component.asInstanceOf[js.Any], shouldTriggerRender.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def responseImmutable[T /* <: ComponentType[Any] */](Component: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("responseImmutable")(Component.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def responseImmutable[T /* <: ComponentType[Any] */](Component: T, propsAreEqual: CompareProps[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("responseImmutable")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useContext[ContextProps](holder: SelectorContext[ContextProps]): ContextProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(holder.asInstanceOf[js.Any]).asInstanceOf[ContextProps]
  inline def useContext[ContextProps, PropName /* <: /* keyof ContextProps */ String */](holder: SelectorContext[ContextProps], selector: PropName): /* import warning: importer.ImportType#apply Failed type conversion: ContextProps[PropName] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(holder.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: ContextProps[PropName] */ js.Any]
  inline def useContext[ContextProps, SelectorValue /* <: Partial[ContextProps] */](holder: SelectorContext[ContextProps], selector: js.Array[/* keyof ContextProps */ String]): SelectorValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(holder.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[SelectorValue]
  inline def useContext[ContextProps, SelectorValue](holder: SelectorContext[ContextProps], selector: Selector[ContextProps, SelectorValue]): SelectorValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(holder.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[SelectorValue]
  
  inline def useImmutableMark(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useImmutableMark")().asInstanceOf[Double]
}
