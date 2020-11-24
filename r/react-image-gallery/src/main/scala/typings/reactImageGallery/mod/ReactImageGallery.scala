package typings.reactImageGallery.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactImageGallery
  extends Component[ReactImageGalleryProps, js.Object, js.Any] {
  
  def exitFullScreen(): Unit = js.native
  
  def fullScreen(): Unit = js.native
  
  def getCurrentIndex(): Double = js.native
  
  def pause(): Unit = js.native
  def pause(callback: Boolean): Unit = js.native
  
  def play(): Unit = js.native
  def play(callback: Boolean): Unit = js.native
  
  def slideToIndex(index: Double): Unit = js.native
}
