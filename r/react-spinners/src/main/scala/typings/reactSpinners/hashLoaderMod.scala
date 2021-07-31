package typings.reactSpinners

import typings.emotionSerialize.mod.Keyframes
import typings.react.mod.PureComponent
import typings.reactSpinners.interfacesMod.CalcFunction
import typings.reactSpinners.interfacesMod.LoaderSizeProps
import typings.reactSpinners.interfacesMod.StyleFunction
import typings.reactSpinners.interfacesMod.StyleFunctionWithIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashLoaderMod {
  
  @JSImport("react-spinners/HashLoader", JSImport.Default)
  @js.native
  class default () extends Loader
  object default {
    
    @JSImport("react-spinners/HashLoader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-spinners/HashLoader", "default.defaultProps")
    @js.native
    def defaultProps: LoaderSizeProps = js.native
    @scala.inline
    def defaultProps_=(x: LoaderSizeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Loader
    extends PureComponent[LoaderSizeProps, js.Object, js.Any] {
    
    var after: CalcFunction[Keyframes] = js.native
    
    var before: CalcFunction[Keyframes] = js.native
    
    var color: CalcFunction[String] = js.native
    
    var lat: CalcFunction[Double] = js.native
    
    var offset: CalcFunction[Double] = js.native
    
    var style: StyleFunctionWithIndex = js.native
    
    var thickness: CalcFunction[Double] = js.native
    
    var wrapper: StyleFunction = js.native
  }
}
