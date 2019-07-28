package typings.relayDashRuntime

import typings.relayDashRuntime.relayDashRuntimeStrings.PageInfo
import typings.relayDashRuntime.relayDashRuntimeStrings.clientMutationId
import typings.relayDashRuntime.relayDashRuntimeStrings.cursor
import typings.relayDashRuntime.relayDashRuntimeStrings.edges
import typings.relayDashRuntime.relayDashRuntimeStrings.endCursor
import typings.relayDashRuntime.relayDashRuntimeStrings.hasNextPage
import typings.relayDashRuntime.relayDashRuntimeStrings.hasPreviousPage
import typings.relayDashRuntime.relayDashRuntimeStrings.node
import typings.relayDashRuntime.relayDashRuntimeStrings.pageInfo
import typings.relayDashRuntime.relayDashRuntimeStrings.startCursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CLIENTMUTATIONID extends js.Object {
  var CLIENT_MUTATION_ID: clientMutationId
  var CURSOR: cursor
  var EDGES: edges
  var EDGES_HAVE_SOURCE_FIELD: Boolean
  var END_CURSOR: endCursor
  var HAS_NEXT_PAGE: hasNextPage
  var HAS_PREV_PAGE: hasPreviousPage
  var NODE: node
  var PAGE_INFO: pageInfo
  var PAGE_INFO_TYPE: PageInfo
  var START_CURSOR: startCursor
}

object Anon_CLIENTMUTATIONID {
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
    PAGE_INFO: pageInfo,
    PAGE_INFO_TYPE: PageInfo,
    START_CURSOR: startCursor
  ): Anon_CLIENTMUTATIONID = {
    val __obj = js.Dynamic.literal(CLIENT_MUTATION_ID = CLIENT_MUTATION_ID, CURSOR = CURSOR, EDGES = EDGES, EDGES_HAVE_SOURCE_FIELD = EDGES_HAVE_SOURCE_FIELD, END_CURSOR = END_CURSOR, HAS_NEXT_PAGE = HAS_NEXT_PAGE, HAS_PREV_PAGE = HAS_PREV_PAGE, NODE = NODE, PAGE_INFO = PAGE_INFO, PAGE_INFO_TYPE = PAGE_INFO_TYPE, START_CURSOR = START_CURSOR)
  
    __obj.asInstanceOf[Anon_CLIENTMUTATIONID]
  }
}

