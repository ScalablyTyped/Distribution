package typings.qlik.mod

import typings.qlik.qlikInts.`0`
import typings.qlik.qlikInts.`10`
import typings.qlik.qlikInts.`11`
import typings.qlik.qlikInts.`12`
import typings.qlik.qlikInts.`13`
import typings.qlik.qlikInts.`14`
import typings.qlik.qlikInts.`15`
import typings.qlik.qlikInts.`1`
import typings.qlik.qlikInts.`2`
import typings.qlik.qlikInts.`3`
import typings.qlik.qlikInts.`4`
import typings.qlik.qlikInts.`5`
import typings.qlik.qlikInts.`6`
import typings.qlik.qlikInts.`7`
import typings.qlik.qlikInts.`8`
import typings.qlik.qlikInts.`9`
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldAttributes extends StObject {
  
  var qDec: String
  
  var qFmt: String
  
  var qSAFEARRAY: js.Array[Any]
  
  var qThou: String
  
  var qType: U | A | I | R | F | M | D | T | TS | IV
  
  var qUseThou: `0` | `1`
  
  var qnDec: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
}
object FieldAttributes {
  
  inline def apply(
    qDec: String,
    qFmt: String,
    qSAFEARRAY: js.Array[Any],
    qThou: String,
    qType: U | A | I | R | F | M | D | T | TS | IV,
    qUseThou: `0` | `1`,
    qnDec: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
  ): FieldAttributes = {
    val __obj = js.Dynamic.literal(qDec = qDec.asInstanceOf[js.Any], qFmt = qFmt.asInstanceOf[js.Any], qSAFEARRAY = qSAFEARRAY.asInstanceOf[js.Any], qThou = qThou.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qUseThou = qUseThou.asInstanceOf[js.Any], qnDec = qnDec.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldAttributes] (val x: Self) extends AnyVal {
    
    inline def setQDec(value: String): Self = StObject.set(x, "qDec", value.asInstanceOf[js.Any])
    
    inline def setQFmt(value: String): Self = StObject.set(x, "qFmt", value.asInstanceOf[js.Any])
    
    inline def setQSAFEARRAY(value: js.Array[Any]): Self = StObject.set(x, "qSAFEARRAY", value.asInstanceOf[js.Any])
    
    inline def setQSAFEARRAYVarargs(value: Any*): Self = StObject.set(x, "qSAFEARRAY", js.Array(value*))
    
    inline def setQThou(value: String): Self = StObject.set(x, "qThou", value.asInstanceOf[js.Any])
    
    inline def setQType(value: U | A | I | R | F | M | D | T | TS | IV): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
    
    inline def setQUseThou(value: `0` | `1`): Self = StObject.set(x, "qUseThou", value.asInstanceOf[js.Any])
    
    inline def setQnDec(
      value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
    ): Self = StObject.set(x, "qnDec", value.asInstanceOf[js.Any])
  }
}
