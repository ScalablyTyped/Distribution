package typings.rcPicker

import org.scalablytyped.runtime.Shortcut
import typings.luxon.mod.DateTime
import typings.rcPicker.esGenerateMod.GenerateConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGenerateLuxonMod extends Shortcut {
  
  @JSImport("rc-picker/es/generate/luxon", JSImport.Default)
  @js.native
  val default: GenerateConfig[DateTime] = js.native
  
  type _To = GenerateConfig[DateTime]
  
  /* This means you don't have to write `default`, but can instead just say `esGenerateLuxonMod.foo` */
  override def _to: GenerateConfig[DateTime] = default
}
