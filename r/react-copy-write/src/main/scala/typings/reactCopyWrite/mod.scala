package typings.reactCopyWrite

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.std.Partial
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-copy-write", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: js.Object */](state: T): typings.reactCopyWrite.anon.Consumer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any]).asInstanceOf[typings.reactCopyWrite.anon.Consumer[T]]
  
  // It'd be nice if this could somehow be improved! Perhaps we need variadic
  // kinds plus infer keyword? Alternatively unions may solve our issue if we had
  // the ability to restrict type widening.
  type AnyDeepMemberOfState[T] = Any
  
  type Consumer[T] = Component[ConsumerProps[T], js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactCopyWrite.mod.ConsumerPropsExplicitRender[T]
    - typings.reactCopyWrite.mod.ConsumerPropsImplicitRender[T]
  */
  trait ConsumerProps[T] extends StObject
  object ConsumerProps {
    
    inline def ConsumerPropsExplicitRender[T](): typings.reactCopyWrite.mod.ConsumerPropsExplicitRender[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactCopyWrite.mod.ConsumerPropsExplicitRender[T]]
    }
    
    inline def ConsumerPropsImplicitRender[T](): typings.reactCopyWrite.mod.ConsumerPropsImplicitRender[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactCopyWrite.mod.ConsumerPropsImplicitRender[T]]
    }
  }
  
  trait ConsumerPropsBase[T] extends StObject {
    
    var select: js.UndefOr[js.Array[SelectorFn[T]]] = js.undefined
  }
  object ConsumerPropsBase {
    
    inline def apply[T](): ConsumerPropsBase[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsumerPropsBase[T]]
    }
    
    extension [Self <: ConsumerPropsBase[?], T](x: Self & ConsumerPropsBase[T]) {
      
      inline def setSelect(value: js.Array[SelectorFn[T]]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectVarargs(value: SelectorFn[T]*): Self = StObject.set(x, "select", js.Array(value*))
    }
  }
  
  trait ConsumerPropsExplicitRender[T]
    extends StObject
       with ConsumerPropsBase[T]
       with ConsumerProps[T] {
    
    var render: js.UndefOr[RenderFn[T]] = js.undefined
  }
  object ConsumerPropsExplicitRender {
    
    inline def apply[T](): ConsumerPropsExplicitRender[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsumerPropsExplicitRender[T]]
    }
    
    extension [Self <: ConsumerPropsExplicitRender[?], T](x: Self & ConsumerPropsExplicitRender[T]) {
      
      inline def setRender(value: RenderFn[T]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  trait ConsumerPropsImplicitRender[T]
    extends StObject
       with ConsumerPropsBase[T]
       with ConsumerProps[T] {
    
    var children: js.UndefOr[RenderFn[T]] = js.undefined
  }
  object ConsumerPropsImplicitRender {
    
    inline def apply[T](): ConsumerPropsImplicitRender[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsumerPropsImplicitRender[T]]
    }
    
    extension [Self <: ConsumerPropsImplicitRender[?], T](x: Self & ConsumerPropsImplicitRender[T]) {
      
      inline def setChildren(value: RenderFn[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  type MutateFn[T] = js.Function2[/* draft */ T, /* state */ T, Unit]
  
  type Mutator[T] = js.Function1[/* mutator */ MutateFn[T], Unit]
  
  type Provider[T] = Component[ProviderProps[T], js.Object, Any]
  
  trait ProviderProps[T] extends StObject {
    
    var children: Element | js.Array[Element]
    
    var initialState: js.UndefOr[Partial[T]] = js.undefined
  }
  object ProviderProps {
    
    inline def apply[T](children: Element | js.Array[Element]): ProviderProps[T] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderProps[T]]
    }
    
    extension [Self <: ProviderProps[?], T](x: Self & ProviderProps[T]) {
      
      inline def setChildren(value: Element | js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setInitialState(value: Partial[T]): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    }
  }
  
  @js.native
  trait RenderFn[T] extends StObject {
    
    def apply(state: ReturnType[SelectorFn[T]]*): Element | js.Array[Element] | Null = js.native
  }
  
  type SelectorFn[T] = js.Function1[/* state */ T, AnyDeepMemberOfState[T]]
}
