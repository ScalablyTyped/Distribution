package typings.prosemirrorDashTestDashBuilder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object prosemirrorDashTestDashBuilderMod {
  import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
  import typings.std.Record

  type Args = js.Array[String | TaggedProsemirrorNode[js.Any] | TaggedFlatObject[js.Any]]
  type Builder = js.Function2[
    /* testSchema */ Schema[String, String], 
    /* names */ Record[String, NodeTypeAttributes | MarkTypeAttributes], 
    (Record[String, NodeBuilderMethod[Schema[String, String]]]) with (Record[String, MarkBuilderMethod[Schema[String, String]]]) with typings.prosemirrorDashTestDashBuilder.prosemirrorDashTestDashBuilderStrings.Builder with (Record[String, NodeTypeAttributes | MarkTypeAttributes])
  ]
  type MarkBuilderMethod[S /* <: Schema[_, _] */] = js.Function1[/* args */ Args, TaggedFlatObject[S]]
  type NodeBuilderMethod[S /* <: Schema[_, _] */] = js.Function1[/* args */ Args, TaggedProsemirrorNode[S]]
  type TestSchema = Schema[TestNodesUnion, TestMarksUnion]
}
