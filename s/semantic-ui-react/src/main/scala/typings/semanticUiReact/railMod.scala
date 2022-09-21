package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.semanticUiReact.railRailMod.RailProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object railMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Rail", JSImport.Default)
  @js.native
  val default: FC[RailProps] = js.native
  
  type _To = FC[RailProps]
  
  /* This means you don't have to write `default`, but can instead just say `railMod.foo` */
  override def _to: FC[RailProps] = default
}
