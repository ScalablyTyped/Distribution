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
  
  inline def apply(): InstanceUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceUpdateOptions]
  }
  
  extension [Self <: InstanceUpdateOptions](x: Self) {
    
    inline def setWhere(value: AnyWhereOptions | (js.Array[col | and | or | String])): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    
    inline def setWhereVarargs(value: (col | and | or | String)*): Self = StObject.set(x, "where", js.Array(value :_*))
  }
}
