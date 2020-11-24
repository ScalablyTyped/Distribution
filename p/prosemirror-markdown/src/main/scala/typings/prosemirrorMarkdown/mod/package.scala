package typings.prosemirrorMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type MarkSerializerMethod[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] = js.Function4[
    /* state */ typings.prosemirrorMarkdown.mod.MarkdownSerializerState[S], 
    /* mark */ typings.prosemirrorModel.mod.Mark[S], 
    /* parent */ typings.prosemirrorModel.mod.Fragment[S], 
    /* index */ scala.Double, 
    scala.Unit
  ]
}
