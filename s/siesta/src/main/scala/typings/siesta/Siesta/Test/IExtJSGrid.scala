package typings.siesta.Siesta.Test

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @mixin
  */
@js.native
trait IExtJSGrid extends StObject {
  
  def getCell(panel: Any, row: Double, column: Double): HTMLElement = js.native
  
  def getFirstCell(panel: Any): HTMLElement = js.native
  
  def getFirstRow(panel: Any): Any = js.native
  
  def getLastCellInRow(panel: Any, row: Double): HTMLElement = js.native
  
  def getRow(panel: Any, index: Double): Any = js.native
  
  def matchGridCellContent(panel: Any, row: Double, column: Double, string: String): Unit = js.native
  def matchGridCellContent(panel: Any, row: Double, column: Double, string: String, description: String): Unit = js.native
  def matchGridCellContent(panel: Any, row: Double, column: Double, string: js.RegExp): Unit = js.native
  def matchGridCellContent(panel: Any, row: Double, column: Double, string: js.RegExp, description: String): Unit = js.native
  
  def waitForRowsVisible(panel: Any, callback: js.Function): Unit = js.native
  def waitForRowsVisible(panel: Any, callback: js.Function, scope: Any): Unit = js.native
  def waitForRowsVisible(panel: Any, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForRowsVisible(panel: Any, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
}
