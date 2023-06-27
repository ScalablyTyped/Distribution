package typings.reactRelay.relayHooksEntryPointTypesMod

import typings.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Readonly<{  entryPoints :react-relay.react-relay/relay-hooks/EntryPointTypes.ThinNestedEntryPointParamsObject<TNestedEntryPoints> | undefined,   extraProps :TExtraProps | undefined,   queries :react-relay.react-relay/relay-hooks/EntryPointTypes.ThinQueryParamsObject<TPreloadedQueries> | undefined}> */
trait PreloadProps[TPreloadParams /* <: js.Object */, TPreloadedQueries /* <: Record[String, OperationType] */, TNestedEntryPoints /* <: Record[String, js.UndefOr[EntryPoint[Any, Any]]] */, TExtraProps /* <: js.Object | Null */] extends StObject {
  
  val entryPoints: js.UndefOr[ThinNestedEntryPointParamsObject[TNestedEntryPoints]] = js.undefined
  
  val extraProps: js.UndefOr[TExtraProps] = js.undefined
  
  val queries: js.UndefOr[ThinQueryParamsObject[TPreloadedQueries]] = js.undefined
}
object PreloadProps {
  
  inline def apply[TPreloadParams /* <: js.Object */, TPreloadedQueries /* <: Record[String, OperationType] */, TNestedEntryPoints /* <: Record[String, js.UndefOr[EntryPoint[Any, Any]]] */, TExtraProps /* <: js.Object | Null */](): PreloadProps[TPreloadParams, TPreloadedQueries, TNestedEntryPoints, TExtraProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreloadProps[TPreloadParams, TPreloadedQueries, TNestedEntryPoints, TExtraProps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreloadProps[?, ?, ?, ?], TPreloadParams /* <: js.Object */, TPreloadedQueries /* <: Record[String, OperationType] */, TNestedEntryPoints /* <: Record[String, js.UndefOr[EntryPoint[Any, Any]]] */, TExtraProps /* <: js.Object | Null */] (val x: Self & (PreloadProps[TPreloadParams, TPreloadedQueries, TNestedEntryPoints, TExtraProps])) extends AnyVal {
    
    inline def setEntryPoints(value: ThinNestedEntryPointParamsObject[TNestedEntryPoints]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
    
    inline def setEntryPointsUndefined: Self = StObject.set(x, "entryPoints", js.undefined)
    
    inline def setExtraProps(value: TExtraProps): Self = StObject.set(x, "extraProps", value.asInstanceOf[js.Any])
    
    inline def setExtraPropsUndefined: Self = StObject.set(x, "extraProps", js.undefined)
    
    inline def setQueries(value: ThinQueryParamsObject[TPreloadedQueries]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
  }
}
