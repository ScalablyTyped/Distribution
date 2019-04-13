package typings
package sizzleLib.sizzleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorsNs {
  type AttrHandleFunction = js.Function3[
    /* elem */ js.Any, 
    /* casePreservedName */ java.lang.String, 
    /* isXML */ scala.Boolean, 
    java.lang.String
  ]
  type AttrHandleFunctions = org.scalablytyped.runtime.StringDictionary[AttrHandleFunction]
  type CreatePseudoFunction = js.Function1[/* repeated */ js.Any, PseudoFunction]
  type FilterFunction = js.Function2[/* element */ java.lang.String, /* repeated */ java.lang.String, scala.Boolean]
  type FilterFunctions = org.scalablytyped.runtime.StringDictionary[FilterFunction]
  type FindFunction = js.Function3[
    /* match */ stdLib.RegExpMatchArray, 
    /* context */ stdLib.Element | stdLib.Document, 
    /* isXML */ scala.Boolean, 
    js.Array[stdLib.Element] | scala.Unit
  ]
  type FindFunctions = org.scalablytyped.runtime.StringDictionary[FindFunction]
  type Matches = org.scalablytyped.runtime.StringDictionary[stdLib.RegExp]
  type PreFilterFunction = js.Function1[/* match */ stdLib.RegExpMatchArray, js.Array[java.lang.String]]
  type PreFilterFunctions = org.scalablytyped.runtime.StringDictionary[PreFilterFunction]
  type PseudoFunction = js.Function1[/* elem */ stdLib.Element, scala.Boolean]
  type PseudoFunctions = org.scalablytyped.runtime.StringDictionary[PseudoFunction]
  type SetFilterFunction = js.Function3[
    /* elements */ js.Array[stdLib.Element], 
    /* argument */ scala.Double, 
    /* not */ scala.Boolean, 
    js.Array[stdLib.Element]
  ]
  type SetFilterFunctions = org.scalablytyped.runtime.StringDictionary[SetFilterFunction]
}
