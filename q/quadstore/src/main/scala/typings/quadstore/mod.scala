package typings.quadstore

import typings.quadstore.distCjsTypesMod.StoreOpts
import typings.quadstore.distCjsTypesMod.TermName
import typings.quadstore.quadstoreInts.`-1`
import typings.quadstore.quadstoreInts.`0`
import typings.quadstore.quadstoreInts.`1`
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("quadstore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("quadstore", "Quadstore")
  @js.native
  open class Quadstore protected ()
    extends typings.quadstore.distCjsQuadstoreMod.Quadstore {
    def this(opts: StoreOpts) = this()
  }
  
  @JSImport("quadstore", "ResultType")
  @js.native
  object ResultType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.quadstore.distCjsTypesMod.ResultType & String] = js.native
    
    /* "approximate_size" */ val APPROXIMATE_SIZE: typings.quadstore.distCjsTypesMod.ResultType.APPROXIMATE_SIZE & String = js.native
    
    /* "quads" */ val QUADS: typings.quadstore.distCjsTypesMod.ResultType.QUADS & String = js.native
    
    /* "void" */ val VOID: typings.quadstore.distCjsTypesMod.ResultType.VOID & String = js.native
  }
  
  inline def getQuadComparator(): js.Function2[/* a */ Quad, /* b */ Quad, `-1` | `0` | `1`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQuadComparator")().asInstanceOf[js.Function2[/* a */ Quad, /* b */ Quad, `-1` | `0` | `1`]]
  inline def getQuadComparator(_termNames: js.Array[TermName]): js.Function2[/* a */ Quad, /* b */ Quad, `-1` | `0` | `1`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQuadComparator")(_termNames.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ Quad, /* b */ Quad, `-1` | `0` | `1`]]
  
  inline def getTermComparator(): js.Function2[/* a */ Term, /* b */ Term, `-1` | `0` | `1`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTermComparator")().asInstanceOf[js.Function2[/* a */ Term, /* b */ Term, `-1` | `0` | `1`]]
}
