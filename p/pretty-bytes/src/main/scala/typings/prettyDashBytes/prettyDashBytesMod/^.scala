package typings.prettyDashBytes.prettyDashBytesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-bytes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Convert bytes to a human readable string: `1337` → `1.34 kB`.
  @param number - The number to format.
  @example
  ```
  import prettyBytes = require('pretty-bytes');
  prettyBytes(1337);
  //=> '1.34 kB'
  prettyBytes(100);
  //=> '100 B'
  // Display file size differences
  prettyBytes(42, {signed: true});
  //=> '+42 B'
  // Localized output using German locale
  prettyBytes(1337, {locale: 'de'});
  //=> '1,34 kB'
  ```
  */
  def apply(number: Double): String = js.native
  def apply(number: Double, options: Options): String = js.native
}

