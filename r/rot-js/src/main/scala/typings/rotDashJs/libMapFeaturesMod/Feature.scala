package typings.rotDashJs.libMapFeaturesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class Dungeon feature; has own .create() method
  */
trait Feature extends js.Object {
  def create(digCallback: DigCallback): Unit
  def debug(): Unit
  def isValid(isWallCallback: TestPositionCallback, canBeDugCallback: TestPositionCallback): Boolean
}

object Feature {
  @scala.inline
  def apply(
    create: DigCallback => Unit,
    debug: () => Unit,
    isValid: (TestPositionCallback, TestPositionCallback) => Boolean
  ): Feature = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), debug = js.Any.fromFunction0(debug), isValid = js.Any.fromFunction2(isValid))
  
    __obj.asInstanceOf[Feature]
  }
}

