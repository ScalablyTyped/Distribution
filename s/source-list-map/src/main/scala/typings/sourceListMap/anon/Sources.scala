package typings.sourceListMap.anon

import typings.sourceListMap.mod.CodeNode
import typings.sourceListMap.mod.SourceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sources extends js.Object {
  var mappings: String = js.native
  var sources: js.Array[String | SourceNode | CodeNode] = js.native
  var sourcesContent: js.Array[String] = js.native
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
  @scala.inline
  implicit class SourcesOps[Self <: Sources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMappings(value: String): Self = this.set("mappings", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcesVarargs(value: (String | SourceNode | CodeNode)*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[String | SourceNode | CodeNode]): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcesContentVarargs(value: String*): Self = this.set("sourcesContent", js.Array(value :_*))
    @scala.inline
    def setSourcesContent(value: js.Array[String]): Self = this.set("sourcesContent", value.asInstanceOf[js.Any])
  }
  
}

