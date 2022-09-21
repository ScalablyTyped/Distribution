package typings.reactResolver

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.react.mod.Factory
import typings.react.mod.FunctionComponent
import typings.reactResolver.anon.Data
import typings.std.Node
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Resolver extends StObject {
    
    def render(factory: Factory[Any]): Unit = js.native
    def render(factory: Factory[Any], root: Node): Unit = js.native
    
    def resolve[P](factory: Factory[P]): js.Promise[Data[P]] = js.native
  }
  @JSImport("react-resolver", "Resolver")
  @js.native
  val Resolver: typings.reactResolver.mod.Resolver = js.native
  
  inline def client(loadingComponent: ComponentType[Any]): js.Function1[/* component */ ComponentType[Any], FunctionComponent[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("client")(loadingComponent.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentType[Any], FunctionComponent[Any]]]
  
  inline def context[K /* <: String */](prop: K): js.Function1[/* component */ ComponentType[Any], FunctionComponent[Any & (Record[K, Any])]] = ^.asInstanceOf[js.Dynamic].applyDynamic("context")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentType[Any], FunctionComponent[Any & (Record[K, Any])]]]
  
  inline def resolve[OwnProps, ResolvableProps, MoreProps](
    resolversMap: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof ResolvableProps ]: react-resolver.react-resolver.ResolveFn<OwnProps & MoreProps, ResolvableProps[K]>}
    */ typings.reactResolver.reactResolverStrings.resolve & TopLevel[ResolvableProps]
  ): js.Function1[
    /* component */ ComponentType[
      OwnProps & typings.reactResolver.reactResolverStrings.resolve & TopLevel[ResolvableProps]
    ], 
    FunctionComponent[OwnProps & MoreProps]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(resolversMap.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ ComponentType[
      OwnProps & typings.reactResolver.reactResolverStrings.resolve & TopLevel[ResolvableProps]
    ], 
    FunctionComponent[OwnProps & MoreProps]
  ]]
  inline def resolve[OwnProps, K /* <: String */, V, MoreProps](prop: K, resolveFn: ResolveFn[OwnProps & MoreProps, V]): js.Function1[
    /* component */ ComponentType[OwnProps & typings.reactResolver.reactResolverStrings.resolve & TopLevel[Any]], 
    FunctionComponent[OwnProps & MoreProps]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(prop.asInstanceOf[js.Any], resolveFn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* component */ ComponentType[OwnProps & typings.reactResolver.reactResolverStrings.resolve & TopLevel[Any]], 
    FunctionComponent[OwnProps & MoreProps]
  ]]
  
  type ResolveFn[Props, V] = js.Function1[/* props */ Props, js.Promise[V]]
}
