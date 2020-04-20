package typings.prosemirrorTestBuilder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Args = js.Array[
    java.lang.String | typings.prosemirrorTestBuilder.mod.TaggedProsemirrorNode[js.Any] | typings.prosemirrorTestBuilder.mod.TaggedFlatObject[js.Any]
  ]
  type Builder = js.Function2[
    /* testSchema */ typings.prosemirrorModel.mod.Schema[java.lang.String, java.lang.String], 
    /* names */ typings.std.Record[
      java.lang.String, 
      typings.prosemirrorTestBuilder.mod.NodeTypeAttributes | typings.prosemirrorTestBuilder.mod.MarkTypeAttributes
    ], 
    (typings.std.Record[
      java.lang.String, 
      typings.prosemirrorTestBuilder.mod.NodeBuilderMethod[typings.prosemirrorModel.mod.Schema[java.lang.String, java.lang.String]]
    ]) with (typings.std.Record[
      java.lang.String, 
      typings.prosemirrorTestBuilder.mod.MarkBuilderMethod[typings.prosemirrorModel.mod.Schema[java.lang.String, java.lang.String]]
    ]) with typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.Builder with (org.scalablytyped.runtime.TopLevel[
      typings.std.Record[
        java.lang.String, 
        typings.prosemirrorTestBuilder.mod.NodeTypeAttributes | typings.prosemirrorTestBuilder.mod.MarkTypeAttributes
      ]
    ])
  ]
  type MarkBuilderMethod[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] = js.Function1[
    /* args */ typings.prosemirrorTestBuilder.mod.Args, 
    typings.prosemirrorTestBuilder.mod.TaggedFlatObject[S]
  ]
  type NodeBuilderMethod[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] = js.Function1[
    /* args */ typings.prosemirrorTestBuilder.mod.Args, 
    typings.prosemirrorTestBuilder.mod.TaggedProsemirrorNode[S]
  ]
  type TestSchema = typings.prosemirrorModel.mod.Schema[
    typings.prosemirrorTestBuilder.mod.TestNodesUnion, 
    typings.prosemirrorTestBuilder.mod.TestMarksUnion
  ]
}
