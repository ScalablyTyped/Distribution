package typings.rdfjsTermSet

import typings.rdfjsTermSet.rdfjsTermSetStrings.termSet
import typings.rdfjsTypes.dataModelMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@rdfjs/term-set/Factory", JSImport.Default)
  @js.native
  open class default () extends TermSetFactory
  /* static members */
  object default {
    
    @JSImport("@rdfjs/term-set/Factory", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@rdfjs/term-set/Factory", "default.exports")
    @js.native
    def exports: js.Array[termSet] = js.native
    inline def exports_=(x: js.Array[termSet]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exports")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@rdfjs/term-set/Factory", "TermSetFactory")
  @js.native
  open class TermSetFactory () extends StObject {
    
    def termSet[T /* <: Term */](): typings.rdfjsTermSet.mod.default[T] = js.native
    def termSet[T /* <: Term */](terms: js.Array[T]): typings.rdfjsTermSet.mod.default[T] = js.native
  }
  /* static members */
  object TermSetFactory {
    
    @JSImport("@rdfjs/term-set/Factory", "TermSetFactory")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@rdfjs/term-set/Factory", "TermSetFactory.exports")
    @js.native
    def exports: js.Array[termSet] = js.native
    inline def exports_=(x: js.Array[termSet]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exports")(x.asInstanceOf[js.Any])
  }
}
