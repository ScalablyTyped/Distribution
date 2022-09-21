package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingsStatic extends StObject {
  
  def clearWatch(watchId: Double): Unit = js.native
  
  def get(key: String): Any = js.native
  
  def set(settings: js.Object): Unit = js.native
  
  def watchKeys(keys: String, callback: js.Function0[Unit]): Double = js.native
  def watchKeys(keys: js.Array[String], callback: js.Function0[Unit]): Double = js.native
}
