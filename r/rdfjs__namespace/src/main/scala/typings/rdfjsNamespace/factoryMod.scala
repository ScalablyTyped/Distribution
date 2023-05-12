package typings.rdfjsNamespace

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.rdfjsNamespace.mod.NamespaceBuilder
import typings.rdfjsNamespace.rdfjsNamespaceStrings.namespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@rdfjs/namespace/Factory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with NamespaceFactory {
    
    // eslint-disable-next-line no-unnecessary-generics
    /* CompleteClass */
    override def namespace[TermNames /* <: String */](baseIRI: String): NamespaceBuilder[TermNames] = js.native
  }
  @JSImport("@rdfjs/namespace/Factory", JSImport.Default)
  @js.native
  val default: NamespaceFactoryCtor = js.native
  
  trait NamespaceFactory extends StObject {
    
    // eslint-disable-next-line no-unnecessary-generics
    def namespace[TermNames /* <: String */](baseIRI: String): NamespaceBuilder[TermNames]
  }
  object NamespaceFactory {
    
    inline def apply(namespace: String => NamespaceBuilder[Any]): NamespaceFactory = {
      val __obj = js.Dynamic.literal(namespace = js.Any.fromFunction1(namespace))
      __obj.asInstanceOf[NamespaceFactory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NamespaceFactory] (val x: Self) extends AnyVal {
      
      inline def setNamespace(value: String => NamespaceBuilder[Any]): Self = StObject.set(x, "namespace", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait NamespaceFactoryCtor
    extends StObject
       with Instantiable0[NamespaceFactory] {
    
    var exports: js.Array[namespace] = js.native
  }
  
  type _To = NamespaceFactoryCtor
  
  /* This means you don't have to write `default`, but can instead just say `factoryMod.foo` */
  override def _to: NamespaceFactoryCtor = default
}
