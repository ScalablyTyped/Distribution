package typings.semanticUiShape.SemanticUI.Shape.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default '.side'
    */
  var side: String
  /**
    * @default '.sides'
    */
  var sides: String
}

object Impl {
  @scala.inline
  def apply(side: String, sides: String): Impl = {
    val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any], sides = sides.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

