package typings.reactSpinners

import typings.emotionSerialize.mod.Keyframes
import typings.react.mod.Component
import typings.reactSpinners.interfacesMod.CalcFunction
import typings.reactSpinners.interfacesMod.LoaderSizeMarginProps
import typings.reactSpinners.interfacesMod.StyleFunction
import typings.reactSpinners.interfacesMod.StyleFunctionWithIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-spinners/PacmanLoader", JSImport.Namespace)
@js.native
object pacmanLoaderMod extends js.Object {
  
  @js.native
  trait Loader
    extends Component[LoaderSizeMarginProps, js.Object, js.Any] {
    
    var ball: CalcFunction[Keyframes] = js.native
    
    var ballStyle: StyleFunctionWithIndex = js.native
    
    var man: StyleFunction = js.native
    
    var pac: StyleFunction = js.native
    
    var pacmanStyle: StyleFunctionWithIndex = js.native
    
    var s1: CalcFunction[String] = js.native
    
    var s2: CalcFunction[String] = js.native
    
    var wrapper: StyleFunction = js.native
  }
  
  @js.native
  class default () extends Loader
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: LoaderSizeMarginProps = js.native
  }
}
