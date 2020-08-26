package typings.prettier.mod.doc.builders

import typings.prettier.anon.Type
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
  def LineSuffix_(contents: Doc, `type`: `line-suffix`): _Doc = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def Align_(contents: Doc, n: Double | String | Type, `type`: typings.prettier.prettierStrings.align): _Doc = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def Trim_(`type`: typings.prettier.prettierStrings.trim): _Doc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def Indent_(contents: Doc, `type`: typings.prettier.prettierStrings.indent): _Doc = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def Fill_(parts: js.Array[Doc], `type`: typings.prettier.prettierStrings.fill): _Doc = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def LineSuffixBoundary_(`type`: `line-suffix-boundary`): _Doc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def Concat_(parts: js.Array[Doc], `type`: typings.prettier.prettierStrings.concat): _Doc = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def Cursor_(placeholder: js.Symbol, `type`: typings.prettier.prettierStrings.cursor): _Doc = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def Group_(
    break: Boolean,
    contents: Doc,
    expandedStates: js.Array[Doc],
    `type`: typings.prettier.prettierStrings.group
  ): _Doc = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], expandedStates = expandedStates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def IfBreak_(breakContents: Doc, flatContents: Doc, `type`: `if-break`): _Doc = {
    val __obj = js.Dynamic.literal(breakContents = breakContents.asInstanceOf[js.Any], flatContents = flatContents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def BreakParent_(`type`: `break-parent`): _Doc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
  @scala.inline
  def Line_(`type`: typings.prettier.prettierStrings.line): _Doc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Doc]
  }
}

