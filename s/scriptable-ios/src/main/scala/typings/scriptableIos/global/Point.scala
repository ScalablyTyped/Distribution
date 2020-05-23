package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Structure representing a point._
  * @see https://docs.scriptable.app/point/#-new-point
  */
@JSGlobal("Point")
@js.native
class Point protected ()
  extends typings.scriptableIos.Point {
  /**
    * _Structure representing a point._
    * @param x - X value.
    * @param y - Y value.
    * @see https://docs.scriptable.app/point/#-new-point
    */
  def this(x: Double, y: Double) = this()
  /**
    * _X value._
    * @see https://docs.scriptable.app/point/#x
    */
  /* CompleteClass */
  override var x: Double = js.native
  /**
    * _Y value._
    * @see https://docs.scriptable.app/point/#y
    */
  /* CompleteClass */
  override var y: Double = js.native
}

