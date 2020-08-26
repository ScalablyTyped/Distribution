package typings.reactMdUtils.gridListMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `GridList` component is a different way to render a list of data where
  * the number of columns is dynamic and based on the max-width for each cell.
  * Instead of setting a percentage width to each cell based on the number of
  * columns, this will dynamically add columns to fill up the remaining space and
  * have each cell grow up to a set max-width. A really good use-case for this is
  * displaying a list of images or thumbnails and allowing the user to see a full
  * screen preview once selected/clicked.
  */
@JSImport("@react-md/utils/types/layout/GridList", JSImport.Default)
@js.native
object default extends TopLevel[ForwardRefExoticComponent[GridListProps with RefAttributes[HTMLDivElement]]]

