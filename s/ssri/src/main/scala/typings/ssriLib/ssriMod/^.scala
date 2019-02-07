package typings
package ssriLib.ssriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkData(data: java.lang.String, sri: java.lang.String): ssriLib.ssriMod.Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: java.lang.String, sri: java.lang.String, opts: ssriLib.Anon_Algo1Algo2Error): ssriLib.ssriMod.Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: java.lang.String, sri: ssriLib.ssriMod.HashLike): ssriLib.ssriMod.Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: java.lang.String, sri: ssriLib.ssriMod.HashLike, opts: ssriLib.Anon_Algo1Algo2Error): ssriLib.ssriMod.Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: java.lang.String, sri: ssriLib.ssriMod.IntegrityLike): ssriLib.ssriMod.Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: java.lang.String, sri: ssriLib.ssriMod.IntegrityLike, opts: ssriLib.Anon_Algo1Algo2Error): ssriLib.ssriMod.Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.Buffer, sri: java.lang.String): ssriLib.ssriMod.Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.Buffer, sri: java.lang.String, opts: ssriLib.Anon_Algo1Algo2Error): ssriLib.ssriMod.Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.Buffer, sri: ssriLib.ssriMod.HashLike): ssriLib.ssriMod.Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.Buffer, sri: ssriLib.ssriMod.HashLike, opts: ssriLib.Anon_Algo1Algo2Error): ssriLib.ssriMod.Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.Buffer, sri: ssriLib.ssriMod.IntegrityLike): ssriLib.ssriMod.Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.Buffer, sri: ssriLib.ssriMod.IntegrityLike, opts: ssriLib.Anon_Algo1Algo2Error): ssriLib.ssriMod.Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.NodeJSNs.TypedArray, sri: java.lang.String): ssriLib.ssriMod.Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.NodeJSNs.TypedArray, sri: java.lang.String, opts: ssriLib.Anon_Algo1Algo2Error): ssriLib.ssriMod.Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.NodeJSNs.TypedArray, sri: ssriLib.ssriMod.HashLike): ssriLib.ssriMod.Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(
    data: nodeLib.NodeJSNs.TypedArray,
    sri: ssriLib.ssriMod.HashLike,
    opts: ssriLib.Anon_Algo1Algo2Error
  ): ssriLib.ssriMod.Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.NodeJSNs.TypedArray, sri: ssriLib.ssriMod.IntegrityLike): ssriLib.ssriMod.Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(
    data: nodeLib.NodeJSNs.TypedArray,
    sri: ssriLib.ssriMod.IntegrityLike,
    opts: ssriLib.Anon_Algo1Algo2Error
  ): ssriLib.ssriMod.Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkStream(stream: nodeLib.streamMod.Readable, sri: java.lang.String): js.Thenable[ssriLib.ssriMod.Hash] = js.native
  def checkStream(stream: nodeLib.streamMod.Readable, sri: java.lang.String, opts: ssriLib.Anon_Algo1Algo2Options): js.Thenable[ssriLib.ssriMod.Hash] = js.native
  def checkStream(stream: nodeLib.streamMod.Readable, sri: ssriLib.ssriMod.HashLike): js.Thenable[ssriLib.ssriMod.Hash] = js.native
  def checkStream(
    stream: nodeLib.streamMod.Readable,
    sri: ssriLib.ssriMod.HashLike,
    opts: ssriLib.Anon_Algo1Algo2Options
  ): js.Thenable[ssriLib.ssriMod.Hash] = js.native
  def checkStream(stream: nodeLib.streamMod.Readable, sri: ssriLib.ssriMod.IntegrityLike): js.Thenable[ssriLib.ssriMod.Hash] = js.native
  def checkStream(
    stream: nodeLib.streamMod.Readable,
    sri: ssriLib.ssriMod.IntegrityLike,
    opts: ssriLib.Anon_Algo1Algo2Options
  ): js.Thenable[ssriLib.ssriMod.Hash] = js.native
  def create(): nodeLib.cryptoMod.Hash = js.native
  def create(opts: ssriLib.Anon_Algorithms): nodeLib.cryptoMod.Hash = js.native
  def fromData(data: java.lang.String): ssriLib.ssriMod.IntegrityMap = js.native
  def fromData(data: java.lang.String, opts: ssriLib.Anon_Algorithms): ssriLib.ssriMod.IntegrityMap = js.native
  def fromData(data: nodeLib.Buffer): ssriLib.ssriMod.IntegrityMap = js.native
  def fromData(data: nodeLib.Buffer, opts: ssriLib.Anon_Algorithms): ssriLib.ssriMod.IntegrityMap = js.native
  def fromData(data: nodeLib.NodeJSNs.TypedArray): ssriLib.ssriMod.IntegrityMap = js.native
  def fromData(data: nodeLib.NodeJSNs.TypedArray, opts: ssriLib.Anon_Algorithms): ssriLib.ssriMod.IntegrityMap = js.native
  def fromData(data: stdLib.DataView): ssriLib.ssriMod.IntegrityMap = js.native
  def fromData(data: stdLib.DataView, opts: ssriLib.Anon_Algorithms): ssriLib.ssriMod.IntegrityMap = js.native
  def fromHex(hexDigest: java.lang.String, algorithm: java.lang.String): ssriLib.ssriMod.Hash = js.native
  def fromHex(hexDigest: java.lang.String, algorithm: java.lang.String, opts: ssriLib.Anon_Options): ssriLib.ssriMod.IntegrityMap = js.native
  def fromHex(hexDigest: java.lang.String, algorithm: java.lang.String, opts: ssriLib.Anon_OptionsSingle): ssriLib.ssriMod.Hash = js.native
  @JSName("fromHex")
  def fromHex_IntegrityMap(hexDigest: java.lang.String, algorithm: java.lang.String): ssriLib.ssriMod.IntegrityMap = js.native
  def fromStream(stream: nodeLib.streamMod.Readable): js.Thenable[ssriLib.ssriMod.IntegrityMap] = js.native
  def fromStream(stream: nodeLib.streamMod.Readable, opts: ssriLib.Anon_AlgorithmsOptions): js.Thenable[ssriLib.ssriMod.IntegrityMap] = js.native
  def integrityStream(): nodeLib.streamMod.Transform = js.native
  def integrityStream(opts: ssriLib.Anon_Algo1Algo2Algorithms): nodeLib.streamMod.Transform = js.native
  def parse(sri: java.lang.String): ssriLib.ssriMod.Hash = js.native
  def parse(sri: java.lang.String, opts: ssriLib.Anon_Single): ssriLib.ssriMod.Hash = js.native
  def parse(sri: java.lang.String, opts: ssriLib.Anon_Strict): ssriLib.ssriMod.IntegrityMap = js.native
  def parse(sri: ssriLib.ssriMod.HashLike): ssriLib.ssriMod.Hash = js.native
  def parse(sri: ssriLib.ssriMod.HashLike, opts: ssriLib.Anon_Single): ssriLib.ssriMod.Hash = js.native
  def parse(sri: ssriLib.ssriMod.HashLike, opts: ssriLib.Anon_Strict): ssriLib.ssriMod.IntegrityMap = js.native
  def parse(sri: ssriLib.ssriMod.IntegrityLike): ssriLib.ssriMod.Hash = js.native
  def parse(sri: ssriLib.ssriMod.IntegrityLike, opts: ssriLib.Anon_Single): ssriLib.ssriMod.Hash = js.native
  def parse(sri: ssriLib.ssriMod.IntegrityLike, opts: ssriLib.Anon_Strict): ssriLib.ssriMod.IntegrityMap = js.native
  @JSName("parse")
  def parse_IntegrityMap(sri: java.lang.String): ssriLib.ssriMod.IntegrityMap = js.native
  @JSName("parse")
  def parse_IntegrityMap(sri: ssriLib.ssriMod.HashLike): ssriLib.ssriMod.IntegrityMap = js.native
  @JSName("parse")
  def parse_IntegrityMap(sri: ssriLib.ssriMod.IntegrityLike): ssriLib.ssriMod.IntegrityMap = js.native
  def stringify(obj: java.lang.String): java.lang.String = js.native
  def stringify(obj: java.lang.String, opts: ssriLib.Anon_Sep): java.lang.String = js.native
  def stringify(obj: ssriLib.ssriMod.HashLike): java.lang.String = js.native
  def stringify(obj: ssriLib.ssriMod.HashLike, opts: ssriLib.Anon_Sep): java.lang.String = js.native
  def stringify(obj: ssriLib.ssriMod.IntegrityLike): java.lang.String = js.native
  def stringify(obj: ssriLib.ssriMod.IntegrityLike, opts: ssriLib.Anon_Sep): java.lang.String = js.native
}

