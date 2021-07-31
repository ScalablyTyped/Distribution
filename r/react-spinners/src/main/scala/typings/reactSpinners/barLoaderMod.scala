package typings.reactSpinners

import typings.react.mod.PureComponent
import typings.reactSpinners.interfacesMod.LoaderHeightWidthProps
import typings.reactSpinners.interfacesMod.StyleFunction
import typings.reactSpinners.interfacesMod.StyleFunctionWithIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barLoaderMod {
  
  @JSImport("react-spinners/BarLoader", JSImport.Default)
  @js.native
  class default protected () extends Loader {
    def this(props: LoaderHeightWidthProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LoaderHeightWidthProps, context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-spinners/BarLoader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-spinners/BarLoader", "default.defaultProps")
    @js.native
    def defaultProps: LoaderHeightWidthProps = js.native
    @scala.inline
    def defaultProps_=(x: LoaderHeightWidthProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-spinners/BarLoader", "Loader")
  @js.native
  class Loader protected ()
    extends PureComponent[LoaderHeightWidthProps, js.Object, js.Any] {
    def this(props: LoaderHeightWidthProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LoaderHeightWidthProps, context: js.Any) = this()
    
    var style: StyleFunctionWithIndex = js.native
    
    var wrapper: StyleFunction = js.native
  }
  /* static members */
  object Loader {
    
    @JSImport("react-spinners/BarLoader", "Loader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-spinners/BarLoader", "Loader.defaultProps")
    @js.native
    def defaultProps: LoaderHeightWidthProps = js.native
    @scala.inline
    def defaultProps_=(x: LoaderHeightWidthProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
