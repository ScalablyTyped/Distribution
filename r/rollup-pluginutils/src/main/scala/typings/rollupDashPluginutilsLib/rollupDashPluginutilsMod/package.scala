package typings
package rollupDashPluginutilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rollupDashPluginutilsMod {
  type AddExtension = js.Function2[
    /* filename */ java.lang.String, 
    /* ext */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type AttachScopes = js.Function2[
    /* ast */ estreeDashWalkerLib.estreeDashWalkerMod.Node, 
    /* propertyName */ js.UndefOr[java.lang.String], 
    AttachedScope
  ]
  type CreateFilter = js.Function3[
    /* include */ js.UndefOr[
      (js.Array[java.lang.String | stdLib.RegExp]) | java.lang.String | stdLib.RegExp | scala.Null
    ], 
    /* exclude */ js.UndefOr[
      (js.Array[java.lang.String | stdLib.RegExp]) | java.lang.String | stdLib.RegExp | scala.Null
    ], 
    /* options */ js.UndefOr[rollupDashPluginutilsLib.Anon_False], 
    js.Function1[/* id */ java.lang.String | js.Any, scala.Boolean]
  ]
  type DataToEsm = js.Function2[/* data */ js.Any, /* options */ js.UndefOr[DataToEsmOptions], java.lang.String]
  type ExtractAssignedNames = js.Function1[
    /* param */ estreeDashWalkerLib.estreeDashWalkerMod.Node, 
    js.Array[java.lang.String]
  ]
  type MakeLegalIdentifier = js.Function1[/* str */ java.lang.String, java.lang.String]
}
