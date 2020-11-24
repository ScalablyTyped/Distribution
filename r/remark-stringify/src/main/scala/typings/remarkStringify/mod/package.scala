package typings.remarkStringify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Compiler = typings.remarkStringify.mod.RemarkCompiler
  
  type Visitor = js.Function2[
    /* node */ typings.unist.mod.Node, 
    /* parent */ js.UndefOr[typings.unist.mod.Parent], 
    java.lang.String
  ]
}
