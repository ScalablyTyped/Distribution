package typings.reactErrorBoundary

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ErrorInfo
import typings.react.mod.PropsWithChildren
import typings.react.mod.PropsWithRef
import typings.react.mod.ReactElement
import typings.reactErrorBoundary.anon.ComponentStack
import typings.reactErrorBoundary.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-error-boundary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-error-boundary", "ErrorBoundary")
  @js.native
  open class ErrorBoundary protected () extends Component[PropsWithRef[PropsWithChildren[ErrorBoundaryProps]], ErrorBoundaryState, Any] {
    def this(props: PropsWithRef[PropsWithChildren[ErrorBoundaryProps]]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PropsWithRef[PropsWithChildren[ErrorBoundaryProps]], context: Any) = this()
    
    @JSName("componentDidCatch")
    def componentDidCatch_MErrorBoundary(error: js.Error, info: ErrorInfo): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MErrorBoundary(prevProps: ErrorBoundaryProps, prevState: ErrorBoundaryState): Unit = js.native
    
    def reset(): Unit = js.native
    
    def resetErrorBoundary(args: Any*): Unit = js.native
  }
  object ErrorBoundary {
    
    @JSImport("react-error-boundary", "ErrorBoundary")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getDerivedStateFromError(error: js.Error): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromError")(error.asInstanceOf[js.Any]).asInstanceOf[Error]
  }
  
  inline def useErrorHandler(): js.Function1[/* error */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useErrorHandler")().asInstanceOf[js.Function1[/* error */ Any, Unit]]
  inline def useErrorHandler(givenError: Any): js.Function1[/* error */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useErrorHandler")(givenError.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* error */ Any, Unit]]
  
  inline def withErrorBoundary[P](Component: ComponentType[P], errorBoundaryProps: ErrorBoundaryProps): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("withErrorBoundary")(Component.asInstanceOf[js.Any], errorBoundaryProps.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactErrorBoundary.mod.ErrorBoundaryPropsWithFallback
    - typings.reactErrorBoundary.mod.ErrorBoundaryPropsWithComponent
    - typings.reactErrorBoundary.mod.ErrorBoundaryPropsWithRender
  */
  trait ErrorBoundaryProps extends StObject
  object ErrorBoundaryProps {
    
    inline def ErrorBoundaryPropsWithComponent(FallbackComponent: ComponentType[FallbackProps]): typings.reactErrorBoundary.mod.ErrorBoundaryPropsWithComponent = {
      val __obj = js.Dynamic.literal(FallbackComponent = FallbackComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactErrorBoundary.mod.ErrorBoundaryPropsWithComponent]
    }
    
    inline def ErrorBoundaryPropsWithFallback(): typings.reactErrorBoundary.mod.ErrorBoundaryPropsWithFallback = {
      val __obj = js.Dynamic.literal(fallback = null)
      __obj.asInstanceOf[typings.reactErrorBoundary.mod.ErrorBoundaryPropsWithFallback]
    }
    
    inline def ErrorBoundaryPropsWithRender(fallbackRender: /* props */ FallbackProps => ReactElement | Null): typings.reactErrorBoundary.mod.ErrorBoundaryPropsWithRender = {
      val __obj = js.Dynamic.literal(fallbackRender = js.Any.fromFunction1(fallbackRender))
      __obj.asInstanceOf[typings.reactErrorBoundary.mod.ErrorBoundaryPropsWithRender]
    }
  }
  
  trait ErrorBoundaryPropsWithComponent
    extends StObject
       with ErrorBoundaryProps {
    
    var FallbackComponent: ComponentType[FallbackProps]
    
    var fallback: js.UndefOr[scala.Nothing] = js.undefined
    
    var fallbackRender: js.UndefOr[scala.Nothing] = js.undefined
    
    var onError: js.UndefOr[js.Function2[/* error */ js.Error, /* info */ ComponentStack, Unit]] = js.undefined
    
    var onReset: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var onResetKeysChange: js.UndefOr[
        js.Function2[
          /* prevResetKeys */ js.UndefOr[js.Array[Any]], 
          /* resetKeys */ js.UndefOr[js.Array[Any]], 
          Unit
        ]
      ] = js.undefined
    
    var resetKeys: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object ErrorBoundaryPropsWithComponent {
    
    inline def apply(FallbackComponent: ComponentType[FallbackProps]): ErrorBoundaryPropsWithComponent = {
      val __obj = js.Dynamic.literal(FallbackComponent = FallbackComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorBoundaryPropsWithComponent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorBoundaryPropsWithComponent] (val x: Self) extends AnyVal {
      
      inline def setFallbackComponent(value: ComponentType[FallbackProps]): Self = StObject.set(x, "FallbackComponent", value.asInstanceOf[js.Any])
      
      inline def setOnError(value: (/* error */ js.Error, /* info */ ComponentStack) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnReset(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetKeysChange(
        value: (/* prevResetKeys */ js.UndefOr[js.Array[Any]], /* resetKeys */ js.UndefOr[js.Array[Any]]) => Unit
      ): Self = StObject.set(x, "onResetKeysChange", js.Any.fromFunction2(value))
      
      inline def setOnResetKeysChangeUndefined: Self = StObject.set(x, "onResetKeysChange", js.undefined)
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setResetKeys(value: js.Array[Any]): Self = StObject.set(x, "resetKeys", value.asInstanceOf[js.Any])
      
      inline def setResetKeysUndefined: Self = StObject.set(x, "resetKeys", js.undefined)
      
      inline def setResetKeysVarargs(value: Any*): Self = StObject.set(x, "resetKeys", js.Array(value*))
    }
  }
  
  trait ErrorBoundaryPropsWithFallback
    extends StObject
       with ErrorBoundaryProps {
    
    var FallbackComponent: js.UndefOr[scala.Nothing] = js.undefined
    
    var fallback: ReactElement | Null
    
    var fallbackRender: js.UndefOr[scala.Nothing] = js.undefined
    
    var onError: js.UndefOr[js.Function2[/* error */ js.Error, /* info */ ComponentStack, Unit]] = js.undefined
    
    var onReset: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var onResetKeysChange: js.UndefOr[
        js.Function2[
          /* prevResetKeys */ js.UndefOr[js.Array[Any]], 
          /* resetKeys */ js.UndefOr[js.Array[Any]], 
          Unit
        ]
      ] = js.undefined
    
    var resetKeys: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object ErrorBoundaryPropsWithFallback {
    
    inline def apply(): ErrorBoundaryPropsWithFallback = {
      val __obj = js.Dynamic.literal(fallback = null)
      __obj.asInstanceOf[ErrorBoundaryPropsWithFallback]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorBoundaryPropsWithFallback] (val x: Self) extends AnyVal {
      
      inline def setFallback(value: ReactElement): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackNull: Self = StObject.set(x, "fallback", null)
      
      inline def setOnError(value: (/* error */ js.Error, /* info */ ComponentStack) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnReset(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetKeysChange(
        value: (/* prevResetKeys */ js.UndefOr[js.Array[Any]], /* resetKeys */ js.UndefOr[js.Array[Any]]) => Unit
      ): Self = StObject.set(x, "onResetKeysChange", js.Any.fromFunction2(value))
      
      inline def setOnResetKeysChangeUndefined: Self = StObject.set(x, "onResetKeysChange", js.undefined)
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setResetKeys(value: js.Array[Any]): Self = StObject.set(x, "resetKeys", value.asInstanceOf[js.Any])
      
      inline def setResetKeysUndefined: Self = StObject.set(x, "resetKeys", js.undefined)
      
      inline def setResetKeysVarargs(value: Any*): Self = StObject.set(x, "resetKeys", js.Array(value*))
    }
  }
  
  trait ErrorBoundaryPropsWithRender
    extends StObject
       with ErrorBoundaryProps {
    
    var FallbackComponent: js.UndefOr[scala.Nothing] = js.undefined
    
    var fallback: js.UndefOr[scala.Nothing] = js.undefined
    
    var fallbackRender: js.Function1[/* props */ FallbackProps, ReactElement | Null]
    
    var onError: js.UndefOr[js.Function2[/* error */ js.Error, /* info */ ComponentStack, Unit]] = js.undefined
    
    var onReset: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var onResetKeysChange: js.UndefOr[
        js.Function2[
          /* prevResetKeys */ js.UndefOr[js.Array[Any]], 
          /* resetKeys */ js.UndefOr[js.Array[Any]], 
          Unit
        ]
      ] = js.undefined
    
    var resetKeys: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object ErrorBoundaryPropsWithRender {
    
    inline def apply(fallbackRender: /* props */ FallbackProps => ReactElement | Null): ErrorBoundaryPropsWithRender = {
      val __obj = js.Dynamic.literal(fallbackRender = js.Any.fromFunction1(fallbackRender))
      __obj.asInstanceOf[ErrorBoundaryPropsWithRender]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorBoundaryPropsWithRender] (val x: Self) extends AnyVal {
      
      inline def setFallbackRender(value: /* props */ FallbackProps => ReactElement | Null): Self = StObject.set(x, "fallbackRender", js.Any.fromFunction1(value))
      
      inline def setOnError(value: (/* error */ js.Error, /* info */ ComponentStack) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnReset(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetKeysChange(
        value: (/* prevResetKeys */ js.UndefOr[js.Array[Any]], /* resetKeys */ js.UndefOr[js.Array[Any]]) => Unit
      ): Self = StObject.set(x, "onResetKeysChange", js.Any.fromFunction2(value))
      
      inline def setOnResetKeysChangeUndefined: Self = StObject.set(x, "onResetKeysChange", js.undefined)
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setResetKeys(value: js.Array[Any]): Self = StObject.set(x, "resetKeys", value.asInstanceOf[js.Any])
      
      inline def setResetKeysUndefined: Self = StObject.set(x, "resetKeys", js.undefined)
      
      inline def setResetKeysVarargs(value: Any*): Self = StObject.set(x, "resetKeys", js.Array(value*))
    }
  }
  
  trait ErrorBoundaryState extends StObject {
    
    var error: js.Error | Null
  }
  object ErrorBoundaryState {
    
    inline def apply(): ErrorBoundaryState = {
      val __obj = js.Dynamic.literal(error = null)
      __obj.asInstanceOf[ErrorBoundaryState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorBoundaryState] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
    }
  }
  
  trait FallbackProps extends StObject {
    
    var error: js.Error
    
    def resetErrorBoundary(args: Any*): Unit
  }
  object FallbackProps {
    
    inline def apply(error: js.Error, resetErrorBoundary: /* repeated */ Any => Unit): FallbackProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], resetErrorBoundary = js.Any.fromFunction1(resetErrorBoundary))
      __obj.asInstanceOf[FallbackProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FallbackProps] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setResetErrorBoundary(value: /* repeated */ Any => Unit): Self = StObject.set(x, "resetErrorBoundary", js.Any.fromFunction1(value))
    }
  }
}
