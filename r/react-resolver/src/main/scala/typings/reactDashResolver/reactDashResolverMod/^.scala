package typings.reactDashResolver.reactDashResolverMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.StatelessComponent
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-resolver", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Resolver: typings.reactDashResolver.reactDashResolverMod.Resolver = js.native
  def client(loadingComponent: ComponentType[_]): js.Function1[/* component */ ComponentType[_], StatelessComponent[_]] = js.native
  def context[K /* <: String */](prop: K): js.Function1[/* component */ ComponentType[_], StatelessComponent[js.Any with (Record[K, _])]] = js.native
  def resolve[OwnProps, ResolvableProps, MoreProps](
    resolversMap: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof ResolvableProps ]: react-resolver.react-resolver.ResolveFn<OwnProps & MoreProps, ResolvableProps[K]>}
    */ typings.reactDashResolver.reactDashResolverStrings.resolve with ResolvableProps
  ): js.Function1[
    /* component */ ComponentType[
      OwnProps with typings.reactDashResolver.reactDashResolverStrings.resolve with ResolvableProps
    ], 
    StatelessComponent[OwnProps with MoreProps]
  ] = js.native
  def resolve[OwnProps, K /* <: String */, V, MoreProps](prop: K, resolveFn: ResolveFn[OwnProps with MoreProps, V]): js.Function1[
    /* component */ ComponentType[
      OwnProps with typings.reactDashResolver.reactDashResolverStrings.resolve with js.Any
    ], 
    StatelessComponent[OwnProps with MoreProps]
  ] = js.native
}

