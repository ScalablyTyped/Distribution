package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.radioRadioMod.RadioProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/Radio", JSImport.Default)
  @js.native
  val default: StatelessComponent[RadioProps] = js.native
  
  type _To = StatelessComponent[RadioProps]
  
  /* This means you don't have to write `default`, but can instead just say `radioMod.foo` */
  override def _to: StatelessComponent[RadioProps] = default
}
