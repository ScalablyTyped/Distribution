package typings.rdfExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dataFactoryMod {
  type Prefixes = typings.rdfExt.prefixMapMod.^  | typings.rdfExt.dataFactoryMod.PrefixesRecord
  type PrefixesRecord = typings.std.Record[java.lang.String, typings.rdfJs.mod.NamedNode | java.lang.String]
}
