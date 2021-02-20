package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ScriptSyntaxError...
  */
@js.native
trait IScriptSyntaxError extends StObject {
  
  /**
    * Position of the erroneous text from the beginning of the line
    */
  var qColInLine: Double = js.native
  
  /**
    * Length of the word where the error is located
    */
  var qErrLen: Double = js.native
  
  /**
    * Line number in the section where the error is located
    */
  var qLineInTab: Double = js.native
  
  /**
    * The default value is false.
    */
  var qSecondaryFailure: Boolean = js.native
  
  /**
    * Number of the faulty section
    */
  var qTabIx: Double = js.native
  
  /**
    * Position of the erroneous text from the beginning of the script
    */
  var qTextPos: Double = js.native
}
object IScriptSyntaxError {
  
  @scala.inline
  def apply(
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
  implicit class IScriptSyntaxErrorMutableBuilder[Self <: IScriptSyntaxError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQColInLine(value: Double): Self = StObject.set(x, "qColInLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQErrLen(value: Double): Self = StObject.set(x, "qErrLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLineInTab(value: Double): Self = StObject.set(x, "qLineInTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSecondaryFailure(value: Boolean): Self = StObject.set(x, "qSecondaryFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTabIx(value: Double): Self = StObject.set(x, "qTabIx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTextPos(value: Double): Self = StObject.set(x, "qTextPos", value.asInstanceOf[js.Any])
  }
}
