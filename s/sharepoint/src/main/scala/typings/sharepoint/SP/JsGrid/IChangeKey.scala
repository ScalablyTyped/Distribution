package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChangeKey extends StObject {
  
  def CompareTo(changeKey: IChangeKey): Double
  
  def GetVersionNumber(): Double
  
  def Release(): Unit
  
  def Reserve(): Unit
}
object IChangeKey {
  
  @scala.inline
  def apply(
    CompareTo: IChangeKey => Double,
    GetVersionNumber: () => Double,
    Release: () => Unit,
    Reserve: () => Unit
  ): IChangeKey = {
    val __obj = js.Dynamic.literal(CompareTo = js.Any.fromFunction1(CompareTo), GetVersionNumber = js.Any.fromFunction0(GetVersionNumber), Release = js.Any.fromFunction0(Release), Reserve = js.Any.fromFunction0(Reserve))
    __obj.asInstanceOf[IChangeKey]
  }
  
  @scala.inline
  implicit class IChangeKeyMutableBuilder[Self <: IChangeKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompareTo(value: IChangeKey => Double): Self = StObject.set(x, "CompareTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVersionNumber(value: () => Double): Self = StObject.set(x, "GetVersionNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRelease(value: () => Unit): Self = StObject.set(x, "Release", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReserve(value: () => Unit): Self = StObject.set(x, "Reserve", js.Any.fromFunction0(value))
  }
}
