package typings.rcSlider.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<rc-slider.rc-slider/lib/createSliderWithTooltip.ComponentWrapperState> */
trait ReadonlyComponentWrapperS extends StObject {
  
  val visibles: Record[Double, Boolean]
}
object ReadonlyComponentWrapperS {
  
  inline def apply(visibles: Record[Double, Boolean]): ReadonlyComponentWrapperS = {
    val __obj = js.Dynamic.literal(visibles = visibles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyComponentWrapperS]
  }
  
  extension [Self <: ReadonlyComponentWrapperS](x: Self) {
    
    inline def setVisibles(value: Record[Double, Boolean]): Self = StObject.set(x, "visibles", value.asInstanceOf[js.Any])
  }
}
