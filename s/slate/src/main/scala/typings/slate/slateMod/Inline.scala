package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.immutableMod.List
import typings.slate.slateStrings.`inline`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "Inline")
@js.native
class Inline ()
  extends BaseNode[StringDictionary[js.Any]]
     with _Node {
  @JSName("nodes")
  var nodes_Inline: List[Inline | Text] = js.native
  @JSName("object")
  var object_Inline: `inline` = js.native
  def toJSON(): InlineJSON = js.native
}

/* static members */
@JSImport("slate", "Inline")
@js.native
object Inline extends js.Object {
  def create(properties: String): Inline = js.native
  def create(properties: Inline): Inline = js.native
  def create(properties: InlineProperties): Inline = js.native
  def createList(): List[Inline] = js.native
  def createList(array: js.Array[Inline | InlineProperties | String]): List[Inline] = js.native
  def fromJS(properties: Inline): Inline = js.native
  def fromJS(properties: InlineJSON): Inline = js.native
  def fromJSON(properties: Inline): Inline = js.native
  def fromJSON(properties: InlineJSON): Inline = js.native
  def isInline(maybeInline: js.Any): /* is slate.slate.Inline */ Boolean = js.native
  def isInlineList(maybeInlineList: js.Any): /* is immutable.immutable.List<slate.slate.Inline> */ Boolean = js.native
}

