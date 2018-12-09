package typings
package rdflibLib.rdflibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Util")
@js.native
object UtilNs extends js.Object {
  /**
       * Loads ontologies of the data we load (this is the callback from the kb to
       * the fetcher). Exports as `AJAR_handleNewTerm`
       * @param kb The store
       * @param p A property
       * @param requestedBy
       */
  def AJAR_handleNewTerm(kb: rdflibLib.rdflibMod.Formula, p: rdflibLib.rdflibMod.NamedNode, requestedBy: java.lang.String): js.Promise[_] = js.native
  /**
       * Gets a named node from the name of a relation
       * @param relation The name of a relation
       */
  def linkRelationProperty(relation: java.lang.String): rdflibLib.rdflibMod.NamedNode = js.native
  /**
       * Gets a named node for a media type
       * @param mediaType A media type
       */
  def mediaTypeClass(mediaType: java.lang.String): rdflibLib.rdflibMod.NamedNode = js.native
}

