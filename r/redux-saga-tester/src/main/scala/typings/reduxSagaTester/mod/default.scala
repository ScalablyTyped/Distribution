package typings.reduxSagaTester.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-saga-tester", JSImport.Default)
@js.native
class default[StateType /* <: js.Object */] () extends SagaTester[StateType] {
  def this(options: SagaTesterOptions[StateType]) = this()
}

