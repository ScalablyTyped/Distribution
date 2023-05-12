package typings.primereact.columnColumnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnFilterElementTemplateOptions extends StObject {
  
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
    * Callback function with optional value and index parameters.
    * @param {*} value - Value of the filter.
    * @param {number} index - Index of the filter.
    */
  def filterCallback(): Unit = js.native
  def filterCallback(value: Any): Unit = js.native
  def filterCallback(value: Any, index: Double): Unit = js.native
  def filterCallback(value: Unit, index: Double): Unit = js.native
  
  /**
    * Object containing column filter model options.
    */
  var filterModel: ColumnFilterModelOptions = js.native
  
  /**
    * Index of the filter.
    */
  var index: Double = js.native
  
  /**
    * Value of the filter.
    */
  var value: Any = js.native
}
