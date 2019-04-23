package typings
package ssriLib.ssriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkData(data: java.lang.String, sri: java.lang.String): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: java.lang.String, sri: java.lang.String, opts: ssriLib.Anon_Algo1Algo2Error): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: java.lang.String, sri: HashLike): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: java.lang.String, sri: HashLike, opts: ssriLib.Anon_Algo1Algo2Error): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: java.lang.String, sri: IntegrityLike): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: java.lang.String, sri: IntegrityLike, opts: ssriLib.Anon_Algo1Algo2Error): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.Buffer, sri: java.lang.String): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.Buffer, sri: java.lang.String, opts: ssriLib.Anon_Algo1Algo2Error): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.Buffer, sri: HashLike): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.Buffer, sri: HashLike, opts: ssriLib.Anon_Algo1Algo2Error): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.Buffer, sri: IntegrityLike): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.Buffer, sri: IntegrityLike, opts: ssriLib.Anon_Algo1Algo2Error): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.NodeJSNs.TypedArray, sri: java.lang.String): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.NodeJSNs.TypedArray, sri: java.lang.String, opts: ssriLib.Anon_Algo1Algo2Error): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.NodeJSNs.TypedArray, sri: HashLike): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.NodeJSNs.TypedArray, sri: HashLike, opts: ssriLib.Anon_Algo1Algo2Error): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.NodeJSNs.TypedArray, sri: IntegrityLike): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkData(data: nodeLib.NodeJSNs.TypedArray, sri: IntegrityLike, opts: ssriLib.Anon_Algo1Algo2Error): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def checkStream(stream: nodeLib.streamMod.Readable, sri: java.lang.String): js.Promise[Hash] = js.native
  def checkStream(stream: nodeLib.streamMod.Readable, sri: java.lang.String, opts: ssriLib.Anon_Algo1Algo2Options): js.Promise[Hash] = js.native
  def checkStream(
    stream: nodeLib.streamMod.Readable,
    sri: java.lang.String,
    opts: ssriLib.Anon_Algo1Algo2OptionsPickAlgorithm
  ): js.Thenable[Hash] = js.native
  def checkStream(stream: nodeLib.streamMod.Readable, sri: HashLike): js.Promise[Hash] = js.native
  def checkStream(stream: nodeLib.streamMod.Readable, sri: HashLike, opts: ssriLib.Anon_Algo1Algo2Options): js.Promise[Hash] = js.native
  def checkStream(
    stream: nodeLib.streamMod.Readable,
    sri: HashLike,
    opts: ssriLib.Anon_Algo1Algo2OptionsPickAlgorithm
  ): js.Thenable[Hash] = js.native
  def checkStream(stream: nodeLib.streamMod.Readable, sri: IntegrityLike): js.Promise[Hash] = js.native
  def checkStream(stream: nodeLib.streamMod.Readable, sri: IntegrityLike, opts: ssriLib.Anon_Algo1Algo2Options): js.Promise[Hash] = js.native
  def checkStream(
    stream: nodeLib.streamMod.Readable,
    sri: IntegrityLike,
    opts: ssriLib.Anon_Algo1Algo2OptionsPickAlgorithm
  ): js.Thenable[Hash] = js.native
  @JSName("checkStream")
  def checkStream_Thenable(stream: nodeLib.streamMod.Readable, sri: java.lang.String): js.Thenable[Hash] = js.native
  @JSName("checkStream")
  def checkStream_Thenable(stream: nodeLib.streamMod.Readable, sri: HashLike): js.Thenable[Hash] = js.native
  @JSName("checkStream")
  def checkStream_Thenable(stream: nodeLib.streamMod.Readable, sri: IntegrityLike): js.Thenable[Hash] = js.native
  def create(): nodeLib.cryptoMod.Hash = js.native
  def create(opts: ssriLib.Anon_Algorithms): nodeLib.cryptoMod.Hash = js.native
  def fromData(data: java.lang.String): IntegrityMap = js.native
  def fromData(data: java.lang.String, opts: ssriLib.Anon_Algorithms): IntegrityMap = js.native
  def fromData(data: nodeLib.Buffer): IntegrityMap = js.native
  def fromData(data: nodeLib.Buffer, opts: ssriLib.Anon_Algorithms): IntegrityMap = js.native
  def fromData(data: nodeLib.NodeJSNs.TypedArray): IntegrityMap = js.native
  def fromData(data: nodeLib.NodeJSNs.TypedArray, opts: ssriLib.Anon_Algorithms): IntegrityMap = js.native
  def fromData(data: stdLib.DataView): IntegrityMap = js.native
  def fromData(data: stdLib.DataView, opts: ssriLib.Anon_Algorithms): IntegrityMap = js.native
  def fromHex(hexDigest: java.lang.String, algorithm: java.lang.String): IntegrityMap | Hash = js.native
  def fromHex(hexDigest: java.lang.String, algorithm: java.lang.String, opts: ssriLib.Anon_FalseOptions): IntegrityMap = js.native
  def fromHex(hexDigest: java.lang.String, algorithm: java.lang.String, opts: ssriLib.Anon_Options): Hash = js.native
  def fromHex(hexDigest: java.lang.String, algorithm: java.lang.String, opts: ssriLib.Anon_OptionsSingle): IntegrityMap | Hash = js.native
  @JSName("fromHex")
  def fromHex_Hash(hexDigest: java.lang.String, algorithm: java.lang.String): Hash = js.native
  @JSName("fromHex")
  def fromHex_IntegrityMap(hexDigest: java.lang.String, algorithm: java.lang.String): IntegrityMap = js.native
  def fromStream(stream: nodeLib.streamMod.Readable): js.Promise[IntegrityMap] = js.native
  def fromStream(stream: nodeLib.streamMod.Readable, opts: ssriLib.Anon_Algorithms): js.Promise[IntegrityMap] = js.native
  def fromStream(stream: nodeLib.streamMod.Readable, opts: ssriLib.Anon_AlgorithmsOptions): js.Thenable[IntegrityMap] = js.native
  @JSName("fromStream")
  def fromStream_Thenable(stream: nodeLib.streamMod.Readable): js.Thenable[IntegrityMap] = js.native
  def integrityStream(): nodeLib.streamMod.Transform = js.native
  def integrityStream(opts: ssriLib.Anon_Algo1Algo2Algorithms): nodeLib.streamMod.Transform = js.native
  def parse(sri: java.lang.String): IntegrityMap | Hash = js.native
  def parse(sri: java.lang.String, opts: ssriLib.Anon_False): IntegrityMap = js.native
  def parse(sri: java.lang.String, opts: ssriLib.Anon_Single): Hash = js.native
  def parse(sri: java.lang.String, opts: ssriLib.Anon_SingleStrict): IntegrityMap | Hash = js.native
  def parse(sri: HashLike): IntegrityMap | Hash = js.native
  def parse(sri: HashLike, opts: ssriLib.Anon_False): IntegrityMap = js.native
  def parse(sri: HashLike, opts: ssriLib.Anon_Single): Hash = js.native
  def parse(sri: HashLike, opts: ssriLib.Anon_SingleStrict): IntegrityMap | Hash = js.native
  def parse(sri: IntegrityLike): IntegrityMap | Hash = js.native
  def parse(sri: IntegrityLike, opts: ssriLib.Anon_False): IntegrityMap = js.native
  def parse(sri: IntegrityLike, opts: ssriLib.Anon_Single): Hash = js.native
  def parse(sri: IntegrityLike, opts: ssriLib.Anon_SingleStrict): IntegrityMap | Hash = js.native
  @JSName("parse")
  def parse_Hash(sri: java.lang.String): Hash = js.native
  @JSName("parse")
  def parse_Hash(sri: HashLike): Hash = js.native
  @JSName("parse")
  def parse_Hash(sri: IntegrityLike): Hash = js.native
  @JSName("parse")
  def parse_IntegrityMap(sri: java.lang.String): IntegrityMap = js.native
  @JSName("parse")
  def parse_IntegrityMap(sri: HashLike): IntegrityMap = js.native
  @JSName("parse")
  def parse_IntegrityMap(sri: IntegrityLike): IntegrityMap = js.native
  def stringify(obj: java.lang.String): java.lang.String = js.native
  def stringify(obj: java.lang.String, opts: ssriLib.Anon_Sep): java.lang.String = js.native
  def stringify(obj: HashLike): java.lang.String = js.native
  def stringify(obj: HashLike, opts: ssriLib.Anon_Sep): java.lang.String = js.native
  def stringify(obj: IntegrityLike): java.lang.String = js.native
  def stringify(obj: IntegrityLike, opts: ssriLib.Anon_Sep): java.lang.String = js.native
}

