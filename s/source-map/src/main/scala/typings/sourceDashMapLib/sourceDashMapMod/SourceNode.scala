package typings
package sourceDashMapLib.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("source-map", "SourceNode")
@js.native
class SourceNode () extends js.Object {
  def this(line: scala.Double) = this()
  def this(line: scala.Double, column: scala.Double) = this()
  def this(line: scala.Double, column: scala.Double, source: java.lang.String) = this()
  def this(line: scala.Double, column: scala.Double, source: java.lang.String, chunks: (js.Array[java.lang.String | SourceNode]) | SourceNode | java.lang.String) = this()
  def this(line: scala.Double, column: scala.Double, source: java.lang.String, chunks: (js.Array[java.lang.String | SourceNode]) | SourceNode | java.lang.String, name: java.lang.String) = this()
  var children: js.Array[SourceNode] = js.native
  var column: scala.Double = js.native
  var line: scala.Double = js.native
  var name: java.lang.String = js.native
  var source: java.lang.String = js.native
  var sourceContents: js.Any = js.native
  def add(chunk: java.lang.String): SourceNode = js.native
  def add(chunk: js.Array[java.lang.String | SourceNode]): SourceNode = js.native
  def add(chunk: SourceNode): SourceNode = js.native
  def join(sep: java.lang.String): SourceNode = js.native
  def prepend(chunk: java.lang.String): SourceNode = js.native
  def prepend(chunk: js.Array[java.lang.String | SourceNode]): SourceNode = js.native
  def prepend(chunk: SourceNode): SourceNode = js.native
  def replaceRight(pattern: java.lang.String, replacement: java.lang.String): SourceNode = js.native
  def setSourceContent(sourceFile: java.lang.String, sourceContent: java.lang.String): scala.Unit = js.native
  def toStringWithSourceMap(): CodeWithSourceMap = js.native
  def toStringWithSourceMap(startOfSourceMap: StartOfSourceMap): CodeWithSourceMap = js.native
  def walk(fn: js.Function2[/* chunk */ java.lang.String, /* mapping */ MappedPosition, scala.Unit]): scala.Unit = js.native
  def walkSourceContents(fn: js.Function2[/* file */ java.lang.String, /* content */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

@JSImport("source-map", "SourceNode")
@js.native
object SourceNode extends js.Object {
  def fromStringWithSourceMap(code: java.lang.String, sourceMapConsumer: sourceDashMapLib.sourceDashMapMod.SourceMapConsumer): sourceDashMapLib.sourceDashMapMod.SourceNode = js.native
  def fromStringWithSourceMap(
    code: java.lang.String,
    sourceMapConsumer: sourceDashMapLib.sourceDashMapMod.SourceMapConsumer,
    relativePath: java.lang.String
  ): sourceDashMapLib.sourceDashMapMod.SourceNode = js.native
}

