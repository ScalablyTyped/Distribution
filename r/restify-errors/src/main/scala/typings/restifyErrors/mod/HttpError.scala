package typings.restifyErrors.mod

import typings.verror.mod.VError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("restify-errors", "HttpError")
@js.native
open class HttpError protected ()
  extends StObject
     with VError {
  def this(printf: String, args: Any*) = this()
  def this(options: RestifyHttpErrorOptions, printf: String, args: Any*) = this()
  def this(options: RestifyHttpErrorOptions, printf: Unit, args: Any*) = this()
  // tslint:disable-next-line unified-signatures
  def this(priorErr: Any, printf: String, args: Any*) = this()
  def this(priorErr: Any, printf: Unit, args: Any*) = this()
  def this(priorErr: Any, options: RestifyHttpErrorOptions, printf: String, args: Any*) = this()
  def this(priorErr: Any, options: RestifyHttpErrorOptions, printf: Unit, args: Any*) = this()
  
  var body: Any = js.native
  
  /* CompleteClass */
  @JSName("cause")
  override def cause_MVError(): js.UndefOr[js.Error] = js.native
  
  var code: String = js.native
  
  var displayName: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  var statusCode: Double = js.native
  
  def toJSON(): Any = js.native
}
