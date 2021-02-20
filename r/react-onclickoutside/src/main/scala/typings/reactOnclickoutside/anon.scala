package typings.reactOnclickoutside

import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofComponent extends StObject {
    
    // tslint won't let me format the sample code in a way that vscode likes it :(
    /**
      * If set, `this.context` will be set at runtime to the current value of the given Context.
      *
      * Usage:
      *
      * ```ts
      * type MyContext = number
      * const Ctx = React.createContext<MyContext>(0)
      *
      * class Foo extends React.Component {
      *   static contextType = Ctx
      *   context!: React.ContextType<typeof Ctx>
      *   render () {
      *     return <>My context's value: {this.context}</>;
      *   }
      * }
      * ```
      *
      * @see https://reactjs.org/docs/context.html#classcontexttype
      */
    /* static member */
    var contextType: js.UndefOr[Context[_]] = js.native
  }
  object TypeofComponent {
    
    @scala.inline
    def apply(): TypeofComponent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeofComponent]
    }
    
    @scala.inline
    implicit class TypeofComponentMutableBuilder[Self <: TypeofComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContextType(value: Context[_]): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextTypeUndefined: Self = StObject.set(x, "contextType", js.undefined)
    }
  }
}
