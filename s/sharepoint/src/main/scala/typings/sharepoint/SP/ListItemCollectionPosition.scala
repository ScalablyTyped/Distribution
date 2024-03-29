package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItemCollectionPosition
  extends StObject
     with ClientValueObject {
  
  def get_pagingInfo(): String
  
  def set_pagingInfo(value: String): Unit
}
object ListItemCollectionPosition {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Unit,
    get_pagingInfo: () => String,
    get_typeId: () => String,
    set_pagingInfo: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ListItemCollectionPosition = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_pagingInfo = js.Any.fromFunction0(get_pagingInfo), get_typeId = js.Any.fromFunction0(get_typeId), set_pagingInfo = js.Any.fromFunction1(set_pagingInfo), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ListItemCollectionPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListItemCollectionPosition] (val x: Self) extends AnyVal {
    
    inline def setGet_pagingInfo(value: () => String): Self = StObject.set(x, "get_pagingInfo", js.Any.fromFunction0(value))
    
    inline def setSet_pagingInfo(value: String => Unit): Self = StObject.set(x, "set_pagingInfo", js.Any.fromFunction1(value))
  }
}
