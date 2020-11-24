package typings.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReaderConnection extends js.Object {
  
  val args: js.Array[ReaderArgument] = js.native
  
  val edges: ReaderLinkedField = js.native
  
  val kind: String = js.native
  
  val label: String = js.native
  
  val name: String = js.native
  
  val pageInfo: ReaderLinkedField = js.native
}
object ReaderConnection {
  
  @scala.inline
  def apply(
    args: js.Array[ReaderArgument],
    edges: ReaderLinkedField,
    kind: String,
    label: String,
    name: String,
    pageInfo: ReaderLinkedField
  ): ReaderConnection = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderConnection]
  }
  
  @scala.inline
  implicit class ReaderConnectionOps[Self <: ReaderConnection] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: ReaderArgument*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[ReaderArgument]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdges(value: ReaderLinkedField): Self = this.set("edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInfo(value: ReaderLinkedField): Self = this.set("pageInfo", value.asInstanceOf[js.Any])
  }
}
