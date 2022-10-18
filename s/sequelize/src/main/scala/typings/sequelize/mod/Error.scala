package typings.sequelize.mod

import typings.std.ErrorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("sequelize", "Error")
@js.native
/* standard es5 */
open class Error ()
  extends StObject
     with typings.std.Error {
  def this(message: String) = this()
  def this(message: String, options: ErrorOptions) = this()
  def this(message: Unit, options: ErrorOptions) = this()
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
