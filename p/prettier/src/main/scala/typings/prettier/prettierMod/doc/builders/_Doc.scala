package typings.prettier.prettierMod.doc.builders

import typings.prettier.Anon_Root
import typings.prettier.prettierStrings.`break-parent`
import typings.prettier.prettierStrings.`if-break`
import typings.prettier.prettierStrings.`line-suffix-boundary`
import typings.prettier.prettierStrings.`line-suffix`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Doc extends js.Object

object _Doc {
  @scala.inline
  def LineSuffix(contents: typings.prettier.prettierMod.doc.builders.Doc, `type`: `line-suffix`): _Doc = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def Align(
    contents: typings.prettier.prettierMod.doc.builders.Doc,
    n: Double | String | Anon_Root,
    `type`: typings.prettier.prettierStrings.align
  ): _Doc = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def Concat(
    parts: js.Array[typings.prettier.prettierMod.doc.builders.Doc],
    `type`: typings.prettier.prettierStrings.concat
  ): _Doc = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def Indent(
    contents: typings.prettier.prettierMod.doc.builders.Doc,
    `type`: typings.prettier.prettierStrings.indent
  ): _Doc = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def Line(
    `type`: typings.prettier.prettierStrings.line,
    hard: js.UndefOr[Boolean] = js.undefined,
    literal: js.UndefOr[Boolean] = js.undefined,
    soft: js.UndefOr[Boolean] = js.undefined
  ): _Doc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(hard)) __obj.updateDynamic("hard")(hard.asInstanceOf[js.Any])
    if (!js.isUndefined(literal)) __obj.updateDynamic("literal")(literal.asInstanceOf[js.Any])
    if (!js.isUndefined(soft)) __obj.updateDynamic("soft")(soft.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def Fill(
    parts: js.Array[typings.prettier.prettierMod.doc.builders.Doc],
    `type`: typings.prettier.prettierStrings.fill
  ): _Doc = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def LineSuffixBoundary(`type`: `line-suffix-boundary`): _Doc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def Group(
    break: Boolean,
    contents: typings.prettier.prettierMod.doc.builders.Doc,
    expandedStates: js.Array[typings.prettier.prettierMod.doc.builders.Doc],
    `type`: typings.prettier.prettierStrings.group
  ): _Doc = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], expandedStates = expandedStates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def BreakParent(`type`: `break-parent`): _Doc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def IfBreak(
    breakContents: typings.prettier.prettierMod.doc.builders.Doc,
    flatContents: typings.prettier.prettierMod.doc.builders.Doc,
    `type`: `if-break`
  ): _Doc = {
    val __obj = js.Dynamic.literal(breakContents = breakContents.asInstanceOf[js.Any], flatContents = flatContents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
}

