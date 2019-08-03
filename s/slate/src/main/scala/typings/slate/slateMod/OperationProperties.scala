package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.immutableMod.List
import typings.slate.slateStrings.operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationProperties extends js.Object {
  var annotation: js.UndefOr[Annotation] = js.undefined
  var data: js.UndefOr[Data | StringDictionary[js.Any]] = js.undefined
  var mark: js.UndefOr[Mark] = js.undefined
  var newPath: js.UndefOr[List[Double]] = js.undefined
  var newProperties: js.UndefOr[
    NodeProperties | ValueProperties | SelectionProperties | MarkProperties | AnnotationProperties
  ] = js.undefined
  var node: js.UndefOr[Node] = js.undefined
  var `object`: js.UndefOr[operation] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[List[Double]] = js.undefined
  var position: js.UndefOr[Double] = js.undefined
  var properties: js.UndefOr[NodeProperties | ValueProperties | SelectionProperties | AnnotationProperties] = js.undefined
  var target: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var `type`: String
}

object OperationProperties {
  @scala.inline
  def apply(
    `type`: String,
    annotation: Annotation = null,
    data: Data | StringDictionary[js.Any] = null,
    mark: Mark = null,
    newPath: List[Double] = null,
    newProperties: NodeProperties | ValueProperties | SelectionProperties | MarkProperties | AnnotationProperties = null,
    node: Node = null,
    `object`: operation = null,
    offset: Int | Double = null,
    path: List[Double] = null,
    position: Int | Double = null,
    properties: NodeProperties | ValueProperties | SelectionProperties | AnnotationProperties = null,
    target: Int | Double = null,
    text: String = null
  ): OperationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (annotation != null) __obj.updateDynamic("annotation")(annotation)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (mark != null) __obj.updateDynamic("mark")(mark)
    if (newPath != null) __obj.updateDynamic("newPath")(newPath)
    if (newProperties != null) __obj.updateDynamic("newProperties")(newProperties.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[OperationProperties]
  }
}

