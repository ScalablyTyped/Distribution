package typings.rdfjsNamespace

import typings.rdfjsNamespace.mod.NamespaceBuilder
import typings.rdfjsNamespace.rdfjsNamespaceStrings.namespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@rdfjs/namespace/Factory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Factory {
    
    /* CompleteClass */
    override def namespace(baseIRI: String): NamespaceBuilder[Any] = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@rdfjs/namespace/Factory", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@rdfjs/namespace/Factory", "default.exports")
    @js.native
    def exports: js.Array[namespace] = js.native
    inline def exports_=(x: js.Array[namespace]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exports")(x.asInstanceOf[js.Any])
  }
  
  trait Factory extends StObject {
    
    def namespace(baseIRI: String): NamespaceBuilder[Any]
  }
  object Factory {
    
    inline def apply(namespace: String => NamespaceBuilder[Any]): Factory = {
      val __obj = js.Dynamic.literal(namespace = js.Any.fromFunction1(namespace))
      __obj.asInstanceOf[Factory]
    }
    
    extension [Self <: Factory](x: Self) {
      
      inline def setNamespace(value: String => NamespaceBuilder[Any]): Self = StObject.set(x, "namespace", js.Any.fromFunction1(value))
    }
  }
}
