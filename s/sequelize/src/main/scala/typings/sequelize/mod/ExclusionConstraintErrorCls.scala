package typings.sequelize.mod

import typings.sequelize.anon.Constraint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("sequelize", "ExclusionConstraintError")
@js.native
open class ExclusionConstraintErrorCls protected ()
  extends StObject
     with ExclusionConstraintError {
  /**
    * Thrown when an exclusion constraint is violated in the database
    */
  def this(options: Constraint) = this()
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
