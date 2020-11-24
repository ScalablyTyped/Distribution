package typings.sharepoint.SP.Publishing

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DesignPackageInfo extends ClientValueObject {
  
  def get_majorVersion(): Double = js.native
  
  def get_minorVersion(): Double = js.native
  
  def get_packageGuid(): Guid = js.native
  
  def get_packageName(): String = js.native
  
  def set_majorVersion(value: Double): Double = js.native
  
  def set_minorVersion(value: Double): Double = js.native
  
  def set_packageGuid(value: Guid): Guid = js.native
  
  def set_packageName(value: String): String = js.native
}
object DesignPackageInfo {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_majorVersion: () => Double,
    get_minorVersion: () => Double,
    get_packageGuid: () => Guid,
    get_packageName: () => String,
    get_typeId: () => String,
    set_majorVersion: Double => Double,
    set_minorVersion: Double => Double,
    set_packageGuid: Guid => Guid,
    set_packageName: String => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): DesignPackageInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_majorVersion = js.Any.fromFunction0(get_majorVersion), get_minorVersion = js.Any.fromFunction0(get_minorVersion), get_packageGuid = js.Any.fromFunction0(get_packageGuid), get_packageName = js.Any.fromFunction0(get_packageName), get_typeId = js.Any.fromFunction0(get_typeId), set_majorVersion = js.Any.fromFunction1(set_majorVersion), set_minorVersion = js.Any.fromFunction1(set_minorVersion), set_packageGuid = js.Any.fromFunction1(set_packageGuid), set_packageName = js.Any.fromFunction1(set_packageName), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[DesignPackageInfo]
  }
  
  @scala.inline
  implicit class DesignPackageInfoOps[Self <: DesignPackageInfo] (val x: Self) extends AnyVal {
    
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
    def setGet_majorVersion(value: () => Double): Self = this.set("get_majorVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_minorVersion(value: () => Double): Self = this.set("get_minorVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_packageGuid(value: () => Guid): Self = this.set("get_packageGuid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_packageName(value: () => String): Self = this.set("get_packageName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_majorVersion(value: Double => Double): Self = this.set("set_majorVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_minorVersion(value: Double => Double): Self = this.set("set_minorVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_packageGuid(value: Guid => Guid): Self = this.set("set_packageGuid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_packageName(value: String => String): Self = this.set("set_packageName", js.Any.fromFunction1(value))
  }
}
