package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DoReloadExParams...
  */
trait IDoReloadExParams extends StObject {
  
  /**
    * Set to true if debug breakpoints are to be honored.
    * The execution of the script will be in debug mode.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qDebug: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Error handling mode
    * One of:
    *    0: for default mode
    *    1: for ABEND; the reload of the script ends if an error occurs.
    *    2: for ignore; the reload of the script continues even if an error is detected in the script.
    * >> This parameter is optional.
    */
  var qMode: js.UndefOr[Double] = js.undefined
  
  /**
    * Set to true for partial reload
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qPartial: js.UndefOr[Boolean] = js.undefined
}
object IDoReloadExParams {
  
  inline def apply(): IDoReloadExParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDoReloadExParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDoReloadExParams] (val x: Self) extends AnyVal {
    
    inline def setQDebug(value: Boolean): Self = StObject.set(x, "qDebug", value.asInstanceOf[js.Any])
    
    inline def setQDebugUndefined: Self = StObject.set(x, "qDebug", js.undefined)
    
    inline def setQMode(value: Double): Self = StObject.set(x, "qMode", value.asInstanceOf[js.Any])
    
    inline def setQModeUndefined: Self = StObject.set(x, "qMode", js.undefined)
    
    inline def setQPartial(value: Boolean): Self = StObject.set(x, "qPartial", value.asInstanceOf[js.Any])
    
    inline def setQPartialUndefined: Self = StObject.set(x, "qPartial", js.undefined)
  }
}
