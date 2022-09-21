package typings.rdfjsTermMap

import typings.rdfjsTermMap.rdfjsTermMapStrings.termMap
import typings.rdfjsTypes.dataModelMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@rdfjs/term-map/Factory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Factory
  /* static members */
  object default {
    
    @JSImport("@rdfjs/term-map/Factory", "default.exports")
    @js.native
    val exports: js.Array[termMap] = js.native
  }
  
  @js.native
  trait Factory extends StObject {
    
    // tslint:disable-next-line:no-unnecessary-generics
    def termMap[T /* <: Term */, V](): typings.rdfjsTermMap.mod.default[T, V] = js.native
    def termMap[T /* <: Term */, V](entries: js.Array[js.Tuple2[Term, V]]): typings.rdfjsTermMap.mod.default[T, V] = js.native
  }
}
