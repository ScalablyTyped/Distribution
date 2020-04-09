package typings.rdfExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dataFactoryMod {
  // tslint:disable-next-line no-unnecessary-class
  type DataFactoryExt = typings.rdfJs.mod.DataFactory[typings.rdfExt.quadMod.QuadExt, typings.rdfJs.mod.Quad]
  type Prefixes = typings.rdfExt.prefixMapMod.^  | typings.rdfExt.dataFactoryMod.PrefixesRecord
  type PrefixesRecord = typings.std.Record[java.lang.String, typings.rdfJs.mod.NamedNode | java.lang.String]
}
