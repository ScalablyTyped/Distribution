package typings.puppeteerCore.esmPuppeteerTypesMod

import org.scalablytyped.runtime.Shortcut
import typings.puppeteerCore.commonErrorsMod.PuppeteerErrors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errors extends Shortcut {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/types", "errors")
  @js.native
  val ^ : PuppeteerErrors = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("puppeteer-core/lib/esm/puppeteer/types", "errors.ProtocolError")
  @js.native
  open class ProtocolErrorCls ()
    extends typings.puppeteerCore.commonErrorsMod.ProtocolError
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("puppeteer-core/lib/esm/puppeteer/types", "errors.TimeoutError")
  @js.native
  open class TimeoutErrorCls ()
    extends typings.puppeteerCore.commonErrorsMod.TimeoutError
  
  type _To = PuppeteerErrors
  
  /* This means you don't have to write `^`, but can instead just say `errors.foo` */
  override def _to: PuppeteerErrors = ^
}
