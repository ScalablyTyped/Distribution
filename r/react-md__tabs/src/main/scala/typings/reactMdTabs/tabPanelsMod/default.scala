package typings.reactMdTabs.tabPanelsMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This component allows you to control the visibility of the `TabPanel`
  * components and animating the next and current panels as needed. This works by
  * looping over all the children and getting the current `TabPanel` by the
  * `activeIndex`. This is why the children for this component can only be
  * `TabPanel` and should not be conditional.
  */
@JSImport("@react-md/tabs/types/TabPanels", JSImport.Default)
@js.native
object default extends TopLevel[ForwardRefExoticComponent[TabPanelsProps with RefAttributes[HTMLDivElement]]]

