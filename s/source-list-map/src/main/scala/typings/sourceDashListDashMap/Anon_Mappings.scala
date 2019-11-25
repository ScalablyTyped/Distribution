package typings.sourceDashListDashMap

import typings.sourceDashListDashMap.sourceDashListDashMapMod.CodeNode
import typings.sourceDashListDashMap.sourceDashListDashMapMod.SourceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mappings extends js.Object {
  var mappings: String
  var sources: js.Array[String | SourceNode | CodeNode]
  var sourcesContent: js.Array[String]
}

object Anon_Mappings {
  @scala.inline
  def apply(
    mappings: String,
    sources: js.Array[String | SourceNode | CodeNode],
    sourcesContent: js.Array[String]
  ): Anon_Mappings = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Mappings]
  }
}

