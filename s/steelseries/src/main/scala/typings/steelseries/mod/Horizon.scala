package typings.steelseries.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steelseries", "Horizon")
@js.native
open class Horizon protected () extends StObject {
  def this(canvas: String) = this()
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: String, parameters: HorizonParams) = this()
  def this(canvas: HTMLCanvasElement, parameters: HorizonParams) = this()
  
  def getPitch(): Double = js.native
  
  def getRoll(): Double = js.native
  
  def repaint(): Unit = js.native
  
  def setForegroundType(newForegroundType: ForegroundType): this.type = js.native
  
  def setFrameDesign(newFrameDesign: FrameDesign): this.type = js.native
  
  def setPitch(newPitch: Double): this.type = js.native
  
  def setPitchAnimated(newPitch: Double): this.type = js.native
  def setPitchAnimated(newPitch: Double, callback: js.Function0[Unit]): this.type = js.native
  
  def setPitchOffset(newPitchOffset: Double): this.type = js.native
  
  def setRoll(newRoll: Double): this.type = js.native
  
  def setRollAnimated(newRoll: Double): this.type = js.native
  def setRollAnimated(newRoll: Double, callback: js.Function0[Unit]): this.type = js.native
}
