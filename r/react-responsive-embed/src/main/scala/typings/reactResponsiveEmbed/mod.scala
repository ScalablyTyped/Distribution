package typings.reactResponsiveEmbed

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.IframeHTMLAttributes
import typings.reactResponsiveEmbed.anon.Ratio
import typings.std.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-responsive-embed", JSImport.Namespace)
  @js.native
  val ^ : ComponentType[Props] = js.native
  
  type Props = Ratio & (DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement])
  
  type _To = ComponentType[Props]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ComponentType[Props] = ^
}
