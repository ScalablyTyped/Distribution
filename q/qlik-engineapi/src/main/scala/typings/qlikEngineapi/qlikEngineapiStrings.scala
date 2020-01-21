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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object qlikEngineapiStrings {
  @js.native
  sealed trait `-1` extends TypeSortDirection
  
  @js.native
  sealed trait `0`
    extends ErrorDataCodeType
       with FieldDefExType
       with SearchObjectsItemType
       with TypeSortDirection
  
  @js.native
  sealed trait `1`
    extends ErrorDataCodeType
       with FieldDefExType
       with SearchObjectsItemType
       with TypeSortDirection
  
  @js.native
  sealed trait `2`
    extends ErrorDataCodeType
       with FieldDefExType
  
  @js.native
  sealed trait A
    extends ExportStateType
       with FieldAttributesType
       with NxCellStateType
       with SortIndicatorType
  
  @js.native
  sealed trait AGGR extends FunctionGroupType
  
  @js.native
  sealed trait ALL extends FunctionGroupType
  
  @js.native
  sealed trait AND extends FieldSelectionModeType
  
  @js.native
  sealed trait ANY_KEY extends TableRecordKeyType
  
  @js.native
  sealed trait Add extends NxPatchOpType
  
  @js.native
  sealed trait BookmarkList extends js.Object
  
  @js.native
  sealed trait C
    extends ReductionModeType
       with _NxGrpType
  
  @js.native
  sealed trait CD_ROM extends DriveType
  
  @js.native
  sealed trait CLR extends FunctionGroupType
  
  @js.native
  sealed trait CND extends FunctionGroupType
  
  @js.native
  sealed trait CONNECT_32 extends MachineModeType
  
  @js.native
  sealed trait CONNECT_64 extends MachineModeType
  
  @js.native
  sealed trait CONNECT_DEFAULT extends MachineModeType
  
  @js.native
  sealed trait COUNT extends FunctionGroupType
  
  @js.native
  sealed trait CSV extends FileDataFormatType
  
  @js.native
  sealed trait CSV_C extends FileType
  
  @js.native
  sealed trait CSV_T extends FileType
  
  @js.native
  sealed trait Cleared extends ContextType
  
  @js.native
  sealed trait CurrentSelection extends js.Object
  
  @js.native
  sealed trait CurrentSelections extends ContextType
  
  @js.native
  sealed trait D
    extends DimensionType
       with FieldAttributesType
       with MTType
       with NxCellStateType
       with NxSelectionCellType
       with SortIndicatorType
  
  @js.native
  sealed trait D1 extends ReductionModeType
  
  @js.native
  sealed trait DATE extends FunctionGroupType
  
  @js.native
  sealed trait DIF extends FileDataFormatType
  
  @js.native
  sealed trait DatasetType extends SearchObjectsGroupType
  
  @js.native
  sealed trait DimensionList extends js.Object
  
  @js.native
  sealed trait DisableQlikViewSelectButton extends CommandType
  
  @js.native
  sealed trait E
    extends BnfType
       with NxCellType
       with NxTreeNodeType
  
  @js.native
  sealed trait EXCEL_BIFF extends FileDataFormatType
  
  @js.native
  sealed trait EXCEL_OOXML extends FileDataFormatType
  
  @js.native
  sealed trait EXP extends FunctionGroupType
  
  @js.native
  sealed trait EXT extends FunctionGroupType
  
  @js.native
  sealed trait F extends FieldAttributesType
  
  @js.native
  sealed trait FILE
    extends FolderItemType
       with FunctionGroupType
  
  @js.native
  sealed trait FIN extends FunctionGroupType
  
  @js.native
  sealed trait FIX extends FileDataFormatType
  
  @js.native
  sealed trait FIXED extends DriveType
  
  @js.native
  sealed trait FOLDER extends FolderItemType
  
  @js.native
  sealed trait FRMT extends FunctionGroupType
  
  @js.native
  sealed trait G extends NxTreeNodeType
  
  @js.native
  sealed trait GEO extends FunctionGroupType
  
  @js.native
  sealed trait GenericObjectsType extends SearchObjectsGroupType
  
  @js.native
  sealed trait GetCustomCaption extends CommandType
  
  @js.native
  sealed trait H extends _NxGrpType
  
  @js.native
  sealed trait HTML extends FileDataFormatType
  
  @js.native
  sealed trait HaveStarField extends CommandType
  
  @js.native
  sealed trait I extends FieldAttributesType
  
  @js.native
  sealed trait IT_BREAK extends InteractionType
  
  @js.native
  sealed trait IT_END extends InteractionType
  
  @js.native
  sealed trait IT_MSGBOX extends InteractionType
  
  @js.native
  sealed trait IT_SCRIPTLINE extends InteractionType
  
  @js.native
  sealed trait IV extends FieldAttributesType
  
  @js.native
  sealed trait IsConnected extends CommandType
  
  @js.native
  sealed trait JSON extends FileDataFormatType
  
  @js.native
  sealed trait JsonRequest extends CommandType
  
  @js.native
  sealed trait K extends NxHypercubeMode
  
  @js.native
  sealed trait KML extends FileDataFormatType
  
  @js.native
  sealed trait L
    extends NxCellStateType
       with NxSelectionCellType
  
  @js.native
  sealed trait LOG extends FunctionGroupType
  
  @js.native
  sealed trait LOG_ON_CURRENT_USER extends LogonType
  
  @js.native
  sealed trait LOG_ON_SERVICE_USER extends LogonType
  
  @js.native
  sealed trait LockedFieldsOnly extends ContextType
  
  @js.native
  sealed trait M extends FieldAttributesType
  
  @js.native
  sealed trait MAPP extends FunctionGroupType
  
  @js.native
  sealed trait MATH extends FunctionGroupType
  
  @js.native
  sealed trait MeasureList extends js.Object
  
  @js.native
  sealed trait N
    extends DimensionType
       with MTType
       with NxCellType
       with NxTreeNodeType
       with ReductionModeType
       with SortIndicatorType
       with _NxGrpType
  
  @js.native
  sealed trait NETWORK extends DriveType
  
  @js.native
  sealed trait NONE extends FunctionGroupType
  
  @js.native
  sealed trait NORMAL extends FieldSelectionModeType
  
  @js.native
  sealed trait NOT extends FieldSelectionModeType
  
  @js.native
  sealed trait NOT_KEY extends TableRecordKeyType
  
  @js.native
  sealed trait NULL extends FunctionGroupType
  
  @js.native
  sealed trait NUM extends FunctionGroupType
  
  @js.native
  sealed trait NUMI extends FunctionGroupType
  
  @js.native
  sealed trait NX_FREQUENCY_NONE extends FrequencyModeType
  
  @js.native
  sealed trait NX_FREQUENCY_PERCENT extends FrequencyModeType
  
  @js.native
  sealed trait NX_FREQUENCY_RELATIVE extends FrequencyModeType
  
  @js.native
  sealed trait NX_FREQUENCY_VALUE extends FrequencyModeType
  
  @js.native
  sealed trait O extends NxCellStateType
  
  @js.native
  sealed trait OOXML extends FileType
  
  @js.native
  sealed trait OTHER extends FolderItemType
  
  @js.native
  sealed trait OTHER_ABS_ACC_TARGET extends OtherModeType
  
  @js.native
  sealed trait OTHER_ABS_LIMITED extends OtherModeType
  
  @js.native
  sealed trait OTHER_COUNTED extends OtherModeType
  
  @js.native
  sealed trait OTHER_GE_LIMIT extends OtherLimitModeType
  
  @js.native
  sealed trait OTHER_GT_LIMIT extends OtherLimitModeType
  
  @js.native
  sealed trait OTHER_LE_LIMIT extends OtherLimitModeType
  
  @js.native
  sealed trait OTHER_LT_LIMIT extends OtherLimitModeType
  
  @js.native
  sealed trait OTHER_OFF extends OtherModeType
  
  @js.native
  sealed trait OTHER_REL_ACC_TARGET extends OtherModeType
  
  @js.native
  sealed trait OTHER_REL_LIMITED extends OtherModeType
  
  @js.native
  sealed trait OTHER_SORT_ASCENDING extends OtherSortModeType
  
  @js.native
  sealed trait OTHER_SORT_DEFAULT extends OtherSortModeType
  
  @js.native
  sealed trait OTHER_SORT_DESCENDING extends OtherSortModeType
  
  @js.native
  sealed trait P
    extends ExportStateType
       with NxCellType
       with NxHypercubeMode
       with NxTreeNodeType
  
  @js.native
  sealed trait PERFECT_KEY extends TableRecordKeyType
  
  @js.native
  sealed trait PRIMARY_KEY extends TableRecordKeyType
  
  @js.native
  sealed trait QVX extends FileDataFormatType
  
  @js.native
  sealed trait R
    extends FieldAttributesType
       with MTType
       with NxCellType
       with NxTreeNodeType
  
  @js.native
  sealed trait RAM extends DriveType
  
  @js.native
  sealed trait RCRD extends FunctionGroupType
  
  @js.native
  sealed trait REMOVABLE extends DriveType
  
  @js.native
  sealed trait RNG extends FunctionGroupType
  
  @js.native
  sealed trait RNK extends FunctionGroupType
  
  @js.native
  sealed trait Remove extends NxPatchOpType
  
  @js.native
  sealed trait Replace extends NxPatchOpType
  
  @js.native
  sealed trait S
    extends BnfType
       with NxCellStateType
       with NxHypercubeMode
       with ReductionModeType
  
  @js.native
  sealed trait ST extends ReductionModeType
  
  @js.native
  sealed trait STR extends FunctionGroupType
  
  @js.native
  sealed trait SYS extends FunctionGroupType
  
  @js.native
  sealed trait SlashqListObjectDef extends js.Object
  
  @js.native
  sealed trait T
    extends DimensionType
       with FieldAttributesType
       with NxCellType
       with NxHypercubeMode
       with NxSelectionCellType
       with NxTreeNodeType
  
  @js.native
  sealed trait TBL extends FunctionGroupType
  
  @js.native
  sealed trait TOTAL_EXPR extends TotalModeType
  
  @js.native
  sealed trait TOTAL_OFF extends TotalModeType
  
  @js.native
  sealed trait TRIG extends FunctionGroupType
  
  @js.native
  sealed trait TS extends FieldAttributesType
  
  @js.native
  sealed trait U
    extends FieldAttributesType
       with FunctionGroupType
       with NxCellType
       with NxTreeNodeType
  
  @js.native
  sealed trait UNKNOWN_TYPE extends DriveType
  
  @js.native
  sealed trait Utf16 extends js.Object
  
  @js.native
  sealed trait Utf8 extends js.Object
  
  @js.native
  sealed trait V
    extends NxCellType
       with NxTreeNodeType
  
  @js.native
  sealed trait X extends NxCellStateType
  
  @js.native
  sealed trait XL extends NxCellStateType
  
  @js.native
  sealed trait XML extends FileDataFormatType
  
  @js.native
  sealed trait XS extends NxCellStateType
  
  @js.native
  sealed trait bookmark extends js.Object
  
  @js.native
  sealed trait dimension extends js.Object
  
  @js.native
  sealed trait measure extends js.Object
  
  @scala.inline
  def `-1`: `-1` = "-1".asInstanceOf[`-1`]
  @scala.inline
  def `0`: `0` = "0".asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = "1".asInstanceOf[`1`]
  @scala.inline
  def `2`: `2` = "2".asInstanceOf[`2`]
  @scala.inline
  def A: A = "A".asInstanceOf[A]
  @scala.inline
  def AGGR: AGGR = "AGGR".asInstanceOf[AGGR]
  @scala.inline
  def ALL: ALL = "ALL".asInstanceOf[ALL]
  @scala.inline
  def AND: AND = "AND".asInstanceOf[AND]
  @scala.inline
  def ANY_KEY: ANY_KEY = "ANY_KEY".asInstanceOf[ANY_KEY]
  @scala.inline
  def Add: Add = "Add".asInstanceOf[Add]
  @scala.inline
  def BookmarkList: BookmarkList = "BookmarkList".asInstanceOf[BookmarkList]
  @scala.inline
  def C: C = "C".asInstanceOf[C]
  @scala.inline
  def CD_ROM: CD_ROM = "CD_ROM".asInstanceOf[CD_ROM]
  @scala.inline
  def CLR: CLR = "CLR".asInstanceOf[CLR]
  @scala.inline
  def CND: CND = "CND".asInstanceOf[CND]
  @scala.inline
  def CONNECT_32: CONNECT_32 = "CONNECT_32".asInstanceOf[CONNECT_32]
  @scala.inline
  def CONNECT_64: CONNECT_64 = "CONNECT_64".asInstanceOf[CONNECT_64]
  @scala.inline
  def CONNECT_DEFAULT: CONNECT_DEFAULT = "CONNECT_DEFAULT".asInstanceOf[CONNECT_DEFAULT]
  @scala.inline
  def COUNT: COUNT = "COUNT".asInstanceOf[COUNT]
  @scala.inline
  def CSV: CSV = "CSV".asInstanceOf[CSV]
  @scala.inline
  def CSV_C: CSV_C = "CSV_C".asInstanceOf[CSV_C]
  @scala.inline
  def CSV_T: CSV_T = "CSV_T".asInstanceOf[CSV_T]
  @scala.inline
  def Cleared: Cleared = "Cleared".asInstanceOf[Cleared]
  @scala.inline
  def CurrentSelection: CurrentSelection = "CurrentSelection".asInstanceOf[CurrentSelection]
  @scala.inline
  def CurrentSelections: CurrentSelections = "CurrentSelections".asInstanceOf[CurrentSelections]
  @scala.inline
  def D: D = "D".asInstanceOf[D]
  @scala.inline
  def D1: D1 = "D1".asInstanceOf[D1]
  @scala.inline
  def DATE: DATE = "DATE".asInstanceOf[DATE]
  @scala.inline
  def DIF: DIF = "DIF".asInstanceOf[DIF]
  @scala.inline
  def DatasetType: DatasetType = "DatasetType".asInstanceOf[DatasetType]
  @scala.inline
  def DimensionList: DimensionList = "DimensionList".asInstanceOf[DimensionList]
  @scala.inline
  def DisableQlikViewSelectButton: DisableQlikViewSelectButton = "DisableQlikViewSelectButton".asInstanceOf[DisableQlikViewSelectButton]
  @scala.inline
  def E: E = "E".asInstanceOf[E]
  @scala.inline
  def EXCEL_BIFF: EXCEL_BIFF = "EXCEL_BIFF".asInstanceOf[EXCEL_BIFF]
  @scala.inline
  def EXCEL_OOXML: EXCEL_OOXML = "EXCEL_OOXML".asInstanceOf[EXCEL_OOXML]
  @scala.inline
  def EXP: EXP = "EXP".asInstanceOf[EXP]
  @scala.inline
  def EXT: EXT = "EXT".asInstanceOf[EXT]
  @scala.inline
  def F: F = "F".asInstanceOf[F]
  @scala.inline
  def FILE: FILE = "FILE".asInstanceOf[FILE]
  @scala.inline
  def FIN: FIN = "FIN".asInstanceOf[FIN]
  @scala.inline
  def FIX: FIX = "FIX".asInstanceOf[FIX]
  @scala.inline
  def FIXED: FIXED = "FIXED".asInstanceOf[FIXED]
  @scala.inline
  def FOLDER: FOLDER = "FOLDER".asInstanceOf[FOLDER]
  @scala.inline
  def FRMT: FRMT = "FRMT".asInstanceOf[FRMT]
  @scala.inline
  def G: G = "G".asInstanceOf[G]
  @scala.inline
  def GEO: GEO = "GEO".asInstanceOf[GEO]
  @scala.inline
  def GenericObjectsType: GenericObjectsType = "GenericObjectsType".asInstanceOf[GenericObjectsType]
  @scala.inline
  def GetCustomCaption: GetCustomCaption = "GetCustomCaption".asInstanceOf[GetCustomCaption]
  @scala.inline
  def H: H = "H".asInstanceOf[H]
  @scala.inline
  def HTML: HTML = "HTML".asInstanceOf[HTML]
  @scala.inline
  def HaveStarField: HaveStarField = "HaveStarField".asInstanceOf[HaveStarField]
  @scala.inline
  def I: I = "I".asInstanceOf[I]
  @scala.inline
  def IT_BREAK: IT_BREAK = "IT_BREAK".asInstanceOf[IT_BREAK]
  @scala.inline
  def IT_END: IT_END = "IT_END".asInstanceOf[IT_END]
  @scala.inline
  def IT_MSGBOX: IT_MSGBOX = "IT_MSGBOX".asInstanceOf[IT_MSGBOX]
  @scala.inline
  def IT_SCRIPTLINE: IT_SCRIPTLINE = "IT_SCRIPTLINE".asInstanceOf[IT_SCRIPTLINE]
  @scala.inline
  def IV: IV = "IV".asInstanceOf[IV]
  @scala.inline
  def IsConnected: IsConnected = "IsConnected".asInstanceOf[IsConnected]
  @scala.inline
  def JSON: JSON = "JSON".asInstanceOf[JSON]
  @scala.inline
  def JsonRequest: JsonRequest = "JsonRequest".asInstanceOf[JsonRequest]
  @scala.inline
  def K: K = "K".asInstanceOf[K]
  @scala.inline
  def KML: KML = "KML".asInstanceOf[KML]
  @scala.inline
  def L: L = "L".asInstanceOf[L]
  @scala.inline
  def LOG: LOG = "LOG".asInstanceOf[LOG]
  @scala.inline
  def LOG_ON_CURRENT_USER: LOG_ON_CURRENT_USER = "LOG_ON_CURRENT_USER".asInstanceOf[LOG_ON_CURRENT_USER]
  @scala.inline
  def LOG_ON_SERVICE_USER: LOG_ON_SERVICE_USER = "LOG_ON_SERVICE_USER".asInstanceOf[LOG_ON_SERVICE_USER]
  @scala.inline
  def LockedFieldsOnly: LockedFieldsOnly = "LockedFieldsOnly".asInstanceOf[LockedFieldsOnly]
  @scala.inline
  def M: M = "M".asInstanceOf[M]
  @scala.inline
  def MAPP: MAPP = "MAPP".asInstanceOf[MAPP]
  @scala.inline
  def MATH: MATH = "MATH".asInstanceOf[MATH]
  @scala.inline
  def MeasureList: MeasureList = "MeasureList".asInstanceOf[MeasureList]
  @scala.inline
  def N: N = "N".asInstanceOf[N]
  @scala.inline
  def NETWORK: NETWORK = "NETWORK".asInstanceOf[NETWORK]
  @scala.inline
  def NONE: NONE = "NONE".asInstanceOf[NONE]
  @scala.inline
  def NORMAL: NORMAL = "NORMAL".asInstanceOf[NORMAL]
  @scala.inline
  def NOT: NOT = "NOT".asInstanceOf[NOT]
  @scala.inline
  def NOT_KEY: NOT_KEY = "NOT_KEY".asInstanceOf[NOT_KEY]
  @scala.inline
  def NULL: NULL = "NULL".asInstanceOf[NULL]
  @scala.inline
  def NUM: NUM = "NUM".asInstanceOf[NUM]
  @scala.inline
  def NUMI: NUMI = "NUMI".asInstanceOf[NUMI]
  @scala.inline
  def NX_FREQUENCY_NONE: NX_FREQUENCY_NONE = "NX_FREQUENCY_NONE".asInstanceOf[NX_FREQUENCY_NONE]
  @scala.inline
  def NX_FREQUENCY_PERCENT: NX_FREQUENCY_PERCENT = "NX_FREQUENCY_PERCENT".asInstanceOf[NX_FREQUENCY_PERCENT]
  @scala.inline
  def NX_FREQUENCY_RELATIVE: NX_FREQUENCY_RELATIVE = "NX_FREQUENCY_RELATIVE".asInstanceOf[NX_FREQUENCY_RELATIVE]
  @scala.inline
  def NX_FREQUENCY_VALUE: NX_FREQUENCY_VALUE = "NX_FREQUENCY_VALUE".asInstanceOf[NX_FREQUENCY_VALUE]
  @scala.inline
  def O: O = "O".asInstanceOf[O]
  @scala.inline
  def OOXML: OOXML = "OOXML".asInstanceOf[OOXML]
  @scala.inline
  def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  @scala.inline
  def OTHER_ABS_ACC_TARGET: OTHER_ABS_ACC_TARGET = "OTHER_ABS_ACC_TARGET".asInstanceOf[OTHER_ABS_ACC_TARGET]
  @scala.inline
  def OTHER_ABS_LIMITED: OTHER_ABS_LIMITED = "OTHER_ABS_LIMITED".asInstanceOf[OTHER_ABS_LIMITED]
  @scala.inline
  def OTHER_COUNTED: OTHER_COUNTED = "OTHER_COUNTED".asInstanceOf[OTHER_COUNTED]
  @scala.inline
  def OTHER_GE_LIMIT: OTHER_GE_LIMIT = "OTHER_GE_LIMIT".asInstanceOf[OTHER_GE_LIMIT]
  @scala.inline
  def OTHER_GT_LIMIT: OTHER_GT_LIMIT = "OTHER_GT_LIMIT".asInstanceOf[OTHER_GT_LIMIT]
  @scala.inline
  def OTHER_LE_LIMIT: OTHER_LE_LIMIT = "OTHER_LE_LIMIT".asInstanceOf[OTHER_LE_LIMIT]
  @scala.inline
  def OTHER_LT_LIMIT: OTHER_LT_LIMIT = "OTHER_LT_LIMIT".asInstanceOf[OTHER_LT_LIMIT]
  @scala.inline
  def OTHER_OFF: OTHER_OFF = "OTHER_OFF".asInstanceOf[OTHER_OFF]
  @scala.inline
  def OTHER_REL_ACC_TARGET: OTHER_REL_ACC_TARGET = "OTHER_REL_ACC_TARGET".asInstanceOf[OTHER_REL_ACC_TARGET]
  @scala.inline
  def OTHER_REL_LIMITED: OTHER_REL_LIMITED = "OTHER_REL_LIMITED".asInstanceOf[OTHER_REL_LIMITED]
  @scala.inline
  def OTHER_SORT_ASCENDING: OTHER_SORT_ASCENDING = "OTHER_SORT_ASCENDING".asInstanceOf[OTHER_SORT_ASCENDING]
  @scala.inline
  def OTHER_SORT_DEFAULT: OTHER_SORT_DEFAULT = "OTHER_SORT_DEFAULT".asInstanceOf[OTHER_SORT_DEFAULT]
  @scala.inline
  def OTHER_SORT_DESCENDING: OTHER_SORT_DESCENDING = "OTHER_SORT_DESCENDING".asInstanceOf[OTHER_SORT_DESCENDING]
  @scala.inline
  def P: P = "P".asInstanceOf[P]
  @scala.inline
  def PERFECT_KEY: PERFECT_KEY = "PERFECT_KEY".asInstanceOf[PERFECT_KEY]
  @scala.inline
  def PRIMARY_KEY: PRIMARY_KEY = "PRIMARY_KEY".asInstanceOf[PRIMARY_KEY]
  @scala.inline
  def QVX: QVX = "QVX".asInstanceOf[QVX]
  @scala.inline
  def R: R = "R".asInstanceOf[R]
  @scala.inline
  def RAM: RAM = "RAM".asInstanceOf[RAM]
  @scala.inline
  def RCRD: RCRD = "RCRD".asInstanceOf[RCRD]
  @scala.inline
  def REMOVABLE: REMOVABLE = "REMOVABLE".asInstanceOf[REMOVABLE]
  @scala.inline
  def RNG: RNG = "RNG".asInstanceOf[RNG]
  @scala.inline
  def RNK: RNK = "RNK".asInstanceOf[RNK]
  @scala.inline
  def Remove: Remove = "Remove".asInstanceOf[Remove]
  @scala.inline
  def Replace: Replace = "Replace".asInstanceOf[Replace]
  @scala.inline
  def S: S = "S".asInstanceOf[S]
  @scala.inline
  def ST: ST = "ST".asInstanceOf[ST]
  @scala.inline
  def STR: STR = "STR".asInstanceOf[STR]
  @scala.inline
  def SYS: SYS = "SYS".asInstanceOf[SYS]
  @scala.inline
  def SlashqListObjectDef: SlashqListObjectDef = "/qListObjectDef".asInstanceOf[SlashqListObjectDef]
  @scala.inline
  def T: T = "T".asInstanceOf[T]
  @scala.inline
  def TBL: TBL = "TBL".asInstanceOf[TBL]
  @scala.inline
  def TOTAL_EXPR: TOTAL_EXPR = "TOTAL_EXPR".asInstanceOf[TOTAL_EXPR]
  @scala.inline
  def TOTAL_OFF: TOTAL_OFF = "TOTAL_OFF".asInstanceOf[TOTAL_OFF]
  @scala.inline
  def TRIG: TRIG = "TRIG".asInstanceOf[TRIG]
  @scala.inline
  def TS: TS = "TS".asInstanceOf[TS]
  @scala.inline
  def U: U = "U".asInstanceOf[U]
  @scala.inline
  def UNKNOWN_TYPE: UNKNOWN_TYPE = "UNKNOWN_TYPE".asInstanceOf[UNKNOWN_TYPE]
  @scala.inline
  def Utf16: Utf16 = "Utf16".asInstanceOf[Utf16]
  @scala.inline
  def Utf8: Utf8 = "Utf8".asInstanceOf[Utf8]
  @scala.inline
  def V: V = "V".asInstanceOf[V]
  @scala.inline
  def X: X = "X".asInstanceOf[X]
  @scala.inline
  def XL: XL = "XL".asInstanceOf[XL]
  @scala.inline
  def XML: XML = "XML".asInstanceOf[XML]
  @scala.inline
  def XS: XS = "XS".asInstanceOf[XS]
  @scala.inline
  def bookmark: bookmark = "bookmark".asInstanceOf[bookmark]
  @scala.inline
  def dimension: dimension = "dimension".asInstanceOf[dimension]
  @scala.inline
  def measure: measure = "measure".asInstanceOf[measure]
}

