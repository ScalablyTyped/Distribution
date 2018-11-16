package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", JSImport.Namespace)
@js.native
object protobufjsModMembers extends js.Object {
  val build: java.lang.String = js.native
  def common(name: java.lang.String, json: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def configure(): scala.Unit = js.native
  def decoder(mtype: Type): protobufjsLib.Codegen = js.native
  def encoder(mtype: Type): protobufjsLib.Codegen = js.native
  def load(filename: java.lang.String): stdLib.Promise[Root] = js.native
  def load(filename: java.lang.String, callback: protobufjsLib.LoadCallback): scala.Unit = js.native
  def load(filename: java.lang.String, root: Root): stdLib.Promise[Root] = js.native
  def load(filename: java.lang.String, root: Root, callback: protobufjsLib.LoadCallback): scala.Unit = js.native
  def load(filename: js.Array[java.lang.String]): stdLib.Promise[Root] = js.native
  def load(filename: js.Array[java.lang.String], callback: protobufjsLib.LoadCallback): scala.Unit = js.native
  def load(filename: js.Array[java.lang.String], root: Root): stdLib.Promise[Root] = js.native
  def load(filename: js.Array[java.lang.String], root: Root, callback: protobufjsLib.LoadCallback): scala.Unit = js.native
  def loadSync(filename: java.lang.String): Root = js.native
  def loadSync(filename: java.lang.String, root: Root): Root = js.native
  def loadSync(filename: js.Array[java.lang.String]): Root = js.native
  def loadSync(filename: js.Array[java.lang.String], root: Root): Root = js.native
  def parse(source: java.lang.String): IParserResult = js.native
  def parse(source: java.lang.String, options: IParseOptions): IParserResult = js.native
  def parse(source: java.lang.String, root: Root): IParserResult = js.native
  def parse(source: java.lang.String, root: Root, options: IParseOptions): IParserResult = js.native
  def tokenize(source: java.lang.String, alternateCommentMode: scala.Boolean): ITokenizerHandle = js.native
  def verifier(mtype: Type): protobufjsLib.Codegen = js.native
}

