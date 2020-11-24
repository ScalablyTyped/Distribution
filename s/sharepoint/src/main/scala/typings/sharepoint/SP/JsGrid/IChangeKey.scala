package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChangeKey extends js.Object {
  
  def CompareTo(changeKey: IChangeKey): Double = js.native
  
  def GetVersionNumber(): Double = js.native
  
  def Release(): Unit = js.native
  
  def Reserve(): Unit = js.native
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
  implicit class IChangeKeyOps[Self <: IChangeKey] (val x: Self) extends AnyVal {
    
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
    def setCompareTo(value: IChangeKey => Double): Self = this.set("CompareTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVersionNumber(value: () => Double): Self = this.set("GetVersionNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRelease(value: () => Unit): Self = this.set("Release", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReserve(value: () => Unit): Self = this.set("Reserve", js.Any.fromFunction0(value))
  }
}
