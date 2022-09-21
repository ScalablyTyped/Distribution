package typings.storybookAddonLinks

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routedLinkMod extends Shortcut {
  
  @JSImport("@storybook/addon-links/dist/ts3.9/react/components/RoutedLink", JSImport.Default)
  @js.native
  val default: FC[DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement]] = js.native
  
  type _To = FC[DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement]]
  
  /* This means you don't have to write `default`, but can instead just say `routedLinkMod.foo` */
  override def _to: FC[DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement]] = default
}
