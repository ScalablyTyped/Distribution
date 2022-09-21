package typings.rdfjsNamespace

import typings.rdfjsTypes.dataModelMod.DataFactory
import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Quad
import typings.std.Record
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/namespace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TermNames /* <: String */](baseIRI: String): NamespaceBuilder[TermNames] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(baseIRI.asInstanceOf[js.Any]).asInstanceOf[NamespaceBuilder[TermNames]]
  inline def default[TermNames /* <: String */](baseIRI: String, options: BuilderOptions): NamespaceBuilder[TermNames] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(baseIRI.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NamespaceBuilder[TermNames]]
  
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
  
  type NamespaceBuilder[TermNames /* <: String */] = (Record[TermNames, NamedNode[String]]) & (js.Function1[/* property */ js.UndefOr[TemplateStringsArray | TermNames], NamedNode[String]])
}
