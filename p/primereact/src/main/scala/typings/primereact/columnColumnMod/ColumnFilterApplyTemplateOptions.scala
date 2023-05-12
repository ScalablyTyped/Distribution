package typings.primereact.columnColumnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnFilterApplyTemplateOptions extends StObject {
  
  /**
    * Field name of the column.
    */
  var field: String = js.native
  
  /**
    * Callback function to apply the filters with optional value and index parameters.
    * @param {*} value - Value of the filter.
    * @param {number} index - Index of the filter.
    */
  def filterApplyCallback(): Unit = js.native
  def filterApplyCallback(value: Any): Unit = js.native
  def filterApplyCallback(value: Any, index: Double): Unit = js.native
  def filterApplyCallback(value: Unit, index: Double): Unit = js.native
  
  /**
    * Object containing column filter model options.
    */
  var filterModel: ColumnFilterModelOptions = js.native
}
