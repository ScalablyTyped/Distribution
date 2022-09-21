package typings.selderee

import typings.selderee.astMod.DecisionTreeNode
import typings.selderee.astMod.ValueContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type BuilderFunction[V, R] = js.Function1[/* nodes */ js.Array[DecisionTreeNode[V]], R]
  
  @js.native
  trait MatcherFunction[L, V] extends StObject {
    
    def apply(el: L, tail: L*): js.Array[ValueContainer[V]] = js.native
  }
}
