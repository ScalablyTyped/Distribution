package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options used for Instance.update method
  */
trait InstanceUpdateOptions
  extends StObject
     with InstanceSaveOptions
     with InstanceSetOptions {
  
  /**
    * A hash of attributes to describe your search. See above for examples.
    */
  var where: js.UndefOr[AnyWhereOptions | (js.Array[col | and | or | String])] = js.undefined
}
object InstanceUpdateOptions {
  
  @scala.inline
  def apply(): InstanceUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceUpdateOptions]
  }
  
  @scala.inline
  implicit class InstanceUpdateOptionsMutableBuilder[Self <: InstanceUpdateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWhere(value: AnyWhereOptions | (js.Array[col | and | or | String])): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    
    @scala.inline
    def setWhereVarargs(value: (col | and | or | String)*): Self = StObject.set(x, "where", js.Array(value :_*))
  }
}
