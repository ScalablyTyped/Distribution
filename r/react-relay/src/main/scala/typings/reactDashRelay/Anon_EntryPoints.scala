package typings.reactDashRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EntryPoints[TPreloadedEntryPoints, TExtraProps, TRuntimeProps, TPreloadedQueries] extends js.Object {
  var entryPoints: TPreloadedEntryPoints
  var extraProps: TExtraProps | Null
  var props: TRuntimeProps
  var queries: TPreloadedQueries
}

object Anon_EntryPoints {
  @scala.inline
  def apply[TPreloadedEntryPoints, TExtraProps, TRuntimeProps, TPreloadedQueries](
    entryPoints: TPreloadedEntryPoints,
    props: TRuntimeProps,
    queries: TPreloadedQueries,
    extraProps: TExtraProps = null
  ): Anon_EntryPoints[TPreloadedEntryPoints, TExtraProps, TRuntimeProps, TPreloadedQueries] = {
    val __obj = js.Dynamic.literal(entryPoints = entryPoints.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EntryPoints[TPreloadedEntryPoints, TExtraProps, TRuntimeProps, TPreloadedQueries]]
  }
}

