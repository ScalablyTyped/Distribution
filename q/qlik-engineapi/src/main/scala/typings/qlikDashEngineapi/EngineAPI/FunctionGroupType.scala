package typings.qlikDashEngineapi.EngineAPI

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
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.ALL
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.U
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.NONE
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.AGGR
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.NUM
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.RNG
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.EXP
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.TRIG
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.FIN
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.MATH
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.COUNT
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.STR
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.MAPP
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.RCRD
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.CND
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.LOG
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.NULL
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.SYS
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.FILE
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.TBL
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.DATE
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.NUMI
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.FRMT
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.CLR
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.RNK
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.GEO
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.EXT
*/
trait FunctionGroupType extends js.Object

object FunctionGroupType {
  @scala.inline
  def AGGR: typings.qlikDashEngineapi.qlikDashEngineapiStrings.AGGR = this.cast("AGGR")
  @scala.inline
  def ALL: typings.qlikDashEngineapi.qlikDashEngineapiStrings.ALL = this.cast("ALL")
  @scala.inline
  def CLR: typings.qlikDashEngineapi.qlikDashEngineapiStrings.CLR = this.cast("CLR")
  @scala.inline
  def CND: typings.qlikDashEngineapi.qlikDashEngineapiStrings.CND = this.cast("CND")
  @scala.inline
  def COUNT: typings.qlikDashEngineapi.qlikDashEngineapiStrings.COUNT = this.cast("COUNT")
  @scala.inline
  def DATE: typings.qlikDashEngineapi.qlikDashEngineapiStrings.DATE = this.cast("DATE")
  @scala.inline
  def EXP: typings.qlikDashEngineapi.qlikDashEngineapiStrings.EXP = this.cast("EXP")
  @scala.inline
  def EXT: typings.qlikDashEngineapi.qlikDashEngineapiStrings.EXT = this.cast("EXT")
  @scala.inline
  def FILE: typings.qlikDashEngineapi.qlikDashEngineapiStrings.FILE = this.cast("FILE")
  @scala.inline
  def FIN: typings.qlikDashEngineapi.qlikDashEngineapiStrings.FIN = this.cast("FIN")
  @scala.inline
  def FRMT: typings.qlikDashEngineapi.qlikDashEngineapiStrings.FRMT = this.cast("FRMT")
  @scala.inline
  def GEO: typings.qlikDashEngineapi.qlikDashEngineapiStrings.GEO = this.cast("GEO")
  @scala.inline
  def LOG: typings.qlikDashEngineapi.qlikDashEngineapiStrings.LOG = this.cast("LOG")
  @scala.inline
  def MAPP: typings.qlikDashEngineapi.qlikDashEngineapiStrings.MAPP = this.cast("MAPP")
  @scala.inline
  def MATH: typings.qlikDashEngineapi.qlikDashEngineapiStrings.MATH = this.cast("MATH")
  @scala.inline
  def NONE: typings.qlikDashEngineapi.qlikDashEngineapiStrings.NONE = this.cast("NONE")
  @scala.inline
  def NULL: typings.qlikDashEngineapi.qlikDashEngineapiStrings.NULL = this.cast("NULL")
  @scala.inline
  def NUM: typings.qlikDashEngineapi.qlikDashEngineapiStrings.NUM = this.cast("NUM")
  @scala.inline
  def NUMI: typings.qlikDashEngineapi.qlikDashEngineapiStrings.NUMI = this.cast("NUMI")
  @scala.inline
  def RCRD: typings.qlikDashEngineapi.qlikDashEngineapiStrings.RCRD = this.cast("RCRD")
  @scala.inline
  def RNG: typings.qlikDashEngineapi.qlikDashEngineapiStrings.RNG = this.cast("RNG")
  @scala.inline
  def RNK: typings.qlikDashEngineapi.qlikDashEngineapiStrings.RNK = this.cast("RNK")
  @scala.inline
  def STR: typings.qlikDashEngineapi.qlikDashEngineapiStrings.STR = this.cast("STR")
  @scala.inline
  def SYS: typings.qlikDashEngineapi.qlikDashEngineapiStrings.SYS = this.cast("SYS")
  @scala.inline
  def TBL: typings.qlikDashEngineapi.qlikDashEngineapiStrings.TBL = this.cast("TBL")
  @scala.inline
  def TRIG: typings.qlikDashEngineapi.qlikDashEngineapiStrings.TRIG = this.cast("TRIG")
  @scala.inline
  def U: typings.qlikDashEngineapi.qlikDashEngineapiStrings.U = this.cast("U")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

