package typings.reactMdLink.linkMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Link` component is used to render links within your app with a basic
  * styles applied and some additional "security" built-in if using the
  * `rel="_blank"`. This can be used with a browser routing library like
  * `react-router` or `reach-router` by providing the `Link` as the
  * `linkComponent` prop.
  */
@JSImport("@react-md/link/types/Link", JSImport.Default)
@js.native
object default
  extends TopLevel[
      ForwardRefExoticComponent[
        (LinkProps with (RefAttributes[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
        ])) | (LinkWithComponentProps with (RefAttributes[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
        ]))
      ]
    ]

