package typings.rdfDashExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDataFactoryMod {
  import typings.rdfDashJs.rdfDashJsMod.NamedNode
  import typings.std.Record

  type Prefixes = typings.rdfDashExt.libPrefixMapMod.^  | PrefixesRecord
  type PrefixesRecord = Record[String, NamedNode | String]
}
