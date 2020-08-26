package typings.rcSteps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stepsMod {
  type ProgressDotRender = js.Function2[
    /* iconDot */ js.Any, 
    /* info */ typings.rcSteps.anon.Index, 
    typings.react.mod.ReactNode
  ]
  type StepIconRender = js.Function1[/* info */ typings.rcSteps.anon.Description, typings.react.mod.ReactNode]
}
