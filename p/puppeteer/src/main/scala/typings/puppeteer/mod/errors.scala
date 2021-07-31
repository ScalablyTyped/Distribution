package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errors {
  
  @JSImport("puppeteer", "errors")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("puppeteer", "errors.TimeoutError")
  @js.native
  def TimeoutError: typings.puppeteer.mod.TimeoutError = js.native
  @scala.inline
  def TimeoutError_=(x: TimeoutError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TimeoutError")(x.asInstanceOf[js.Any])
  
  @JSImport("puppeteer", "errors.puppeteerErrors")
  @js.native
  def puppeteerErrors: typings.puppeteer.anon.TimeoutError = js.native
  @scala.inline
  def puppeteerErrors_=(x: typings.puppeteer.anon.TimeoutError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("puppeteerErrors")(x.asInstanceOf[js.Any])
}
