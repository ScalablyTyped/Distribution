package typings.selderee

import typings.selderee.typesMod.BuilderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decisionTreeMod {
  
  @JSImport("selderee/lib/DecisionTree", "DecisionTree")
  @js.native
  open class DecisionTree[V] protected () extends StObject {
    /**
      * Create new DecisionTree object.
      *
      * @param input - an array containing all selectors
      * paired with associated values.
      *
      * @typeParam V - the type of values associated with selectors.
      */
    def this(input: js.Array[js.Tuple2[String, V]]) = this()
    
    /* private */ val branches: Any = js.native
    
    /**
      * Turn this decision tree into a usable form.
      *
      * @typeParam R - return type defined by the builder function.
      *
      * @param builder - the builder function.
      *
      * @returns the decision tree in a form ready for use.
      */
    def build[R](builder: BuilderFunction[V, R]): R = js.native
  }
}
