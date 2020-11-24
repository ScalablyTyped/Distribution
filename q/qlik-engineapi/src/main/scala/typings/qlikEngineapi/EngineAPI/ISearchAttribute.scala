package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchAttribute...
  */
@js.native
trait ISearchAttribute extends js.Object {
  
  /**
    * String corresponding to
    * SearchObjectOptions.qAttributes
    * It will be qProperty for SearchObjectOptions.
    */
  var qKey: String = js.native
  
  /**
    * String corresponding to qKey for the current SearchGroupItemMatch.
    * For example, if the match is Make by Price found in the title of a generic object, qValue will be qMetaDef/title.
    */
  var qValue: String = js.native
}
object ISearchAttribute {
  
  @scala.inline
  def apply(qKey: String, qValue: String): ISearchAttribute = {
    val __obj = js.Dynamic.literal(qKey = qKey.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchAttribute]
  }
  
  @scala.inline
  implicit class ISearchAttributeOps[Self <: ISearchAttribute] (val x: Self) extends AnyVal {
    
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
    def setQKey(value: String): Self = this.set("qKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValue(value: String): Self = this.set("qValue", value.asInstanceOf[js.Any])
  }
}
