package typings.rdflib

import typings.rdflib.anon.Flags
import typings.rdflib.tfTypesMod.BlankNode
import typings.rdflib.tfTypesMod.NamedNode
import typings.rdflib.typesMod.ContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializeMod {
  
  @JSImport("rdflib/lib/serialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    /** The graph or nodes that should be serialized */
  target: typings.rdflib.formulaMod.default | NamedNode | BlankNode | Null,
    /** The store */
  kb: typings.rdflib.formulaMod.default,
    base: js.UndefOr[Any],
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: js.UndefOr[String | ContentType],
    callback: js.UndefOr[
      js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[String], Any]
    ],
    options: js.UndefOr[Flags]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], kb.asInstanceOf[js.Any], base.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
}
