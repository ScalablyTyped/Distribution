package typings.rpiGpio

import typings.rpiGpio.mod.EDGE
import typings.rpiGpio.mod.MODE
import typings.rpiGpio.mod.PinDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpiGpioStrings {
  
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  
  @scala.inline
  def falling: falling = "falling".asInstanceOf[falling]
  
  @scala.inline
  def high: high = "high".asInstanceOf[high]
  
  @scala.inline
  def in: in = "in".asInstanceOf[in]
  
  @scala.inline
  def low: low = "low".asInstanceOf[low]
  
  @scala.inline
  def mode_bcm: mode_bcm = "mode_bcm".asInstanceOf[mode_bcm]
  
  @scala.inline
  def mode_rpi: mode_rpi = "mode_rpi".asInstanceOf[mode_rpi]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def out: out = "out".asInstanceOf[out]
  
  @scala.inline
  def rising: rising = "rising".asInstanceOf[rising]
  
  @js.native
  sealed trait both extends EDGE
  
  @js.native
  sealed trait falling extends EDGE
  
  @js.native
  sealed trait high extends PinDirection
  
  @js.native
  sealed trait in extends PinDirection
  
  @js.native
  sealed trait low extends PinDirection
  
  @js.native
  sealed trait mode_bcm extends MODE
  
  @js.native
  sealed trait mode_rpi extends MODE
  
  @js.native
  sealed trait none extends EDGE
  
  @js.native
  sealed trait out extends PinDirection
  
  @js.native
  sealed trait rising extends EDGE
}
