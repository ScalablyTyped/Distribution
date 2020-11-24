package typings.reactRelay.entryPointTypesMod

import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Readonly<{  entryPoints :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ThinNestedEntryPointParamsObject<TPreloadedEntryPoints> | undefined,   extraProps :TExtraProps | undefined,   queries :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ThinQueryParamsObject<TPreloadedQueries> | undefined}> */
@js.native
trait PreloadProps[TPreloadParams /* <: js.Object */, TPreloadedQueries /* <: Record[String, OperationType] */, TPreloadedEntryPoints /* <: Record[String, js.UndefOr[EntryPoint[_, _]]] */, TExtraProps /* <: js.Object | Null */] extends js.Object {
  
  val entryPoints: js.UndefOr[ThinNestedEntryPointParamsObject[TPreloadedEntryPoints]] = js.native
  
  val extraProps: js.UndefOr[TExtraProps] = js.native
  
  val queries: js.UndefOr[ThinQueryParamsObject[TPreloadedQueries]] = js.native
}
object PreloadProps {
  
  @scala.inline
  def apply[TPreloadParams /* <: js.Object */, TPreloadedQueries /* <: Record[String, OperationType] */, TPreloadedEntryPoints /* <: Record[String, js.UndefOr[EntryPoint[_, _]]] */, TExtraProps /* <: js.Object | Null */](): PreloadProps[TPreloadParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreloadProps[TPreloadParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps]]
  }
  
  @scala.inline
  implicit class PreloadPropsOps[Self <: PreloadProps[_, _, _, _], TPreloadParams /* <: js.Object */, TPreloadedQueries /* <: Record[String, OperationType] */, TPreloadedEntryPoints /* <: Record[String, js.UndefOr[EntryPoint[_, _]]] */, TExtraProps /* <: js.Object | Null */] (val x: Self with (PreloadProps[TPreloadParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntryPoints(value: ThinNestedEntryPointParamsObject[TPreloadedEntryPoints]): Self = this.set("entryPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryPoints: Self = this.set("entryPoints", js.undefined)
    
    @scala.inline
    def setExtraProps(value: TExtraProps): Self = this.set("extraProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraProps: Self = this.set("extraProps", js.undefined)
    
    @scala.inline
    def setQueries(value: ThinQueryParamsObject[TPreloadedQueries]): Self = this.set("queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
  }
}
