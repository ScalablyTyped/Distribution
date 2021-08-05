package typings.reactSpinners

import typings.react.mod.PureComponent
import typings.reactSpinners.interfacesMod.LoaderSizeProps
import typings.reactSpinners.interfacesMod.StyleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipLoaderMod {
  
  @JSImport("react-spinners/ClipLoader", JSImport.Default)
  @js.native
  class default () extends Loader
  object default {
    
    @JSImport("react-spinners/ClipLoader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-spinners/ClipLoader", "default.defaultProps")
    @js.native
    def defaultProps: LoaderSizeProps = js.native
    inline def defaultProps_=(x: LoaderSizeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Loader
    extends PureComponent[LoaderSizeProps, js.Object, js.Any] {
    
    var style: StyleFunction = js.native
  }
}
