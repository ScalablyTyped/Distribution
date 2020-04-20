package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
/* Rewritten from type alias, can be one of: 
  - typings.qlikEngineapi.qlikEngineapiStrings.ALL
  - typings.qlikEngineapi.qlikEngineapiStrings.U
  - typings.qlikEngineapi.qlikEngineapiStrings.NONE
  - typings.qlikEngineapi.qlikEngineapiStrings.AGGR
  - typings.qlikEngineapi.qlikEngineapiStrings.NUM
  - typings.qlikEngineapi.qlikEngineapiStrings.RNG
  - typings.qlikEngineapi.qlikEngineapiStrings.EXP
  - typings.qlikEngineapi.qlikEngineapiStrings.TRIG
  - typings.qlikEngineapi.qlikEngineapiStrings.FIN
  - typings.qlikEngineapi.qlikEngineapiStrings.MATH
  - typings.qlikEngineapi.qlikEngineapiStrings.COUNT
  - typings.qlikEngineapi.qlikEngineapiStrings.STR
  - typings.qlikEngineapi.qlikEngineapiStrings.MAPP
  - typings.qlikEngineapi.qlikEngineapiStrings.RCRD
  - typings.qlikEngineapi.qlikEngineapiStrings.CND
  - typings.qlikEngineapi.qlikEngineapiStrings.LOG
  - typings.qlikEngineapi.qlikEngineapiStrings.NULL
  - typings.qlikEngineapi.qlikEngineapiStrings.SYS
  - typings.qlikEngineapi.qlikEngineapiStrings.FILE
  - typings.qlikEngineapi.qlikEngineapiStrings.TBL
  - typings.qlikEngineapi.qlikEngineapiStrings.DATE
  - typings.qlikEngineapi.qlikEngineapiStrings.NUMI
  - typings.qlikEngineapi.qlikEngineapiStrings.FRMT
  - typings.qlikEngineapi.qlikEngineapiStrings.CLR
  - typings.qlikEngineapi.qlikEngineapiStrings.RNK
  - typings.qlikEngineapi.qlikEngineapiStrings.GEO
  - typings.qlikEngineapi.qlikEngineapiStrings.EXT
*/
trait FunctionGroupType extends js.Object

object FunctionGroupType {
  @scala.inline
  def AGGR: typings.qlikEngineapi.qlikEngineapiStrings.AGGR = "AGGR".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.AGGR]
  @scala.inline
  def ALL: typings.qlikEngineapi.qlikEngineapiStrings.ALL = "ALL".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.ALL]
  @scala.inline
  def CLR: typings.qlikEngineapi.qlikEngineapiStrings.CLR = "CLR".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.CLR]
  @scala.inline
  def CND: typings.qlikEngineapi.qlikEngineapiStrings.CND = "CND".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.CND]
  @scala.inline
  def COUNT: typings.qlikEngineapi.qlikEngineapiStrings.COUNT = "COUNT".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.COUNT]
  @scala.inline
  def DATE: typings.qlikEngineapi.qlikEngineapiStrings.DATE = "DATE".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.DATE]
  @scala.inline
  def EXP: typings.qlikEngineapi.qlikEngineapiStrings.EXP = "EXP".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.EXP]
  @scala.inline
  def EXT: typings.qlikEngineapi.qlikEngineapiStrings.EXT = "EXT".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.EXT]
  @scala.inline
  def FILE: typings.qlikEngineapi.qlikEngineapiStrings.FILE = "FILE".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.FILE]
  @scala.inline
  def FIN: typings.qlikEngineapi.qlikEngineapiStrings.FIN = "FIN".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.FIN]
  @scala.inline
  def FRMT: typings.qlikEngineapi.qlikEngineapiStrings.FRMT = "FRMT".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.FRMT]
  @scala.inline
  def GEO: typings.qlikEngineapi.qlikEngineapiStrings.GEO = "GEO".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.GEO]
  @scala.inline
  def LOG: typings.qlikEngineapi.qlikEngineapiStrings.LOG = "LOG".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.LOG]
  @scala.inline
  def MAPP: typings.qlikEngineapi.qlikEngineapiStrings.MAPP = "MAPP".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.MAPP]
  @scala.inline
  def MATH: typings.qlikEngineapi.qlikEngineapiStrings.MATH = "MATH".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.MATH]
  @scala.inline
  def NONE: typings.qlikEngineapi.qlikEngineapiStrings.NONE = "NONE".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.NONE]
  @scala.inline
  def NULL: typings.qlikEngineapi.qlikEngineapiStrings.NULL = "NULL".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.NULL]
  @scala.inline
  def NUM: typings.qlikEngineapi.qlikEngineapiStrings.NUM = "NUM".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.NUM]
  @scala.inline
  def NUMI: typings.qlikEngineapi.qlikEngineapiStrings.NUMI = "NUMI".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.NUMI]
  @scala.inline
  def RCRD: typings.qlikEngineapi.qlikEngineapiStrings.RCRD = "RCRD".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.RCRD]
  @scala.inline
  def RNG: typings.qlikEngineapi.qlikEngineapiStrings.RNG = "RNG".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.RNG]
  @scala.inline
  def RNK: typings.qlikEngineapi.qlikEngineapiStrings.RNK = "RNK".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.RNK]
  @scala.inline
  def STR: typings.qlikEngineapi.qlikEngineapiStrings.STR = "STR".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.STR]
  @scala.inline
  def SYS: typings.qlikEngineapi.qlikEngineapiStrings.SYS = "SYS".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.SYS]
  @scala.inline
  def TBL: typings.qlikEngineapi.qlikEngineapiStrings.TBL = "TBL".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.TBL]
  @scala.inline
  def TRIG: typings.qlikEngineapi.qlikEngineapiStrings.TRIG = "TRIG".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.TRIG]
  @scala.inline
  def U: typings.qlikEngineapi.qlikEngineapiStrings.U = "U".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.U]
}

