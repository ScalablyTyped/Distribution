package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMeasureLib {
  type MeasuredComponent[T] = reactLib.reactMod.ReactNs.ComponentType[
    T with (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify MeasuredComponentProps */ js.Any)
  ]
}
