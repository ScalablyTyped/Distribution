package typings.rcSlider.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.rcSlider.createSliderWithTooltipMod.ComponentWrapperProps
import typings.rcSlider.interfaceMod.GenericSliderProps
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextType[Props /* <: GenericSliderProps */]
  extends Instantiable1[/* props */ ComponentWrapperProps with Props, ComponentDidMount[Props]]
     with Instantiable2[
      /* props */ ComponentWrapperProps with Props, 
      /* context */ js.Any, 
      ComponentDidMount[Props]
    ] {
  
  var contextType: js.UndefOr[Context[_]] = js.native
  
  var defaultProps: GetTooltipContainer = js.native
}
