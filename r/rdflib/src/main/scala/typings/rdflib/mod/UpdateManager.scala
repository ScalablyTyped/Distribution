package typings.rdflib.mod

import typings.rdflib.updateManagerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "UpdateManager")
@js.native
/**
  * @param  store - The quadstore to store data and metadata. Created if not passed.
  */
class UpdateManager () extends default {
  def this(store: typings.rdflib.storeMod.default) = this()
}

