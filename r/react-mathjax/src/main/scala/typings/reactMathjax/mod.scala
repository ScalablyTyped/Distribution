package typings.reactMathjax

import typings.react.mod.Component
import typings.react.mod.PureComponent
import typings.reactMathjax.anon.Children
import typings.reactMathjax.anon.Formula
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-mathjax", "default.Node")
    @js.native
    class Node ()
      extends PureComponent[Formula, js.Object, js.Any]
    
    @JSImport("react-mathjax", "default.Provider")
    @js.native
    class Provider ()
      extends Component[Children, MathJaxContextValue, js.Any]
  }
  
  object MathJax {
    
    type Node = PureComponent[Formula, js.Object, js.Any]
    
    type Provider = Component[Children, MathJaxContextValue, js.Any]
  }
  
  trait MathJaxContextValue extends StObject {
    
    var MathJax: js.UndefOr[js.Object] = js.undefined
    
    def registerNode(): Unit
  }
  object MathJaxContextValue {
    
    inline def apply(registerNode: () => Unit): MathJaxContextValue = {
      val __obj = js.Dynamic.literal(registerNode = js.Any.fromFunction0(registerNode))
      __obj.asInstanceOf[MathJaxContextValue]
    }
    
    extension [Self <: MathJaxContextValue](x: Self) {
      
      inline def setMathJax(value: js.Object): Self = StObject.set(x, "MathJax", value.asInstanceOf[js.Any])
      
      inline def setMathJaxUndefined: Self = StObject.set(x, "MathJax", js.undefined)
      
      inline def setRegisterNode(value: () => Unit): Self = StObject.set(x, "registerNode", js.Any.fromFunction0(value))
    }
  }
}
