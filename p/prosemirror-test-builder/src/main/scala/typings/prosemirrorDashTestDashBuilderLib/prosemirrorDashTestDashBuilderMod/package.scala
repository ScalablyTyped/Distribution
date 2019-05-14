package typings
package prosemirrorDashTestDashBuilderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object prosemirrorDashTestDashBuilderMod {
  type Builder = js.Function2[
    /* testSchema */ prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[java.lang.String, java.lang.String], 
    /* names */ stdLib.Record[java.lang.String, NodeTypeAttributes | MarkTypeAttributes], 
    (stdLib.Record[
      java.lang.String, 
      NodeBuilderMethod[
        prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[java.lang.String, java.lang.String]
      ]
    ]) with (stdLib.Record[
      java.lang.String, 
      MarkBuilderMethod[
        prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[java.lang.String, java.lang.String]
      ]
    ]) with prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.Builder with (stdLib.Record[java.lang.String, NodeTypeAttributes | MarkTypeAttributes])
  ]
  type MarkBuilderMethod[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] = js.Function1[/* args */ prosemirrorDashTestDashBuilderLib.Args, TaggedFlatObject[S]]
  type NodeBuilderMethod[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] = js.Function1[/* args */ prosemirrorDashTestDashBuilderLib.Args, TaggedProsemirrorNode[S]]
  type TestSchema = prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[TestNodesUnion, TestMarksUnion]
}
