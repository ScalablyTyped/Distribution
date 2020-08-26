package typings.reactMdDivider.verticalDividerMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This component is used to create a vertical divider based on a parent
  * element's height. This is really only needed when the parent element **has no
  * defined height**.  If there is a defined height, this component is not worth
  * much as the height can be computed in css as normal. This really just fixes
  * the issue that the height would be set to `auto` (which computes to 0 most of
  * the time) when it is not set on a parent element.
  */
@JSImport("@react-md/divider/types/VerticalDivider", JSImport.Default)
@js.native
object default extends TopLevel[
      ForwardRefExoticComponent[VerticalDividerProps with RefAttributes[HTMLDivElement]]
    ]

