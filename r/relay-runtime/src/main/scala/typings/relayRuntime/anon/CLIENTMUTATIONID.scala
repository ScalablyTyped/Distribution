package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.PageInfo
import typings.relayRuntime.relayRuntimeStrings.clientMutationId
import typings.relayRuntime.relayRuntimeStrings.cursor
import typings.relayRuntime.relayRuntimeStrings.edges
import typings.relayRuntime.relayRuntimeStrings.endCursor
import typings.relayRuntime.relayRuntimeStrings.hasNextPage
import typings.relayRuntime.relayRuntimeStrings.hasPreviousPage
import typings.relayRuntime.relayRuntimeStrings.node
import typings.relayRuntime.relayRuntimeStrings.pageInfo_
import typings.relayRuntime.relayRuntimeStrings.startCursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CLIENTMUTATIONID extends js.Object {
  
  var CLIENT_MUTATION_ID: clientMutationId = js.native
  
  var CURSOR: cursor = js.native
  
  var EDGES: edges = js.native
  
  var EDGES_HAVE_SOURCE_FIELD: Boolean = js.native
  
  var END_CURSOR: endCursor = js.native
  
  var HAS_NEXT_PAGE: hasNextPage = js.native
  
  var HAS_PREV_PAGE: hasPreviousPage = js.native
  
  var NODE: node = js.native
  
  var PAGE_INFO: pageInfo_ = js.native
  
  var PAGE_INFO_TYPE: PageInfo = js.native
  
  var START_CURSOR: startCursor = js.native
}
object CLIENTMUTATIONID {
  
  @scala.inline
  def apply(
    CLIENT_MUTATION_ID: clientMutationId,
    CURSOR: cursor,
    EDGES: edges,
    EDGES_HAVE_SOURCE_FIELD: Boolean,
    END_CURSOR: endCursor,
    HAS_NEXT_PAGE: hasNextPage,
    HAS_PREV_PAGE: hasPreviousPage,
    NODE: node,
    PAGE_INFO: pageInfo_,
    PAGE_INFO_TYPE: PageInfo,
    START_CURSOR: startCursor
  ): CLIENTMUTATIONID = {
    val __obj = js.Dynamic.literal(CLIENT_MUTATION_ID = CLIENT_MUTATION_ID.asInstanceOf[js.Any], CURSOR = CURSOR.asInstanceOf[js.Any], EDGES = EDGES.asInstanceOf[js.Any], EDGES_HAVE_SOURCE_FIELD = EDGES_HAVE_SOURCE_FIELD.asInstanceOf[js.Any], END_CURSOR = END_CURSOR.asInstanceOf[js.Any], HAS_NEXT_PAGE = HAS_NEXT_PAGE.asInstanceOf[js.Any], HAS_PREV_PAGE = HAS_PREV_PAGE.asInstanceOf[js.Any], NODE = NODE.asInstanceOf[js.Any], PAGE_INFO = PAGE_INFO.asInstanceOf[js.Any], PAGE_INFO_TYPE = PAGE_INFO_TYPE.asInstanceOf[js.Any], START_CURSOR = START_CURSOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[CLIENTMUTATIONID]
  }
  
  @scala.inline
  implicit class CLIENTMUTATIONIDOps[Self <: CLIENTMUTATIONID] (val x: Self) extends AnyVal {
    
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
    def setCLIENT_MUTATION_ID(value: clientMutationId): Self = this.set("CLIENT_MUTATION_ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCURSOR(value: cursor): Self = this.set("CURSOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEDGES(value: edges): Self = this.set("EDGES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEDGES_HAVE_SOURCE_FIELD(value: Boolean): Self = this.set("EDGES_HAVE_SOURCE_FIELD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEND_CURSOR(value: endCursor): Self = this.set("END_CURSOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHAS_NEXT_PAGE(value: hasNextPage): Self = this.set("HAS_NEXT_PAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHAS_PREV_PAGE(value: hasPreviousPage): Self = this.set("HAS_PREV_PAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNODE(value: node): Self = this.set("NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPAGE_INFO(value: pageInfo_): Self = this.set("PAGE_INFO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPAGE_INFO_TYPE(value: PageInfo): Self = this.set("PAGE_INFO_TYPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTART_CURSOR(value: startCursor): Self = this.set("START_CURSOR", value.asInstanceOf[js.Any])
  }
}
