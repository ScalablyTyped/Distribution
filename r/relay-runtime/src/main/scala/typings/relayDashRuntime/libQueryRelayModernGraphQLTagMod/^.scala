package typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod

import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderInlineDataFragment
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderPaginationFragment
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderRefetchableFragment
import typings.relayDashRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/query/RelayModernGraphQLTag", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getFragment(taggedNode: GraphQLTaggedNode): ReaderFragment = js.native
  def getInlineDataFragment(taggedNode: GraphQLTaggedNode): ReaderInlineDataFragment = js.native
  def getNode(taggedNode: js.Any): js.Any = js.native
  def getPaginationFragment(taggedNode: GraphQLTaggedNode): ReaderPaginationFragment | Null = js.native
  def getRefetchableFragment(taggedNode: GraphQLTaggedNode): ReaderRefetchableFragment | Null = js.native
  def getRequest(taggedNode: GraphQLTaggedNode): ConcreteRequest = js.native
  def graphql(strings: js.Any): GraphQLTaggedNode = js.native
  def isFragment(node: GraphQLTaggedNode): Boolean = js.native
  def isInlineDataFragment(node: GraphQLTaggedNode): Boolean = js.native
  def isRequest(node: GraphQLTaggedNode): Boolean = js.native
}

