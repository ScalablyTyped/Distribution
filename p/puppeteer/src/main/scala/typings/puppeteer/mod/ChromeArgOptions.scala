package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChromeArgOptions extends js.Object {
  
  /**
    * Additional arguments to pass to the browser instance.
    * The list of Chromium flags can be found here.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether to auto-open a DevTools panel for each tab.
    * If this option is true, the headless option will be set false.
    */
  var devtools: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to run browser in headless mode.
    * @default true unless the devtools option is true.
    */
  var headless: js.UndefOr[Boolean] = js.native
  
  /**
    * Path to a User Data Directory.
    */
  var userDataDir: js.UndefOr[String] = js.native
}
object ChromeArgOptions {
  
  @scala.inline
  def apply(): ChromeArgOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeArgOptions]
  }
  
  @scala.inline
  implicit class ChromeArgOptionsOps[Self <: ChromeArgOptions] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setDevtools(value: Boolean): Self = this.set("devtools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevtools: Self = this.set("devtools", js.undefined)
    
    @scala.inline
    def setHeadless(value: Boolean): Self = this.set("headless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadless: Self = this.set("headless", js.undefined)
    
    @scala.inline
    def setUserDataDir(value: String): Self = this.set("userDataDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDataDir: Self = this.set("userDataDir", js.undefined)
  }
}
