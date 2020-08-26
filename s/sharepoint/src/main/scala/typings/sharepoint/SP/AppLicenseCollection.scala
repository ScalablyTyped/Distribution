package typings.sharepoint.SP

import typings.sharepoint.IEnumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppLicenseCollection extends ClientValueObjectCollection[AppLicense] {
  def add(item: AppLicense): Unit = js.native
  def get_item(index: Double): AppLicense = js.native
}

object AppLicenseCollection {
  @scala.inline
  def apply(
    add: AppLicense => Unit,
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    getEnumerator: () => IEnumerator[AppLicense],
    get_count: () => Double,
    get_item: Double => AppLicense,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): AppLicenseCollection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), getEnumerator = js.Any.fromFunction0(getEnumerator), get_count = js.Any.fromFunction0(get_count), get_item = js.Any.fromFunction1(get_item), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[AppLicenseCollection]
  }
  @scala.inline
  implicit class AppLicenseCollectionOps[Self <: AppLicenseCollection] (val x: Self) extends AnyVal {
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
    def setAdd(value: AppLicense => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setGet_item(value: Double => AppLicense): Self = this.set("get_item", js.Any.fromFunction1(value))
  }
  
}

