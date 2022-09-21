package typings.reactVis.mod

import typings.reactVis.anon.BOTTOM_
import typings.reactVis.anon.HORIZONTAL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AxisUtils {
  
  @JSImport("react-vis", "AxisUtils")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-vis", "AxisUtils.DIRECTION")
  @js.native
  def DIRECTION: HORIZONTAL_ = js.native
  inline def DIRECTION_=(x: HORIZONTAL_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION")(x.asInstanceOf[js.Any])
  
  @JSImport("react-vis", "AxisUtils.ORIENTATION")
  @js.native
  def ORIENTATION: BOTTOM_ = js.native
  inline def ORIENTATION_=(x: BOTTOM_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORIENTATION")(x.asInstanceOf[js.Any])
  
  inline def getTickValues(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTickValues")().asInstanceOf[Any]
  inline def getTickValues(scale: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTickValues")(scale.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getTickValues(scale: Any, tickTotal: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickValues")(scale.asInstanceOf[js.Any], tickTotal.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getTickValues(scale: Any, tickTotal: Any, tickValues: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickValues")(scale.asInstanceOf[js.Any], tickTotal.asInstanceOf[js.Any], tickValues.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getTickValues(scale: Any, tickTotal: Unit, tickValues: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickValues")(scale.asInstanceOf[js.Any], tickTotal.asInstanceOf[js.Any], tickValues.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getTickValues(scale: Unit, tickTotal: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickValues")(scale.asInstanceOf[js.Any], tickTotal.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getTickValues(scale: Unit, tickTotal: Any, tickValues: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickValues")(scale.asInstanceOf[js.Any], tickTotal.asInstanceOf[js.Any], tickValues.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getTickValues(scale: Unit, tickTotal: Unit, tickValues: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickValues")(scale.asInstanceOf[js.Any], tickTotal.asInstanceOf[js.Any], tickValues.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getTicksTotalFromSize(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTicksTotalFromSize")().asInstanceOf[Any]
  inline def getTicksTotalFromSize(size: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTicksTotalFromSize")(size.asInstanceOf[js.Any]).asInstanceOf[Any]
}
