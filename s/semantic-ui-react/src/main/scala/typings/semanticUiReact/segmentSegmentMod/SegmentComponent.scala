package typings.semanticUiReact.segmentSegmentMod

import typings.react.mod.FunctionComponent
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.segmentGroupMod.SegmentGroupProps
import typings.semanticUiReact.segmentInlineMod.SegmentInlineComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentComponent extends FunctionComponent[SegmentProps] {
  var Group: StatelessComponent[SegmentGroupProps] = js.native
  var Inline: SegmentInlineComponent = js.native
}

