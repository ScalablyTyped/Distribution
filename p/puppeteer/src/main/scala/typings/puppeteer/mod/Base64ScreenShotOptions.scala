package typings.puppeteer.mod

import typings.puppeteer.puppeteerStrings.base64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base64ScreenShotOptions
  extends StObject
     with ScreenshotOptions {
  
  @JSName("encoding")
  var encoding_Base64ScreenShotOptions: base64
}
object Base64ScreenShotOptions {
  
  inline def apply(): Base64ScreenShotOptions = {
    val __obj = js.Dynamic.literal(encoding = "base64")
    __obj.asInstanceOf[Base64ScreenShotOptions]
  }
  
  extension [Self <: Base64ScreenShotOptions](x: Self) {
    
    inline def setEncoding(value: base64): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
