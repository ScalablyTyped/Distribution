package typings.rdfjsTermMap

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.rdfjsTermMap.rdfjsTermMapStrings.termMap
import typings.rdfjsTypes.dataModelMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@rdfjs/term-map/Factory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TermMapFactory
  @JSImport("@rdfjs/term-map/Factory", JSImport.Default)
  @js.native
  val default: FactoryCtor = js.native
  
  @js.native
  trait FactoryCtor
    extends StObject
       with Instantiable0[TermMapFactory] {
    
    var exports: js.Array[termMap] = js.native
  }
  
  @js.native
  trait TermMapFactory extends StObject {
    
    // eslint-disable-next-line no-unnecessary-generics
    def termMap[T /* <: Term */, V](): typings.rdfjsTermMap.mod.default[T, V] = js.native
    def termMap[T /* <: Term */, V](entries: js.Array[js.Tuple2[T, V]]): typings.rdfjsTermMap.mod.default[T, V] = js.native
  }
  
  type _To = FactoryCtor
  
  /* This means you don't have to write `default`, but can instead just say `factoryMod.foo` */
  override def _to: FactoryCtor = default
}
