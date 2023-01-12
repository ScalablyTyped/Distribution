package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ScriptSyntaxError...
  */
trait IScriptSyntaxError extends StObject {
  
  /**
    * Position of the erroneous text from the beginning of the line
    */
  var qColInLine: Double
  
  /**
    * Length of the word where the error is located
    */
  var qErrLen: Double
  
  /**
    * Line number in the section where the error is located
    */
  var qLineInTab: Double
  
  /**
    * The default value is false.
    */
  var qSecondaryFailure: Boolean
  
  /**
    * Number of the faulty section
    */
  var qTabIx: Double
  
  /**
    * Position of the erroneous text from the beginning of the script
    */
  var qTextPos: Double
}
object IScriptSyntaxError {
  
  inline def apply(
    qColInLine: Double,
    qErrLen: Double,
    qLineInTab: Double,
    qSecondaryFailure: Boolean,
    qTabIx: Double,
    qTextPos: Double
  ): IScriptSyntaxError = {
    val __obj = js.Dynamic.literal(qColInLine = qColInLine.asInstanceOf[js.Any], qErrLen = qErrLen.asInstanceOf[js.Any], qLineInTab = qLineInTab.asInstanceOf[js.Any], qSecondaryFailure = qSecondaryFailure.asInstanceOf[js.Any], qTabIx = qTabIx.asInstanceOf[js.Any], qTextPos = qTextPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScriptSyntaxError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IScriptSyntaxError] (val x: Self) extends AnyVal {
    
    inline def setQColInLine(value: Double): Self = StObject.set(x, "qColInLine", value.asInstanceOf[js.Any])
    
    inline def setQErrLen(value: Double): Self = StObject.set(x, "qErrLen", value.asInstanceOf[js.Any])
    
    inline def setQLineInTab(value: Double): Self = StObject.set(x, "qLineInTab", value.asInstanceOf[js.Any])
    
    inline def setQSecondaryFailure(value: Boolean): Self = StObject.set(x, "qSecondaryFailure", value.asInstanceOf[js.Any])
    
    inline def setQTabIx(value: Double): Self = StObject.set(x, "qTabIx", value.asInstanceOf[js.Any])
    
    inline def setQTextPos(value: Double): Self = StObject.set(x, "qTextPos", value.asInstanceOf[js.Any])
  }
}
