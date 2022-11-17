package typings.rcSlider

import typings.rcSlider.anon.Value
import typings.rcSlider.libMarksMod.InternalMarkObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseOffsetMod {
  
  @JSImport("rc-slider/lib/hooks/useOffset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.annotation.targetName("default_false")
  inline def default(
    min: Double,
    max: Double,
    step: Double,
    markList: js.Array[InternalMarkObj],
    allowCross: Boolean,
    pushable: false
  ): js.Tuple2[FormatValue, OffsetValues] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], step.asInstanceOf[js.Any], markList.asInstanceOf[js.Any], allowCross.asInstanceOf[js.Any], pushable.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[FormatValue, OffsetValues]]
  inline def default(
    min: Double,
    max: Double,
    step: Double,
    markList: js.Array[InternalMarkObj],
    allowCross: Boolean,
    pushable: Double
  ): js.Tuple2[FormatValue, OffsetValues] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], step.asInstanceOf[js.Any], markList.asInstanceOf[js.Any], allowCross.asInstanceOf[js.Any], pushable.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[FormatValue, OffsetValues]]
  
  /** Format value align with step & marks */
  type FormatValue = js.Function1[/* value */ Double, Double]
  
  object OffsetMode {
    
    inline def dist: "dist" = "dist".asInstanceOf["dist"]
    
    inline def unit: "unit" = "unit".asInstanceOf["unit"]
  }
  type OffsetMode = "unit" | "dist"
  
  type OffsetValues = js.Function4[
    /* values */ js.Array[Double], 
    /* offset */ Double | "min" | "max", 
    /* valueIndex */ Double, 
    /* mode */ js.UndefOr[OffsetMode], 
    Value
  ]
}
