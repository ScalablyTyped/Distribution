package typings.sinclairTypebox.errorsErrorsMod

import typings.sinclairTypebox.mod.TSchema
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sinclair/typebox/errors/errors", "ValueErrorsUnknownTypeError")
@js.native
open class ValueErrorsUnknownTypeError protected ()
  extends StObject
     with Error {
  def this(schema: TSchema) = this()
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  val schema: TSchema = js.native
}
