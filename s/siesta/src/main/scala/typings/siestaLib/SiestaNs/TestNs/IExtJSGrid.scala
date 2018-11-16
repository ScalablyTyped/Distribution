package typings
package siestaLib.SiestaNs.TestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * @mixin
         */
@js.native
trait IExtJSGrid extends js.Object {
  def getCell(panel: js.Any, row: scala.Double, column: scala.Double): stdLib.HTMLElement = js.native
  def getFirstCell(panel: js.Any): stdLib.HTMLElement = js.native
  def getFirstRow(panel: js.Any): js.Any = js.native
  def getLastCellInRow(panel: js.Any, row: scala.Double): stdLib.HTMLElement = js.native
  def getRow(panel: js.Any, index: scala.Double): js.Any = js.native
  def matchGridCellContent(panel: js.Any, row: scala.Double, column: scala.Double, string: java.lang.String): scala.Unit = js.native
  def matchGridCellContent(
    panel: js.Any,
    row: scala.Double,
    column: scala.Double,
    string: java.lang.String,
    description: java.lang.String
  ): scala.Unit = js.native
  def matchGridCellContent(panel: js.Any, row: scala.Double, column: scala.Double, string: stdLib.RegExp): scala.Unit = js.native
  def matchGridCellContent(
    panel: js.Any,
    row: scala.Double,
    column: scala.Double,
    string: stdLib.RegExp,
    description: java.lang.String
  ): scala.Unit = js.native
  def waitForRowsVisible(panel: js.Any, callback: js.Function): scala.Unit = js.native
  def waitForRowsVisible(panel: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForRowsVisible(panel: js.Any, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
}

