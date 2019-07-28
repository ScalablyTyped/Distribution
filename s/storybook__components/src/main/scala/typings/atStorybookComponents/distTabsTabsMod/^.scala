package typings.atStorybookComponents.distTabsTabsMod

import typings.atEmotionStyledDashBase.atEmotionStyledDashBaseMod.StyledComponent
import typings.atStorybookTheming.distTypesMod.Theme
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.NamedExoticComponent
import typings.std.HTMLDivElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components/dist/tabs/tabs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val TabBar: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    Pick[
      DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 254 */ js.Any
    ], 
    Theme
  ] = js.native
  val TabWrapper: FunctionComponent[TabWrapperProps] = js.native
  val Tabs: NamedExoticComponent[TabsProps] = js.native
}

