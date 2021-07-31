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
  @scala.inline
  def DIRECTION_=(x: HORIZONTAL_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION")(x.asInstanceOf[js.Any])
  
  @JSImport("react-vis", "AxisUtils.ORIENTATION")
  @js.native
  def ORIENTATION: BOTTOM_ = js.native
  @scala.inline
  def ORIENTATION_=(x: BOTTOM_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORIENTATION")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def getTickValues(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTickValues")().asInstanceOf[js.Any]
  @scala.inline
  def getTickValues(scale: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTickValues")(scale.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def getTickValues(scale: js.Any, tickTotal: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickValues")(scale.asInstanceOf[js.Any], tickTotal.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getTickValues(scale: js.Any, tickTotal: js.Any, tickValues: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickValues")(scale.asInstanceOf[js.Any], tickTotal.asInstanceOf[js.Any], tickValues.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getTickValues(scale: js.Any, tickTotal: Unit, tickValues: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickValues")(scale.asInstanceOf[js.Any], tickTotal.asInstanceOf[js.Any], tickValues.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getTickValues(scale: Unit, tickTotal: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickValues")(scale.asInstanceOf[js.Any], tickTotal.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getTickValues(scale: Unit, tickTotal: js.Any, tickValues: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickValues")(scale.asInstanceOf[js.Any], tickTotal.asInstanceOf[js.Any], tickValues.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getTickValues(scale: Unit, tickTotal: Unit, tickValues: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickValues")(scale.asInstanceOf[js.Any], tickTotal.asInstanceOf[js.Any], tickValues.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getTicksTotalFromSize(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTicksTotalFromSize")().asInstanceOf[js.Any]
  @scala.inline
  def getTicksTotalFromSize(size: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTicksTotalFromSize")(size.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
