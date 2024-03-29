package typings.qlikVisualizationextensions

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FieldAPI {
  
  @js.native
  trait IQField extends StObject {
    
    /**
      * Clears a field selection.
      * @return - A promise.
      */
    def clear(): IPromise[Any] = js.native
    
    /**
      * Clears all fields except the selected one.
      * @param [softlock] - Optional. If true, locked selections can be overridden.
      * @return - A promise.
      */
    def clearOther(): IPromise[Any] = js.native
    def clearOther(softlock: Boolean): IPromise[Any] = js.native
    
    /**
      * Gets field data. The values are available as QFieldValue in array
      * field.rows and will updated when the selection state changes.
      * Notification OnData will be triggered after each update.
      * @param [options] - Optional. Properties:
      * Name | Type | Description
      * rows | Number | Number of rows to fetch. Default: 200.
      * frequencyMode | String | Can be one of:
      *       # V=Absolute
      *       # P=Percent
      *       # R=Relative
      *       # N=No frequency
      *      |        | Default: V.
      * @return - The field object.
      */
    def getData(): IQField = js.native
    def getData(options: Boolean): IQField = js.native
    
    /**
      * Gets more data for your field. Notification OnData is triggered when complete.
      * @return - The field object.
      */
    def getMoreData(): IQField = js.native
    
    /**
      * Locks a field selection.
      * @return - A promise.
      */
    def lock(): IPromise[Any] = js.native
    
    /**
      * Optional. Object with number of values in different states.
      * Only after getData() call. Introduced in 2.1.
      */
    var qStateCounts: Any = js.native
    
    /**
      * Optional. Number of different values. Only after getData() call. Introduced in 2.1.
      */
    var rowCount: Double = js.native
    
    /**
      * Field values. You need to call getData() method to make this available. Introduced in 2.1.
      */
    var rows: js.Array[IQFieldValue] = js.native
    
    /**
      * Selects field values using indexes.
      * @param Array - Array of index values to select
      * @param [toggle] - Optional. If true, toggle selected state.
      * @param [softlock] - Optional. If true, locked selections can be overridden.
      * @return - A promise.
      */
    def select(Array: js.Array[Double]): IPromise[Any] = js.native
    def select(Array: js.Array[Double], toggle: Boolean): IPromise[Any] = js.native
    def select(Array: js.Array[Double], toggle: Boolean, softlock: Boolean): IPromise[Any] = js.native
    def select(Array: js.Array[Double], toggle: Unit, softlock: Boolean): IPromise[Any] = js.native
    
    /**
      * Selects all values in a field.
      * @param [softlock] - Optional. If true, locked selections can be overridden.
      * @return - A promise.
      */
    def selectAll(): IPromise[Any] = js.native
    def selectAll(softlock: Boolean): IPromise[Any] = js.native
    
    /**
      * Selects alternative values in a field.
      * @param [softlock] - Optional. If true, locked selections can be overridden.
      * @return - A promise.
      */
    def selectAlternative(): IPromise[Any] = js.native
    def selectAlternative(softlock: Boolean): IPromise[Any] = js.native
    
    /**
      * Selects excluded values in a field.
      * @param [softlock] - Optional. If true, locked selections can be overridden.
      * @return - A promise.
      */
    def selectExcluded(): IPromise[Any] = js.native
    def selectExcluded(softlock: Boolean): IPromise[Any] = js.native
    
    /**
      * Selects matching field values.
      * @param match - Match string.
      * @param [softlock] - Optional. If true, locked selections can be overridden.
      * @return - A promise.
      */
    def selectMatch(`match`: String): IPromise[Any] = js.native
    def selectMatch(`match`: String, softlock: Boolean): IPromise[Any] = js.native
    
    /**
      * Selects possible values in a field.
      * @param [softlock] - Optional. If true, locked selections can be overridden.
      * @return - A promise.
      */
    def selectPossible(): IPromise[Any] = js.native
    def selectPossible(softlock: Boolean): IPromise[Any] = js.native
    
    /**
      * Selects specific values in a field.
      * @param array - Array of qFieldValues to select. A simplified syntax with
      *                         strings or numbers also works since version 1.1.
      * For a numeric field you need to provide the numeric value.
      * @param [toggle] - Optional. If true, toggle selected state.
      * @param [softlock] - Optional. If true, locked selections can be overridden.
      * @return - A promise.
      */
    def selectValues(array: js.Array[IQFieldValue]): IPromise[Any] = js.native
    def selectValues(array: js.Array[IQFieldValue], toggle: Boolean): IPromise[Any] = js.native
    def selectValues(array: js.Array[IQFieldValue], toggle: Boolean, softlock: Boolean): IPromise[Any] = js.native
    def selectValues(array: js.Array[IQFieldValue], toggle: Unit, softlock: Boolean): IPromise[Any] = js.native
    
    /**
      * Toggles a field selection.
      * @param match - Match string.
      * @param [softlock] - Optional. If true, locked selections can be overridden.
      * @return - A promise.
      */
    def toggleSelect(`match`: String): IPromise[Any] = js.native
    def toggleSelect(`match`: String, softlock: Boolean): IPromise[Any] = js.native
    
    /**
      * Unlocks field selections.
      * @return - A promise.
      */
    def unlock(): IPromise[Any] = js.native
  }
  
  @js.native
  trait IQFieldValue extends StObject {
    
    /**
      * Cell value index.
      */
    var qElemNumber: Double = js.native
    
    /**
      * Optional. Frequency, if calculated by the Qlik engine.
      */
    var qFrequency: js.UndefOr[String] = js.native
    
    /**
      * Optional. Cell numeric value, if cell is numeric.
      */
    var qNum: js.UndefOr[Double] = js.native
    
    /**
      * Cell state.
      */
    var qState: Any = js.native
    
    /**
      * Cell value formatted as set up in properties.
      */
    var qText: String = js.native
    
    /**
      * Selects a field value.
      * @param [toggle] - Optional. If true, toggle selected state.
      * @param [softlock] - Optional. If true, locked selections can be overridden.
      * @return - A promise.
      */
    def select(): IPromise[Any] = js.native
    def select(toggle: Boolean): IPromise[Any] = js.native
    def select(toggle: Boolean, softlock: Boolean): IPromise[Any] = js.native
    def select(toggle: Unit, softlock: Boolean): IPromise[Any] = js.native
  }
}
