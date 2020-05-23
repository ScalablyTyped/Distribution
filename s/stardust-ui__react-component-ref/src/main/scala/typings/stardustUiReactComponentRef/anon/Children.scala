package typings.stardustUiReactComponentRef.anon

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.Validator
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: Validator[ReactElementLike]
  var innerRef: Validator[Ref[_]]
}

object Children {
  @scala.inline
  def apply(children: Validator[ReactElementLike], innerRef: Validator[Ref[_]]): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], innerRef = innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

