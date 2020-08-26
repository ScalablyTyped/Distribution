package typings.rotJs.featuresMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class Dungeon feature; has own .create() method
  */
@js.native
trait Feature extends js.Object {
  def create(digCallback: DigCallback): Unit = js.native
  def debug(): Unit = js.native
  def isValid(isWallCallback: TestPositionCallback, canBeDugCallback: TestPositionCallback): Boolean = js.native
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
  @scala.inline
  implicit class FeatureOps[Self <: Feature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: DigCallback => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDebug(value: () => Unit): Self = this.set("debug", js.Any.fromFunction0(value))
    @scala.inline
    def setIsValid(value: (TestPositionCallback, TestPositionCallback) => Boolean): Self = this.set("isValid", js.Any.fromFunction2(value))
  }
  
}

