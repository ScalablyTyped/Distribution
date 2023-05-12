package typings.reactErrorBoundary

import typings.react.mod.ComponentType
import typings.react.mod.PropsWithChildren
import typings.react.mod.PropsWithRef
import typings.reactErrorBoundary.anon.Error
import typings.reactErrorBoundary.mod.ErrorBoundaryProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReactErrorBoundaryDotumdDotminMod {
  
  @JSImport("react-error-boundary/dist/react-error-boundary.umd.min", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-error-boundary/dist/react-error-boundary.umd.min", "ErrorBoundary")
  @js.native
  open class ErrorBoundary protected ()
    extends typings.reactErrorBoundary.mod.ErrorBoundary {
    def this(props: PropsWithRef[PropsWithChildren[ErrorBoundaryProps]]) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: PropsWithRef[PropsWithChildren[ErrorBoundaryProps]], context: Any) = this()
  }
  object ErrorBoundary {
    
    @JSImport("react-error-boundary/dist/react-error-boundary.umd.min", "ErrorBoundary")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getDerivedStateFromError(error: js.Error): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromError")(error.asInstanceOf[js.Any]).asInstanceOf[Error]
  }
  
  inline def useErrorHandler(): js.Function1[/* error */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useErrorHandler")().asInstanceOf[js.Function1[/* error */ Any, Unit]]
  inline def useErrorHandler(givenError: Any): js.Function1[/* error */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useErrorHandler")(givenError.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* error */ Any, Unit]]
  
  inline def withErrorBoundary[P](Component: ComponentType[P], errorBoundaryProps: ErrorBoundaryProps): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("withErrorBoundary")(Component.asInstanceOf[js.Any], errorBoundaryProps.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
}
