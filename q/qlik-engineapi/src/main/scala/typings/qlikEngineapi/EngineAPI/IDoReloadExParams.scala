package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DoReloadExParams...
  */
@js.native
trait IDoReloadExParams extends StObject {
  
  /**
    * Set to true if debug breakpoints are to be honored.
    * The execution of the script will be in debug mode.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qDebug: js.UndefOr[Boolean] = js.native
  
  /**
    * Error handling mode
    * One of:
    *    0: for default mode
    *    1: for ABEND; the reload of the script ends if an error occurs.
    *    2: for ignore; the reload of the script continues even if an error is detected in the script.
    * >> This parameter is optional.
    */
  var qMode: js.UndefOr[Double] = js.native
  
  /**
    * Set to true for partial reload
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qPartial: js.UndefOr[Boolean] = js.native
}
object IDoReloadExParams {
  
  @scala.inline
  def apply(): IDoReloadExParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDoReloadExParams]
  }
  
  @scala.inline
  implicit class IDoReloadExParamsMutableBuilder[Self <: IDoReloadExParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDebug(value: Boolean): Self = StObject.set(x, "qDebug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDebugUndefined: Self = StObject.set(x, "qDebug", js.undefined)
    
    @scala.inline
    def setQMode(value: Double): Self = StObject.set(x, "qMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQModeUndefined: Self = StObject.set(x, "qMode", js.undefined)
    
    @scala.inline
    def setQPartial(value: Boolean): Self = StObject.set(x, "qPartial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPartialUndefined: Self = StObject.set(x, "qPartial", js.undefined)
  }
}
