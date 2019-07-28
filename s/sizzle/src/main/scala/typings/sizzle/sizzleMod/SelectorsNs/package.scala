package typings.sizzle.sizzleMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Document
import typings.std.Element
import typings.std.RegExp
import typings.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorsNs {
  type AttrHandleFunction = js.Function3[/* elem */ js.Any, /* casePreservedName */ String, /* isXML */ Boolean, String]
  type AttrHandleFunctions = StringDictionary[AttrHandleFunction]
  type CreatePseudoFunction = js.Function1[/* repeated */ js.Any, PseudoFunction]
  type FilterFunction = js.Function2[/* element */ String, /* repeated */ String, Boolean]
  type FilterFunctions = StringDictionary[FilterFunction]
  type FindFunction = js.Function3[
    /* match */ RegExpMatchArray, 
    /* context */ Element | Document, 
    /* isXML */ Boolean, 
    js.Array[Element] | Unit
  ]
  type FindFunctions = StringDictionary[FindFunction]
  type Matches = StringDictionary[RegExp]
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
