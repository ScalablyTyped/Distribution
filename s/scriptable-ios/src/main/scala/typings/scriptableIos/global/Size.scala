package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Structure representing a size._
  * @see https://docs.scriptable.app/size/#-new-size
  */
@JSGlobal("Size")
@js.native
class Size protected ()
  extends typings.scriptableIos.Size {
  /**
    * _Structure representing a size._
    * @param width - Width value.
    * @param height - Height value.
    * @see https://docs.scriptable.app/size/#-new-size
    */
  def this(width: Double, height: Double) = this()
  /**
    * _Height value._
    * @see https://docs.scriptable.app/size/#height
    */
  /* CompleteClass */
  override var height: Double = js.native
  /**
    * _Width value._
    * @see https://docs.scriptable.app/size/#width
    */
  /* CompleteClass */
  override var width: Double = js.native
}

