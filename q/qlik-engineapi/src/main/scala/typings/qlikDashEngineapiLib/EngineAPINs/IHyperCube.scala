package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Renders the properties of a hypercube. Is the layout for HyperCubeDef.
  * For more information about the definition of a hypercube, see Generic objects.
  *
  * Note: What is returned in HyperCube depends on the type of the hypercube
  *          (straight, pivot or stacked table) and on the method called
  *          (GetLayout, GetHyperCubeData, GetHyperCubePivotData, GetHyperCubeStackData).
  */
trait IHyperCube extends js.Object {
  /**
    * Set of data.
    * Is empty if nothing has been defined in qInitialDataFetch in HyperCubeDef.
    */
  var qDataPages: js.Array[INxDataPage]
  /**
    * Information on the dimension.
    */
  var qDimensionInfo: js.Array[INxDimensionInfo]
  /**
    * Sort order of the columns in the hypercube.
    * Column numbers are separated by a comma.
    * Example: [1,0,2] means that the first column to be sorted was the column 1,
    * followed by the column 0 and the column 2.
    */
  var qEffectiveInterColumnSortOrder: js.Array[scala.Double]
  /**
    * This parameter is optional and is displayed in case of error.
    */
  var qError: js.UndefOr[INxValidationError] = js.undefined
  /**
    * Aggregate for measures of all values in the field.
    * The result value depends on the qAggrFunc defined in HyperCubeDef.
    */
  var qGrandTotalRow: js.Array[INxCell]
  /**
    * ...
    */
  var qHasOtherValues: scala.Boolean
  /**
    * Is used for pivot tables only.
    * If set to true, the formatting of the results is slightly different.
    * >> This property is optional.
    */
  var qIndentMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Is used for pivot tables only.
    * Position of the last expended cell.
    * >> This property is optional.
    */
  var qLastExpandedPos: js.UndefOr[INxCellPosition] = js.undefined
  /**
    * Information on the measure.
    */
  var qMeasureInfo: js.Array[INxMeasureInfo]
  /**
    * Information about the mode of the visualization.
    */
  var qMode: NxHypercubeMode
  /**
    * Number of left dimensions
    * Default value is -1.
    * The index related to each left dimension depends on the position of the pseudo dimension (if any).
    * For example, a pivot table with:
    *
    * - 4 dimensions in the following order: Country, City, Product and Category
    * - one pseudo dimension in position 1
    * - 3 left dimensions.
    *
    * implies that:
    *
    * - The index 0 corresponds to the left dimension Country
    * - The index 1 corresponds to the pseudo dimension
    * - The index 2 corresponds to the left dimension City
    * - Product and Category are top dimensions.
    *
    * Another example:
    *
    * - 4 dimensions in the following order: Country, City, Product and Category
    * - one pseudo dimension in position -1
    * - 3 left dimensions.
    *
    * implies that:
    *
    * - The index -1 corresponds to the pseudo dimension; the pseudo dimension is the most to the right
    * - The index 0 corresponds to the left dimension Country
    * - The index 1 corresponds to the left dimension City
    * - The index 2 corresponds to the left dimension Product
    * - Category is a top dimension.
    */
  var qNoOfLeftDims: scala.Double
  /**
    * Set of data for pivot tables.
    * Is empty if nothing has been defined in qInitialDataFetch in HyperCubeDef.
    */
  var qPivotDataPages: js.Array[INxPivotPage]
  /**
    * Defines the size of the hypercube.
    */
  var qSize: ISize
  /**
    * Set of data for stacked tables.
    * Is empty if nothing has been defined in qInitialDataFetch in HyperCubeDef.
    */
  var qStackedDataPages: js.Array[INxStackPage]
  /**
    * Name of the alternate state.
    * Default is current selections $.
    */
  var qStateName: java.lang.String
}

