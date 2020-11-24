package typings.seleniumWebdriver.capabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPageLoadStrategy extends js.Object {
  
  /**
    * Indicates WebDriver should wait for the document readiness state to
    * become "interactive" after navigation.
    */
  var EAGER: String = js.native
  
  /**
    * Indicates WebDriver should not wait on the document readiness state after a
    * navigation event.
    */
  var NONE: String = js.native
  
  /**
    * Indicates WebDriver should wait for the document readiness state to
    * be "complete" after navigation. This is the default page loading strategy.
    */
  var NORMAL: String = js.native
}
object IPageLoadStrategy {
  
  @scala.inline
  def apply(EAGER: String, NONE: String, NORMAL: String): IPageLoadStrategy = {
    val __obj = js.Dynamic.literal(EAGER = EAGER.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPageLoadStrategy]
  }
  
  @scala.inline
  implicit class IPageLoadStrategyOps[Self <: IPageLoadStrategy] (val x: Self) extends AnyVal {
    
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
    def setEAGER(value: String): Self = this.set("EAGER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNONE(value: String): Self = this.set("NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNORMAL(value: String): Self = this.set("NORMAL", value.asInstanceOf[js.Any])
  }
}
