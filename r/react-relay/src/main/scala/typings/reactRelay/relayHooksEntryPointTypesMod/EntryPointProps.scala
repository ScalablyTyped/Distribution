package typings.reactRelay.relayHooksEntryPointTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Readonly<{  entryPoints :react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadedEntryPoints<TNestedEntryPoints>,   extraProps :TExtraProps,   props :TRuntimeProps,   queries :react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadedQueries<TPreloadedQueries>}> */
trait EntryPointProps[TPreloadedQueries, TNestedEntryPoints, TRuntimeProps, TExtraProps] extends StObject {
  
  val entryPoints: PreloadedEntryPoints[TNestedEntryPoints]
  
  val extraProps: TExtraProps
  
  val props: TRuntimeProps
  
  val queries: PreloadedQueries[TPreloadedQueries]
}
object EntryPointProps {
  
  inline def apply[TPreloadedQueries, TNestedEntryPoints, TRuntimeProps, TExtraProps](
    entryPoints: PreloadedEntryPoints[TNestedEntryPoints],
    extraProps: TExtraProps,
    props: TRuntimeProps,
    queries: PreloadedQueries[TPreloadedQueries]
  ): EntryPointProps[TPreloadedQueries, TNestedEntryPoints, TRuntimeProps, TExtraProps] = {
    val __obj = js.Dynamic.literal(entryPoints = entryPoints.asInstanceOf[js.Any], extraProps = extraProps.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPointProps[TPreloadedQueries, TNestedEntryPoints, TRuntimeProps, TExtraProps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntryPointProps[?, ?, ?, ?], TPreloadedQueries, TNestedEntryPoints, TRuntimeProps, TExtraProps] (val x: Self & (EntryPointProps[TPreloadedQueries, TNestedEntryPoints, TRuntimeProps, TExtraProps])) extends AnyVal {
    
    inline def setEntryPoints(value: PreloadedEntryPoints[TNestedEntryPoints]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
    
    inline def setExtraProps(value: TExtraProps): Self = StObject.set(x, "extraProps", value.asInstanceOf[js.Any])
    
    inline def setProps(value: TRuntimeProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setQueries(value: PreloadedQueries[TPreloadedQueries]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
  }
}
