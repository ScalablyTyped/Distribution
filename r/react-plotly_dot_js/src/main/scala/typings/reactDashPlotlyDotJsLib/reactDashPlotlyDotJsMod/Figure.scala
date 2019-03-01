package typings
package reactDashPlotlyDotJsLib.reactDashPlotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Figure extends js.Object {
  var data: js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.Data */ _
  ]
  var layout: stdLib.Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.Layout */ _
  ]
}

object Figure {
  @scala.inline
  def apply(
    data: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.Data */ _
    ],
    layout: stdLib.Partial[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.Layout */ _
    ]
  ): Figure = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("layout")(layout)
    __obj.asInstanceOf[Figure]
  }
}

