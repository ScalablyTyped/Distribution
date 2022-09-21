package typings.rockset.apiMod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rockset/dist/codegen/api", "RequiredError")
@js.native
open class RequiredError protected ()
  extends StObject
     with Error {
  def this(field: String) = this()
  def this(field: String, msg: String) = this()
  
  var field: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  @JSName("name")
  var name_RequiredError: typings.rockset.rocksetStrings.RequiredError = js.native
}
