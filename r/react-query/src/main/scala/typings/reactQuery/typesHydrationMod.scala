package typings.reactQuery

import typings.react.mod.ReactElement
import typings.reactQuery.typesCoreHydrationMod.DehydrateOptions
import typings.reactQuery.typesCoreHydrationMod.DehydratedState
import typings.reactQuery.typesCoreHydrationMod.HydrateOptions
import typings.reactQuery.typesCoreQueryClientMod.QueryClient
import typings.reactQuery.typesReactHydrateMod.HydrateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHydrationMod {
  
  @JSImport("react-query/types/hydration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Hydrate_(param0: HydrateProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Hydrate")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def dehydrate(client: QueryClient): DehydratedState = ^.asInstanceOf[js.Dynamic].applyDynamic("dehydrate")(client.asInstanceOf[js.Any]).asInstanceOf[DehydratedState]
  inline def dehydrate(client: QueryClient, options: DehydrateOptions): DehydratedState = (^.asInstanceOf[js.Dynamic].applyDynamic("dehydrate")(client.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DehydratedState]
  
  inline def hydrate(client: QueryClient, dehydratedState: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(client.asInstanceOf[js.Any], dehydratedState.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hydrate(client: QueryClient, dehydratedState: Any, options: HydrateOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(client.asInstanceOf[js.Any], dehydratedState.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useHydrate(state: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useHydrate")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useHydrate(state: Any, options: HydrateOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useHydrate")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
