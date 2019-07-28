package typings.protobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.Codegen
import typings.protobufjs.protobufjsMod.IParseOptions
import typings.protobufjs.protobufjsMod.IParserResult
import typings.protobufjs.protobufjsMod.ITokenizerHandle
import typings.protobufjs.protobufjsMod.LoadCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/minimal", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val build: String = js.native
  def common(name: String, json: StringDictionary[js.Any]): Unit = js.native
  def configure(): Unit = js.native
  def decoder(mtype: typings.protobufjs.protobufjsMod.Type): Codegen = js.native
  def encoder(mtype: typings.protobufjs.protobufjsMod.Type): Codegen = js.native
  def load(filename: String): js.Promise[typings.protobufjs.protobufjsMod.Root] = js.native
  def load(filename: String, callback: LoadCallback): Unit = js.native
  def load(filename: String, root: typings.protobufjs.protobufjsMod.Root): js.Promise[typings.protobufjs.protobufjsMod.Root] = js.native
  def load(filename: String, root: typings.protobufjs.protobufjsMod.Root, callback: LoadCallback): Unit = js.native
  def load(filename: js.Array[String]): js.Promise[typings.protobufjs.protobufjsMod.Root] = js.native
  def load(filename: js.Array[String], callback: LoadCallback): Unit = js.native
  def load(filename: js.Array[String], root: typings.protobufjs.protobufjsMod.Root): js.Promise[typings.protobufjs.protobufjsMod.Root] = js.native
  def load(filename: js.Array[String], root: typings.protobufjs.protobufjsMod.Root, callback: LoadCallback): Unit = js.native
  def loadSync(filename: String): typings.protobufjs.protobufjsMod.Root = js.native
  def loadSync(filename: String, root: typings.protobufjs.protobufjsMod.Root): typings.protobufjs.protobufjsMod.Root = js.native
  def loadSync(filename: js.Array[String]): typings.protobufjs.protobufjsMod.Root = js.native
  def loadSync(filename: js.Array[String], root: typings.protobufjs.protobufjsMod.Root): typings.protobufjs.protobufjsMod.Root = js.native
  def parse(source: String): IParserResult = js.native
  def parse(source: String, options: IParseOptions): IParserResult = js.native
  def parse(source: String, root: typings.protobufjs.protobufjsMod.Root): IParserResult = js.native
  def parse(source: String, root: typings.protobufjs.protobufjsMod.Root, options: IParseOptions): IParserResult = js.native
  def tokenize(source: String, alternateCommentMode: Boolean): ITokenizerHandle = js.native
  def verifier(mtype: typings.protobufjs.protobufjsMod.Type): Codegen = js.native
}

