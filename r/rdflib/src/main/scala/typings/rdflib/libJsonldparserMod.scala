package typings.rdflib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldparserMod {
  
  @JSImport("rdflib/lib/jsonldparser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(str: Any, kb: Any, base: Any, callback: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], kb.asInstanceOf[js.Any], base.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def jsonldObjectToTerm(kb: Any, obj: Any): /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Literal */ Any = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonldObjectToTerm")(kb.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Literal */ Any]
}
