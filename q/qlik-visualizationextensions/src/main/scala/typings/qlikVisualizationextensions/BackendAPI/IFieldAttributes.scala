package typings.qlikVisualizationextensions.BackendAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFieldAttributes extends js.Object {
  
  /**
    * Defines the decimal separator.
    * Example: .
    */
  var qDec: String = js.native
  
  /**
    * Defines the format pattern that applies to qText.
    * Is used in connection to the type of the field (parameter qType).
    * For more information, see Struct FieldAttributes.
    * Example: YYYY-MM-DD for a date
    */
  var qFmt: String = js.native
  
  /**
    * Array
    */
  var qSAFEARRAY: js.Array[_] = js.native
  
  /**
    * Defines the thousand separator (if any).
    * Is used if qUseThou is set to 1.
    * Example: ,
    */
  var qThou: String = js.native
  
  /**
    * Type of the field.
    * Default is U.
    * One of:
    *       # U for UNKNOWN type.
    *       # A for ASCII; Numeric fields values contain only standard ASCII characters.
    *       # I for INTEGER; Numeric fields values are shown as integer numbers.
    *       # R for REAL; Numeric fields values are shown as real numbers.
    *       # F for FIX; Numeric fields values are shown as numbers with a fix number of decimals.
    *       # M for MONEY; Numeric fields values are shown as in the money format.
    *       # D for DATE; Numeric fields values are shown as dates.
    *       # T for TIME; Numeric fields values are shown as times.
    *       # TS TIMESTAMP; Numeric fields values are shown as time stamps.
    *       # IV for INTERVAL; Numeric fields values are shown as intervals.
    */
  var qType: FieldAttributesType = js.native
  
  /**
    * Defines whether or not a thousands separator must be used.
    * Default is 0.
    * One of: 0 for false | 1 for true
    */
  var qUseThou: Boolean = js.native
  
  /**
    * Number of decimals.
    * Default is 10.
    * Integer between 0 and 15.
    */
  var qnDec: Double = js.native
}
object IFieldAttributes {
  
  @scala.inline
  def apply(
    qDec: String,
    qFmt: String,
    qSAFEARRAY: js.Array[_],
    qThou: String,
    qType: FieldAttributesType,
    qUseThou: Boolean,
    qnDec: Double
  ): IFieldAttributes = {
    val __obj = js.Dynamic.literal(qDec = qDec.asInstanceOf[js.Any], qFmt = qFmt.asInstanceOf[js.Any], qSAFEARRAY = qSAFEARRAY.asInstanceOf[js.Any], qThou = qThou.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qUseThou = qUseThou.asInstanceOf[js.Any], qnDec = qnDec.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldAttributes]
  }
  
  @scala.inline
  implicit class IFieldAttributesOps[Self <: IFieldAttributes] (val x: Self) extends AnyVal {
    
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
    def setQType(value: FieldAttributesType): Self = this.set("qType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUseThou(value: Boolean): Self = this.set("qUseThou", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQnDec(value: Double): Self = this.set("qnDec", value.asInstanceOf[js.Any])
  }
}
