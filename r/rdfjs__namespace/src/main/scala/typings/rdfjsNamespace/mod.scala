package typings.rdfjsNamespace

import org.scalablytyped.runtime.StringDictionary
import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.NamedNode
import typings.rdfJs.mod.Quad
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(baseIRI: String): NamespaceBuilder = ^.asInstanceOf[js.Dynamic].apply(baseIRI.asInstanceOf[js.Any]).asInstanceOf[NamespaceBuilder]
  inline def apply(baseIRI: String, options: BuilderOptions): NamespaceBuilder = (^.asInstanceOf[js.Dynamic].apply(baseIRI.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NamespaceBuilder]
  
  @JSImport("@rdfjs/namespace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait BuilderOptions extends StObject {
    
    var factory: js.UndefOr[DataFactory[Quad, Quad]] = js.undefined
  }
  object BuilderOptions {
    
    inline def apply(): BuilderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuilderOptions]
    }
    
    extension [Self <: BuilderOptions](x: Self) {
      
      inline def setFactory(value: DataFactory[Quad, Quad]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
    }
  }
  
  @js.native
  trait NamespaceBuilder
    extends StObject
       with /* property */ StringDictionary[NamedNode[String]] {
    
    def apply(): NamedNode[String] = js.native
    def apply(property: String): NamedNode[String] = js.native
    def apply(property: TemplateStringsArray): NamedNode[String] = js.native
  }
}
