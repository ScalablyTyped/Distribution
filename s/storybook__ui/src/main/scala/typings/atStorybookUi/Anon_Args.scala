package typings.atStorybookUi

import typings.propDashTypes.propDashTypesMod.ReactElementLike
import typings.propDashTypes.propDashTypesMod.ReactNodeArray
import typings.propDashTypes.propDashTypesMod.Requireable
import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var childIds: Requireable[js.Array[String | Null]]
  var children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]
  var id: Validator[String]
  var isExpanded: Requireable[Boolean]
  var isLeaf: Validator[Boolean]
  var name: Validator[String]
  var onClick: Validator[js.Function1[/* repeated */ _, _]]
  var onKeyUp: Validator[js.Function1[/* repeated */ _, _]]
  var prefix: Validator[String]
}

object Anon_Args {
  @scala.inline
  def apply(
    childIds: Requireable[js.Array[String | Null]],
    children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray],
    id: Validator[String],
    isExpanded: Requireable[Boolean],
    isLeaf: Validator[Boolean],
    name: Validator[String],
    onClick: Validator[js.Function1[/* repeated */ _, _]],
    onKeyUp: Validator[js.Function1[/* repeated */ _, _]],
    prefix: Validator[String]
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(childIds = childIds.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onKeyUp = onKeyUp.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Args]
  }
}

