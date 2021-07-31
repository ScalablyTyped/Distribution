package typings.relayRuntime

import typings.relayRuntime.mod.FragmentRef
import typings.relayRuntime.mod.RefType
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readInlineDataMod {
  
  @JSImport("relay-runtime/lib/store/readInlineData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def readInlineData[T /* <: RefType[js.Any] */](fragment: GraphQLTaggedNode): js.UndefOr[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragment.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T | Null]]
  @scala.inline
  def readInlineData[T /* <: RefType[js.Any] */](fragment: GraphQLTaggedNode, ref: FragmentRef[T]): js.UndefOr[T | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragment.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | Null]]
  
  @scala.inline
  def readInlineData_T_RefTypeAny_T[T /* <: RefType[js.Any] */](fragment: GraphQLTaggedNode, ref: FragmentRef[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragment.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[T]
}
