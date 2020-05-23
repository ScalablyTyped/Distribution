package typings.saxStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Size of internal transform stream buffer - defaults to 350 objects.
    */
  var highWaterMark: js.UndefOr[Double] = js.undefined
  /**
    * If true, then lowercase tag names and attribute names in loose mode, rather than uppercasing them.
    */
  var lowercase: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, then turn any whitespace into a single space.
    */
  var normalize: js.UndefOr[Boolean] = js.undefined
  /**
    * Default to false, if true makes sax parser to accept valid XML only.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, only parse predefined XML entities (&amp;, &apos;, &gt;, &lt;, and &quot;).
    */
  var strictEntities: js.UndefOr[Boolean] = js.undefined
  /**
    * Name of the tag to select objects from XML file, an Array of tag names can be used -
    * when multiple tags are specified stream pushes `{ tag, record }` tuples.
    */
  var tag: String | js.Array[String]
  /**
    * If false, then don't track line/col/position.
    */
  var trackPosition: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not to trim text and comment nodes.
    */
  var trim: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, then namespaces are supported.
    */
  var xmlns: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    tag: String | js.Array[String],
    highWaterMark: js.UndefOr[Double] = js.undefined,
    lowercase: js.UndefOr[Boolean] = js.undefined,
    normalize: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    strictEntities: js.UndefOr[Boolean] = js.undefined,
    trackPosition: js.UndefOr[Boolean] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined,
    xmlns: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    if (!js.isUndefined(highWaterMark)) __obj.updateDynamic("highWaterMark")(highWaterMark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lowercase)) __obj.updateDynamic("lowercase")(lowercase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strictEntities)) __obj.updateDynamic("strictEntities")(strictEntities.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trackPosition)) __obj.updateDynamic("trackPosition")(trackPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xmlns)) __obj.updateDynamic("xmlns")(xmlns.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

