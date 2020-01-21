package typings.prosemirrorSchemaBasic

import typings.prosemirrorModel.mod.MarkSpec
import typings.prosemirrorModel.mod.NodeSpec
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-schema-basic", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var schema: Schema[String, String] = js.native
  @js.native
  object marks extends js.Object {
    var code: MarkSpec = js.native
    var em: MarkSpec = js.native
    var link: MarkSpec = js.native
    var strong: MarkSpec = js.native
  }
  
  @js.native
  object nodes extends js.Object {
    var blockquote: NodeSpec = js.native
    var code_block: NodeSpec = js.native
    var doc: NodeSpec = js.native
    var hard_break: NodeSpec = js.native
    var heading: NodeSpec = js.native
    var horizontal_rule: NodeSpec = js.native
    var image: NodeSpec = js.native
    var paragraph: NodeSpec = js.native
    var text: NodeSpec = js.native
  }
  
}

