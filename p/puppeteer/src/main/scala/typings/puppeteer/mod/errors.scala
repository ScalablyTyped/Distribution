package typings.puppeteer.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errors extends Shortcut {
  
  @JSImport("puppeteer", "errors")
  @js.native
  val ^ : PuppeteerErrors = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("puppeteer", "errors.ProtocolError")
  @js.native
  open class ProtocolErrorCls () extends ProtocolError
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("puppeteer", "errors.TimeoutError")
  @js.native
  open class TimeoutErrorCls () extends TimeoutError
  
  type _To = PuppeteerErrors
  
  /* This means you don't have to write `^`, but can instead just say `errors.foo` */
  override def _to: PuppeteerErrors = ^
}
