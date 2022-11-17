package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardStatic
  extends StObject
     with NativeEventEmitter {
  
  /**
    * Dismisses the active keyboard and removes focus.
    */
  def dismiss(): Unit = js.native
  
  /**
    * Useful for syncing TextInput (or other keyboard accessory view) size of
    * position changes with keyboard movements.
    */
  def scheduleLayoutAnimation(event: KeyboardEvent): Unit = js.native
}
