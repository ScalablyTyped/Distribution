package typings.puppeteerCore

import org.scalablytyped.runtime.Shortcut
import typings.puppeteerCore.apiDocsEntryMod.PuppeteerNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object puppeteerNodeMod extends Shortcut {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/node", JSImport.Default)
  @js.native
  val default: PuppeteerNode = js.native
  
  type _To = PuppeteerNode
  
  /* This means you don't have to write `default`, but can instead just say `puppeteerNodeMod.foo` */
  override def _to: PuppeteerNode = default
}
