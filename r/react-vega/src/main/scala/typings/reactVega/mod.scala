package typings.reactVega

import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.reactVega.anon.Data
import typings.reactVega.anon.Mode
import typings.reactVega.libCreateClassFromSpecMod.Constructor
import typings.reactVega.libCreateClassFromSpecMod.FixedVegaChartProps
import typings.reactVega.libVegaLiteMod.VegaLiteProps
import typings.reactVega.libVegaMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-vega", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-vega", "Vega")
  @js.native
  open class Vega () extends default
  /* static members */
  object Vega {
    
    @JSImport("react-vega", "Vega")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-vega", "Vega.defaultProps")
    @js.native
    def defaultProps: Data = js.native
    inline def defaultProps_=(x: Data): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def VegaLite(props: VegaLiteProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("VegaLite")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def createClassFromSpec(hasModeSpec: Mode): Constructor[PureComponent[FixedVegaChartProps, js.Object, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClassFromSpec")(hasModeSpec.asInstanceOf[js.Any]).asInstanceOf[Constructor[PureComponent[FixedVegaChartProps, js.Object, Any]]]
}
