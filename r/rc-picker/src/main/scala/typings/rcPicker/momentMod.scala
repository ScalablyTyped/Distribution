package typings.rcPicker

import org.scalablytyped.runtime.Shortcut
import typings.moment.mod.Moment
import typings.rcPicker.generateMod.GenerateConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object momentMod extends Shortcut {
  
  @JSImport("rc-picker/es/generate/moment", JSImport.Default)
  @js.native
  val default: GenerateConfig[Moment] = js.native
  
  type _To = GenerateConfig[Moment]
  
  /* This means you don't have to write `default`, but can instead just say `momentMod.foo` */
  override def _to: GenerateConfig[Moment] = default
}
