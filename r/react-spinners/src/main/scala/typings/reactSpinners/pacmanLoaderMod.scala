package typings.reactSpinners

import typings.emotionSerialize.mod.Keyframes
import typings.react.mod.PureComponent
import typings.reactSpinners.interfacesMod.CalcFunction
import typings.reactSpinners.interfacesMod.LoaderSizeMarginProps
import typings.reactSpinners.interfacesMod.StyleFunction
import typings.reactSpinners.interfacesMod.StyleFunctionWithIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pacmanLoaderMod {
  
  @JSImport("react-spinners/PacmanLoader", JSImport.Default)
  @js.native
  class default () extends Loader
  object default {
    
    @JSImport("react-spinners/PacmanLoader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-spinners/PacmanLoader", "default.defaultProps")
    @js.native
    def defaultProps: LoaderSizeMarginProps = js.native
    inline def defaultProps_=(x: LoaderSizeMarginProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Loader
    extends PureComponent[LoaderSizeMarginProps, js.Object, js.Any] {
    
    var ball: CalcFunction[Keyframes] = js.native
    
    var ballStyle: StyleFunctionWithIndex = js.native
    
    var man: StyleFunction = js.native
    
    var pac: StyleFunction = js.native
    
    var pacmanStyle: StyleFunctionWithIndex = js.native
    
    var s1: CalcFunction[String] = js.native
    
    var s2: CalcFunction[String] = js.native
    
    var wrapper: StyleFunction = js.native
  }
}
