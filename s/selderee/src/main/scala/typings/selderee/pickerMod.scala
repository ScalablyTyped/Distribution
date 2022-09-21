package typings.selderee

import typings.selderee.astMod.ValueContainer
import typings.selderee.typesMod.MatcherFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerMod {
  
  @JSImport("selderee/lib/Picker", "Picker")
  @js.native
  open class Picker[L, V] protected () extends StObject {
    /**
      * Create new Picker object.
      *
      * @typeParam L - the type of HTML Element in the targeted DOM AST.
      * @typeParam V - the type of associated values.
      *
      * @param f - the function that matches an element
      * and returns all associated values.
      */
    def this(f: MatcherFunction[L, V]) = this()
    
    /* private */ var f: Any = js.native
    
    /**
      * Run the selectors decision tree against one HTML Element
      * and choose the value from the most specific matched selector.
      *
      * @param el - an HTML Element.
      *
      * @param preferFirst - option to define which value to choose
      * when there are multiple matches with equal specificity.
      *
      * @returns the value from the most specific matched selector
      * or `null` if nothing matched.
      */
    def pick1(el: L): V | Null = js.native
    def pick1(el: L, preferFirst: Boolean): V | Null = js.native
    
    /**
      * Run the selectors decision tree against one HTML Element
      * and return all matched associated values
      * along with selector specificities.
      *
      * Client code then decides how to further process them
      * (sort, filter, etc).
      *
      * @param el - an HTML Element.
      *
      * @returns all associated values along with
      * selector specificities for all matched selectors.
      */
    def pickAll(el: L): js.Array[ValueContainer[V]] = js.native
  }
}
