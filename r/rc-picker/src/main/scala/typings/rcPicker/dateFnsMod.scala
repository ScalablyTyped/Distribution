package typings.rcPicker

import org.scalablytyped.runtime.Shortcut
import typings.rcPicker.generateMod.GenerateConfig
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsMod extends Shortcut {
  
  @JSImport("rc-picker/es/generate/dateFns", JSImport.Default)
  @js.native
  val default: GenerateConfig[Date] = js.native
  
  type _To = GenerateConfig[Date]
  
  /* This means you don't have to write `default`, but can instead just say `dateFnsMod.foo` */
  override def _to: GenerateConfig[Date] = default
}
