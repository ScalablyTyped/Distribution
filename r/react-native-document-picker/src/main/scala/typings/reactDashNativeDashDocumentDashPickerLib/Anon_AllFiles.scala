package typings
package reactDashNativeDashDocumentDashPickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllFiles extends js.Object {
  def allFiles(): java.lang.String
  def audio(): java.lang.String
  def images(): java.lang.String
  def pdf(): java.lang.String
  def plainText(): java.lang.String
  def video(): java.lang.String
}

object Anon_AllFiles {
  @scala.inline
  def apply(
    allFiles: () => java.lang.String,
    audio: () => java.lang.String,
    images: () => java.lang.String,
    pdf: () => java.lang.String,
    plainText: () => java.lang.String,
    video: () => java.lang.String
  ): Anon_AllFiles = {
    val __obj = js.Dynamic.literal(allFiles = js.Any.fromFunction0(allFiles), audio = js.Any.fromFunction0(audio), images = js.Any.fromFunction0(images), pdf = js.Any.fromFunction0(pdf), plainText = js.Any.fromFunction0(plainText), video = js.Any.fromFunction0(video))
  
    __obj.asInstanceOf[Anon_AllFiles]
  }
}

