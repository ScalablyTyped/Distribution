package typings.rdfjsToNtriples

import typings.rdfjsTypes.dataModelMod.NamedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNamedNodeMod {
  
  inline def apply(namedNode: NamedNode[String]): String = ^.asInstanceOf[js.Dynamic].apply(namedNode.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@rdfjs/to-ntriples/lib/namedNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
