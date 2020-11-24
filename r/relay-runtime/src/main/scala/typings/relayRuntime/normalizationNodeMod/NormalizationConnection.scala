package typings.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizationConnection extends js.Object {
  
  var args: js.Array[NormalizationArgument] = js.native
  
  var edges: NormalizationLinkedField = js.native
  
  var kind: String = js.native
  
  var label: String = js.native
  
  var name: String = js.native
  
  var pageInfo: NormalizationLinkedField = js.native
}
object NormalizationConnection {
  
  @scala.inline
  def apply(
    args: js.Array[NormalizationArgument],
    edges: NormalizationLinkedField,
    kind: String,
    label: String,
    name: String,
    pageInfo: NormalizationLinkedField
  ): NormalizationConnection = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationConnection]
  }
  
  @scala.inline
  implicit class NormalizationConnectionOps[Self <: NormalizationConnection] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: NormalizationArgument*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[NormalizationArgument]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdges(value: NormalizationLinkedField): Self = this.set("edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInfo(value: NormalizationLinkedField): Self = this.set("pageInfo", value.asInstanceOf[js.Any])
  }
}
