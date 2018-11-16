package typings
package reactDashResolverLib.reactDashResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-resolver", JSImport.Namespace)
@js.native
object reactDashResolverModMembers extends js.Object {
  val Resolver: Resolver = js.native
  def client(loadingComponent: reactLib.reactMod.ReactNs.ComponentType[_]): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactLib.reactMod.ReactNs.StatelessComponent[_]
  ] = js.native
  def context[K /* <: java.lang.String */](prop: K): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactLib.reactMod.ReactNs.StatelessComponent[js.Any with (stdLib.Record[K, _])]
  ] = js.native
  def resolve[OwnProps, ResolvableProps, MoreProps](resolversMap: reactDashResolverLib.reactDashResolverLibStrings.resolve with ResolvableProps): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[
      OwnProps with reactDashResolverLib.reactDashResolverLibStrings.resolve with ResolvableProps
    ], 
    reactLib.reactMod.ReactNs.StatelessComponent[OwnProps with MoreProps]
  ] = js.native
  def resolve[OwnProps, K /* <: java.lang.String */, V, MoreProps](prop: K, resolveFn: ResolveFn[OwnProps with MoreProps, V]): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[
      OwnProps with reactDashResolverLib.reactDashResolverLibStrings.resolve with js.Any
    ], 
    reactLib.reactMod.ReactNs.StatelessComponent[OwnProps with MoreProps]
  ] = js.native
}

