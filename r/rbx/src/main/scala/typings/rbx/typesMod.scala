package typings.rbx

import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rbx/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  
  type Prefer[P, T] = P with (Omit[T, /* keyof P */ String])
  
  type UnionToIntersection[U] = js.Any
}
