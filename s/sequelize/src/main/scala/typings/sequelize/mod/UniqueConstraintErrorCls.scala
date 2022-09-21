package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("sequelize", "UniqueConstraintError")
@js.native
open class UniqueConstraintErrorCls protected ()
  extends StObject
     with UniqueConstraintError {
  /**
    * Thrown when a unique constraint is violated in the database
    */
  def this(options: typings.sequelize.anon.Errors) = this()
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
