package typings.rdfjsEnvironment

import org.scalablytyped.runtime.Shortcut
import typings.rdfjsNamespace.factoryMod.NamespaceFactory
import typings.rdfjsNamespace.factoryMod.NamespaceFactoryCtor
import typings.rdfjsNamespace.mod.NamespaceBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespaceFactoryMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@rdfjs/environment/NamespaceFactory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with NamespaceFactory {
    
    // eslint-disable-next-line no-unnecessary-generics
    /* CompleteClass */
    override def namespace[TermNames /* <: String */](baseIRI: String): NamespaceBuilder[TermNames] = js.native
  }
  @JSImport("@rdfjs/environment/NamespaceFactory", JSImport.Default)
  @js.native
  val default: NamespaceFactoryCtor = js.native
  
  type _To = NamespaceFactoryCtor
  
  /* This means you don't have to write `default`, but can instead just say `namespaceFactoryMod.foo` */
  override def _to: NamespaceFactoryCtor = default
}
