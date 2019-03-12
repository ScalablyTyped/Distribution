package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "Inline")
@js.native
class Inline ()
  extends BaseNode[org.scalablytyped.runtime.StringDictionary[js.Any]]
     with _Node {
  @JSName("nodes")
  var nodes_Inline: immutableLib.immutableMod.List[Inline | Text] = js.native
  @JSName("object")
  var object_Inline: slateLib.slateLibStrings.`inline` = js.native
  def toJSON(): InlineJSON = js.native
}

/* static members */
@JSImport("slate", "Inline")
@js.native
object Inline extends js.Object {
  def create(properties: java.lang.String): slateLib.slateMod.Inline = js.native
  def create(properties: slateLib.slateMod.Inline): slateLib.slateMod.Inline = js.native
  def create(properties: slateLib.slateMod.InlineProperties): slateLib.slateMod.Inline = js.native
  def createList(): immutableLib.immutableMod.List[slateLib.slateMod.Inline] = js.native
  def createList(array: js.Array[slateLib.slateMod.Inline | slateLib.slateMod.InlineProperties | java.lang.String]): immutableLib.immutableMod.List[slateLib.slateMod.Inline] = js.native
  def fromJS(properties: slateLib.slateMod.Inline): slateLib.slateMod.Inline = js.native
  def fromJS(properties: slateLib.slateMod.InlineJSON): slateLib.slateMod.Inline = js.native
  def fromJSON(properties: slateLib.slateMod.Inline): slateLib.slateMod.Inline = js.native
  def fromJSON(properties: slateLib.slateMod.InlineJSON): slateLib.slateMod.Inline = js.native
  def isInline(maybeInline: js.Any): /* is slate.slate.Inline */ scala.Boolean = js.native
  def isInlineList(maybeInlineList: js.Any): /* is immutable.immutable.List<slate.slate.Inline> */ scala.Boolean = js.native
}

