package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.semanticUiReact.distCommonjsElementsContainerContainerMod.ContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsContainerMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Container", JSImport.Default)
  @js.native
  val default: FC[ContainerProps] = js.native
  
  type _To = FC[ContainerProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsContainerMod.foo` */
  override def _to: FC[ContainerProps] = default
}
