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
  def AGGR: typings.qlikEngineapi.qlikEngineapiStrings.AGGR = this.cast("AGGR")
  @scala.inline
  def ALL: typings.qlikEngineapi.qlikEngineapiStrings.ALL = this.cast("ALL")
  @scala.inline
  def CLR: typings.qlikEngineapi.qlikEngineapiStrings.CLR = this.cast("CLR")
  @scala.inline
  def CND: typings.qlikEngineapi.qlikEngineapiStrings.CND = this.cast("CND")
  @scala.inline
  def COUNT: typings.qlikEngineapi.qlikEngineapiStrings.COUNT = this.cast("COUNT")
  @scala.inline
  def DATE: typings.qlikEngineapi.qlikEngineapiStrings.DATE = this.cast("DATE")
  @scala.inline
  def EXP: typings.qlikEngineapi.qlikEngineapiStrings.EXP = this.cast("EXP")
  @scala.inline
  def EXT: typings.qlikEngineapi.qlikEngineapiStrings.EXT = this.cast("EXT")
  @scala.inline
  def FILE: typings.qlikEngineapi.qlikEngineapiStrings.FILE = this.cast("FILE")
  @scala.inline
  def FIN: typings.qlikEngineapi.qlikEngineapiStrings.FIN = this.cast("FIN")
  @scala.inline
  def FRMT: typings.qlikEngineapi.qlikEngineapiStrings.FRMT = this.cast("FRMT")
  @scala.inline
  def GEO: typings.qlikEngineapi.qlikEngineapiStrings.GEO = this.cast("GEO")
  @scala.inline
  def LOG: typings.qlikEngineapi.qlikEngineapiStrings.LOG = this.cast("LOG")
  @scala.inline
  def MAPP: typings.qlikEngineapi.qlikEngineapiStrings.MAPP = this.cast("MAPP")
  @scala.inline
  def MATH: typings.qlikEngineapi.qlikEngineapiStrings.MATH = this.cast("MATH")
  @scala.inline
  def NONE: typings.qlikEngineapi.qlikEngineapiStrings.NONE = this.cast("NONE")
  @scala.inline
  def NULL: typings.qlikEngineapi.qlikEngineapiStrings.NULL = this.cast("NULL")
  @scala.inline
  def NUM: typings.qlikEngineapi.qlikEngineapiStrings.NUM = this.cast("NUM")
  @scala.inline
  def NUMI: typings.qlikEngineapi.qlikEngineapiStrings.NUMI = this.cast("NUMI")
  @scala.inline
  def RCRD: typings.qlikEngineapi.qlikEngineapiStrings.RCRD = this.cast("RCRD")
  @scala.inline
  def RNG: typings.qlikEngineapi.qlikEngineapiStrings.RNG = this.cast("RNG")
  @scala.inline
  def RNK: typings.qlikEngineapi.qlikEngineapiStrings.RNK = this.cast("RNK")
  @scala.inline
  def STR: typings.qlikEngineapi.qlikEngineapiStrings.STR = this.cast("STR")
  @scala.inline
  def SYS: typings.qlikEngineapi.qlikEngineapiStrings.SYS = this.cast("SYS")
  @scala.inline
  def TBL: typings.qlikEngineapi.qlikEngineapiStrings.TBL = this.cast("TBL")
  @scala.inline
  def TRIG: typings.qlikEngineapi.qlikEngineapiStrings.TRIG = this.cast("TRIG")
  @scala.inline
  def U: typings.qlikEngineapi.qlikEngineapiStrings.U = this.cast("U")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

