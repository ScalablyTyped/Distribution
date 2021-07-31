package typings.puppeteer.mod

import typings.puppeteer.puppeteerStrings.mutation
import typings.puppeteer.puppeteerStrings.raf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageFnOptions
  extends StObject
     with Timeoutable {
  
  var polling: js.UndefOr[raf | mutation | Double] = js.undefined
}
object PageFnOptions {
  
  @scala.inline
  def apply(): PageFnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageFnOptions]
  }
  
  @scala.inline
  implicit class PageFnOptionsMutableBuilder[Self <: PageFnOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolling(value: raf | mutation | Double): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
  }
}
