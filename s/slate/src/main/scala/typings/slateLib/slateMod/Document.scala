package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "Document")
@js.native
class Document[DataMap] () extends BaseNode[DataMap] {
  @JSName("nodes")
  var nodes_Document: immutableLib.immutableMod.List[Block] = js.native
  @JSName("object")
  var object_Document: slateLib.slateLibStrings.document = js.native
  def toJSON(): DocumentJSON = js.native
}

/* static members */
@JSImport("slate", "Document")
@js.native
object Document extends js.Object {
  def create(properties: immutableLib.immutableMod.List[slateLib.slateMod.Node]): slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def create(properties: js.Array[slateLib.slateMod.Node]): slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def create(properties: slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]]): slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def create(properties: slateLib.slateMod.DocumentProperties): slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def fromJS(properties: slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]]): slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def fromJS(properties: slateLib.slateMod.DocumentJSON): slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def fromJSON(properties: slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]]): slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def fromJSON(properties: slateLib.slateMod.DocumentJSON): slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def isDocument(maybeDocument: js.Any): /* is slate.slate.Document<{[key: string] : any}> */ scala.Boolean = js.native
}

