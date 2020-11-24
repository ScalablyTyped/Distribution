package typings.scalike.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scalike", "TryBuilder1")
@js.native
class TryBuilder1[A, B] protected () extends js.Object {
  def this(oa: Try[A], ob: Try[B]) = this()
  
  def chain[C](oc: Try[C]): TryBuilder2[A, B, C] = js.native
  
  var oa: js.Any = js.native
  
  var ob: js.Any = js.native
  
  def run[C](f: js.Function2[/* a */ A, /* b */ B, C]): Try[C] = js.native
}
