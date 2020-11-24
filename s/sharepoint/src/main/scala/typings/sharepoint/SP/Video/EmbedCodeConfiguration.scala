package typings.sharepoint.SP.Video

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbedCodeConfiguration extends ClientValueObject {
  
  def get_autoPlay(): Boolean = js.native
  
  def get_displayTitle(): Boolean = js.native
  
  def get_linkToOwnerProfilePage(): Boolean = js.native
  
  def get_linkToVideoHomePage(): Boolean = js.native
  
  def get_loop(): Boolean = js.native
  
  def get_pixelHeight(): Double = js.native
  
  def get_pixelWidth(): Double = js.native
  
  def get_previewImagePath(): String = js.native
  
  def get_startTime(): Double = js.native
  
  def set_autoPlay(value: Boolean): Boolean = js.native
  
  def set_displayTitle(value: Boolean): Boolean = js.native
  
  def set_linkToOwnerProfilePage(value: Boolean): Boolean = js.native
  
  def set_linkToVideoHomePage(value: Boolean): Boolean = js.native
  
  def set_loop(value: Boolean): Boolean = js.native
  
  def set_pixelHeight(value: Double): Double = js.native
  
  def set_pixelWidth(value: Double): Double = js.native
  
  def set_previewImagePath(value: String): String = js.native
  
  def set_startTime(value: Double): Double = js.native
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
  
  @scala.inline
  implicit class EmbedCodeConfigurationOps[Self <: EmbedCodeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet_autoPlay(value: () => Boolean): Self = this.set("get_autoPlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_displayTitle(value: () => Boolean): Self = this.set("get_displayTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_linkToOwnerProfilePage(value: () => Boolean): Self = this.set("get_linkToOwnerProfilePage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_linkToVideoHomePage(value: () => Boolean): Self = this.set("get_linkToVideoHomePage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_loop(value: () => Boolean): Self = this.set("get_loop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_pixelHeight(value: () => Double): Self = this.set("get_pixelHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_pixelWidth(value: () => Double): Self = this.set("get_pixelWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_previewImagePath(value: () => String): Self = this.set("get_previewImagePath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_startTime(value: () => Double): Self = this.set("get_startTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_autoPlay(value: Boolean => Boolean): Self = this.set("set_autoPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_displayTitle(value: Boolean => Boolean): Self = this.set("set_displayTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_linkToOwnerProfilePage(value: Boolean => Boolean): Self = this.set("set_linkToOwnerProfilePage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_linkToVideoHomePage(value: Boolean => Boolean): Self = this.set("set_linkToVideoHomePage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_loop(value: Boolean => Boolean): Self = this.set("set_loop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_pixelHeight(value: Double => Double): Self = this.set("set_pixelHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_pixelWidth(value: Double => Double): Self = this.set("set_pixelWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_previewImagePath(value: String => String): Self = this.set("set_previewImagePath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_startTime(value: Double => Double): Self = this.set("set_startTime", js.Any.fromFunction1(value))
  }
}
