package typings.stripJsonComments.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strip-json-comments", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Strip comments from JSON. Lets you use comments in your JSON files!
  It will replace single-line comments `//` and multi-line comments `/ **\/` with whitespace. This allows JSON error positions to remain as close as possible to the original source.
  @param jsonString - Accepts a string with JSON.
  @returns A JSON string without comments.
  @example
  ```
  const json = `{
  	// Rainbows
  	"unicorn": "cake"
  }`;
  JSON.parse(stripJsonComments(json));
  //=> {unicorn: 'cake'}
  ```
  */
  def apply(jsonString: String): String = js.native
  def apply(jsonString: String, options: Options): String = js.native
}

