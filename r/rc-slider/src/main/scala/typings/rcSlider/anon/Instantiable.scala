package typings.rcSlider.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.rcSlider.createSliderWithTooltipMod.ComponentWrapperProps
import typings.rcSlider.interfaceMod.GenericSliderProps
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instantiable[Props /* <: GenericSliderProps */]
  extends StObject
     with Instantiable1[/* props */ ComponentWrapperProps & Props, ComponentDidCatch[Props]]
     with Instantiable2[
      /* props */ ComponentWrapperProps & Props, 
      /* context */ js.Any, 
      ComponentDidCatch[Props]
    ] {
  
  var contextType: js.UndefOr[Context[js.Any]] = js.native
  
  var defaultProps: GetTooltipContainer = js.native
}
