package typings.sequelize.mod

import typings.sequelize.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("sequelize", "ForeignKeyConstraintError")
@js.native
open class ForeignKeyConstraintErrorCls protected ()
  extends StObject
     with ForeignKeyConstraintError {
  /**
    * Thrown when a foreign key constraint is violated in the database
    */
  def this(options: Fields) = this()
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
