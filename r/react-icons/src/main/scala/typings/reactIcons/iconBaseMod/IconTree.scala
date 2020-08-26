package typings.reactIcons.iconBaseMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconTree extends js.Object {
  var attr: StringDictionary[String] = js.native
  var child: js.Array[IconTree] = js.native
  var tag: String = js.native
}

object IconTree {
  @scala.inline
  def apply(attr: StringDictionary[String], child: js.Array[IconTree], tag: String): IconTree = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], child = child.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconTree]
  }
  @scala.inline
  implicit class IconTreeOps[Self <: IconTree] (val x: Self) extends AnyVal {
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
    def setAttr(value: StringDictionary[String]): Self = this.set("attr", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildVarargs(value: IconTree*): Self = this.set("child", js.Array(value :_*))
    @scala.inline
    def setChild(value: js.Array[IconTree]): Self = this.set("child", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
  
}

