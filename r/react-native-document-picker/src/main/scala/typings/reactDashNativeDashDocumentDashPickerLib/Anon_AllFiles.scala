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
    allFiles: js.Function0[java.lang.String],
    audio: js.Function0[java.lang.String],
    images: js.Function0[java.lang.String],
    pdf: js.Function0[java.lang.String],
    plainText: js.Function0[java.lang.String],
    video: js.Function0[java.lang.String]
  ): Anon_AllFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allFiles")(allFiles)
    __obj.updateDynamic("audio")(audio)
    __obj.updateDynamic("images")(images)
    __obj.updateDynamic("pdf")(pdf)
    __obj.updateDynamic("plainText")(plainText)
    __obj.updateDynamic("video")(video)
    __obj.asInstanceOf[Anon_AllFiles]
  }
}

