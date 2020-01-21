package typings.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntryPoints[TPreloadedEntryPoints, TExtraProps, TRuntimeProps, TPreloadedQueries] extends js.Object {
  var entryPoints: TPreloadedEntryPoints
  var extraProps: TExtraProps | Null
  var props: TRuntimeProps
  var queries: TPreloadedQueries
}

object AnonEntryPoints {
  @scala.inline
  def apply[TPreloadedEntryPoints, TExtraProps, TRuntimeProps, TPreloadedQueries](
    entryPoints: TPreloadedEntryPoints,
    props: TRuntimeProps,
    queries: TPreloadedQueries,
    extraProps: TExtraProps = null
  ): AnonEntryPoints[TPreloadedEntryPoints, TExtraProps, TRuntimeProps, TPreloadedQueries] = {
    val __obj = js.Dynamic.literal(entryPoints = entryPoints.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEntryPoints[TPreloadedEntryPoints, TExtraProps, TRuntimeProps, TPreloadedQueries]]
  }
}

