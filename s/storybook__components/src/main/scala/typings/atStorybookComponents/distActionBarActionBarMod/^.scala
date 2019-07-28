package typings.atStorybookComponents.distActionBarActionBarMod

import typings.atEmotionStyledDashBase.atEmotionStyledDashBaseMod.StyledComponent
import typings.atStorybookTheming.distTypesMod.Theme
import typings.react.reactMod.ButtonHTMLAttributes
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.FunctionComponent
import typings.std.HTMLButtonElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components/dist/ActionBar/ActionBar", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ActionBar: FunctionComponent[ActionBarProps] = js.native
  val ActionButton: StyledComponent[
    DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
    Pick[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 265 */ js.Any
    ], 
    Theme
  ] = js.native
}

