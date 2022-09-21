package typings.reactNativeVideo.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Video
  extends Component[VideoProperties, js.Object, Any] {
  
  def dismissFullscreenPlayer(): Unit = js.native
  
  def presentFullscreenPlayer(): Unit = js.native
  
  def restoreUserInterfaceForPictureInPictureStopCompleted(restored: Boolean): Unit = js.native
  
  def save(): js.Promise[Unit] = js.native
  
  def seek(time: Double): Unit = js.native
  def seek(time: Double, tolerance: Double): Unit = js.native
}
