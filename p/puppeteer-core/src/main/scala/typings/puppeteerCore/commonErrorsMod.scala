package typings.puppeteerCore

import org.scalablytyped.runtime.Instantiable1
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonErrorsMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/Errors", "TimeoutError")
  @js.native
  class TimeoutError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/Errors", "puppeteerErrors")
  @js.native
  val puppeteerErrors: PuppeteerErrors_ = js.native
  
  type CustomError = Error
  
  type PuppeteerErrors_ = Record[String, Instantiable1[/* message */ String, CustomError]]
}
