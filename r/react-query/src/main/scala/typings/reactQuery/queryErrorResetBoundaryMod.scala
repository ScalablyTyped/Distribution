package typings.reactQuery

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryErrorResetBoundaryMod {
  
  @JSImport("react-query/types/react/QueryErrorResetBoundary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def QueryErrorResetBoundary(hasChildren: QueryErrorResetBoundaryProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("QueryErrorResetBoundary")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useQueryErrorResetBoundary(): QueryErrorResetBoundaryValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryErrorResetBoundary")().asInstanceOf[QueryErrorResetBoundaryValue]
  
  trait QueryErrorResetBoundaryProps extends StObject {
    
    var children: (js.Function1[/* value */ QueryErrorResetBoundaryValue, ReactNode]) | ReactNode
  }
  object QueryErrorResetBoundaryProps {
    
    inline def apply(): QueryErrorResetBoundaryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryErrorResetBoundaryProps]
    }
    
    extension [Self <: QueryErrorResetBoundaryProps](x: Self) {
      
      inline def setChildren(value: (js.Function1[/* value */ QueryErrorResetBoundaryValue, ReactNode]) | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* value */ QueryErrorResetBoundaryValue => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait QueryErrorResetBoundaryValue extends StObject {
    
    def clearReset(): Unit
    
    def isReset(): Boolean
    
    def reset(): Unit
  }
  object QueryErrorResetBoundaryValue {
    
    inline def apply(clearReset: () => Unit, isReset: () => Boolean, reset: () => Unit): QueryErrorResetBoundaryValue = {
      val __obj = js.Dynamic.literal(clearReset = js.Any.fromFunction0(clearReset), isReset = js.Any.fromFunction0(isReset), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[QueryErrorResetBoundaryValue]
    }
    
    extension [Self <: QueryErrorResetBoundaryValue](x: Self) {
      
      inline def setClearReset(value: () => Unit): Self = StObject.set(x, "clearReset", js.Any.fromFunction0(value))
      
      inline def setIsReset(value: () => Boolean): Self = StObject.set(x, "isReset", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
}
