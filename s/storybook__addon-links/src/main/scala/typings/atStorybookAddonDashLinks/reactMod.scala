package typings.atStorybookAddonDashLinks

import typings.atStorybookAddonDashLinks.reactMod.LinkTo
import typings.react.reactMod.AnchorHTMLAttributes
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.PureComponent
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-links/react", JSImport.Namespace)
@js.native
object reactMod extends js.Object {
  @js.native
  class default () extends LinkTo
  
  type LinkTo = PureComponent[
    (DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement]) with Anon_Kind, 
    js.Object, 
    js.Any
  ]
}

