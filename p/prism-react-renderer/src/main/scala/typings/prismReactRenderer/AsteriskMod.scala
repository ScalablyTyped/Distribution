package typings.prismReactRenderer

import org.scalablytyped.runtime.Shortcut
import typings.prismReactRenderer.mod.PrismTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AsteriskMod extends Shortcut {
  
  @JSImport("prism-react-renderer/themes/*", JSImport.Default)
  @js.native
  val default: PrismTheme = js.native
  
  type _To = PrismTheme
  
  /* This means you don't have to write `default`, but can instead just say `AsteriskMod.foo` */
  override def _to: PrismTheme = default
}
