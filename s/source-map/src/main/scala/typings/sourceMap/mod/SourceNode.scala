package typings.sourceMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("source-map", "SourceNode")
@js.native
class SourceNode () extends js.Object {
  def this(
    line: Double | Null,
    column: Double | Null,
    source: String | Null,
    chunks: js.UndefOr[(js.Array[String | SourceNode]) | SourceNode | String],
    name: js.UndefOr[String]
  ) = this()
  var children: js.Array[SourceNode] = js.native
  var column: Double = js.native
  var line: Double = js.native
  var name: String = js.native
  var source: String = js.native
  var sourceContents: js.Any = js.native
  def add(chunk: String): SourceNode = js.native
  def add(chunk: js.Array[String | SourceNode]): SourceNode = js.native
  def add(chunk: SourceNode): SourceNode = js.native
  def join(sep: String): SourceNode = js.native
  def prepend(chunk: String): SourceNode = js.native
  def prepend(chunk: js.Array[String | SourceNode]): SourceNode = js.native
  def prepend(chunk: SourceNode): SourceNode = js.native
  def replaceRight(pattern: String, replacement: String): SourceNode = js.native
  def setSourceContent(sourceFile: String, sourceContent: String): Unit = js.native
  def toStringWithSourceMap(): CodeWithSourceMap = js.native
  def toStringWithSourceMap(startOfSourceMap: StartOfSourceMap): CodeWithSourceMap = js.native
  def walk(fn: js.Function2[/* chunk */ String, /* mapping */ MappedPosition, Unit]): Unit = js.native
  def walkSourceContents(fn: js.Function2[/* file */ String, /* content */ String, Unit]): Unit = js.native
}

/* static members */
@JSImport("source-map", "SourceNode")
@js.native
object SourceNode extends js.Object {
  def fromStringWithSourceMap(code: String, sourceMapConsumer: SourceMapConsumer): SourceNode = js.native
  def fromStringWithSourceMap(code: String, sourceMapConsumer: SourceMapConsumer, relativePath: String): SourceNode = js.native
}

