package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFromJson extends StObject {
  
  def customFromJson(initValue: Any): Boolean
  
  def fromJson(initValue: Any): Unit
}
object IFromJson {
  
  inline def apply(customFromJson: Any => Boolean, fromJson: Any => Unit): IFromJson = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), fromJson = js.Any.fromFunction1(fromJson))
    __obj.asInstanceOf[IFromJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFromJson] (val x: Self) extends AnyVal {
    
    inline def setCustomFromJson(value: Any => Boolean): Self = StObject.set(x, "customFromJson", js.Any.fromFunction1(value))
    
    inline def setFromJson(value: Any => Unit): Self = StObject.set(x, "fromJson", js.Any.fromFunction1(value))
  }
}
