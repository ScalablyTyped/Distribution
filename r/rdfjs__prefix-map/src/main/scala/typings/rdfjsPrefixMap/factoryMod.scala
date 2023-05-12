package typings.rdfjsPrefixMap

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.rdfjsPrefixMap.prefixMapMod.PrefixMap
import typings.rdfjsPrefixMap.prefixMapMod.PrefixMapInit
import typings.rdfjsPrefixMap.rdfjsPrefixMapStrings.prefixMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@rdfjs/prefix-map/Factory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with PrefixMapFactory
  @JSImport("@rdfjs/prefix-map/Factory", JSImport.Default)
  @js.native
  val default: PrefixMapFactoryCtor = js.native
  
  @js.native
  trait PrefixMapFactory extends StObject {
    
    def prefixMap(): PrefixMap = js.native
    def prefixMap(prefixes: PrefixMapInit): PrefixMap = js.native
  }
  
  @js.native
  trait PrefixMapFactoryCtor
    extends StObject
       with Instantiable0[PrefixMapFactory] {
    
    var exports: js.Array[prefixMap] = js.native
  }
  
  type _To = PrefixMapFactoryCtor
  
  /* This means you don't have to write `default`, but can instead just say `factoryMod.foo` */
  override def _to: PrefixMapFactoryCtor = default
}
