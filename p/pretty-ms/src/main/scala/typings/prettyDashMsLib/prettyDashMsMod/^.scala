package typings
package prettyDashMsLib.prettyDashMsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-ms", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Convert milliseconds to a human readable string: `1337000000` → `15d 11h 23m 20s`.
  @param milliseconds - Milliseconds to humanize.
  @example
  ```
  import prettyMilliseconds = require('pretty-ms');
  prettyMilliseconds(1337000000);
  //=> '15d 11h 23m 20s'
  prettyMilliseconds(1337);
  //=> '1.3s'
  prettyMilliseconds(133);
  //=> '133ms'
  // `compact` option
  prettyMilliseconds(1337, {compact: true});
  //=> '~1s'
  // `verbose` option
  prettyMilliseconds(1335669000, {verbose: true});
  //=> '15 days 11 hours 1 minute 9 seconds'
  // `formatSubMilliseconds` option
  prettyMilliseconds(100.400080, {formatSubMilliseconds: true})
  //=> '100ms 400µs 80ns'
  // Can be useful for time durations
  prettyMilliseconds(new Date(2014, 0, 1, 10, 40) - new Date(2014, 0, 1, 10, 5))
  //=> '35m'
  ```
  */
  def apply(milliseconds: scala.Double): java.lang.String = js.native
  def apply(milliseconds: scala.Double, options: Options): java.lang.String = js.native
}

