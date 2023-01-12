package typings.sizzle

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.sizzle.mod.Selectors.AttrHandleFunctions
import typings.sizzle.mod.Selectors.CreatePseudoFunction
import typings.sizzle.mod.Selectors.FilterFunctions
import typings.sizzle.mod.Selectors.FindFunctions
import typings.sizzle.mod.Selectors.Matches
import typings.sizzle.mod.Selectors.PreFilterFunctions
import typings.sizzle.mod.Selectors.PseudoFunction
import typings.sizzle.mod.Selectors.PseudoFunctions
import typings.sizzle.mod.Selectors.SetFilterFunctions
import typings.std.ArrayLike
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("sizzle", JSImport.Namespace)
  @js.native
  val ^ : SizzleStatic = js.native
  
  trait Selectors extends StObject {
    
    var attrHandle: AttrHandleFunctions
    
    var cacheLength: Double
    
    def createPseudo(fn: CreatePseudoFunction): PseudoFunction
    
    var filter: FilterFunctions
    
    var find: FindFunctions
    
    var `match`: Matches
    
    var preFilter: PreFilterFunctions
    
    var pseudos: PseudoFunctions
    
    var setFilters: SetFilterFunctions
  }
  object Selectors {
    
    inline def apply(
      attrHandle: AttrHandleFunctions,
      cacheLength: Double,
      createPseudo: CreatePseudoFunction => PseudoFunction,
      filter: FilterFunctions,
      find: FindFunctions,
      `match`: Matches,
      preFilter: PreFilterFunctions,
      pseudos: PseudoFunctions,
      setFilters: SetFilterFunctions
    ): Selectors = {
      val __obj = js.Dynamic.literal(attrHandle = attrHandle.asInstanceOf[js.Any], cacheLength = cacheLength.asInstanceOf[js.Any], createPseudo = js.Any.fromFunction1(createPseudo), filter = filter.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], preFilter = preFilter.asInstanceOf[js.Any], pseudos = pseudos.asInstanceOf[js.Any], setFilters = setFilters.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selectors]
    }
    
    type AttrHandleFunction = js.Function3[/* elem */ Any, /* casePreservedName */ String, /* isXML */ Boolean, String]
    
    type AttrHandleFunctions = StringDictionary[AttrHandleFunction]
    
    type CreatePseudoFunction = js.Function1[/* repeated */ Any, PseudoFunction]
    
    type FilterFunction = js.Function2[/* element */ String, /* repeated */ String, Boolean]
    
    type FilterFunctions = StringDictionary[FilterFunction]
    
    type FindFunction = js.Function3[
        /* match */ RegExpMatchArray, 
        /* context */ Element | Document, 
        /* isXML */ Boolean, 
        js.Array[Element] | Unit
      ]
    
    type FindFunctions = StringDictionary[FindFunction]
    
    type Matches = StringDictionary[js.RegExp]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Selectors] (val x: Self) extends AnyVal {
      
      inline def setAttrHandle(value: AttrHandleFunctions): Self = StObject.set(x, "attrHandle", value.asInstanceOf[js.Any])
      
      inline def setCacheLength(value: Double): Self = StObject.set(x, "cacheLength", value.asInstanceOf[js.Any])
      
      inline def setCreatePseudo(value: CreatePseudoFunction => PseudoFunction): Self = StObject.set(x, "createPseudo", js.Any.fromFunction1(value))
      
      inline def setFilter(value: FilterFunctions): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFind(value: FindFunctions): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: Matches): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setPreFilter(value: PreFilterFunctions): Self = StObject.set(x, "preFilter", value.asInstanceOf[js.Any])
      
      inline def setPseudos(value: PseudoFunctions): Self = StObject.set(x, "pseudos", value.asInstanceOf[js.Any])
      
      inline def setSetFilters(value: SetFilterFunctions): Self = StObject.set(x, "setFilters", value.asInstanceOf[js.Any])
    }
    
    type PreFilterFunction = js.Function1[/* match */ RegExpMatchArray, js.Array[String]]
    
    type PreFilterFunctions = StringDictionary[PreFilterFunction]
    
    type PseudoFunction = js.Function1[/* elem */ Element, Boolean]
    
    type PseudoFunctions = StringDictionary[PseudoFunction]
    
    type SetFilterFunction = js.Function3[
        /* elements */ js.Array[Element], 
        /* argument */ Double, 
        /* not */ Boolean, 
        js.Array[Element]
      ]
    
    type SetFilterFunctions = StringDictionary[SetFilterFunction]
  }
  
  @js.native
  trait SizzleStatic extends StObject {
    
    def apply(selector: String): js.Array[Element] = js.native
    def apply(selector: String, context: Document): js.Array[Element] = js.native
    def apply(selector: String, context: DocumentFragment): js.Array[Element] = js.native
    def apply(selector: String, context: Element): js.Array[Element] = js.native
    def apply[TArrayLike /* <: ArrayLike[Element] */](selector: String, context: DocumentFragment, results: TArrayLike): TArrayLike = js.native
    def apply[TArrayLike /* <: ArrayLike[Element] */](selector: String, context: Document, results: TArrayLike): TArrayLike = js.native
    def apply[TArrayLike /* <: ArrayLike[Element] */](selector: String, context: Element, results: TArrayLike): TArrayLike = js.native
    
    // tslint:disable-next-line:ban-types
    def compile(selector: String): js.Function = js.native
    
    def matches(selector: String, elements: js.Array[Element]): js.Array[Element] = js.native
    
    def matchesSelector(element: Element, selector: String): Boolean = js.native
    
    var selectors: Selectors = js.native
  }
  
  type _To = SizzleStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SizzleStatic = ^
}
