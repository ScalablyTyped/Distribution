package typings
package protobufjsLib.minimalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/minimal", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val build: java.lang.String = js.native
  def common(name: java.lang.String, json: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def configure(): scala.Unit = js.native
  def decoder(mtype: protobufjsLib.protobufjsMod.Type): protobufjsLib.protobufjsMod.Codegen = js.native
  def encoder(mtype: protobufjsLib.protobufjsMod.Type): protobufjsLib.protobufjsMod.Codegen = js.native
  def load(filename: java.lang.String): js.Promise[protobufjsLib.protobufjsMod.Root] = js.native
  def load(filename: java.lang.String, callback: protobufjsLib.protobufjsMod.LoadCallback): scala.Unit = js.native
  def load(filename: java.lang.String, root: protobufjsLib.protobufjsMod.Root): js.Promise[protobufjsLib.protobufjsMod.Root] = js.native
  def load(
    filename: java.lang.String,
    root: protobufjsLib.protobufjsMod.Root,
    callback: protobufjsLib.protobufjsMod.LoadCallback
  ): scala.Unit = js.native
  def load(filename: js.Array[java.lang.String]): js.Promise[protobufjsLib.protobufjsMod.Root] = js.native
  def load(filename: js.Array[java.lang.String], callback: protobufjsLib.protobufjsMod.LoadCallback): scala.Unit = js.native
  def load(filename: js.Array[java.lang.String], root: protobufjsLib.protobufjsMod.Root): js.Promise[protobufjsLib.protobufjsMod.Root] = js.native
  def load(
    filename: js.Array[java.lang.String],
    root: protobufjsLib.protobufjsMod.Root,
    callback: protobufjsLib.protobufjsMod.LoadCallback
  ): scala.Unit = js.native
  def loadSync(filename: java.lang.String): protobufjsLib.protobufjsMod.Root = js.native
  def loadSync(filename: java.lang.String, root: protobufjsLib.protobufjsMod.Root): protobufjsLib.protobufjsMod.Root = js.native
  def loadSync(filename: js.Array[java.lang.String]): protobufjsLib.protobufjsMod.Root = js.native
  def loadSync(filename: js.Array[java.lang.String], root: protobufjsLib.protobufjsMod.Root): protobufjsLib.protobufjsMod.Root = js.native
  def parse(source: java.lang.String): protobufjsLib.protobufjsMod.IParserResult = js.native
  def parse(source: java.lang.String, options: protobufjsLib.protobufjsMod.IParseOptions): protobufjsLib.protobufjsMod.IParserResult = js.native
  def parse(source: java.lang.String, root: protobufjsLib.protobufjsMod.Root): protobufjsLib.protobufjsMod.IParserResult = js.native
  def parse(
    source: java.lang.String,
    root: protobufjsLib.protobufjsMod.Root,
    options: protobufjsLib.protobufjsMod.IParseOptions
  ): protobufjsLib.protobufjsMod.IParserResult = js.native
  def tokenize(source: java.lang.String, alternateCommentMode: scala.Boolean): protobufjsLib.protobufjsMod.ITokenizerHandle = js.native
  def verifier(mtype: protobufjsLib.protobufjsMod.Type): protobufjsLib.protobufjsMod.Codegen = js.native
}

