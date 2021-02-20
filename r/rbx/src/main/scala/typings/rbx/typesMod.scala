package typings.rbx

import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type Prefer[P, T] = P with (Omit[T, /* keyof P */ String])
  
  type UnionToIntersection[U] = js.Any
}
