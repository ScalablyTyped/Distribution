package typings.storybookUi.anon

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children extends js.Object {
  var childIds: Requireable[js.Array[js.UndefOr[String | Null]]] = js.native
  var children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray] = js.native
  var id: Validator[String] = js.native
  var isExpanded: Requireable[Boolean] = js.native
  var isLeaf: Validator[Boolean] = js.native
  var name: Validator[String] = js.native
  var onClick: Validator[js.Function1[/* repeated */ _, _]] = js.native
  var onKeyUp: Validator[js.Function1[/* repeated */ _, _]] = js.native
  var prefix: Validator[String] = js.native
}

object Children {
  @scala.inline
  def apply(
    childIds: Requireable[js.Array[js.UndefOr[String | Null]]],
    children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray],
    id: Validator[String],
    isExpanded: Requireable[Boolean],
    isLeaf: Validator[Boolean],
    name: Validator[String],
    onClick: Validator[js.Function1[/* repeated */ _, _]],
    onKeyUp: Validator[js.Function1[/* repeated */ _, _]],
    prefix: Validator[String]
  ): Children = {
    val __obj = js.Dynamic.literal(childIds = childIds.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onKeyUp = onKeyUp.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
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
    def setChildIds(value: Requireable[js.Array[js.UndefOr[String | Null]]]): Self = this.set("childIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Validator[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsExpanded(value: Requireable[Boolean]): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLeaf(value: Validator[Boolean]): Self = this.set("isLeaf", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Validator[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClick(value: Validator[js.Function1[/* repeated */ _, _]]): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnKeyUp(value: Validator[js.Function1[/* repeated */ _, _]]): Self = this.set("onKeyUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: Validator[String]): Self = this.set("prefix", value.asInstanceOf[js.Any])
  }
  
}

