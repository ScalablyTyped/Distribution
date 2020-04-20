package typings.remarkStringify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Compiler = typings.remarkStringify.mod.RemarkCompiler
  type Visitor = js.Function2[
    /* node */ typings.unist.mod.Node, 
    /* parent */ js.UndefOr[typings.unist.mod.Parent], 
    java.lang.String
  ]
}
