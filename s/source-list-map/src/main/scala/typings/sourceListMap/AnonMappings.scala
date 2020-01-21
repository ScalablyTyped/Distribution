package typings.sourceListMap

import typings.sourceListMap.mod.CodeNode
import typings.sourceListMap.mod.SourceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMappings extends js.Object {
  var mappings: String
  var sources: js.Array[String | SourceNode | CodeNode]
  var sourcesContent: js.Array[String]
}

object AnonMappings {
  @scala.inline
  def apply(
    mappings: String,
    sources: js.Array[String | SourceNode | CodeNode],
    sourcesContent: js.Array[String]
  ): AnonMappings = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMappings]
  }
}

