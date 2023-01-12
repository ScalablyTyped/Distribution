package typings.raml1Parser

import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWrapperHelperStubMod {
  
  @JSImport("raml-1-parser/dist/wrapperHelperStub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def completeRelativeUri(res: Resource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("completeRelativeUri")(res.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Opt[T] extends StObject {
    
    def getOrElse(v: T): T
  }
  object Opt {
    
    inline def apply[T](getOrElse: T => T): Opt[T] = {
      val __obj = js.Dynamic.literal(getOrElse = js.Any.fromFunction1(getOrElse))
      __obj.asInstanceOf[Opt[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Opt[?], T] (val x: Self & Opt[T]) extends AnyVal {
      
      inline def setGetOrElse(value: T => T): Self = StObject.set(x, "getOrElse", js.Any.fromFunction1(value))
    }
  }
  
  trait SchemaDef extends StObject {
    
    def content(): Any
    
    def name(): Any
  }
  object SchemaDef {
    
    inline def apply(content: () => Any, name: () => Any): SchemaDef = {
      val __obj = js.Dynamic.literal(content = js.Any.fromFunction0(content), name = js.Any.fromFunction0(name))
      __obj.asInstanceOf[SchemaDef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SchemaDef] (val x: Self) extends AnyVal {
      
      inline def setContent(value: () => Any): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
      
      inline def setName(value: () => Any): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
    }
  }
}
