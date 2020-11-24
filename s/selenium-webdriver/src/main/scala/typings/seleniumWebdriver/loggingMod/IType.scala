package typings.seleniumWebdriver.loggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IType extends js.Object {
  
  /** Logs originating from the browser. */
  var BROWSER: String = js.native
  
  /** Logs from a WebDriver client. */
  var CLIENT: String = js.native
  
  /** Logs from a WebDriver implementation. */
  var DRIVER: String = js.native
  
  /** Logs related to performance. */
  var PERFORMANCE: String = js.native
  
  /** Logs from the remote server. */
  var SERVER: String = js.native
}
object IType {
  
  @scala.inline
  def apply(BROWSER: String, CLIENT: String, DRIVER: String, PERFORMANCE: String, SERVER: String): IType = {
    val __obj = js.Dynamic.literal(BROWSER = BROWSER.asInstanceOf[js.Any], CLIENT = CLIENT.asInstanceOf[js.Any], DRIVER = DRIVER.asInstanceOf[js.Any], PERFORMANCE = PERFORMANCE.asInstanceOf[js.Any], SERVER = SERVER.asInstanceOf[js.Any])
    __obj.asInstanceOf[IType]
  }
  
  @scala.inline
  implicit class ITypeOps[Self <: IType] (val x: Self) extends AnyVal {
    
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
    def setBROWSER(value: String): Self = this.set("BROWSER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLIENT(value: String): Self = this.set("CLIENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDRIVER(value: String): Self = this.set("DRIVER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPERFORMANCE(value: String): Self = this.set("PERFORMANCE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSERVER(value: String): Self = this.set("SERVER", value.asInstanceOf[js.Any])
  }
}
