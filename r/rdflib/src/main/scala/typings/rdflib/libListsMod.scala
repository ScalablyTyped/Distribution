package typings.rdflib

import typings.rdflib.libStoreMod.default
import typings.rdflib.libTfTypesMod.NamedNode
import typings.rdflib.libTfTypesMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libListsMod {
  
  @JSImport("rdflib/lib/lists", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertFirstRestNil(store: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("convertFirstRestNil")(store.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def convertFirstRestNil(store: default, doc: NamedNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertFirstRestNil")(store.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def substituteInDoc(store: default, x: Term, y: Term): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("substituteInDoc")(store.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def substituteInDoc(store: default, x: Term, y: Term, doc: NamedNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("substituteInDoc")(store.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def substituteNillsInDoc(store: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("substituteNillsInDoc")(store.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def substituteNillsInDoc(store: default, doc: NamedNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("substituteNillsInDoc")(store.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
