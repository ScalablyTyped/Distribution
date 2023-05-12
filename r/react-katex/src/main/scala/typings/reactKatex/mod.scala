package typings.reactKatex

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-katex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BlockMath(props: MathComponentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("BlockMath")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InlineMath(props: MathComponentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InlineMath")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type ErrorRenderer = js.Function1[/* error */ js.Error, ReactNode]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactKatex.mod.MathComponentPropsWithMath
    - typings.reactKatex.mod.MathComponentPropsWithChildren
  */
  trait MathComponentProps extends StObject
  object MathComponentProps {
    
    inline def MathComponentPropsWithChildren(): typings.reactKatex.mod.MathComponentPropsWithChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactKatex.mod.MathComponentPropsWithChildren]
    }
    
    inline def MathComponentPropsWithMath(math: String): typings.reactKatex.mod.MathComponentPropsWithMath = {
      val __obj = js.Dynamic.literal(math = math.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactKatex.mod.MathComponentPropsWithMath]
    }
  }
  
  trait MathComponentPropsWithChildren
    extends StObject
       with MathComponentProps {
    
    var children: ReactNode
    
    var errorColor: js.UndefOr[String] = js.undefined
    
    var renderError: js.UndefOr[ErrorRenderer] = js.undefined
  }
  object MathComponentPropsWithChildren {
    
    inline def apply(): MathComponentPropsWithChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MathComponentPropsWithChildren]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MathComponentPropsWithChildren] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setErrorColor(value: String): Self = StObject.set(x, "errorColor", value.asInstanceOf[js.Any])
      
      inline def setErrorColorUndefined: Self = StObject.set(x, "errorColor", js.undefined)
      
      inline def setRenderError(value: /* error */ js.Error => ReactNode): Self = StObject.set(x, "renderError", js.Any.fromFunction1(value))
      
      inline def setRenderErrorUndefined: Self = StObject.set(x, "renderError", js.undefined)
    }
  }
  
  trait MathComponentPropsWithMath
    extends StObject
       with MathComponentProps {
    
    var errorColor: js.UndefOr[String] = js.undefined
    
    var math: String
    
    var renderError: js.UndefOr[ErrorRenderer] = js.undefined
  }
  object MathComponentPropsWithMath {
    
    inline def apply(math: String): MathComponentPropsWithMath = {
      val __obj = js.Dynamic.literal(math = math.asInstanceOf[js.Any])
      __obj.asInstanceOf[MathComponentPropsWithMath]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MathComponentPropsWithMath] (val x: Self) extends AnyVal {
      
      inline def setErrorColor(value: String): Self = StObject.set(x, "errorColor", value.asInstanceOf[js.Any])
      
      inline def setErrorColorUndefined: Self = StObject.set(x, "errorColor", js.undefined)
      
      inline def setMath(value: String): Self = StObject.set(x, "math", value.asInstanceOf[js.Any])
      
      inline def setRenderError(value: /* error */ js.Error => ReactNode): Self = StObject.set(x, "renderError", js.Any.fromFunction1(value))
      
      inline def setRenderErrorUndefined: Self = StObject.set(x, "renderError", js.undefined)
    }
  }
}
