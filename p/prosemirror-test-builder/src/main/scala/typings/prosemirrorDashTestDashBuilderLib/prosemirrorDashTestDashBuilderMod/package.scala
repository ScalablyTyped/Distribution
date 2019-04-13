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
      prosemirrorDashTestDashBuilderLib.NodeBuilderMethod[
        prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[java.lang.String, java.lang.String]
      ]
    ]) with (stdLib.Record[
      java.lang.String, 
      prosemirrorDashTestDashBuilderLib.MarkBuilderMethod[
        prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[java.lang.String, java.lang.String]
      ]
    ]) with prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.Builder with js.Any
  ]
  type TestSchema = prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[
    prosemirrorDashTestDashBuilderLib.TestNodesUnion, 
    prosemirrorDashTestDashBuilderLib.TestMarksUnion
  ]
}
