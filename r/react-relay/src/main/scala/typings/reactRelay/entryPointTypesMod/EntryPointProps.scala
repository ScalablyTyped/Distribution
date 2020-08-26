package typings.reactRelay.entryPointTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  entryPoints :TPreloadedEntryPoints,   extraProps :TExtraProps | null,   props :TRuntimeProps,   queries :TPreloadedQueries}> */
@js.native
trait EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] extends js.Object {
  val entryPoints: TPreloadedEntryPoints = js.native
  val extraProps: js.UndefOr[TExtraProps | Null] = js.native
  val props: TRuntimeProps = js.native
  val queries: TPreloadedQueries = js.native
}

object EntryPointProps {
  @scala.inline
  def apply[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps](entryPoints: TPreloadedEntryPoints, props: TRuntimeProps, queries: TPreloadedQueries): EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
    val __obj = js.Dynamic.literal(entryPoints = entryPoints.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]
  }
  @scala.inline
  implicit class EntryPointPropsOps[Self <: EntryPointProps[_, _, _, _], TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] (val x: Self with (EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps])) extends AnyVal {
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
    def setEntryPoints(value: TPreloadedEntryPoints): Self = this.set("entryPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(value: TRuntimeProps): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueries(value: TPreloadedQueries): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraProps(value: TExtraProps): Self = this.set("extraProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraProps: Self = this.set("extraProps", js.undefined)
    @scala.inline
    def setExtraPropsNull: Self = this.set("extraProps", null)
  }
  
}

