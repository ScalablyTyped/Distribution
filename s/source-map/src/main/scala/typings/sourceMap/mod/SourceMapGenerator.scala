package typings.sourceMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("source-map", "SourceMapGenerator")
@js.native
class SourceMapGenerator () extends js.Object {
  def this(startOfSourceMap: StartOfSourceMap) = this()
  /**
    * Add a single mapping from original source line and column to the generated
    * source's line and column for this source map being created. The mapping
    * object should have the following properties:
    *
    *   - generated: An object with the generated line and column positions.
    *   - original: An object with the original line and column positions.
    *   - source: The original source file (relative to the sourceRoot).
    *   - name: An optional original token name for this mapping.
    */
  def addMapping(mapping: Mapping): Unit = js.native
  /**
    * Applies the mappings of a sub-source-map for a specific source file to the
    * source map being generated. Each mapping to the supplied source file is
    * rewritten using the supplied source map. Note: The resolution for the
    * resulting mappings is the minimium of this map and the supplied map.
    *
    * @param sourceMapConsumer The source map to be applied.
    * @param sourceFile Optional. The filename of the source file.
    *        If omitted, SourceMapConsumer's file property will be used.
    * @param sourceMapPath Optional. The dirname of the path to the source map
    *        to be applied. If relative, it is relative to the SourceMapConsumer.
    *        This parameter is needed when the two source maps aren't in the same
    *        directory, and the source map to be applied contains relative source
    *        paths. If so, those relative source paths need to be rewritten
    *        relative to the SourceMapGenerator.
    */
  def applySourceMap(sourceMapConsumer: SourceMapConsumer): Unit = js.native
  def applySourceMap(sourceMapConsumer: SourceMapConsumer, sourceFile: js.UndefOr[scala.Nothing], sourceMapPath: String): Unit = js.native
  def applySourceMap(sourceMapConsumer: SourceMapConsumer, sourceFile: String): Unit = js.native
  def applySourceMap(sourceMapConsumer: SourceMapConsumer, sourceFile: String, sourceMapPath: String): Unit = js.native
  /**
    * Set the source content for a source file.
    */
  def setSourceContent(sourceFile: String, sourceContent: String): Unit = js.native
  def toJSON(): RawSourceMap = js.native
}

/* static members */
@JSImport("source-map", "SourceMapGenerator")
@js.native
object SourceMapGenerator extends js.Object {
  /**
    * Creates a new SourceMapGenerator based on a SourceMapConsumer
    *
    * @param sourceMapConsumer The SourceMap.
    */
  def fromSourceMap(sourceMapConsumer: SourceMapConsumer): SourceMapGenerator = js.native
}

