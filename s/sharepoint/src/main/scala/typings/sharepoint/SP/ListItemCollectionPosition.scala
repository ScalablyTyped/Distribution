package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
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
  implicit class ListItemCollectionPositionMutableBuilder[Self <: ListItemCollectionPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_pagingInfo(value: () => String): Self = StObject.set(x, "get_pagingInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_pagingInfo(value: String => Unit): Self = StObject.set(x, "set_pagingInfo", js.Any.fromFunction1(value))
  }
}
