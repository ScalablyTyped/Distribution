package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target extends js.Object {
  
  /** Get the browser the target belongs to. */
  def browser(): Browser = js.native
  
  /** The browser context the target belongs to. */
  def browserContext(): BrowserContext = js.native
  
  /** Creates a Chrome Devtools Protocol session attached to the target. */
  def createCDPSession(): js.Promise[CDPSession] = js.native
  
  /** Get the target that opened this target. Top-level targets return `null`. */
  def opener(): Target | Null = js.native
  
  /** Returns the target `Page` or a `null` if the type of the page is not "page". */
  def page(): js.Promise[Page] = js.native
  
  /** Identifies what kind of target this is.  */
  def `type`(): TargetType = js.native
  
  /** Returns the target URL. */
  def url(): String = js.native
  
  /** If the target is not of type `service_worker` or `shared_worker`, resolves `null`. */
  def worker(): js.Promise[Worker | Null] = js.native
}
object Target {
  
  @scala.inline
  def apply(
    browser: () => Browser,
    browserContext: () => BrowserContext,
    createCDPSession: () => js.Promise[CDPSession],
    opener: () => Target | Null,
    page: () => js.Promise[Page],
    `type`: () => TargetType,
    url: () => String,
    worker: () => js.Promise[Worker | Null]
  ): Target = {
    val __obj = js.Dynamic.literal(browser = js.Any.fromFunction0(browser), browserContext = js.Any.fromFunction0(browserContext), createCDPSession = js.Any.fromFunction0(createCDPSession), opener = js.Any.fromFunction0(opener), page = js.Any.fromFunction0(page), url = js.Any.fromFunction0(url), worker = js.Any.fromFunction0(worker))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
    
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
    def setBrowser(value: () => Browser): Self = this.set("browser", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBrowserContext(value: () => BrowserContext): Self = this.set("browserContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateCDPSession(value: () => js.Promise[CDPSession]): Self = this.set("createCDPSession", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpener(value: () => Target | Null): Self = this.set("opener", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPage(value: () => js.Promise[Page]): Self = this.set("page", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: () => TargetType): Self = this.set("type", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUrl(value: () => String): Self = this.set("url", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWorker(value: () => js.Promise[Worker | Null]): Self = this.set("worker", js.Any.fromFunction0(value))
  }
}
