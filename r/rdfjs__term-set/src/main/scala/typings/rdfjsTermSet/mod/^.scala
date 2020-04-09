package typings.rdfjsTermSet.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Set
import typings.std.SetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@rdfjs/term-set", JSImport.Namespace)
@js.native
class ^[T] () extends Set[T] {
  def this(values: js.Array[T]) = this()
}

@JSImport("@rdfjs/term-set", JSImport.Namespace)
@js.native
object ^ extends TopLevel[SetConstructor]

