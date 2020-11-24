package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemCollectionPosition extends ClientValueObject {
  
  def get_pagingInfo(): String = js.native
  
  def set_pagingInfo(value: String): Unit = js.native
}
object ListItemCollectionPosition {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_pagingInfo: () => String,
    get_typeId: () => String,
    set_pagingInfo: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ListItemCollectionPosition = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_pagingInfo = js.Any.fromFunction0(get_pagingInfo), get_typeId = js.Any.fromFunction0(get_typeId), set_pagingInfo = js.Any.fromFunction1(set_pagingInfo), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ListItemCollectionPosition]
  }
  
  @scala.inline
  implicit class ListItemCollectionPositionOps[Self <: ListItemCollectionPosition] (val x: Self) extends AnyVal {
    
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
    def setGet_pagingInfo(value: () => String): Self = this.set("get_pagingInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_pagingInfo(value: String => Unit): Self = this.set("set_pagingInfo", js.Any.fromFunction1(value))
  }
}
