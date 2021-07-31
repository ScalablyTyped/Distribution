package typings.qlikVisualizationextensions.BackendAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFieldAttributes extends StObject {
  
  /**
    * Defines the decimal separator.
    * Example: .
    */
  var qDec: String
  
  /**
    * Defines the format pattern that applies to qText.
    * Is used in connection to the type of the field (parameter qType).
    * For more information, see Struct FieldAttributes.
    * Example: YYYY-MM-DD for a date
    */
  var qFmt: String
  
  /**
    * Array
    */
  var qSAFEARRAY: js.Array[js.Any]
  
  /**
    * Defines the thousand separator (if any).
    * Is used if qUseThou is set to 1.
    * Example: ,
    */
  var qThou: String
  
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
  var qType: FieldAttributesType
  
  /**
    * Defines whether or not a thousands separator must be used.
    * Default is 0.
    * One of: 0 for false | 1 for true
    */
  var qUseThou: Boolean
  
  /**
    * Number of decimals.
    * Default is 10.
    * Integer between 0 and 15.
    */
  var qnDec: Double
}
object IFieldAttributes {
  
  @scala.inline
  def apply(
    qDec: String,
    qFmt: String,
    qSAFEARRAY: js.Array[js.Any],
    qThou: String,
    qType: FieldAttributesType,
    qUseThou: Boolean,
    qnDec: Double
  ): IFieldAttributes = {
    val __obj = js.Dynamic.literal(qDec = qDec.asInstanceOf[js.Any], qFmt = qFmt.asInstanceOf[js.Any], qSAFEARRAY = qSAFEARRAY.asInstanceOf[js.Any], qThou = qThou.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qUseThou = qUseThou.asInstanceOf[js.Any], qnDec = qnDec.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldAttributes]
  }
  
  @scala.inline
  implicit class IFieldAttributesMutableBuilder[Self <: IFieldAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDec(value: String): Self = StObject.set(x, "qDec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFmt(value: String): Self = StObject.set(x, "qFmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSAFEARRAY(value: js.Array[js.Any]): Self = StObject.set(x, "qSAFEARRAY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSAFEARRAYVarargs(value: js.Any*): Self = StObject.set(x, "qSAFEARRAY", js.Array(value :_*))
    
    @scala.inline
    def setQThou(value: String): Self = StObject.set(x, "qThou", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: FieldAttributesType): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUseThou(value: Boolean): Self = StObject.set(x, "qUseThou", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQnDec(value: Double): Self = StObject.set(x, "qnDec", value.asInstanceOf[js.Any])
  }
}
