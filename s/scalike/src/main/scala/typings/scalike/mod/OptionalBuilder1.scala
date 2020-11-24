package typings.scalike.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scalike", "OptionalBuilder1")
@js.native
class OptionalBuilder1[A, B] protected () extends js.Object {
  def this(oa: Optional[A], ob: Optional[B]) = this()
  
  def chain[C](oc: Optional[C]): OptionalBuilder2[A, B, C] = js.native
  
  var oa: js.Any = js.native
  
  var ob: js.Any = js.native
  
  def run[C](f: js.Function2[/* a */ A, /* b */ B, C]): Optional[C] = js.native
}
