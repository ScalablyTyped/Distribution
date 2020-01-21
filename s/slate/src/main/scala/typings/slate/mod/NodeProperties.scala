package typings.slate.mod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.Immutable.List
import typings.immutable.Immutable.Set_
import typings.slate.slateStrings.`inline`
import typings.slate.slateStrings.block
import typings.slate.slateStrings.document
import typings.slate.slateStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.slate.mod.DocumentProperties
  - typings.slate.mod.BlockProperties
  - typings.slate.mod.InlineProperties
  - typings.slate.mod.TextProperties
*/
trait NodeProperties extends js.Object

object NodeProperties {
  @scala.inline
  def DocumentProperties(
    data: Data | StringDictionary[js.Any] = null,
    key: String = null,
    nodes: List[Node] | js.Array[Node] = null,
    `object`: document = null
  ): NodeProperties = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProperties]
  }
  @scala.inline
  def BlockProperties(
    `type`: String,
    data: Data | StringDictionary[js.Any] = null,
    key: String = null,
    nodes: (List[Block | Text | Inline]) | (js.Array[Block | Text | Inline]) = null,
    `object`: block = null
  ): NodeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProperties]
  }
  @scala.inline
  def InlineProperties(
    `type`: String,
    data: Data | StringDictionary[js.Any] = null,
    key: String = null,
    nodes: (List[Inline | Text]) | (js.Array[Inline | Text]) = null,
    `object`: `inline` = null
  ): NodeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProperties]
  }
  @scala.inline
  def TextProperties(
    key: String = null,
    marks: Set_[Mark] | js.Array[Mark] = null,
    `object`: text = null,
    text: String = null
  ): NodeProperties = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProperties]
  }
}

