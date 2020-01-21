package typings.slate.mod

import org.scalablytyped.runtime.StringDictionary
import typings.slate.slateStrings.operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationJSON extends js.Object {
  var annotation: js.UndefOr[AnnotationJSON] = js.undefined
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var mark: js.UndefOr[MarkJSON] = js.undefined
  var newPath: js.UndefOr[js.Array[Double]] = js.undefined
  var newProperties: js.UndefOr[NodeJSON | ValueJSON | SelectionJSON | MarkJSON | AnnotationJSON] = js.undefined
  var node: js.UndefOr[Node] = js.undefined
  var `object`: js.UndefOr[operation] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[js.Array[Double]] = js.undefined
  var position: js.UndefOr[Double] = js.undefined
  var properties: js.UndefOr[NodeJSON | ValueJSON | SelectionJSON | AnnotationJSON] = js.undefined
  var target: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var `type`: String
}

object OperationJSON {
  @scala.inline
  def apply(
    `type`: String,
    annotation: AnnotationJSON = null,
    data: StringDictionary[js.Any] = null,
    mark: MarkJSON = null,
    newPath: js.Array[Double] = null,
    newProperties: NodeJSON | ValueJSON | SelectionJSON | MarkJSON | AnnotationJSON = null,
    node: Node = null,
    `object`: operation = null,
    offset: Int | Double = null,
    path: js.Array[Double] = null,
    position: Int | Double = null,
    properties: NodeJSON | ValueJSON | SelectionJSON | AnnotationJSON = null,
    target: Int | Double = null,
    text: String = null
  ): OperationJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (annotation != null) __obj.updateDynamic("annotation")(annotation.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (mark != null) __obj.updateDynamic("mark")(mark.asInstanceOf[js.Any])
    if (newPath != null) __obj.updateDynamic("newPath")(newPath.asInstanceOf[js.Any])
    if (newProperties != null) __obj.updateDynamic("newProperties")(newProperties.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationJSON]
  }
}

