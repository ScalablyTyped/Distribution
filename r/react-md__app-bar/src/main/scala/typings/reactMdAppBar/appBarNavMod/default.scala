package typings.reactMdAppBar.appBarNavMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This component is really just a simple wrapper for the `Button` component
  * that adds some additional styles for adding spacing before and after this
  * button so that it aligns to the main "keyline" of your application's
  * navigation. In simpler terms, it will make the left side of the icon in this
  * button aligns with all the other icons that appear in `ListItem`s in your
  * main navigation.
  *
  * This component is generally really only used when you want to have a
  * temporary navigation element like a hamburger menu.
  */
@JSImport("@react-md/app-bar/types/AppBarNav", JSImport.Default)
@js.native
object default extends TopLevel[ForwardRefExoticComponent[AppBarNavProps with RefAttributes[HTMLButtonElement]]]

