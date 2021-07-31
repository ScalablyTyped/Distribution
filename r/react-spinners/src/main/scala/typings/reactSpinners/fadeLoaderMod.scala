package typings.reactSpinners

import typings.react.mod.PureComponent
import typings.reactSpinners.interfacesMod.LoaderHeightWidthRadiusProps
import typings.reactSpinners.interfacesMod.StyleFunction
import typings.reactSpinners.interfacesMod.StyleFunctionWithIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fadeLoaderMod {
  
  @JSImport("react-spinners/FadeLoader", JSImport.Default)
  @js.native
  class default () extends Loader
  object default {
    
    @JSImport("react-spinners/FadeLoader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-spinners/FadeLoader", "default.defaultProps")
    @js.native
    def defaultProps: LoaderHeightWidthRadiusProps = js.native
    @scala.inline
    def defaultProps_=(x: LoaderHeightWidthRadiusProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Loader
    extends PureComponent[LoaderHeightWidthRadiusProps, js.Object, js.Any] {
    
    var a: StyleFunction = js.native
    
    var b: StyleFunction = js.native
    
    var c: StyleFunction = js.native
    
    var d: StyleFunction = js.native
    
    var e: StyleFunction = js.native
    
    var f: StyleFunction = js.native
    
    var g: StyleFunction = js.native
    
    var h: StyleFunction = js.native
    
    def quarter(): Double = js.native
    
    def radius(): Double = js.native
    
    var style: StyleFunctionWithIndex = js.native
    
    var wrapper: StyleFunction = js.native
  }
}
