package typings.reactMdLink.skipToMainContentMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This component allows you to create a screen-reader only/keyboard focusable
  * only link that allows a user to skip to the main content of the page. This is
  * extremely useful when you have a lot of navigation items that must be tabbed
  * through before the main content can be focused and this component should
  * normally be the first focusable element on your page.
  */
@JSImport("@react-md/link/types/SkipToMainContent", JSImport.Default)
@js.native
object default extends TopLevel[
      ForwardRefExoticComponent[SkipToMainContentProps with RefAttributes[HTMLAnchorElement]]
    ]

