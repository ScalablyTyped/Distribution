package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object prosemirrorDashTestDashBuilderLib {
  type Args = js.Array[
    java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TaggedProsemirrorNode */ js.Any)
  ]
  type MarkBuilderMethod[S /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Schema */ js.Any */] = js.Function1[
    /* args */ Args, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TaggedFlatObject<S> */ js.Any
  ]
  type NodeBuilderMethod[S /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Schema */ js.Any */] = js.Function1[
    /* args */ Args, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TaggedProsemirrorNode<S> */ js.Any
  ]
  type TestMarksUnion = prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.a | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.link | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.em | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.strong | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.code
  type TestNodesUnion = prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.p | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.pre | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.h1 | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.h2 | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.h3 | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.li | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.ul | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.ol | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.br | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.img | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.hr | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.ordered_list | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.bullet_list | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.list_item | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.doc | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.paragraph | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.blockquote | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.horizontal_rule | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.heading | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.code_block | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.text | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.image | prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderLibStrings.hard_break
}
