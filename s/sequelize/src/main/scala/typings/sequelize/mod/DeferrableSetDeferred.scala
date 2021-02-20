package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeferrableSetDeferred extends DeferrableAbstract {
  
  /**
    * A property that will trigger an additional query at the beginning of a
    * transaction which sets the constraints to deferred.
    *
    * @param constraints An array of constraint names. Will defer all constraints by default.
    */
  def apply(constraints: js.Array[String]): DeferrableSetDeferred = js.native
}
