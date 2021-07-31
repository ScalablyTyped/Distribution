package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFromJson extends StObject {
  
  def customFromJson(initValue: js.Any): Boolean
  
  def fromJson(initValue: js.Any): Unit
}
object IFromJson {
  
  @scala.inline
  def apply(customFromJson: js.Any => Boolean, fromJson: js.Any => Unit): IFromJson = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), fromJson = js.Any.fromFunction1(fromJson))
    __obj.asInstanceOf[IFromJson]
  }
  
  @scala.inline
  implicit class IFromJsonMutableBuilder[Self <: IFromJson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomFromJson(value: js.Any => Boolean): Self = StObject.set(x, "customFromJson", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFromJson(value: js.Any => Unit): Self = StObject.set(x, "fromJson", js.Any.fromFunction1(value))
  }
}
