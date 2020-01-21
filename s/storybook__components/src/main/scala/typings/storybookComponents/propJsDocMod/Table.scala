package typings.storybookComponents.propJsDocMod

import org.scalablytyped.runtime.TopLevel
import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.TableHTMLAttributes
import typings.std.HTMLTableElement
import typings.std.Pick
import typings.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components/dist/blocks/PropsTable/PropJsDoc", "Table")
@js.native
object Table
  extends TopLevel[
      StyledComponent[
        DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
        Pick[
          DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 258 */ js.Any
        ], 
        Theme
      ]
    ]

