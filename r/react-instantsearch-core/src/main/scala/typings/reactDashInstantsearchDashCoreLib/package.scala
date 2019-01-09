package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashInstantsearchDashCoreLib {
  type HighlightResultArray[TItem] = js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HighlightResult<TItem> */ js.Any
  ]
  type HighlightResultField[TField] = HighlightResultArray[js.Any]
  type Omit[T1, T2] = stdLib.Pick[T1, stdLib.Exclude[java.lang.String, java.lang.String]]
}
