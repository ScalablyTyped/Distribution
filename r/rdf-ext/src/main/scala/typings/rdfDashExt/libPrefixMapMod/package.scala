package typings.rdfDashExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPrefixMapMod {
  import typings.rdfDashJs.rdfDashJsMod.NamedNode
  import typings.std.Record

  type Prefixes = PrefixMap | PrefixesRecord
  type PrefixesRecord = Record[String, NamedNode | String]
}
