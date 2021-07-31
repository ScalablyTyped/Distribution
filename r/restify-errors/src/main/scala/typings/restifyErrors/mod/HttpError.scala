package typings.restifyErrors.mod

import typings.std.Error
import typings.verror.mod.VError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("restify-errors", "HttpError")
@js.native
class HttpError protected ()
  extends StObject
     with VError {
  def this(printf: String, args: js.Any*) = this()
  def this(options: RestifyHttpErrorOptions, printf: String, args: js.Any*) = this()
  def this(options: RestifyHttpErrorOptions, printf: Unit, args: js.Any*) = this()
  // tslint:disable-next-line unified-signatures
  def this(priorErr: js.Any, printf: String, args: js.Any*) = this()
  def this(priorErr: js.Any, printf: Unit, args: js.Any*) = this()
  def this(priorErr: js.Any, options: RestifyHttpErrorOptions, printf: String, args: js.Any*) = this()
  def this(priorErr: js.Any, options: RestifyHttpErrorOptions, printf: Unit, args: js.Any*) = this()
  
  var body: js.Any = js.native
  
  /* CompleteClass */
  override def cause(): js.UndefOr[Error] = js.native
  
  var code: String = js.native
  
  var displayName: String = js.native
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  var statusCode: Double = js.native
  
  def toJSON(): js.Any = js.native
}
