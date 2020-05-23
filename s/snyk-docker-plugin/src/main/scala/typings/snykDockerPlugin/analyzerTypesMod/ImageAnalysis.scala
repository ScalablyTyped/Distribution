package typings.snykDockerPlugin.analyzerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageAnalysis extends js.Object {
  var Analysis: js.Array[AnalyzedPackage | Binary]
  var AnalyzeType: AnalysisType
  var Image: String
}

object ImageAnalysis {
  @scala.inline
  def apply(Analysis: js.Array[AnalyzedPackage | Binary], AnalyzeType: AnalysisType, Image: String): ImageAnalysis = {
    val __obj = js.Dynamic.literal(Analysis = Analysis.asInstanceOf[js.Any], AnalyzeType = AnalyzeType.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageAnalysis]
  }
}

