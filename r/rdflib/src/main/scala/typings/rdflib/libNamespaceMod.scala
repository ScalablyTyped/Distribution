package typings.rdflib

import typings.rdflib.libTfTypesMod.NamedNode
import typings.rdflib.libTfTypesMod.RdfJsDataFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNamespaceMod {
  
  @JSImport("rdflib/lib/namespace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(nsuri: String): js.Function1[/* ln */ String, NamedNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(nsuri.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ln */ String, NamedNode]]
  inline def default(nsuri: String, factory: RdfJsDataFactory): js.Function1[/* ln */ String, NamedNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(nsuri.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ln */ String, NamedNode]]
}
