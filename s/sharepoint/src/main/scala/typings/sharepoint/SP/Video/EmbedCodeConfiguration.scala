package typings.sharepoint.SP.Video

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbedCodeConfiguration extends ClientValueObject {
  def get_autoPlay(): Boolean
  def get_displayTitle(): Boolean
  def get_linkToOwnerProfilePage(): Boolean
  def get_linkToVideoHomePage(): Boolean
  def get_loop(): Boolean
  def get_pixelHeight(): Double
  def get_pixelWidth(): Double
  def get_previewImagePath(): String
  def get_startTime(): Double
  def set_autoPlay(value: Boolean): Boolean
  def set_displayTitle(value: Boolean): Boolean
  def set_linkToOwnerProfilePage(value: Boolean): Boolean
  def set_linkToVideoHomePage(value: Boolean): Boolean
  def set_loop(value: Boolean): Boolean
  def set_pixelHeight(value: Double): Double
  def set_pixelWidth(value: Double): Double
  def set_previewImagePath(value: String): String
  def set_startTime(value: Double): Double
}

object EmbedCodeConfiguration {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_autoPlay: () => Boolean,
    get_displayTitle: () => Boolean,
    get_linkToOwnerProfilePage: () => Boolean,
    get_linkToVideoHomePage: () => Boolean,
    get_loop: () => Boolean,
    get_pixelHeight: () => Double,
    get_pixelWidth: () => Double,
    get_previewImagePath: () => String,
    get_startTime: () => Double,
    get_typeId: () => String,
    set_autoPlay: Boolean => Boolean,
    set_displayTitle: Boolean => Boolean,
    set_linkToOwnerProfilePage: Boolean => Boolean,
    set_linkToVideoHomePage: Boolean => Boolean,
    set_loop: Boolean => Boolean,
    set_pixelHeight: Double => Double,
    set_pixelWidth: Double => Double,
    set_previewImagePath: String => String,
    set_startTime: Double => Double,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): EmbedCodeConfiguration = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_autoPlay = js.Any.fromFunction0(get_autoPlay), get_displayTitle = js.Any.fromFunction0(get_displayTitle), get_linkToOwnerProfilePage = js.Any.fromFunction0(get_linkToOwnerProfilePage), get_linkToVideoHomePage = js.Any.fromFunction0(get_linkToVideoHomePage), get_loop = js.Any.fromFunction0(get_loop), get_pixelHeight = js.Any.fromFunction0(get_pixelHeight), get_pixelWidth = js.Any.fromFunction0(get_pixelWidth), get_previewImagePath = js.Any.fromFunction0(get_previewImagePath), get_startTime = js.Any.fromFunction0(get_startTime), get_typeId = js.Any.fromFunction0(get_typeId), set_autoPlay = js.Any.fromFunction1(set_autoPlay), set_displayTitle = js.Any.fromFunction1(set_displayTitle), set_linkToOwnerProfilePage = js.Any.fromFunction1(set_linkToOwnerProfilePage), set_linkToVideoHomePage = js.Any.fromFunction1(set_linkToVideoHomePage), set_loop = js.Any.fromFunction1(set_loop), set_pixelHeight = js.Any.fromFunction1(set_pixelHeight), set_pixelWidth = js.Any.fromFunction1(set_pixelWidth), set_previewImagePath = js.Any.fromFunction1(set_previewImagePath), set_startTime = js.Any.fromFunction1(set_startTime), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[EmbedCodeConfiguration]
  }
}

