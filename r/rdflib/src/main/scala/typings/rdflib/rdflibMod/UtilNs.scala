package typings.rdflib.rdflibMod

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
  def AJAR_handleNewTerm(kb: Formula, p: NamedNode, requestedBy: String): js.Promise[_] = js.native
  /**
    * Gets a named node from the name of a relation
    * @param relation The name of a relation
    */
  def linkRelationProperty(relation: String): NamedNode = js.native
  /**
    * Gets a named node for a media type
    * @param mediaType A media type
    */
  def mediaTypeClass(mediaType: String): NamedNode = js.native
}

