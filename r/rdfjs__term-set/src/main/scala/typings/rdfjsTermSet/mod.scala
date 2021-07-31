package typings.rdfjsTermSet

import typings.rdfJs.mod.Term
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("@rdfjs/term-set", JSImport.Namespace)
  @js.native
  class ^[T /* <: Term */] ()
    extends StObject
       with Set[T] {
    def this(values: js.Array[T]) = this()
  }
  
  // tslint:disable-next-line no-unnecessary-class
  type TermSet[T /* <: Term */] = Set[T]
}
