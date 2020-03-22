package typings.reactRelay.entryPointTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  entryPoints  :TPreloadedEntryPoints,   extraProps  :TExtraProps | null,   props  :TRuntimeProps,   queries  :TPreloadedQueries}> */
trait EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] extends js.Object {
  val entryPoints: TPreloadedEntryPoints
  val extraProps: js.UndefOr[TExtraProps] = js.undefined
  val props: TRuntimeProps
  val queries: TPreloadedQueries
}

object EntryPointProps {
  @scala.inline
  def apply[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps](
    entryPoints: TPreloadedEntryPoints,
    props: TRuntimeProps,
    queries: TPreloadedQueries,
    extraProps: TExtraProps = null
  ): EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
    val __obj = js.Dynamic.literal(entryPoints = entryPoints.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]
  }
}

