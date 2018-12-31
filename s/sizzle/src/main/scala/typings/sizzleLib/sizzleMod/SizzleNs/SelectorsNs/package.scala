package typings
package sizzleLib.sizzleMod.SizzleNs

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
  type CreatePseudoFunction = js.Function1[/* repeated */ js.Any, PseudoFunction]
  type FilterFunction = js.Function2[/* element */ java.lang.String, /* repeated */ java.lang.String, scala.Boolean]
  type FindFunction = js.Function3[
    /* match */ stdLib.RegExpMatchArray, 
    /* context */ stdLib.Element | stdLib.Document, 
    /* isXML */ scala.Boolean, 
    js.Array[stdLib.Element] | scala.Unit
  ]
  type PreFilterFunction = js.Function1[/* match */ stdLib.RegExpMatchArray, js.Array[java.lang.String]]
  type PseudoFunction = js.Function1[/* elem */ stdLib.Element, scala.Boolean]
  type SetFilterFunction = js.Function3[
    /* elements */ js.Array[stdLib.Element], 
    /* argument */ scala.Double, 
    /* not */ scala.Boolean, 
    js.Array[stdLib.Element]
  ]
}
