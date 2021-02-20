package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericObjectLayout...
  */
@js.native
trait IGenericObjectLayout extends IGenericBaseLayout {
  
  /**
    * This parameter is optional.
    * Gives information on the error.
    */
  var qError: js.UndefOr[INxLayoutErrors] = js.native
  
  /**
    * Should be set to create an object that is linked to another object.
    * Enter the identifier of the object you want to link to.
    * If you do not want to link your object, set this parameter to an empty string.
    */
  var qExtendsId: String = js.native
  
  /**
    * Is set to true if the generic object contains some properties that are not persistent
    * (a soft patch was applied).
    */
  var qHasSoftPatches: Boolean = js.native
  
  /**
    * Information about the selections.
    */
  var qSelectionInfo: INxSelectionInfo = js.native
  
  /**
    *     Name of the alternate state. Default is current selections $ .
    */
  var qStateName: String = js.native
}
object IGenericObjectLayout {
  
  @scala.inline
  def apply(
    qExtendsId: String,
    qHasSoftPatches: Boolean,
    qInfo: INxInfo,
    qMeta: INxMeta,
    qSelectionInfo: INxSelectionInfo,
    qStateName: String
  ): IGenericObjectLayout = {
    val __obj = js.Dynamic.literal(qExtendsId = qExtendsId.asInstanceOf[js.Any], qHasSoftPatches = qHasSoftPatches.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qSelectionInfo = qSelectionInfo.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericObjectLayout]
  }
  
  @scala.inline
  implicit class IGenericObjectLayoutMutableBuilder[Self <: IGenericObjectLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQError(value: INxLayoutErrors): Self = StObject.set(x, "qError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQErrorUndefined: Self = StObject.set(x, "qError", js.undefined)
    
    @scala.inline
    def setQExtendsId(value: String): Self = StObject.set(x, "qExtendsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQHasSoftPatches(value: Boolean): Self = StObject.set(x, "qHasSoftPatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSelectionInfo(value: INxSelectionInfo): Self = StObject.set(x, "qSelectionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStateName(value: String): Self = StObject.set(x, "qStateName", value.asInstanceOf[js.Any])
  }
}
