package typings.snykJavaCallGraphBuilder.metricsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metrics extends js.Object {
  var fetchCallGraphBuilder: js.UndefOr[Double] = js.undefined
  var generateCallGraph: Double
  var getCallGraph: Double
  var getEntrypoints: Double
  var getGradleClassPath: js.UndefOr[Double] = js.undefined
  var getMvnClassPath: js.UndefOr[Double] = js.undefined
  var mapClassesPerJar: Double
}

object Metrics {
  @scala.inline
  def apply(
    generateCallGraph: Double,
    getCallGraph: Double,
    getEntrypoints: Double,
    mapClassesPerJar: Double,
    fetchCallGraphBuilder: js.UndefOr[Double] = js.undefined,
    getGradleClassPath: js.UndefOr[Double] = js.undefined,
    getMvnClassPath: js.UndefOr[Double] = js.undefined
  ): Metrics = {
    val __obj = js.Dynamic.literal(generateCallGraph = generateCallGraph.asInstanceOf[js.Any], getCallGraph = getCallGraph.asInstanceOf[js.Any], getEntrypoints = getEntrypoints.asInstanceOf[js.Any], mapClassesPerJar = mapClassesPerJar.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchCallGraphBuilder)) __obj.updateDynamic("fetchCallGraphBuilder")(fetchCallGraphBuilder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(getGradleClassPath)) __obj.updateDynamic("getGradleClassPath")(getGradleClassPath.get.asInstanceOf[js.Any])
    if (!js.isUndefined(getMvnClassPath)) __obj.updateDynamic("getMvnClassPath")(getMvnClassPath.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
}

