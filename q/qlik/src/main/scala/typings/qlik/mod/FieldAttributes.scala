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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldAttributes extends js.Object {
  
  var qDec: String = js.native
  
  var qFmt: String = js.native
  
  var qSAFEARRAY: js.Array[_] = js.native
  
  var qThou: String = js.native
  
  var qType: U | A | I | R | F | M | D | T | TS | IV = js.native
  
  var qUseThou: `0` | `1` = js.native
  
  var qnDec: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` = js.native
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
  
  @scala.inline
  implicit class FieldAttributesOps[Self <: FieldAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQDec(value: String): Self = this.set("qDec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFmt(value: String): Self = this.set("qFmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSAFEARRAYVarargs(value: js.Any*): Self = this.set("qSAFEARRAY", js.Array(value :_*))
    
    @scala.inline
    def setQSAFEARRAY(value: js.Array[_]): Self = this.set("qSAFEARRAY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQThou(value: String): Self = this.set("qThou", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: U | A | I | R | F | M | D | T | TS | IV): Self = this.set("qType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUseThou(value: `0` | `1`): Self = this.set("qUseThou", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQnDec(
      value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
    ): Self = this.set("qnDec", value.asInstanceOf[js.Any])
  }
}
