package typings.sourceMap.mod

import org.scalablytyped.runtime.TopLevel
import typings.sourceMap.anon.MappedPositionbiasnumberu
import typings.sourceMap.anon.Positionbiasnumberundefin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceMapConsumer extends js.Object {
  
  /**
    * Returns all generated line and column information for the original source,
    * line, and column provided. If no column is provided, returns all mappings
    * corresponding to a either the line we are searching for or the next
    * closest line that has any mappings. Otherwise, returns all mappings
    * corresponding to the given line and either the column we are searching for
    * or the next closest column that has any offsets.
    *
    * The only argument is an object with the following properties:
    *
    *   - source: The filename of the original source.
    *   - line: The line number in the original source.
    *   - column: Optional. the column number in the original source.
    *
    * and an array of objects is returned, each with the following properties:
    *
    *   - line: The line number in the generated source, or null.
    *   - column: The column number in the generated source, or null.
    */
  def allGeneratedPositionsFor(originalPosition: MappedPosition): js.Array[NullablePosition] = js.native
  
  /**
    * Compute the last column for each generated mapping. The last column is
    * inclusive.
    */
  def computeColumnSpans(): Unit = js.native
  
  /**
    * Free this source map consumer's associated wasm data that is manually-managed.
    * Alternatively, you can use SourceMapConsumer.with to avoid needing to remember to call destroy.
    */
  def destroy(): Unit = js.native
  
  /**
    * Iterate over each mapping between an original source/line/column and a
    * generated line/column in this source map.
    *
    * @param callback
    *        The function that is called with each mapping.
    * @param context
    *        Optional. If specified, this object will be the value of `this` every
    *        time that `aCallback` is called.
    * @param order
    *        Either `SourceMapConsumer.GENERATED_ORDER` or
    *        `SourceMapConsumer.ORIGINAL_ORDER`. Specifies whether you want to
    *        iterate over the mappings sorted by the generated file's line/column
    *        order or the original's source/line/column order, respectively. Defaults to
    *        `SourceMapConsumer.GENERATED_ORDER`.
    */
  def eachMapping(callback: js.Function1[/* mapping */ MappingItem, Unit]): Unit = js.native
  def eachMapping(
    callback: js.Function1[/* mapping */ MappingItem, Unit],
    context: js.UndefOr[scala.Nothing],
    order: Double
  ): Unit = js.native
  def eachMapping(callback: js.Function1[/* mapping */ MappingItem, Unit], context: js.Any): Unit = js.native
  def eachMapping(callback: js.Function1[/* mapping */ MappingItem, Unit], context: js.Any, order: Double): Unit = js.native
  
  /**
    * Returns the generated line and column information for the original source,
    * line, and column positions provided. The only argument is an object with
    * the following properties:
    *
    *   - source: The filename of the original source.
    *   - line: The line number in the original source.
    *   - column: The column number in the original source.
    *   - bias: Either 'SourceMapConsumer.GREATEST_LOWER_BOUND' or
    *     'SourceMapConsumer.LEAST_UPPER_BOUND'. Specifies whether to return the
    *     closest element that is smaller than or greater than the one we are
    *     searching for, respectively, if the exact element cannot be found.
    *     Defaults to 'SourceMapConsumer.GREATEST_LOWER_BOUND'.
    *
    * and an object is returned with the following properties:
    *
    *   - line: The line number in the generated source, or null.
    *   - column: The column number in the generated source, or null.
    */
  def generatedPositionFor(originalPosition: MappedPositionbiasnumberu): NullablePosition = js.native
  
  /**
    * Return true if we have the source content for every source in the source
    * map, false otherwise.
    */
  def hasContentsOfAllSources(): Boolean = js.native
  
  /**
    * Returns the original source, line, and column information for the generated
    * source's line and column positions provided. The only argument is an object
    * with the following properties:
    *
    *   - line: The line number in the generated source.
    *   - column: The column number in the generated source.
    *   - bias: Either 'SourceMapConsumer.GREATEST_LOWER_BOUND' or
    *     'SourceMapConsumer.LEAST_UPPER_BOUND'. Specifies whether to return the
    *     closest element that is smaller than or greater than the one we are
    *     searching for, respectively, if the exact element cannot be found.
    *     Defaults to 'SourceMapConsumer.GREATEST_LOWER_BOUND'.
    *
    * and an object is returned with the following properties:
    *
    *   - source: The original source file, or null.
    *   - line: The line number in the original source, or null.
    *   - column: The column number in the original source, or null.
    *   - name: The original identifier, or null.
    */
  def originalPositionFor(generatedPosition: Positionbiasnumberundefin): NullableMappedPosition = js.native
  
  /**
    * Returns the original source content. The only argument is the url of the
    * original source file. Returns null if no original source content is
    * available.
    */
  def sourceContentFor(source: String): String | Null = js.native
  def sourceContentFor(source: String, returnNullOnMissing: Boolean): String | Null = js.native
}
@JSImport("source-map", "SourceMapConsumer")
@js.native
object SourceMapConsumer extends TopLevel[SourceMapConsumerConstructor]
