package typings.storybookComponents

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FormHTMLAttributes
import typings.std.HTMLFormElement
import typings.std.Pick
import typings.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components/dist/form", JSImport.Namespace)
@js.native
object formMod extends js.Object {
  val Form: (StyledComponent[
    DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
    Pick[
      DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 263 */ js.Any
    ], 
    Theme
  ]) with AnonAbout = js.native
}

