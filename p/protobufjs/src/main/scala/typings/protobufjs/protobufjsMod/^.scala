package typings.protobufjs.protobufjsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val build: String = js.native
  def common(name: String, json: StringDictionary[js.Any]): Unit = js.native
  def configure(): Unit = js.native
  def decoder(mtype: Type): Codegen = js.native
  def encoder(mtype: Type): Codegen = js.native
  def load(filename: String): js.Promise[Root] = js.native
  def load(filename: String, callback: LoadCallback): Unit = js.native
  def load(filename: String, root: Root): js.Promise[Root] = js.native
  def load(filename: String, root: Root, callback: LoadCallback): Unit = js.native
  def load(filename: js.Array[String]): js.Promise[Root] = js.native
  def load(filename: js.Array[String], callback: LoadCallback): Unit = js.native
  def load(filename: js.Array[String], root: Root): js.Promise[Root] = js.native
  def load(filename: js.Array[String], root: Root, callback: LoadCallback): Unit = js.native
  def loadSync(filename: String): Root = js.native
  def loadSync(filename: String, root: Root): Root = js.native
  def loadSync(filename: js.Array[String]): Root = js.native
  def loadSync(filename: js.Array[String], root: Root): Root = js.native
  def parse(source: String): IParserResult = js.native
  def parse(source: String, options: IParseOptions): IParserResult = js.native
  def parse(source: String, root: Root): IParserResult = js.native
  def parse(source: String, root: Root, options: IParseOptions): IParserResult = js.native
  def tokenize(source: String, alternateCommentMode: Boolean): ITokenizerHandle = js.native
  def verifier(mtype: Type): Codegen = js.native
}

