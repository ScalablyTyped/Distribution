package typings
package qlikDashEngineapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EngineAPINs {
  type BnfType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.S | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.E
  type CommandType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.JsonRequest | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.GetCustomCaption | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.IsConnected | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.DisableQlikViewSelectButton | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.HaveStarField
  /**
    * One of:
    * - Cleared: In this mode, the first step is to clear any current selections in the app.
    *            The second step is to search for one or more terms in the values of the app.
    * - LockedFieldsOnly: In this mode, the search applies only to the values associated with
    *                     the selections made in locked fields, ignoring selections in any unlocked field.
    *                     If no locked fields, the behavior is identical to the Cleared context.
    *                     You cannot make any new selections in a locked field. You can get search hits for
    *                     the associated values of a locked field but you cannot get the search hits for the non associative values.
    * - CurrentSelections: In this mode, the current selections are kept (if any). Search for one or more terms in the values of the app.
    *                      New selections are made on top of the current selections. If no selections were made before the search,
    *                      this mode is identical to the Cleared context.
    */
  type ContextType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.Cleared | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.LockedFieldsOnly | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.CurrentSelections
  type DimensionType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.D | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.N | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.T
  /**
    * Type of the drive. Can be:
    * - REMOVABLE
    * - FIXED
    * - NETWORK
    * - CD_ROM
    * - RAM
    * - UNKNOWN_TYPE
    */
  type DriveType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.REMOVABLE | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.FIXED | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.NETWORK | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.CD_ROM | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.RAM | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.UNKNOWN_TYPE
  type ErrorDataCodeType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.`0` | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.`1` | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.`2`
  type ExportStateType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.P | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.A
  type FieldAttributesType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.U | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.A | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.I | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.R | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.F | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.M | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.D | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.T | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.TS | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.IV
  type FieldDefExType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.`0` | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.`1` | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.`2`
  type FieldSelectionModeType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.NORMAL | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.AND | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.NOT
  type FileDataFormatType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.CSV | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.FIX | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.DIF | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.EXCEL_BIFF | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.EXCEL_OOXML | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.HTML | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.XML | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.QVX | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.JSON | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.KML
  type FileType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.CSV_C | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.CSV_T | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.OOXML
  type FolderItemType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.FOLDER | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.FILE | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.OTHER
  /**
    * One of:
    * - NX_FREQUENCY_NONE
    * - NX_FREQUENCY_VALUE
    * - NX_FREQUENCY_PERCENT. The percentage is between 0 and 100.
    * - NX_FREQUENCY_RELATIVE. Same as percent except that the relative value is between 0 and 1.
    */
  type FrequencyModeType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.NX_FREQUENCY_NONE | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.NX_FREQUENCY_VALUE | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.NX_FREQUENCY_PERCENT | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.NX_FREQUENCY_RELATIVE
  /**
    * One of:
    * - ALL for FUNC_GROUP_ALL,
    * - U for FUNC_GROUP_UNKNOWN,
    * - NONE for FUNC_GROUP_NONE,
    * - AGGR for FUNC_GROUP_AGGR,
    * - NUM for FUNC_GROUP_NUMERIC,
    * - RNG for FUNC_GROUP_RANGE,
    * - EXP for FUNC_GROUP_EXPONENTIAL_AND_LOGARITHMIC,
    * - TRIG for FUNC_GROUP_TRIGONOMETRIC_AND_HYPERBOLIC,
    * - FIN for FUNC_GROUP_FINANCIAL,
    * - MATH for FUNC_GROUP_MATH_CONSTANT_AND_PARAM_FREE,
    * - COUNT for FUNC_GROUP_COUNTER,
    * - STR for FUNC_GROUP_STRING,
    * - MAPP for FUNC_GROUP_MAPPING,
    * - RCRD for FUNC_GROUP_INTER_RECORD,
    * - CND for FUNC_GROUP_CONDITIONAL,
    * - LOG for FUNC_GROUP_LOGICAL,
    * - NULL for FUNC_GROUP_NULL,
    * - SYS for FUNC_GROUP_SYSTEM,
    * - FILE for FUNC_GROUP_FILE,
    * - TBL for FUNC_GROUP_TABLE,
    * - DATE for FUNC_GROUP_DATE_AND_TIME,
    * - NUMI for FUNC_GROUP_NUMBER_INTERPRET,
    * - FRMT for FUNC_GROUP_FORMATTING,
    * - CLR for FUNC_GROUP_COLOR,
    * - RNK for FUNC_GROUP_RANKING
    * - GEO for FUNC_GROUP_GEO
    * - EXT for FUNC_GROUP_EXTERNAL
    */
  type FunctionGroupType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.ALL | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.U | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.NONE | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.AGGR | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.NUM | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.RNG | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.EXP | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.TRIG | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.FIN | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.MATH | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.COUNT | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.STR | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.MAPP | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.RCRD | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.CND | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.LOG | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.NULL | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.SYS | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.FILE | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.TBL | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.DATE | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.NUMI | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.FRMT | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.CLR | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.RNK | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.GEO | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.EXT
  /**
    * BookmarkListObject width extend GenericObject
    */
  type IBookmarkListObject = IGenericObjectPrototype[IGenericBookmarkListProperties, IGenericBookmarkListLayout]
  type IDimensionListObject = IGenericObjectPrototype[IGenericDimensionsListProperties, IGenericDimensionListLayout]
  /**
    * FieldListObject width extend GenericObject
    */
  type IFieldListObject = IGenericObjectPrototype[IGenericFieldListProperties, IGenericFieldLayout]
  /**
    * GenericBookmarkProperties width extend GenericProperties
    */
  type IGenericBookmarkProperties = IGenericProperties
  type IGenericDerivedFieldProperties = IGenericProperties
  /**
    * GenericList...
    */
  type IGenericList = IGenericObjectPrototype[IGenericListProperties, IGenericListLayout]
  /**
    * HyperCubeObject width extend GenericObjectPrototype<GenericHyperCubeProperties, GenericHyperCubeLayout>
    */
  type IHyperCubeObject = IGenericObjectPrototype[IGenericHyperCubeProperties, IGenericHyperCubeLayout]
  /**
    * IMeassureListObject
    */
  type IMeassureListObject = IGenericObjectPrototype[IGenericMeasureListProperties, IGenericMeasureListLayout]
  /**
    * NxCellRows...
    */
  type INxCellRows = js.Array[INxCell]
  /**
    * VariableListObject width extend GenericObject
    */
  type IVariableListObject = IGenericObjectPrototype[IGenericVariableListProperties, IGenericVariableListLayout]
  /**
    * One of:
    * - IT_SCRIPTLINE; the engine returns the statement that will be executed next.
    * - IT_MSGBOX; the engine returns a script execution error message. This type can only be returned if the parameter qInteractOnError was set to true when calling the ConfigureReload method.
    * - IT_BREAK; the engine breaks and waits for a response on what to do next.
    * - IT_END; the engine has finished to execute all statements in the script.
    */
  type InteractionType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.IT_SCRIPTLINE | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.IT_MSGBOX | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.IT_BREAK | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.IT_END
  type LogonType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.LOG_ON_SERVICE_USER | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.LOG_ON_CURRENT_USER
  /**
    * One of:
    * - N for NOT_META
    * - D for META_DOC_NAME
    * - R for META_RET_TYPE
    */
  type MTType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.N | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.D | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.R
  /**
    * One of:
    * - CONNECT_DEFAULT: used internally
    * - CONNECT_64
    * - CONNECT_32
    */
  type MachineModeType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.CONNECT_DEFAULT | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.CONNECT_64 | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.CONNECT_32
  type NxCellStateType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.L | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.S | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.O | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.D | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.A | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.X | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.XS | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.XL
  type NxCellType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.V | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.E | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.N | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.T | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.P | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.R | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.U
  type NxGrpType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.N | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.H | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.C | java.lang.String
  /**
    * One of:
    * - S for DATA_MODE_STRAIGHT; straight table representation
    * - P for DATA_MODE_PIVOT; pivot table representation
    * - K for DATA_MODE_PIVOT_STACK; stacked table representation
    * - T for DATA_MODE_TREE; tree representation
    */
  type NxHypercubeMode = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.S | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.P | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.K | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.T
  type NxPatchOpType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.Add | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.Remove | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.Replace
  type NxSelectionCellType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.D | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.T | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.L
  /**
    * One of:
    * - V for NX_DIM_CELL_VALUE. Applies to values in the data matrix.
    * - E for NX_DIM_CELL_EMPTY. Applies to empty cells in the top and left dimensions.
    * - G for NX_DIM_CELL_GENERATED. Applies to generated nodes that are inserted into the returned tree when there is no actual value (qAllValues in NxPageTreeNode set to true).
    * - N for NX_DIM_CELL_NORMAL. Applies to left and top dimensions cells.
    * - T for NX_DIM_CELL_TOTAL. Applies to cells marked with Total.
    * - P for NX_DIM_CELL_PSEUDO. Applies to pseudo dimensions.
    * - R for NX_DIM_CELL_ROOT. Applies to root node.
    * - U for NX_DIM_CELL_NULL. Applies to Null values in the data matrix.
    */
  type NxTreeNodeType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.V | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.E | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.G | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.N | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.T | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.P | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.R | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.U
  type OtherLimitModeType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.OTHER_GE_LIMIT | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.OTHER_LE_LIMIT | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.OTHER_GT_LIMIT | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.OTHER_LT_LIMIT
  type OtherModeType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.OTHER_OFF | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.OTHER_COUNTED | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.OTHER_ABS_LIMITED | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.OTHER_ABS_ACC_TARGET | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.OTHER_REL_LIMITED | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.OTHER_REL_ACC_TARGET
  type OtherSortModeType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.OTHER_SORT_DEFAULT | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.OTHER_SORT_DESCENDING | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.OTHER_SORT_ASCENDING
  type ReductionModeType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.N | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.D1 | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.S | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.C | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.ST
  type SearchObjectsGroupType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.DatasetType | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.GenericObjectsType
  type SearchObjectsItemType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.`0` | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.`1`
  type SortIndicatorType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.N | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.A | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.D
  type TableRecordKeyType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.NOT_KEY | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.ANY_KEY | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.PRIMARY_KEY | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.PERFECT_KEY
  type TotalModeType = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.TOTAL_OFF | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.TOTAL_EXPR
  type TypeSortDirection = qlikDashEngineapiLib.qlikDashEngineapiLibStrings.`1` | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.`-1` | qlikDashEngineapiLib.qlikDashEngineapiLibStrings.`0`
}
