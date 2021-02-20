package typings.reactTransitionGroup

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Appear extends StObject {
    
    var appear: js.UndefOr[Double] = js.native
    
    var enter: js.UndefOr[Double] = js.native
    
    var exit: js.UndefOr[Double] = js.native
  }
  object Appear {
    
    @scala.inline
    def apply(): Appear = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Appear]
    }
    
    @scala.inline
    implicit class AppearMutableBuilder[Self <: Appear] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppear(value: Double): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      @scala.inline
      def setEnter(value: Double): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setExit(value: Double): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    }
  }
  
  @js.native
  trait ClassNames extends StObject {
    
    /**
      * The animation `classNames` applied to the component as it enters or exits.
      * A single name can be provided and it will be suffixed for each stage: e.g.
      *
      * `classNames="fade"` applies `fade-enter`, `fade-enter-active`,
      * `fade-exit`, `fade-exit-active`, `fade-appear`, and `fade-appear-active`.
      *
      * Each individual classNames can also be specified independently like:
      *
      * ```js
      * classNames={{
      *   appear: 'my-appear',
      *   appearActive: 'my-appear-active',
      *   appearDone: 'my-appear-done',
      *   enter: 'my-enter',
      *   enterActive: 'my-enter-active',
      *   enterDone: 'my-enter-done',
      *   exit: 'my-exit',
      *   exitActive: 'my-exit-active',
      *   exitDone: 'my-exit-done'
      * }}
      * ```
      */
    var classNames: js.UndefOr[String | CSSTransitionClassNames] = js.native
  }
  object ClassNames {
    
    @scala.inline
    def apply(): ClassNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassNames]
    }
    
    @scala.inline
    implicit class ClassNamesMutableBuilder[Self <: ClassNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNames(value: String | CSSTransitionClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    }
  }
  
  @js.native
  trait Dictprop
    extends /* prop */ StringDictionary[js.Any] {
    
    var childFactory: js.UndefOr[js.Function1[/* child */ ReactElement, ReactElement]] = js.native
    
    var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.native
  }
  object Dictprop {
    
    @scala.inline
    def apply(): Dictprop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictprop]
    }
    
    @scala.inline
    implicit class DictpropMutableBuilder[Self <: Dictprop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildFactory(value: /* child */ ReactElement => ReactElement): Self = StObject.set(x, "childFactory", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildFactoryUndefined: Self = StObject.set(x, "childFactory", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Explicit[ImplicitRefHandler /* <: js.Function2[/* node */ HTMLElement, /* repeated */ js.Any, Unit] */, ExplicitRefHandler /* <: js.Function1[/* repeated */ js.Any, Unit] */] extends StObject {
    
    var explicit: ExplicitRefHandler = js.native
    
    var `implicit`: ImplicitRefHandler = js.native
  }
  object Explicit {
    
    @scala.inline
    def apply[ImplicitRefHandler /* <: js.Function2[/* node */ HTMLElement, /* repeated */ js.Any, Unit] */, ExplicitRefHandler /* <: js.Function1[/* repeated */ js.Any, Unit] */](explicit: ExplicitRefHandler, `implicit`: ImplicitRefHandler): Explicit[ImplicitRefHandler, ExplicitRefHandler] = {
      val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any])
      __obj.updateDynamic("implicit")(`implicit`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Explicit[ImplicitRefHandler, ExplicitRefHandler]]
    }
    
    @scala.inline
    implicit class ExplicitMutableBuilder[Self <: Explicit[_, _], ImplicitRefHandler /* <: js.Function2[/* node */ HTMLElement, /* repeated */ js.Any, Unit] */, ExplicitRefHandler /* <: js.Function1[/* repeated */ js.Any, Unit] */] (val x: Self with (Explicit[ImplicitRefHandler, ExplicitRefHandler])) extends AnyVal {
      
      @scala.inline
      def setExplicit(value: ExplicitRefHandler): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplicit(value: ImplicitRefHandler): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
    }
  }
}
