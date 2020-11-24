package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeferrableNot extends DeferrableAbstract {
  
  /**
    * A property that will set the constraints to not deferred. This is the default in PostgreSQL and it make
    * it impossible to dynamically defer the constraints within a transaction.
    */
  def apply(): DeferrableNot = js.native
}
