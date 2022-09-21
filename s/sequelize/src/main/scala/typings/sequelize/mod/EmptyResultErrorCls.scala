package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("sequelize", "EmptyResultError")
@js.native
open class EmptyResultErrorCls protected ()
  extends StObject
     with EmptyResultError {
  /**
    * Thrown when a record was not found, Usually used with rejectOnEmpty mode (see message for details)
    */
  def this(parent: js.Error) = this()
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
