package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMotionLib {
  type InterpolateFunction = js.Function1[
    /* previousInterpolatedStyles */ js.UndefOr[
      js.Array[
        /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify TransitionPlainStyle */ js.Any
      ]
    ], 
    js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify TransitionStyle */ js.Any
    ]
  ]
}
