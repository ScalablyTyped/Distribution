package typings.prosemirrorDashTestDashBuilder.prosemirrorDashTestDashBuilderMod

import typings.prosemirrorDashModel.prosemirrorDashModelMod.Node
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedProsemirrorNode[S /* <: Schema[_, _] */]
  extends Node[js.Any]
     with TaggedFlatObject[S]

