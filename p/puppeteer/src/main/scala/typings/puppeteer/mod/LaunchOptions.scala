package typings.puppeteer.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchOptions
  extends ChromeArgOptions
     with BrowserOptions
     with Timeoutable {
  
  /**
    * Whether to pipe browser process stdout and stderr into process.stdout and
    * process.stderr.
    * @default false
    */
  var dumpio: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify environment variables that will be visible to Chromium.
    * @default `process.env`.
    */
  var env: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.native
  
  /**
    * Path to a Chromium executable to run instead of bundled Chromium. If
    * executablePath is a relative path, then it is resolved relative to current
    * working directory.
    */
  var executablePath: js.UndefOr[String] = js.native
  
  /**
    * Close chrome process on SIGHUP.
    * @default true
    */
  var handleSIGHUP: js.UndefOr[Boolean] = js.native
  
  /**
    * Close chrome process on Ctrl-C.
    * @default true
    */
  var handleSIGINT: js.UndefOr[Boolean] = js.native
  
  /**
    * Close chrome process on SIGTERM.
    * @default true
    */
  var handleSIGTERM: js.UndefOr[Boolean] = js.native
  
  /**
    * Do not use `puppeteer.defaultArgs()` for launching Chromium.
    * @default false
    */
  var ignoreDefaultArgs: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  /**
    * Connects to the browser over a pipe instead of a WebSocket.
    * @default false
    */
  var pipe: js.UndefOr[Boolean] = js.native
  
  /**
    * Which browser to launch.
    * At this time, this is either `chrome` or `firefox`. See also `PUPPETEER_PRODUCT`.
    * @default 'chrome'
    */
  var product: js.UndefOr[Product_] = js.native
}
object LaunchOptions {
  
  @scala.inline
  def apply(): LaunchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchOptions]
  }
  
  @scala.inline
  implicit class LaunchOptionsOps[Self <: LaunchOptions] (val x: Self) extends AnyVal {
    
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
    def setDumpio(value: Boolean): Self = this.set("dumpio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDumpio: Self = this.set("dumpio", js.undefined)
    
    @scala.inline
    def setEnv(value: StringDictionary[String | Boolean | Double]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setExecutablePath(value: String): Self = this.set("executablePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutablePath: Self = this.set("executablePath", js.undefined)
    
    @scala.inline
    def setHandleSIGHUP(value: Boolean): Self = this.set("handleSIGHUP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleSIGHUP: Self = this.set("handleSIGHUP", js.undefined)
    
    @scala.inline
    def setHandleSIGINT(value: Boolean): Self = this.set("handleSIGINT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleSIGINT: Self = this.set("handleSIGINT", js.undefined)
    
    @scala.inline
    def setHandleSIGTERM(value: Boolean): Self = this.set("handleSIGTERM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleSIGTERM: Self = this.set("handleSIGTERM", js.undefined)
    
    @scala.inline
    def setIgnoreDefaultArgsVarargs(value: String*): Self = this.set("ignoreDefaultArgs", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreDefaultArgs(value: Boolean | js.Array[String]): Self = this.set("ignoreDefaultArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreDefaultArgs: Self = this.set("ignoreDefaultArgs", js.undefined)
    
    @scala.inline
    def setPipe(value: Boolean): Self = this.set("pipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipe: Self = this.set("pipe", js.undefined)
    
    @scala.inline
    def setProduct(value: Product_): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
  }
}
