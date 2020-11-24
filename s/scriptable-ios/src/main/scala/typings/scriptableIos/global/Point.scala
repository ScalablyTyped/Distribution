package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
