package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TextMacro...
  */
trait ITextMacro extends StObject {
  
  /**
    * Variable value.
    */
  var qDisplayString: String
  
  /**
    * Is set to true if the variable is a reserved variable.
    */
  var qIsReserved: Boolean
  
  /**
    * Is set to true if the variable is a system variable.
    */
  var qIsSystem: Boolean
  
  /**
    * Order in which the variable was referenced during the script execution.
    * The same number sequence is used for both qRefSeqNo and qSetSeqNo.
    */
  var qRefSeqNo: Double
  
  /**
    * Order in which the variable was updated during the script execution.
    * The same number sequence is used for both qRefSeqNo and qSetSeqNo.
    */
  var qSetSeqNo: Double
  
  /**
    * Name of the variable.
    */
  var qTag: String
}
object ITextMacro {
  
  inline def apply(
    qDisplayString: String,
    qIsReserved: Boolean,
    qIsSystem: Boolean,
    qRefSeqNo: Double,
    qSetSeqNo: Double,
    qTag: String
  ): ITextMacro = {
    val __obj = js.Dynamic.literal(qDisplayString = qDisplayString.asInstanceOf[js.Any], qIsReserved = qIsReserved.asInstanceOf[js.Any], qIsSystem = qIsSystem.asInstanceOf[js.Any], qRefSeqNo = qRefSeqNo.asInstanceOf[js.Any], qSetSeqNo = qSetSeqNo.asInstanceOf[js.Any], qTag = qTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextMacro]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITextMacro] (val x: Self) extends AnyVal {
    
    inline def setQDisplayString(value: String): Self = StObject.set(x, "qDisplayString", value.asInstanceOf[js.Any])
    
    inline def setQIsReserved(value: Boolean): Self = StObject.set(x, "qIsReserved", value.asInstanceOf[js.Any])
    
    inline def setQIsSystem(value: Boolean): Self = StObject.set(x, "qIsSystem", value.asInstanceOf[js.Any])
    
    inline def setQRefSeqNo(value: Double): Self = StObject.set(x, "qRefSeqNo", value.asInstanceOf[js.Any])
    
    inline def setQSetSeqNo(value: Double): Self = StObject.set(x, "qSetSeqNo", value.asInstanceOf[js.Any])
    
    inline def setQTag(value: String): Self = StObject.set(x, "qTag", value.asInstanceOf[js.Any])
  }
}
