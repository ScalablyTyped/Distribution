package typings.sinclairTypebox.errorsErrorsMod

import typings.sinclairTypebox.mod.TRef
import typings.sinclairTypebox.mod.TSchema
import typings.sinclairTypebox.mod.TThis
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sinclair/typebox/errors/errors", "ValueErrorsDereferenceError")
@js.native
open class ValueErrorsDereferenceError protected ()
  extends StObject
     with Error {
  def this(schema: TRef[TSchema]) = this()
  def this(schema: TThis) = this()
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  val schema: TRef[TSchema] | TThis = js.native
}
