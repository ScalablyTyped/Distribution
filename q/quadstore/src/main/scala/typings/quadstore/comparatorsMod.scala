package typings.quadstore

import typings.quadstore.quadstoreNumbers.`-1`
import typings.quadstore.quadstoreNumbers.`0`
import typings.quadstore.quadstoreNumbers.`1`
import typings.quadstore.typesMod.Binding
import typings.quadstore.typesMod.TermName
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comparatorsMod {
  
  @JSImport("quadstore/dist/cjs/utils/comparators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBindingComparator(): js.Function2[/* a */ Binding, /* b */ Binding, `-1` | `0` | `1`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBindingComparator")().asInstanceOf[js.Function2[/* a */ Binding, /* b */ Binding, `-1` | `0` | `1`]]
  inline def getBindingComparator(_termNames: js.Array[String]): js.Function2[/* a */ Binding, /* b */ Binding, `-1` | `0` | `1`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBindingComparator")(_termNames.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ Binding, /* b */ Binding, `-1` | `0` | `1`]]
  
  inline def getQuadComparator(): js.Function2[/* a */ Quad, /* b */ Quad, `-1` | `0` | `1`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQuadComparator")().asInstanceOf[js.Function2[/* a */ Quad, /* b */ Quad, `-1` | `0` | `1`]]
  inline def getQuadComparator(_termNames: js.Array[TermName]): js.Function2[/* a */ Quad, /* b */ Quad, `-1` | `0` | `1`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQuadComparator")(_termNames.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ Quad, /* b */ Quad, `-1` | `0` | `1`]]
  
  inline def getTermComparator(): js.Function2[/* a */ Term, /* b */ Term, `-1` | `0` | `1`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTermComparator")().asInstanceOf[js.Function2[/* a */ Term, /* b */ Term, `-1` | `0` | `1`]]
}
