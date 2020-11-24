package typings.protractorHelpers.mod.global.protractor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementArrayFinder extends js.Object {
  
  @JSName("$$data")
  def DollarDollardata(hook: String): ElementArrayFinder = js.native
  
  def getByText(text: String): ElementFinder = js.native
}
object ElementArrayFinder {
  
  @scala.inline
  def apply(DollarDollardata: String => ElementArrayFinder, getByText: String => ElementFinder): ElementArrayFinder = {
    val __obj = js.Dynamic.literal(getByText = js.Any.fromFunction1(getByText))
    __obj.updateDynamic("$$data")(js.Any.fromFunction1(DollarDollardata))
    __obj.asInstanceOf[ElementArrayFinder]
  }
  
  @scala.inline
  implicit class ElementArrayFinderOps[Self <: ElementArrayFinder] (val x: Self) extends AnyVal {
    
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
    def setDollarDollardata(value: String => ElementArrayFinder): Self = this.set("$$data", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetByText(value: String => ElementFinder): Self = this.set("getByText", js.Any.fromFunction1(value))
  }
}
