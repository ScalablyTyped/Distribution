package typings.scalike.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scalike", "TryBuilder4")
@js.native
class TryBuilder4[A, B, C, D, E] protected () extends js.Object {
  def this(oa: Try[A], ob: Try[B], oc: Try[C], od: Try[D], oe: Try[E]) = this()
  
  def chain[F](of: Try[F]): TryBuilder5[A, B, C, D, E, F] = js.native
  
  var oa: js.Any = js.native
  
  var ob: js.Any = js.native
  
  var oc: js.Any = js.native
  
  var od: js.Any = js.native
  
  var oe: js.Any = js.native
  
  def run[F](f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]): Try[F] = js.native
}
