package typings
package reactDashImageDashGalleryLib.reactDashImageDashGalleryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactImageGallery
  extends reactLib.reactMod.Component[ReactImageGalleryProps, js.Object, js.Any] {
  def exitFullScreen(): scala.Unit = js.native
  def fullScreen(): scala.Unit = js.native
  def getCurrentIndex(): scala.Double = js.native
  def pause(): scala.Unit = js.native
  def pause(callback: scala.Boolean): scala.Unit = js.native
  def play(): scala.Unit = js.native
  def play(callback: scala.Boolean): scala.Unit = js.native
  def slideToIndex(index: scala.Double): scala.Unit = js.native
}

