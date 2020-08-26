package typings.reactMdBadge.badgedButtonMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a small wrapper for the `Button` component that will automatically
  * apply the `aria-describedby` attribute when it has been "badged". It also
  * adds some reasonable defaults for the most common use-case for badges:
  * notifications.
  */
@JSImport("@react-md/badge/types/BadgedButton", JSImport.Default)
@js.native
object default extends TopLevel[
      ForwardRefExoticComponent[BadgedButtonProps with RefAttributes[HTMLButtonElement]]
    ]

