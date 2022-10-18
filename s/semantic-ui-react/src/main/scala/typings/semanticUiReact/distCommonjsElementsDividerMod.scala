package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.semanticUiReact.distCommonjsElementsDividerDividerMod.DividerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsDividerMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Divider", JSImport.Default)
  @js.native
  val default: FC[DividerProps] = js.native
  
  type _To = FC[DividerProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsDividerMod.foo` */
  override def _to: FC[DividerProps] = default
}
