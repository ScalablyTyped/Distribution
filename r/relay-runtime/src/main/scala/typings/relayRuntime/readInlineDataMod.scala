package typings.relayRuntime

import typings.relayRuntime.mod.FragmentRef
import typings.relayRuntime.mod.RefType
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readInlineDataMod {
  
  @JSImport("relay-runtime/lib/store/readInlineData", "readInlineData")
  @js.native
  def readInlineData[T /* <: RefType[_] */](fragment: GraphQLTaggedNode): js.UndefOr[T | Null] = js.native
  @JSImport("relay-runtime/lib/store/readInlineData", "readInlineData")
  @js.native
  def readInlineData[T /* <: RefType[_] */](fragment: GraphQLTaggedNode, ref: FragmentRef[T]): js.UndefOr[T | Null] = js.native
  @JSImport("relay-runtime/lib/store/readInlineData", "readInlineData")
  @js.native
  def readInlineData_T_RefTypeWildcard_T[T /* <: RefType[_] */](fragment: GraphQLTaggedNode, ref: FragmentRef[T]): T = js.native
}
