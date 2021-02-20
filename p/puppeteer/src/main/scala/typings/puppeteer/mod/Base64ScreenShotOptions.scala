package typings.puppeteer.mod

import typings.puppeteer.puppeteerStrings.base64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base64ScreenShotOptions extends ScreenshotOptions {
  
  @JSName("encoding")
  var encoding_Base64ScreenShotOptions: base64 = js.native
}
object Base64ScreenShotOptions {
  
  @scala.inline
  def apply(encoding: base64): Base64ScreenShotOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base64ScreenShotOptions]
  }
  
  @scala.inline
  implicit class Base64ScreenShotOptionsMutableBuilder[Self <: Base64ScreenShotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: base64): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
