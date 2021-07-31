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
  
  @scala.inline
  def apply(visibles: Record[Double, Boolean]): ReadonlyComponentWrapperS = {
    val __obj = js.Dynamic.literal(visibles = visibles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyComponentWrapperS]
  }
  
  @scala.inline
  implicit class ReadonlyComponentWrapperSMutableBuilder[Self <: ReadonlyComponentWrapperS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisibles(value: Record[Double, Boolean]): Self = StObject.set(x, "visibles", value.asInstanceOf[js.Any])
  }
}
