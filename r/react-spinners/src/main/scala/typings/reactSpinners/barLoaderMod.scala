package typings.reactSpinners

import typings.react.mod.Component
import typings.reactSpinners.interfacesMod.LoaderHeightWidthProps
import typings.reactSpinners.interfacesMod.StyleFunction
import typings.reactSpinners.interfacesMod.StyleFunctionWithIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-spinners/BarLoader", JSImport.Namespace)
@js.native
object barLoaderMod extends js.Object {
  
  @js.native
  class Loader ()
    extends Component[LoaderHeightWidthProps, js.Object, js.Any] {
    
    var style: StyleFunctionWithIndex = js.native
    
    var wrapper: StyleFunction = js.native
  }
  /* static members */
  @js.native
  object Loader extends js.Object {
    
    var defaultProps: LoaderHeightWidthProps = js.native
  }
  
  @js.native
  class default () extends Loader
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: LoaderHeightWidthProps = js.native
  }
}
