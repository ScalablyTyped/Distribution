package typings.ssri.ssriMod

import typings.node.Buffer
import typings.node.NodeJSNs.TypedArray
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.ssri.Anon_Algo1Algo2Algorithms
import typings.ssri.Anon_Algo1Algo2Error
import typings.ssri.Anon_Algo1Algo2Options
import typings.ssri.Anon_Algo1Algo2OptionsPickAlgorithm
import typings.ssri.Anon_Algorithms
import typings.ssri.Anon_AlgorithmsOptions
import typings.ssri.Anon_False
import typings.ssri.Anon_FalseOptions
import typings.ssri.Anon_Options
import typings.ssri.Anon_OptionsSingle
import typings.ssri.Anon_Sep
import typings.ssri.Anon_Single
import typings.ssri.Anon_SingleStrict
import typings.ssri.ssriNumbers.`false`
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkData(data: String, sri: String): Hash | `false` = js.native
  def checkData(data: String, sri: String, opts: Anon_Algo1Algo2Error): Hash | `false` = js.native
  def checkData(data: String, sri: HashLike): Hash | `false` = js.native
  def checkData(data: String, sri: HashLike, opts: Anon_Algo1Algo2Error): Hash | `false` = js.native
  def checkData(data: String, sri: IntegrityLike): Hash | `false` = js.native
  def checkData(data: String, sri: IntegrityLike, opts: Anon_Algo1Algo2Error): Hash | `false` = js.native
  def checkData(data: Buffer, sri: String): Hash | `false` = js.native
  def checkData(data: Buffer, sri: String, opts: Anon_Algo1Algo2Error): Hash | `false` = js.native
  def checkData(data: Buffer, sri: HashLike): Hash | `false` = js.native
  def checkData(data: Buffer, sri: HashLike, opts: Anon_Algo1Algo2Error): Hash | `false` = js.native
  def checkData(data: Buffer, sri: IntegrityLike): Hash | `false` = js.native
  def checkData(data: Buffer, sri: IntegrityLike, opts: Anon_Algo1Algo2Error): Hash | `false` = js.native
  def checkData(data: TypedArray, sri: String): Hash | `false` = js.native
  def checkData(data: TypedArray, sri: String, opts: Anon_Algo1Algo2Error): Hash | `false` = js.native
  def checkData(data: TypedArray, sri: HashLike): Hash | `false` = js.native
  def checkData(data: TypedArray, sri: HashLike, opts: Anon_Algo1Algo2Error): Hash | `false` = js.native
  def checkData(data: TypedArray, sri: IntegrityLike): Hash | `false` = js.native
  def checkData(data: TypedArray, sri: IntegrityLike, opts: Anon_Algo1Algo2Error): Hash | `false` = js.native
  def checkStream(stream: Readable, sri: String): js.Promise[Hash] = js.native
  def checkStream(stream: Readable, sri: String, opts: Anon_Algo1Algo2Options): js.Promise[Hash] = js.native
  def checkStream(stream: Readable, sri: String, opts: Anon_Algo1Algo2OptionsPickAlgorithm): js.Thenable[Hash] = js.native
  def checkStream(stream: Readable, sri: HashLike): js.Promise[Hash] = js.native
  def checkStream(stream: Readable, sri: HashLike, opts: Anon_Algo1Algo2Options): js.Promise[Hash] = js.native
  def checkStream(stream: Readable, sri: HashLike, opts: Anon_Algo1Algo2OptionsPickAlgorithm): js.Thenable[Hash] = js.native
  def checkStream(stream: Readable, sri: IntegrityLike): js.Promise[Hash] = js.native
  def checkStream(stream: Readable, sri: IntegrityLike, opts: Anon_Algo1Algo2Options): js.Promise[Hash] = js.native
  def checkStream(stream: Readable, sri: IntegrityLike, opts: Anon_Algo1Algo2OptionsPickAlgorithm): js.Thenable[Hash] = js.native
  @JSName("checkStream")
  def checkStream_Thenable(stream: Readable, sri: String): js.Thenable[Hash] = js.native
  @JSName("checkStream")
  def checkStream_Thenable(stream: Readable, sri: HashLike): js.Thenable[Hash] = js.native
  @JSName("checkStream")
  def checkStream_Thenable(stream: Readable, sri: IntegrityLike): js.Thenable[Hash] = js.native
  def create(): typings.node.cryptoMod.Hash = js.native
  def create(opts: Anon_Algorithms): typings.node.cryptoMod.Hash = js.native
  def fromData(data: String): IntegrityMap = js.native
  def fromData(data: String, opts: Anon_Algorithms): IntegrityMap = js.native
  def fromData(data: Buffer): IntegrityMap = js.native
  def fromData(data: Buffer, opts: Anon_Algorithms): IntegrityMap = js.native
  def fromData(data: TypedArray): IntegrityMap = js.native
  def fromData(data: TypedArray, opts: Anon_Algorithms): IntegrityMap = js.native
  def fromData(data: DataView): IntegrityMap = js.native
  def fromData(data: DataView, opts: Anon_Algorithms): IntegrityMap = js.native
  def fromHex(hexDigest: String, algorithm: String): IntegrityMap | Hash = js.native
  def fromHex(hexDigest: String, algorithm: String, opts: Anon_FalseOptions): IntegrityMap = js.native
  def fromHex(hexDigest: String, algorithm: String, opts: Anon_Options): Hash = js.native
  def fromHex(hexDigest: String, algorithm: String, opts: Anon_OptionsSingle): IntegrityMap | Hash = js.native
  @JSName("fromHex")
  def fromHex_Hash(hexDigest: String, algorithm: String): Hash = js.native
  @JSName("fromHex")
  def fromHex_IntegrityMap(hexDigest: String, algorithm: String): IntegrityMap = js.native
  def fromStream(stream: Readable): js.Promise[IntegrityMap] = js.native
  def fromStream(stream: Readable, opts: Anon_Algorithms): js.Promise[IntegrityMap] = js.native
  def fromStream(stream: Readable, opts: Anon_AlgorithmsOptions): js.Thenable[IntegrityMap] = js.native
  @JSName("fromStream")
  def fromStream_Thenable(stream: Readable): js.Thenable[IntegrityMap] = js.native
  def integrityStream(): Transform = js.native
  def integrityStream(opts: Anon_Algo1Algo2Algorithms): Transform = js.native
  def parse(sri: String): IntegrityMap | Hash = js.native
  def parse(sri: String, opts: Anon_False): IntegrityMap = js.native
  def parse(sri: String, opts: Anon_Single): Hash = js.native
  def parse(sri: String, opts: Anon_SingleStrict): IntegrityMap | Hash = js.native
  def parse(sri: HashLike): IntegrityMap | Hash = js.native
  def parse(sri: HashLike, opts: Anon_False): IntegrityMap = js.native
  def parse(sri: HashLike, opts: Anon_Single): Hash = js.native
  def parse(sri: HashLike, opts: Anon_SingleStrict): IntegrityMap | Hash = js.native
  def parse(sri: IntegrityLike): IntegrityMap | Hash = js.native
  def parse(sri: IntegrityLike, opts: Anon_False): IntegrityMap = js.native
  def parse(sri: IntegrityLike, opts: Anon_Single): Hash = js.native
  def parse(sri: IntegrityLike, opts: Anon_SingleStrict): IntegrityMap | Hash = js.native
  @JSName("parse")
  def parse_Hash(sri: String): Hash = js.native
  @JSName("parse")
  def parse_Hash(sri: HashLike): Hash = js.native
  @JSName("parse")
  def parse_Hash(sri: IntegrityLike): Hash = js.native
  @JSName("parse")
  def parse_IntegrityMap(sri: String): IntegrityMap = js.native
  @JSName("parse")
  def parse_IntegrityMap(sri: HashLike): IntegrityMap = js.native
  @JSName("parse")
  def parse_IntegrityMap(sri: IntegrityLike): IntegrityMap = js.native
  def stringify(obj: String): String = js.native
  def stringify(obj: String, opts: Anon_Sep): String = js.native
  def stringify(obj: HashLike): String = js.native
  def stringify(obj: HashLike, opts: Anon_Sep): String = js.native
  def stringify(obj: IntegrityLike): String = js.native
  def stringify(obj: IntegrityLike, opts: Anon_Sep): String = js.native
}

