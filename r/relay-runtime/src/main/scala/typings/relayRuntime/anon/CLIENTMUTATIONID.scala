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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CLIENTMUTATIONID extends StObject {
  
  var CLIENT_MUTATION_ID: clientMutationId
  
  var CURSOR: cursor
  
  var EDGES: edges
  
  var EDGES_HAVE_SOURCE_FIELD: Boolean
  
  var END_CURSOR: endCursor
  
  var HAS_NEXT_PAGE: hasNextPage
  
  var HAS_PREV_PAGE: hasPreviousPage
  
  var NODE: node
  
  var PAGE_INFO: pageInfo_
  
  var PAGE_INFO_TYPE: PageInfo
  
  var START_CURSOR: startCursor
}
object CLIENTMUTATIONID {
  
  inline def apply(EDGES_HAVE_SOURCE_FIELD: Boolean): CLIENTMUTATIONID = {
    val __obj = js.Dynamic.literal(CLIENT_MUTATION_ID = "clientMutationId", CURSOR = "cursor", EDGES = "edges", EDGES_HAVE_SOURCE_FIELD = EDGES_HAVE_SOURCE_FIELD.asInstanceOf[js.Any], END_CURSOR = "endCursor", HAS_NEXT_PAGE = "hasNextPage", HAS_PREV_PAGE = "hasPreviousPage", NODE = "node", PAGE_INFO = "pageInfo", PAGE_INFO_TYPE = "PageInfo", START_CURSOR = "startCursor")
    __obj.asInstanceOf[CLIENTMUTATIONID]
  }
  
  extension [Self <: CLIENTMUTATIONID](x: Self) {
    
    inline def setCLIENT_MUTATION_ID(value: clientMutationId): Self = StObject.set(x, "CLIENT_MUTATION_ID", value.asInstanceOf[js.Any])
    
    inline def setCURSOR(value: cursor): Self = StObject.set(x, "CURSOR", value.asInstanceOf[js.Any])
    
    inline def setEDGES(value: edges): Self = StObject.set(x, "EDGES", value.asInstanceOf[js.Any])
    
    inline def setEDGES_HAVE_SOURCE_FIELD(value: Boolean): Self = StObject.set(x, "EDGES_HAVE_SOURCE_FIELD", value.asInstanceOf[js.Any])
    
    inline def setEND_CURSOR(value: endCursor): Self = StObject.set(x, "END_CURSOR", value.asInstanceOf[js.Any])
    
    inline def setHAS_NEXT_PAGE(value: hasNextPage): Self = StObject.set(x, "HAS_NEXT_PAGE", value.asInstanceOf[js.Any])
    
    inline def setHAS_PREV_PAGE(value: hasPreviousPage): Self = StObject.set(x, "HAS_PREV_PAGE", value.asInstanceOf[js.Any])
    
    inline def setNODE(value: node): Self = StObject.set(x, "NODE", value.asInstanceOf[js.Any])
    
    inline def setPAGE_INFO(value: pageInfo_): Self = StObject.set(x, "PAGE_INFO", value.asInstanceOf[js.Any])
    
    inline def setPAGE_INFO_TYPE(value: PageInfo): Self = StObject.set(x, "PAGE_INFO_TYPE", value.asInstanceOf[js.Any])
    
    inline def setSTART_CURSOR(value: startCursor): Self = StObject.set(x, "START_CURSOR", value.asInstanceOf[js.Any])
  }
}
