package typings.rcComponentContext

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.std.Partial
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextMod {
  
  @JSImport("@rc-component/context/es/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createContext[ContextProps](): SelectorContext[ContextProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")().asInstanceOf[SelectorContext[ContextProps]]
  inline def createContext[ContextProps](defaultValue: ContextProps): SelectorContext[ContextProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[SelectorContext[ContextProps]]
  
  inline def useContext[ContextProps](holder: SelectorContext[ContextProps]): ContextProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(holder.asInstanceOf[js.Any]).asInstanceOf[ContextProps]
  inline def useContext[ContextProps, PropName /* <: /* keyof ContextProps */ String */](holder: SelectorContext[ContextProps], selector: PropName): /* import warning: importer.ImportType#apply Failed type conversion: ContextProps[PropName] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(holder.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: ContextProps[PropName] */ js.Any]
  inline def useContext[ContextProps, SelectorValue /* <: Partial[ContextProps] */](holder: SelectorContext[ContextProps], selector: js.Array[/* keyof ContextProps */ String]): SelectorValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(holder.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[SelectorValue]
  inline def useContext[ContextProps, SelectorValue](holder: SelectorContext[ContextProps], selector: Selector[ContextProps, SelectorValue]): SelectorValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(holder.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[SelectorValue]
  
  trait Context[ContextProps] extends StObject {
    
    def getValue(): ContextProps
    
    var listeners: Listeners[ContextProps]
  }
  object Context {
    
    inline def apply[ContextProps](getValue: () => ContextProps, listeners: Listeners[ContextProps]): Context[ContextProps] = {
      val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue), listeners = listeners.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context[ContextProps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context[?], ContextProps] (val x: Self & Context[ContextProps]) extends AnyVal {
      
      inline def setGetValue(value: () => ContextProps): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setListeners(value: Listeners[ContextProps]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextSelectorProviderProps[T] extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var value: T
  }
  object ContextSelectorProviderProps {
    
    inline def apply[T](value: T): ContextSelectorProviderProps[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextSelectorProviderProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextSelectorProviderProps[?], T] (val x: Self & ContextSelectorProviderProps[T]) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Listeners[ContextProps] = Set[Trigger[ContextProps]]
  
  type Selector[ContextProps, SelectorValue] = js.Function1[/* value */ ContextProps, SelectorValue]
  
  trait SelectorContext[ContextProps] extends StObject {
    
    var Context: typings.react.mod.Context[typings.rcComponentContext.esContextMod.Context[ContextProps]]
    
    var Provider: ComponentType[ContextSelectorProviderProps[ContextProps]]
    
    var defaultValue: js.UndefOr[ContextProps] = js.undefined
  }
  object SelectorContext {
    
    inline def apply[ContextProps](
      Context: typings.react.mod.Context[Context[ContextProps]],
      Provider: ComponentType[ContextSelectorProviderProps[ContextProps]]
    ): SelectorContext[ContextProps] = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorContext[ContextProps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectorContext[?], ContextProps] (val x: Self & SelectorContext[ContextProps]) extends AnyVal {
      
      inline def setContext(value: typings.react.mod.Context[Context[ContextProps]]): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
      
      inline def setDefaultValue(value: ContextProps): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setProvider(value: ComponentType[ContextSelectorProviderProps[ContextProps]]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    }
  }
  
  type Trigger[ContextProps] = js.Function1[/* value */ ContextProps, Unit]
}
