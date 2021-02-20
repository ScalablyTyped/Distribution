package typings.qlikEngineapi

import typings.qlikEngineapi.EngineAPI.BnfType
import typings.qlikEngineapi.EngineAPI.CommandType
import typings.qlikEngineapi.EngineAPI.ContextType
import typings.qlikEngineapi.EngineAPI.DimensionType
import typings.qlikEngineapi.EngineAPI.DriveType
import typings.qlikEngineapi.EngineAPI.ErrorDataCodeType
import typings.qlikEngineapi.EngineAPI.ExportStateType
import typings.qlikEngineapi.EngineAPI.FieldAttributesType
import typings.qlikEngineapi.EngineAPI.FieldDefExType
import typings.qlikEngineapi.EngineAPI.FieldSelectionModeType
import typings.qlikEngineapi.EngineAPI.FileDataFormatType
import typings.qlikEngineapi.EngineAPI.FileType
import typings.qlikEngineapi.EngineAPI.FolderItemType
import typings.qlikEngineapi.EngineAPI.FrequencyModeType
import typings.qlikEngineapi.EngineAPI.FunctionGroupType
import typings.qlikEngineapi.EngineAPI.InteractionType
import typings.qlikEngineapi.EngineAPI.LogonType
import typings.qlikEngineapi.EngineAPI.MTType
import typings.qlikEngineapi.EngineAPI.MachineModeType
import typings.qlikEngineapi.EngineAPI.NxCellStateType
import typings.qlikEngineapi.EngineAPI.NxCellType
import typings.qlikEngineapi.EngineAPI.NxHypercubeMode
import typings.qlikEngineapi.EngineAPI.NxPatchOpType
import typings.qlikEngineapi.EngineAPI.NxSelectionCellType
import typings.qlikEngineapi.EngineAPI.NxTreeNodeType
import typings.qlikEngineapi.EngineAPI.OtherLimitModeType
import typings.qlikEngineapi.EngineAPI.OtherModeType
import typings.qlikEngineapi.EngineAPI.OtherSortModeType
import typings.qlikEngineapi.EngineAPI.ReductionModeType
import typings.qlikEngineapi.EngineAPI.SearchObjectsGroupType
import typings.qlikEngineapi.EngineAPI.SearchObjectsItemType
import typings.qlikEngineapi.EngineAPI.SortIndicatorType
import typings.qlikEngineapi.EngineAPI.TableRecordKeyType
import typings.qlikEngineapi.EngineAPI.TotalModeType
import typings.qlikEngineapi.EngineAPI.TypeSortDirection
import typings.qlikEngineapi.EngineAPI._NxGrpType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object qlikEngineapiStrings {
  
  @js.native
  sealed trait `-1` extends TypeSortDirection
  @scala.inline
  def `-1`: `-1` = "-1".asInstanceOf[`-1`]
  
  @js.native
  sealed trait `0`
    extends ErrorDataCodeType
       with FieldDefExType
       with SearchObjectsItemType
       with TypeSortDirection
  @scala.inline
  def `0`: `0` = "0".asInstanceOf[`0`]
  
  @js.native
  sealed trait `1`
    extends ErrorDataCodeType
       with FieldDefExType
       with SearchObjectsItemType
       with TypeSortDirection
  @scala.inline
  def `1`: `1` = "1".asInstanceOf[`1`]
  
  @js.native
  sealed trait `2`
    extends ErrorDataCodeType
       with FieldDefExType
  @scala.inline
  def `2`: `2` = "2".asInstanceOf[`2`]
  
  @js.native
  sealed trait A
    extends ExportStateType
       with FieldAttributesType
       with NxCellStateType
       with SortIndicatorType
  @scala.inline
  def A: A = "A".asInstanceOf[A]
  
  @js.native
  sealed trait AGGR extends FunctionGroupType
  @scala.inline
  def AGGR: AGGR = "AGGR".asInstanceOf[AGGR]
  
  @js.native
  sealed trait ALL extends FunctionGroupType
  @scala.inline
  def ALL: ALL = "ALL".asInstanceOf[ALL]
  
  @js.native
  sealed trait AND extends FieldSelectionModeType
  @scala.inline
  def AND: AND = "AND".asInstanceOf[AND]
  
  @js.native
  sealed trait ANY_KEY extends TableRecordKeyType
  @scala.inline
  def ANY_KEY: ANY_KEY = "ANY_KEY".asInstanceOf[ANY_KEY]
  
  @js.native
  sealed trait Add extends NxPatchOpType
  @scala.inline
  def Add: Add = "Add".asInstanceOf[Add]
  
  @js.native
  sealed trait BookmarkList extends StObject
  @scala.inline
  def BookmarkList: BookmarkList = "BookmarkList".asInstanceOf[BookmarkList]
  
  @js.native
  sealed trait C
    extends ReductionModeType
       with _NxGrpType
  @scala.inline
  def C: C = "C".asInstanceOf[C]
  
  @js.native
  sealed trait CD_ROM extends DriveType
  @scala.inline
  def CD_ROM: CD_ROM = "CD_ROM".asInstanceOf[CD_ROM]
  
  @js.native
  sealed trait CLR extends FunctionGroupType
  @scala.inline
  def CLR: CLR = "CLR".asInstanceOf[CLR]
  
  @js.native
  sealed trait CND extends FunctionGroupType
  @scala.inline
  def CND: CND = "CND".asInstanceOf[CND]
  
  @js.native
  sealed trait CONNECT_32 extends MachineModeType
  @scala.inline
  def CONNECT_32: CONNECT_32 = "CONNECT_32".asInstanceOf[CONNECT_32]
  
  @js.native
  sealed trait CONNECT_64 extends MachineModeType
  @scala.inline
  def CONNECT_64: CONNECT_64 = "CONNECT_64".asInstanceOf[CONNECT_64]
  
  @js.native
  sealed trait CONNECT_DEFAULT extends MachineModeType
  @scala.inline
  def CONNECT_DEFAULT: CONNECT_DEFAULT = "CONNECT_DEFAULT".asInstanceOf[CONNECT_DEFAULT]
  
  @js.native
  sealed trait COUNT extends FunctionGroupType
  @scala.inline
  def COUNT: COUNT = "COUNT".asInstanceOf[COUNT]
  
  @js.native
  sealed trait CSV extends FileDataFormatType
  @scala.inline
  def CSV: CSV = "CSV".asInstanceOf[CSV]
  
  @js.native
  sealed trait CSV_C extends FileType
  @scala.inline
  def CSV_C: CSV_C = "CSV_C".asInstanceOf[CSV_C]
  
  @js.native
  sealed trait CSV_T extends FileType
  @scala.inline
  def CSV_T: CSV_T = "CSV_T".asInstanceOf[CSV_T]
  
  @js.native
  sealed trait Cleared extends ContextType
  @scala.inline
  def Cleared: Cleared = "Cleared".asInstanceOf[Cleared]
  
  @js.native
  sealed trait CurrentSelection extends StObject
  @scala.inline
  def CurrentSelection: CurrentSelection = "CurrentSelection".asInstanceOf[CurrentSelection]
  
  @js.native
  sealed trait CurrentSelections extends ContextType
  @scala.inline
  def CurrentSelections: CurrentSelections = "CurrentSelections".asInstanceOf[CurrentSelections]
  
  @js.native
  sealed trait D
    extends DimensionType
       with FieldAttributesType
       with MTType
       with NxCellStateType
       with NxSelectionCellType
       with SortIndicatorType
  @scala.inline
  def D: D = "D".asInstanceOf[D]
  
  @js.native
  sealed trait D1 extends ReductionModeType
  @scala.inline
  def D1: D1 = "D1".asInstanceOf[D1]
  
  @js.native
  sealed trait DATE extends FunctionGroupType
  @scala.inline
  def DATE: DATE = "DATE".asInstanceOf[DATE]
  
  @js.native
  sealed trait DIF extends FileDataFormatType
  @scala.inline
  def DIF: DIF = "DIF".asInstanceOf[DIF]
  
  @js.native
  sealed trait DatasetType extends SearchObjectsGroupType
  @scala.inline
  def DatasetType: DatasetType = "DatasetType".asInstanceOf[DatasetType]
  
  @js.native
  sealed trait DimensionList extends StObject
  @scala.inline
  def DimensionList: DimensionList = "DimensionList".asInstanceOf[DimensionList]
  
  @js.native
  sealed trait DisableQlikViewSelectButton extends CommandType
  @scala.inline
  def DisableQlikViewSelectButton: DisableQlikViewSelectButton = "DisableQlikViewSelectButton".asInstanceOf[DisableQlikViewSelectButton]
  
  @js.native
  sealed trait E
    extends BnfType
       with NxCellType
       with NxTreeNodeType
  @scala.inline
  def E: E = "E".asInstanceOf[E]
  
  @js.native
  sealed trait EXCEL_BIFF extends FileDataFormatType
  @scala.inline
  def EXCEL_BIFF: EXCEL_BIFF = "EXCEL_BIFF".asInstanceOf[EXCEL_BIFF]
  
  @js.native
  sealed trait EXCEL_OOXML extends FileDataFormatType
  @scala.inline
  def EXCEL_OOXML: EXCEL_OOXML = "EXCEL_OOXML".asInstanceOf[EXCEL_OOXML]
  
  @js.native
  sealed trait EXP extends FunctionGroupType
  @scala.inline
  def EXP: EXP = "EXP".asInstanceOf[EXP]
  
  @js.native
  sealed trait EXT extends FunctionGroupType
  @scala.inline
  def EXT: EXT = "EXT".asInstanceOf[EXT]
  
  @js.native
  sealed trait F extends FieldAttributesType
  @scala.inline
  def F: F = "F".asInstanceOf[F]
  
  @js.native
  sealed trait FILE
    extends FolderItemType
       with FunctionGroupType
  @scala.inline
  def FILE: FILE = "FILE".asInstanceOf[FILE]
  
  @js.native
  sealed trait FIN extends FunctionGroupType
  @scala.inline
  def FIN: FIN = "FIN".asInstanceOf[FIN]
  
  @js.native
  sealed trait FIX extends FileDataFormatType
  @scala.inline
  def FIX: FIX = "FIX".asInstanceOf[FIX]
  
  @js.native
  sealed trait FIXED extends DriveType
  @scala.inline
  def FIXED: FIXED = "FIXED".asInstanceOf[FIXED]
  
  @js.native
  sealed trait FOLDER extends FolderItemType
  @scala.inline
  def FOLDER: FOLDER = "FOLDER".asInstanceOf[FOLDER]
  
  @js.native
  sealed trait FRMT extends FunctionGroupType
  @scala.inline
  def FRMT: FRMT = "FRMT".asInstanceOf[FRMT]
  
  @js.native
  sealed trait G extends NxTreeNodeType
  @scala.inline
  def G: G = "G".asInstanceOf[G]
  
  @js.native
  sealed trait GEO extends FunctionGroupType
  @scala.inline
  def GEO: GEO = "GEO".asInstanceOf[GEO]
  
  @js.native
  sealed trait GenericObjectsType extends SearchObjectsGroupType
  @scala.inline
  def GenericObjectsType: GenericObjectsType = "GenericObjectsType".asInstanceOf[GenericObjectsType]
  
  @js.native
  sealed trait GetCustomCaption extends CommandType
  @scala.inline
  def GetCustomCaption: GetCustomCaption = "GetCustomCaption".asInstanceOf[GetCustomCaption]
  
  @js.native
  sealed trait H extends _NxGrpType
  @scala.inline
  def H: H = "H".asInstanceOf[H]
  
  @js.native
  sealed trait HTML extends FileDataFormatType
  @scala.inline
  def HTML: HTML = "HTML".asInstanceOf[HTML]
  
  @js.native
  sealed trait HaveStarField extends CommandType
  @scala.inline
  def HaveStarField: HaveStarField = "HaveStarField".asInstanceOf[HaveStarField]
  
  @js.native
  sealed trait I extends FieldAttributesType
  @scala.inline
  def I: I = "I".asInstanceOf[I]
  
  @js.native
  sealed trait IT_BREAK extends InteractionType
  @scala.inline
  def IT_BREAK: IT_BREAK = "IT_BREAK".asInstanceOf[IT_BREAK]
  
  @js.native
  sealed trait IT_END extends InteractionType
  @scala.inline
  def IT_END: IT_END = "IT_END".asInstanceOf[IT_END]
  
  @js.native
  sealed trait IT_MSGBOX extends InteractionType
  @scala.inline
  def IT_MSGBOX: IT_MSGBOX = "IT_MSGBOX".asInstanceOf[IT_MSGBOX]
  
  @js.native
  sealed trait IT_SCRIPTLINE extends InteractionType
  @scala.inline
  def IT_SCRIPTLINE: IT_SCRIPTLINE = "IT_SCRIPTLINE".asInstanceOf[IT_SCRIPTLINE]
  
  @js.native
  sealed trait IV extends FieldAttributesType
  @scala.inline
  def IV: IV = "IV".asInstanceOf[IV]
  
  @js.native
  sealed trait IsConnected extends CommandType
  @scala.inline
  def IsConnected: IsConnected = "IsConnected".asInstanceOf[IsConnected]
  
  @js.native
  sealed trait JSON extends FileDataFormatType
  @scala.inline
  def JSON: JSON = "JSON".asInstanceOf[JSON]
  
  @js.native
  sealed trait JsonRequest extends CommandType
  @scala.inline
  def JsonRequest: JsonRequest = "JsonRequest".asInstanceOf[JsonRequest]
  
  @js.native
  sealed trait K extends NxHypercubeMode
  @scala.inline
  def K: K = "K".asInstanceOf[K]
  
  @js.native
  sealed trait KML extends FileDataFormatType
  @scala.inline
  def KML: KML = "KML".asInstanceOf[KML]
  
  @js.native
  sealed trait L
    extends NxCellStateType
       with NxSelectionCellType
  @scala.inline
  def L: L = "L".asInstanceOf[L]
  
  @js.native
  sealed trait LOG extends FunctionGroupType
  @scala.inline
  def LOG: LOG = "LOG".asInstanceOf[LOG]
  
  @js.native
  sealed trait LOG_ON_CURRENT_USER extends LogonType
  @scala.inline
  def LOG_ON_CURRENT_USER: LOG_ON_CURRENT_USER = "LOG_ON_CURRENT_USER".asInstanceOf[LOG_ON_CURRENT_USER]
  
  @js.native
  sealed trait LOG_ON_SERVICE_USER extends LogonType
  @scala.inline
  def LOG_ON_SERVICE_USER: LOG_ON_SERVICE_USER = "LOG_ON_SERVICE_USER".asInstanceOf[LOG_ON_SERVICE_USER]
  
  @js.native
  sealed trait LockedFieldsOnly extends ContextType
  @scala.inline
  def LockedFieldsOnly: LockedFieldsOnly = "LockedFieldsOnly".asInstanceOf[LockedFieldsOnly]
  
  @js.native
  sealed trait M extends FieldAttributesType
  @scala.inline
  def M: M = "M".asInstanceOf[M]
  
  @js.native
  sealed trait MAPP extends FunctionGroupType
  @scala.inline
  def MAPP: MAPP = "MAPP".asInstanceOf[MAPP]
  
  @js.native
  sealed trait MATH extends FunctionGroupType
  @scala.inline
  def MATH: MATH = "MATH".asInstanceOf[MATH]
  
  @js.native
  sealed trait MeasureList extends StObject
  @scala.inline
  def MeasureList: MeasureList = "MeasureList".asInstanceOf[MeasureList]
  
  @js.native
  sealed trait N
    extends DimensionType
       with MTType
       with NxCellType
       with NxTreeNodeType
       with ReductionModeType
       with SortIndicatorType
       with _NxGrpType
  @scala.inline
  def N: N = "N".asInstanceOf[N]
  
  @js.native
  sealed trait NETWORK extends DriveType
  @scala.inline
  def NETWORK: NETWORK = "NETWORK".asInstanceOf[NETWORK]
  
  @js.native
  sealed trait NONE extends FunctionGroupType
  @scala.inline
  def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @js.native
  sealed trait NORMAL extends FieldSelectionModeType
  @scala.inline
  def NORMAL: NORMAL = "NORMAL".asInstanceOf[NORMAL]
  
  @js.native
  sealed trait NOT extends FieldSelectionModeType
  @scala.inline
  def NOT: NOT = "NOT".asInstanceOf[NOT]
  
  @js.native
  sealed trait NOT_KEY extends TableRecordKeyType
  @scala.inline
  def NOT_KEY: NOT_KEY = "NOT_KEY".asInstanceOf[NOT_KEY]
  
  @js.native
  sealed trait NULL extends FunctionGroupType
  @scala.inline
  def NULL: NULL = "NULL".asInstanceOf[NULL]
  
  @js.native
  sealed trait NUM extends FunctionGroupType
  @scala.inline
  def NUM: NUM = "NUM".asInstanceOf[NUM]
  
  @js.native
  sealed trait NUMI extends FunctionGroupType
  @scala.inline
  def NUMI: NUMI = "NUMI".asInstanceOf[NUMI]
  
  @js.native
  sealed trait NX_FREQUENCY_NONE extends FrequencyModeType
  @scala.inline
  def NX_FREQUENCY_NONE: NX_FREQUENCY_NONE = "NX_FREQUENCY_NONE".asInstanceOf[NX_FREQUENCY_NONE]
  
  @js.native
  sealed trait NX_FREQUENCY_PERCENT extends FrequencyModeType
  @scala.inline
  def NX_FREQUENCY_PERCENT: NX_FREQUENCY_PERCENT = "NX_FREQUENCY_PERCENT".asInstanceOf[NX_FREQUENCY_PERCENT]
  
  @js.native
  sealed trait NX_FREQUENCY_RELATIVE extends FrequencyModeType
  @scala.inline
  def NX_FREQUENCY_RELATIVE: NX_FREQUENCY_RELATIVE = "NX_FREQUENCY_RELATIVE".asInstanceOf[NX_FREQUENCY_RELATIVE]
  
  @js.native
  sealed trait NX_FREQUENCY_VALUE extends FrequencyModeType
  @scala.inline
  def NX_FREQUENCY_VALUE: NX_FREQUENCY_VALUE = "NX_FREQUENCY_VALUE".asInstanceOf[NX_FREQUENCY_VALUE]
  
  @js.native
  sealed trait O extends NxCellStateType
  @scala.inline
  def O: O = "O".asInstanceOf[O]
  
  @js.native
  sealed trait OOXML extends FileType
  @scala.inline
  def OOXML: OOXML = "OOXML".asInstanceOf[OOXML]
  
  @js.native
  sealed trait OTHER extends FolderItemType
  @scala.inline
  def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  
  @js.native
  sealed trait OTHER_ABS_ACC_TARGET extends OtherModeType
  @scala.inline
  def OTHER_ABS_ACC_TARGET: OTHER_ABS_ACC_TARGET = "OTHER_ABS_ACC_TARGET".asInstanceOf[OTHER_ABS_ACC_TARGET]
  
  @js.native
  sealed trait OTHER_ABS_LIMITED extends OtherModeType
  @scala.inline
  def OTHER_ABS_LIMITED: OTHER_ABS_LIMITED = "OTHER_ABS_LIMITED".asInstanceOf[OTHER_ABS_LIMITED]
  
  @js.native
  sealed trait OTHER_COUNTED extends OtherModeType
  @scala.inline
  def OTHER_COUNTED: OTHER_COUNTED = "OTHER_COUNTED".asInstanceOf[OTHER_COUNTED]
  
  @js.native
  sealed trait OTHER_GE_LIMIT extends OtherLimitModeType
  @scala.inline
  def OTHER_GE_LIMIT: OTHER_GE_LIMIT = "OTHER_GE_LIMIT".asInstanceOf[OTHER_GE_LIMIT]
  
  @js.native
  sealed trait OTHER_GT_LIMIT extends OtherLimitModeType
  @scala.inline
  def OTHER_GT_LIMIT: OTHER_GT_LIMIT = "OTHER_GT_LIMIT".asInstanceOf[OTHER_GT_LIMIT]
  
  @js.native
  sealed trait OTHER_LE_LIMIT extends OtherLimitModeType
  @scala.inline
  def OTHER_LE_LIMIT: OTHER_LE_LIMIT = "OTHER_LE_LIMIT".asInstanceOf[OTHER_LE_LIMIT]
  
  @js.native
  sealed trait OTHER_LT_LIMIT extends OtherLimitModeType
  @scala.inline
  def OTHER_LT_LIMIT: OTHER_LT_LIMIT = "OTHER_LT_LIMIT".asInstanceOf[OTHER_LT_LIMIT]
  
  @js.native
  sealed trait OTHER_OFF extends OtherModeType
  @scala.inline
  def OTHER_OFF: OTHER_OFF = "OTHER_OFF".asInstanceOf[OTHER_OFF]
  
  @js.native
  sealed trait OTHER_REL_ACC_TARGET extends OtherModeType
  @scala.inline
  def OTHER_REL_ACC_TARGET: OTHER_REL_ACC_TARGET = "OTHER_REL_ACC_TARGET".asInstanceOf[OTHER_REL_ACC_TARGET]
  
  @js.native
  sealed trait OTHER_REL_LIMITED extends OtherModeType
  @scala.inline
  def OTHER_REL_LIMITED: OTHER_REL_LIMITED = "OTHER_REL_LIMITED".asInstanceOf[OTHER_REL_LIMITED]
  
  @js.native
  sealed trait OTHER_SORT_ASCENDING extends OtherSortModeType
  @scala.inline
  def OTHER_SORT_ASCENDING: OTHER_SORT_ASCENDING = "OTHER_SORT_ASCENDING".asInstanceOf[OTHER_SORT_ASCENDING]
  
  @js.native
  sealed trait OTHER_SORT_DEFAULT extends OtherSortModeType
  @scala.inline
  def OTHER_SORT_DEFAULT: OTHER_SORT_DEFAULT = "OTHER_SORT_DEFAULT".asInstanceOf[OTHER_SORT_DEFAULT]
  
  @js.native
  sealed trait OTHER_SORT_DESCENDING extends OtherSortModeType
  @scala.inline
  def OTHER_SORT_DESCENDING: OTHER_SORT_DESCENDING = "OTHER_SORT_DESCENDING".asInstanceOf[OTHER_SORT_DESCENDING]
  
  @js.native
  sealed trait P
    extends ExportStateType
       with NxCellType
       with NxHypercubeMode
       with NxTreeNodeType
  @scala.inline
  def P: P = "P".asInstanceOf[P]
  
  @js.native
  sealed trait PERFECT_KEY extends TableRecordKeyType
  @scala.inline
  def PERFECT_KEY: PERFECT_KEY = "PERFECT_KEY".asInstanceOf[PERFECT_KEY]
  
  @js.native
  sealed trait PRIMARY_KEY extends TableRecordKeyType
  @scala.inline
  def PRIMARY_KEY: PRIMARY_KEY = "PRIMARY_KEY".asInstanceOf[PRIMARY_KEY]
  
  @js.native
  sealed trait QVX extends FileDataFormatType
  @scala.inline
  def QVX: QVX = "QVX".asInstanceOf[QVX]
  
  @js.native
  sealed trait R
    extends FieldAttributesType
       with MTType
       with NxCellType
       with NxTreeNodeType
  @scala.inline
  def R: R = "R".asInstanceOf[R]
  
  @js.native
  sealed trait RAM extends DriveType
  @scala.inline
  def RAM: RAM = "RAM".asInstanceOf[RAM]
  
  @js.native
  sealed trait RCRD extends FunctionGroupType
  @scala.inline
  def RCRD: RCRD = "RCRD".asInstanceOf[RCRD]
  
  @js.native
  sealed trait REMOVABLE extends DriveType
  @scala.inline
  def REMOVABLE: REMOVABLE = "REMOVABLE".asInstanceOf[REMOVABLE]
  
  @js.native
  sealed trait RNG extends FunctionGroupType
  @scala.inline
  def RNG: RNG = "RNG".asInstanceOf[RNG]
  
  @js.native
  sealed trait RNK extends FunctionGroupType
  @scala.inline
  def RNK: RNK = "RNK".asInstanceOf[RNK]
  
  @js.native
  sealed trait Remove extends NxPatchOpType
  @scala.inline
  def Remove: Remove = "Remove".asInstanceOf[Remove]
  
  @js.native
  sealed trait Replace extends NxPatchOpType
  @scala.inline
  def Replace: Replace = "Replace".asInstanceOf[Replace]
  
  @js.native
  sealed trait S
    extends BnfType
       with NxCellStateType
       with NxHypercubeMode
       with ReductionModeType
  @scala.inline
  def S: S = "S".asInstanceOf[S]
  
  @js.native
  sealed trait ST extends ReductionModeType
  @scala.inline
  def ST: ST = "ST".asInstanceOf[ST]
  
  @js.native
  sealed trait STR extends FunctionGroupType
  @scala.inline
  def STR: STR = "STR".asInstanceOf[STR]
  
  @js.native
  sealed trait SYS extends FunctionGroupType
  @scala.inline
  def SYS: SYS = "SYS".asInstanceOf[SYS]
  
  @js.native
  sealed trait SlashqListObjectDef extends StObject
  @scala.inline
  def SlashqListObjectDef: SlashqListObjectDef = "/qListObjectDef".asInstanceOf[SlashqListObjectDef]
  
  @js.native
  sealed trait T
    extends DimensionType
       with FieldAttributesType
       with NxCellType
       with NxHypercubeMode
       with NxSelectionCellType
       with NxTreeNodeType
  @scala.inline
  def T: T = "T".asInstanceOf[T]
  
  @js.native
  sealed trait TBL extends FunctionGroupType
  @scala.inline
  def TBL: TBL = "TBL".asInstanceOf[TBL]
  
  @js.native
  sealed trait TOTAL_EXPR extends TotalModeType
  @scala.inline
  def TOTAL_EXPR: TOTAL_EXPR = "TOTAL_EXPR".asInstanceOf[TOTAL_EXPR]
  
  @js.native
  sealed trait TOTAL_OFF extends TotalModeType
  @scala.inline
  def TOTAL_OFF: TOTAL_OFF = "TOTAL_OFF".asInstanceOf[TOTAL_OFF]
  
  @js.native
  sealed trait TRIG extends FunctionGroupType
  @scala.inline
  def TRIG: TRIG = "TRIG".asInstanceOf[TRIG]
  
  @js.native
  sealed trait TS extends FieldAttributesType
  @scala.inline
  def TS: TS = "TS".asInstanceOf[TS]
  
  @js.native
  sealed trait U
    extends FieldAttributesType
       with FunctionGroupType
       with NxCellType
       with NxTreeNodeType
  @scala.inline
  def U: U = "U".asInstanceOf[U]
  
  @js.native
  sealed trait UNKNOWN_TYPE extends DriveType
  @scala.inline
  def UNKNOWN_TYPE: UNKNOWN_TYPE = "UNKNOWN_TYPE".asInstanceOf[UNKNOWN_TYPE]
  
  @js.native
  sealed trait Utf16 extends StObject
  @scala.inline
  def Utf16: Utf16 = "Utf16".asInstanceOf[Utf16]
  
  @js.native
  sealed trait Utf8 extends StObject
  @scala.inline
  def Utf8: Utf8 = "Utf8".asInstanceOf[Utf8]
  
  @js.native
  sealed trait V
    extends NxCellType
       with NxTreeNodeType
  @scala.inline
  def V: V = "V".asInstanceOf[V]
  
  @js.native
  sealed trait X extends NxCellStateType
  @scala.inline
  def X: X = "X".asInstanceOf[X]
  
  @js.native
  sealed trait XL extends NxCellStateType
  @scala.inline
  def XL: XL = "XL".asInstanceOf[XL]
  
  @js.native
  sealed trait XML extends FileDataFormatType
  @scala.inline
  def XML: XML = "XML".asInstanceOf[XML]
  
  @js.native
  sealed trait XS extends NxCellStateType
  @scala.inline
  def XS: XS = "XS".asInstanceOf[XS]
  
  @js.native
  sealed trait bookmark extends StObject
  @scala.inline
  def bookmark: bookmark = "bookmark".asInstanceOf[bookmark]
  
  @js.native
  sealed trait dimension extends StObject
  @scala.inline
  def dimension: dimension = "dimension".asInstanceOf[dimension]
  
  @js.native
  sealed trait measure extends StObject
  @scala.inline
  def measure: measure = "measure".asInstanceOf[measure]
}
