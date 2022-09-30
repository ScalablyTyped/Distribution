package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VibrationStatic extends StObject {
  
  /**
    * Stop vibration
    */
  def cancel(): Unit = js.native
  
  def vibrate(): Unit = js.native
  def vibrate(pattern: js.Array[Double]): Unit = js.native
  def vibrate(pattern: js.Array[Double], repeat: Boolean): Unit = js.native
  def vibrate(pattern: Double): Unit = js.native
  def vibrate(pattern: Double, repeat: Boolean): Unit = js.native
  def vibrate(pattern: Null, repeat: Boolean): Unit = js.native
  def vibrate(pattern: Unit, repeat: Boolean): Unit = js.native
}
