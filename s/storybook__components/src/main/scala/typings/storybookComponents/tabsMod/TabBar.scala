package typings.storybookComponents.tabsMod

import org.scalablytyped.runtime.TopLevel
import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.Pick
import typings.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components/dist/tabs/tabs", "TabBar")
@js.native
object TabBar
  extends TopLevel[
      StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
        Pick[
          DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
        ], 
        Theme
      ]
    ]

