package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.dividerDividerMod.DividerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Divider", JSImport.Default)
  @js.native
  val default: StatelessComponent[DividerProps] = js.native
  
  type _To = StatelessComponent[DividerProps]
  
  /* This means you don't have to write `default`, but can instead just say `dividerMod.foo` */
  override def _to: StatelessComponent[DividerProps] = default
}
