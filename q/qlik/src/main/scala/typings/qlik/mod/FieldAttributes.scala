package typings.qlik.mod

import typings.qlik.qlikNumbers.`0`
import typings.qlik.qlikNumbers.`10`
import typings.qlik.qlikNumbers.`11`
import typings.qlik.qlikNumbers.`12`
import typings.qlik.qlikNumbers.`13`
import typings.qlik.qlikNumbers.`14`
import typings.qlik.qlikNumbers.`15`
import typings.qlik.qlikNumbers.`1`
import typings.qlik.qlikNumbers.`2`
import typings.qlik.qlikNumbers.`3`
import typings.qlik.qlikNumbers.`4`
import typings.qlik.qlikNumbers.`5`
import typings.qlik.qlikNumbers.`6`
import typings.qlik.qlikNumbers.`7`
import typings.qlik.qlikNumbers.`8`
import typings.qlik.qlikNumbers.`9`
import typings.qlik.qlikStrings.A
import typings.qlik.qlikStrings.D
import typings.qlik.qlikStrings.F
import typings.qlik.qlikStrings.I
import typings.qlik.qlikStrings.IV
import typings.qlik.qlikStrings.M
import typings.qlik.qlikStrings.R
import typings.qlik.qlikStrings.T
import typings.qlik.qlikStrings.TS
import typings.qlik.qlikStrings.U
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldAttributes extends js.Object {
  var qDec: String
  var qFmt: String
  var qSAFEARRAY: js.Array[_]
  var qThou: String
  var qType: U | A | I | R | F | M | D | T | TS | IV
  var qUseThou: `0` | `1`
  var qnDec: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
}

object FieldAttributes {
  @scala.inline
  def apply(
    qDec: String,
    qFmt: String,
    qSAFEARRAY: js.Array[_],
    qThou: String,
    qType: U | A | I | R | F | M | D | T | TS | IV,
    qUseThou: `0` | `1`,
    qnDec: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
  ): FieldAttributes = {
    val __obj = js.Dynamic.literal(qDec = qDec.asInstanceOf[js.Any], qFmt = qFmt.asInstanceOf[js.Any], qSAFEARRAY = qSAFEARRAY.asInstanceOf[js.Any], qThou = qThou.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qUseThou = qUseThou.asInstanceOf[js.Any], qnDec = qnDec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldAttributes]
  }
}

