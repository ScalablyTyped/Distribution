package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Renders a table._
  *
  * Use a table to present data in a structured manner.
  * @see https://docs.scriptable.app/uitable/#-new-uitable
  */
@js.native
trait UITable extends StObject {
  
  /**
    * _Adds a row._
    *
    * Adds a row to the table. Rows are shown vertically in the table view, i.e. from the top and down. Rows are rendered in the order they are added.
    * @param row - Row to add.
    * @see https://docs.scriptable.app/uitable/#-addrow
    */
  def addRow(row: UITableRow): Unit = js.native
  
  /**
    * _Presents the table._
    * @param fullscreen - Optional. Set to true to present the web view in fullscreen. This only has an effect when used within the app. Defaults to false.
    * @see https://docs.scriptable.app/uitable/#-present
    */
  def present(): js.Promise[Unit] = js.native
  def present(fullscreen: Boolean): js.Promise[Unit] = js.native
  
  /**
    * _Reloads the table._
    *
    * If you add or remove rows while a table view is presented, you must reload the table in order for the changes to take effect.
    * @see https://docs.scriptable.app/uitable/#-reload
    */
  def reload(): Unit = js.native
  
  /**
    * _Removes all rows._
    *
    * Removes all rows from the table. If the table is presented, you must call the `reload` function in order for the changes to be reflected visually.
    * @see https://docs.scriptable.app/uitable/#-removeallrows
    */
  def removeAllRows(): Unit = js.native
  
  /**
    * _Removes a row._
    *
    * Removes a row from the table.
    * @param row - Row to remove.
    * @see https://docs.scriptable.app/uitable/#-removerow
    */
  def removeRow(row: UITableRow): Unit = js.native
  
  /**
    * _Whether to show separators._
    *
    * Whether to show separators between rows. Defaults to false.
    * @see https://docs.scriptable.app/uitable/#showseparators
    */
  var showSeparators: Boolean = js.native
}
