package typings.puppeteerCore

import org.scalablytyped.runtime.Shortcut
import typings.puppeteerCore.mod.Puppeteer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webMod extends Shortcut {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/web", JSImport.Default)
  @js.native
  val default: Puppeteer = js.native
  
  type _To = Puppeteer
  
  /* This means you don't have to write `default`, but can instead just say `webMod.foo` */
  override def _to: Puppeteer = default
}
