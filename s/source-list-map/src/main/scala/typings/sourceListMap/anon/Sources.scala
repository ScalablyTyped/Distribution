package typings.sourceListMap.anon

import typings.sourceListMap.mod.CodeNode
import typings.sourceListMap.mod.SourceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sources extends js.Object {
  var mappings: String
  var sources: js.Array[String | SourceNode | CodeNode]
  var sourcesContent: js.Array[String]
}

object Sources {
  @scala.inline
  def apply(
    mappings: String,
    sources: js.Array[String | SourceNode | CodeNode],
    sourcesContent: js.Array[String]
  ): Sources = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sources]
  }
}

