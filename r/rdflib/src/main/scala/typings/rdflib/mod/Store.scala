package typings.rdflib.mod

import typings.rdflib.formulaMod.FormulaOpts
import typings.rdflib.storeMod.FeaturesType
import typings.rdflib.storeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Store")
@js.native
/**
  * Creates a new formula
  * @param features - What sort of autmatic processing to do? Array of string
  * @param features.sameAs - Smush together A and B nodes whenever { A sameAs B }
  * @param opts
  * @param [opts.rdfFactory] - The data factory that should be used by the store
  * @param [opts.rdfArrayRemove] - Function which removes statements from the store
  * @param [opts.dataCallback] - Callback when a statement is added to the store, will not trigger when adding duplicates
  */
class Store () extends default {
  def this(features: FeaturesType) = this()
  def this(features: FeaturesType, opts: FormulaOpts) = this()
}

/* static members */
@JSImport("rdflib", "Store")
@js.native
object Store extends js.Object {
  var handleRDFType: js.Function = js.native
  /**
    * Gets the URI of the default graph
    */
  def defaultGraphURI: String = js.native
}

