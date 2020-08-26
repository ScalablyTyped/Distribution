package typings.reactMdList.listItemLinkMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This component is a really bad attempt at creating a `Link` within a `List`
  * that has the main `ListItem` styles. It will probably be better to just use
  * the `ListItemChildren` within your `Link` component instead.
  */
@JSImport("@react-md/list/types/ListItemLink", JSImport.Default)
@js.native
object default
  extends TopLevel[
      ForwardRefExoticComponent[
        (ListItemLinkProps with (RefAttributes[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
        ])) | (ListItemLinkWithComponentProps with (RefAttributes[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
        ]))
      ]
    ]

