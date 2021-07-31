package typings.rdfLoaderCode

import org.scalablytyped.runtime.Shortcut
import typings.rdfJs.mod.NamedNode
import typings.rdfLoadersRegistry.mod.Loader
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argumentsMod extends Shortcut {
  
  @JSImport("rdf-loader-code/arguments", JSImport.Namespace)
  @js.native
  val ^ : ArgumentsLoader = js.native
  
  type Arguments = js.Array[js.Any | (Record[String, js.Any])]
  
  @js.native
  trait ArgumentsLoader extends Loader[Arguments, Options] {
    
    def register(registry: typings.rdfLoadersRegistry.mod.^): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var basePath: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[js.Any] = js.undefined
    
    var property: js.UndefOr[NamedNode[String]] = js.undefined
    
    var variables: js.UndefOr[Map[String, js.Any]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setProperty(value: NamedNode[String]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setVariables(value: Map[String, js.Any]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  type _To = ArgumentsLoader
  
  /* This means you don't have to write `^`, but can instead just say `argumentsMod.foo` */
  override def _to: ArgumentsLoader = ^
}
