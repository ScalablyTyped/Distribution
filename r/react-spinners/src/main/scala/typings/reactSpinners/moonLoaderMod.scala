package typings.reactSpinners

import typings.react.mod.PureComponent
import typings.reactSpinners.interfacesMod.CalcFunction
import typings.reactSpinners.interfacesMod.LoaderSizeProps
import typings.reactSpinners.interfacesMod.PrecompiledCss
import typings.reactSpinners.interfacesMod.StyleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moonLoaderMod {
  
  @JSImport("react-spinners/MoonLoader", JSImport.Default)
  @js.native
  class default () extends Loader
  object default {
    
    @JSImport("react-spinners/MoonLoader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-spinners/MoonLoader", "default.defaultProps")
    @js.native
    def defaultProps: LoaderSizeProps = js.native
    @scala.inline
    def defaultProps_=(x: LoaderSizeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type BallStyleFunction = js.Function1[/* size */ Double, PrecompiledCss]
  
  @js.native
  trait Loader
    extends PureComponent[LoaderSizeProps, js.Object, js.Any] {
    
    var ball: CalcFunction[PrecompiledCss] = js.native
    
    var ballStyle: BallStyleFunction = js.native
    
    var circle: CalcFunction[PrecompiledCss] = js.native
    
    var moonSize: CalcFunction[Double] = js.native
    
    var wrapper: StyleFunction = js.native
  }
}
