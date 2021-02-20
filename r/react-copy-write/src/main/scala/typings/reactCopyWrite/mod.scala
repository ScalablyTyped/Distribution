package typings.reactCopyWrite

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.std.Partial
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-copy-write", JSImport.Default)
  @js.native
  def default[T /* <: js.Object */](state: T): typings.reactCopyWrite.anon.Consumer[T] = js.native
  
  // It'd be nice if this could somehow be improved! Perhaps we need variadic
  // kinds plus infer keyword? Alternatively unions may solve our issue if we had
  // the ability to restrict type widening.
  type AnyDeepMemberOfState[T] = js.Any
  
  type Consumer[T] = Component[ConsumerProps[T], js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactCopyWrite.mod.ConsumerPropsExplicitRender[T]
    - typings.reactCopyWrite.mod.ConsumerPropsImplicitRender[T]
  */
  trait ConsumerProps[T] extends StObject
  object ConsumerProps {
    
    @scala.inline
    def ConsumerPropsExplicitRender[T](): typings.reactCopyWrite.mod.ConsumerPropsExplicitRender[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactCopyWrite.mod.ConsumerPropsExplicitRender[T]]
    }
    
    @scala.inline
    def ConsumerPropsImplicitRender[T](): typings.reactCopyWrite.mod.ConsumerPropsImplicitRender[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactCopyWrite.mod.ConsumerPropsImplicitRender[T]]
    }
  }
  
  @js.native
  trait ConsumerPropsBase[T] extends StObject {
    
    var select: js.UndefOr[js.Array[SelectorFn[T]]] = js.native
  }
  object ConsumerPropsBase {
    
    @scala.inline
    def apply[T](): ConsumerPropsBase[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsumerPropsBase[T]]
    }
    
    @scala.inline
    implicit class ConsumerPropsBaseMutableBuilder[Self <: ConsumerPropsBase[_], T] (val x: Self with ConsumerPropsBase[T]) extends AnyVal {
      
      @scala.inline
      def setSelect(value: js.Array[SelectorFn[T]]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setSelectVarargs(value: SelectorFn[T]*): Self = StObject.set(x, "select", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ConsumerPropsExplicitRender[T]
    extends ConsumerPropsBase[T]
       with ConsumerProps[T] {
    
    var render: js.UndefOr[RenderFn[T]] = js.native
  }
  object ConsumerPropsExplicitRender {
    
    @scala.inline
    def apply[T](): ConsumerPropsExplicitRender[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsumerPropsExplicitRender[T]]
    }
    
    @scala.inline
    implicit class ConsumerPropsExplicitRenderMutableBuilder[Self <: ConsumerPropsExplicitRender[_], T] (val x: Self with ConsumerPropsExplicitRender[T]) extends AnyVal {
      
      @scala.inline
      def setRender(value: /* repeated */ ReturnType[SelectorFn[T]] => Element | js.Array[Element] | Null): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  @js.native
  trait ConsumerPropsImplicitRender[T]
    extends ConsumerPropsBase[T]
       with ConsumerProps[T] {
    
    var children: js.UndefOr[RenderFn[T]] = js.native
  }
  object ConsumerPropsImplicitRender {
    
    @scala.inline
    def apply[T](): ConsumerPropsImplicitRender[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsumerPropsImplicitRender[T]]
    }
    
    @scala.inline
    implicit class ConsumerPropsImplicitRenderMutableBuilder[Self <: ConsumerPropsImplicitRender[_], T] (val x: Self with ConsumerPropsImplicitRender[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* repeated */ ReturnType[SelectorFn[T]] => Element | js.Array[Element] | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  type MutateFn[T] = js.Function2[/* draft */ T, /* state */ T, Unit]
  
  type Mutator[T] = js.Function1[/* mutator */ MutateFn[T], Unit]
  
  type Provider[T] = Component[ProviderProps[T], js.Object, js.Any]
  
  @js.native
  trait ProviderProps[T] extends StObject {
    
    var children: Element | js.Array[Element] = js.native
    
    var initialState: js.UndefOr[Partial[T]] = js.native
  }
  object ProviderProps {
    
    @scala.inline
    def apply[T](children: Element | js.Array[Element]): ProviderProps[T] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderProps[T]]
    }
    
    @scala.inline
    implicit class ProviderPropsMutableBuilder[Self <: ProviderProps[_], T] (val x: Self with ProviderProps[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: Element | js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setInitialState(value: Partial[T]): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    }
  }
  
  type RenderFn[T] = js.Function1[/* repeated */ ReturnType[SelectorFn[T]], Element | js.Array[Element] | Null]
  
  type SelectorFn[T] = js.Function1[/* state */ T, AnyDeepMemberOfState[T]]
}
