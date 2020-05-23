package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Structure representing a size._
  * @see https://docs.scriptable.app/size/#-new-size
  */
trait Size extends js.Object {
  /**
    * _Height value._
    * @see https://docs.scriptable.app/size/#height
    */
  var height: Double
  /**
    * _Width value._
    * @see https://docs.scriptable.app/size/#width
    */
  var width: Double
}

object Size {
  @scala.inline
  def apply(height: Double, width: Double): Size = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

