package typings
package prosemirrorDashModelLib.prosemirrorDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-model", "Schema")
@js.native
class Schema[N /* <: java.lang.String */, M /* <: java.lang.String */] protected () extends js.Object {
  /**
    * Construct a schema from a schema [specification](#model.SchemaSpec).
    */
  def this(spec: SchemaSpec[N, M]) = this()
  /**
    * An object for storing whatever values modules may want to
    * compute and cache per schema. (If you want to store something
    * in it, try to use property names unlikely to clash.)
    */
  var cached: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * A map from mark names to mark type objects.
    */
  var marks: prosemirrorDashModelLib.prosemirrorDashModelLibStrings.Schema with js.Any with (org.scalablytyped.runtime.StringDictionary[NodeType[Schema[N, M]]]) = js.native
  /**
    * An object mapping the schema's node names to node type objects.
    */
  var nodes: prosemirrorDashModelLib.prosemirrorDashModelLibStrings.Schema with js.Any with (org.scalablytyped.runtime.StringDictionary[NodeType[Schema[N, M]]]) = js.native
  /**
    * The [spec](#model.SchemaSpec) on which the schema is based,
    * with the added guarantee that its `nodes` and `marks`
    * properties are
    * [`OrderedMap`](https://github.com/marijnh/orderedmap) instances
    * (not raw objects).
    */
  var spec: SchemaSpec[N, M] = js.native
  /**
    * The type of the [default top node](#model.SchemaSpec.topNode)
    * for this schema.
    */
  var topNodeType: NodeType[Schema[N, M]] = js.native
  /**
    * Create a mark with the given type and attributes.
    */
  def mark(`type`: java.lang.String): Mark[Schema[N, M]] = js.native
  def mark(`type`: java.lang.String, attrs: org.scalablytyped.runtime.StringDictionary[js.Any]): Mark[Schema[N, M]] = js.native
  def mark(`type`: MarkType[Schema[N, M]]): Mark[Schema[N, M]] = js.native
  def mark(`type`: MarkType[Schema[N, M]], attrs: org.scalablytyped.runtime.StringDictionary[js.Any]): Mark[Schema[N, M]] = js.native
  /**
    * Deserialize a mark from its JSON representation. This method is
    * bound.
    */
  def markFromJSON(json: org.scalablytyped.runtime.StringDictionary[js.Any]): Mark[Schema[N, M]] = js.native
  /**
    * Create a node in this schema. The `type` may be a string or a
    * `NodeType` instance. Attributes will be extended
    * with defaults, `content` may be a `Fragment`,
    * `null`, a `Node`, or an array of nodes.
    */
  def node(`type`: java.lang.String): ProsemirrorNode[Schema[N, M]] = js.native
  def node(`type`: java.lang.String, attrs: org.scalablytyped.runtime.StringDictionary[js.Any]): ProsemirrorNode[Schema[N, M]] = js.native
  def node(
    `type`: java.lang.String,
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: js.Array[ProsemirrorNode[Schema[N, M]]]
  ): ProsemirrorNode[Schema[N, M]] = js.native
  def node(
    `type`: java.lang.String,
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: js.Array[ProsemirrorNode[Schema[N, M]]],
    marks: js.Array[Mark[Schema[N, M]]]
  ): ProsemirrorNode[Schema[N, M]] = js.native
  def node(
    `type`: java.lang.String,
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: Fragment[Schema[N, M]]
  ): ProsemirrorNode[Schema[N, M]] = js.native
  def node(
    `type`: java.lang.String,
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: Fragment[Schema[N, M]],
    marks: js.Array[Mark[Schema[N, M]]]
  ): ProsemirrorNode[Schema[N, M]] = js.native
  def node(
    `type`: java.lang.String,
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: ProsemirrorNode[Schema[N, M]]
  ): ProsemirrorNode[Schema[N, M]] = js.native
  def node(
    `type`: java.lang.String,
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: ProsemirrorNode[Schema[N, M]],
    marks: js.Array[Mark[Schema[N, M]]]
  ): ProsemirrorNode[Schema[N, M]] = js.native
  def node(`type`: NodeType[Schema[N, M]]): ProsemirrorNode[Schema[N, M]] = js.native
  def node(`type`: NodeType[Schema[N, M]], attrs: org.scalablytyped.runtime.StringDictionary[js.Any]): ProsemirrorNode[Schema[N, M]] = js.native
  def node(
    `type`: NodeType[Schema[N, M]],
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: js.Array[ProsemirrorNode[Schema[N, M]]]
  ): ProsemirrorNode[Schema[N, M]] = js.native
  def node(
    `type`: NodeType[Schema[N, M]],
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: js.Array[ProsemirrorNode[Schema[N, M]]],
    marks: js.Array[Mark[Schema[N, M]]]
  ): ProsemirrorNode[Schema[N, M]] = js.native
  def node(
    `type`: NodeType[Schema[N, M]],
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: Fragment[Schema[N, M]]
  ): ProsemirrorNode[Schema[N, M]] = js.native
  def node(
    `type`: NodeType[Schema[N, M]],
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: Fragment[Schema[N, M]],
    marks: js.Array[Mark[Schema[N, M]]]
  ): ProsemirrorNode[Schema[N, M]] = js.native
  def node(
    `type`: NodeType[Schema[N, M]],
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: ProsemirrorNode[Schema[N, M]]
  ): ProsemirrorNode[Schema[N, M]] = js.native
  def node(
    `type`: NodeType[Schema[N, M]],
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: ProsemirrorNode[Schema[N, M]],
    marks: js.Array[Mark[Schema[N, M]]]
  ): ProsemirrorNode[Schema[N, M]] = js.native
  /**
    * Deserialize a node from its JSON representation. This method is
    * bound.
    */
  def nodeFromJSON(json: org.scalablytyped.runtime.StringDictionary[js.Any]): ProsemirrorNode[Schema[N, M]] = js.native
  /**
    * Create a text node in the schema. Empty text nodes are not
    * allowed.
    */
  def text(text: java.lang.String): ProsemirrorNode[Schema[N, M]] = js.native
  def text(text: java.lang.String, marks: js.Array[Mark[Schema[N, M]]]): ProsemirrorNode[Schema[N, M]] = js.native
}

