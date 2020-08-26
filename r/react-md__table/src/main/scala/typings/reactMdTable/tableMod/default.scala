package typings.reactMdTable.tableMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLTableElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a `<table>` element with some default styles and a quick way to
  * configure the other styles within a table. That being said, styling tables is
  * awful if you are used to flexbox and this component will not be helping with
  * layout styles of tables.
  *
  * The table will not be responsive by default, but you can easily create a
  * responsive table with overflow by wrapping with the `TableContainer`
  * component or just adding `overflow: auto` to a parent element. Note that
  * horizontal scrolling is still not one of the best user interactions and it
  * might be better to render a table in a different manner for mobile devices to
  * help display all the required data.
  */
@JSImport("@react-md/table/types/Table", JSImport.Default)
@js.native
object default extends TopLevel[ForwardRefExoticComponent[TableProps with RefAttributes[HTMLTableElement]]]

