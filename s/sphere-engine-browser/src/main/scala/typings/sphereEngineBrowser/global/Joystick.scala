package typings.sphereEngineBrowser.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Joystick")
@js.native
open class Joystick ()
  extends StObject
     with typings.sphereEngineBrowser.Joystick {
  
  /* CompleteClass */
  override def getPosition(axisID: Double): Double = js.native
  
  /* CompleteClass */
  override def isPressed(buttonID: Double): Boolean = js.native
  
  /* CompleteClass */
  override val name: String = js.native
  
  /* CompleteClass */
  override val numAxes: Double = js.native
  
  /* CompleteClass */
  override val numButtons: Double = js.native
}
object Joystick {
  
  @JSGlobal("Joystick")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Joystick.Null")
  @js.native
  val Null: typings.sphereEngineBrowser.Joystick = js.native
  
  /* static member */
  @JSGlobal("Joystick.P1")
  @js.native
  val P1: typings.sphereEngineBrowser.Joystick = js.native
  
  /* static member */
  @JSGlobal("Joystick.P2")
  @js.native
  val P2: typings.sphereEngineBrowser.Joystick = js.native
  
  /* static member */
  @JSGlobal("Joystick.P3")
  @js.native
  val P3: typings.sphereEngineBrowser.Joystick = js.native
  
  /* static member */
  @JSGlobal("Joystick.P4")
  @js.native
  val P4: typings.sphereEngineBrowser.Joystick = js.native
  
  /* static member */
  inline def getDevices(): js.Array[typings.sphereEngineBrowser.Joystick] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")().asInstanceOf[js.Array[typings.sphereEngineBrowser.Joystick]]
}
