package typings.storybookComponents.inputMod

import org.scalablytyped.runtime.TopLevel
import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.RefAttributes
import typings.react.mod.SelectHTMLAttributes
import typings.std.HTMLSelectElement
import typings.std.Pick
import typings.storybookComponents.AnonDisplayName
import typings.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components/dist/form/input/input", "Select")
@js.native
object Select
  extends TopLevel[
      (StyledComponent[
        (Pick[
          SelectHTMLAttributes[HTMLSelectElement], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 263 */ js.Any
        ]) with InputStyleProps with RefAttributes[_], 
        SelectProps, 
        Theme
      ]) with AnonDisplayName
    ]

