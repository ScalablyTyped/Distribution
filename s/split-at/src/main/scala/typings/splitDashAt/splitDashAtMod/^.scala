package typings.splitDashAt.splitDashAtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("split-at", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Split a string at one or more indices.
  @param string - String to be split.
  @param index - One or more indices. A negative index is a 1-based position from the end of the string. For example, -1 is the index of the last place in the string. Duplicate indices are removed from the `index` array. A negative index and positive index that refer to the same position in the string are treated as duplicates.
  @example
  ```
  import splitAt = require('split-at');
  splitAt('unicorn', 2);
  //=> ['uni', 'corn']
  splitAt('unicorn', -2);
  //=> ['unico', 'rn']
  splitAt('unicorn&rainbow', [6, 7]);
  //=> ['unicorn', '&', 'rainbow']
  splitAt('unicorn&rainbow', 7, {remove: true});
  //=> ['unicorn', 'rainbow']
  ```
  */
  def apply(string: String, index: Double | js.Array[Double]): js.Array[String] = js.native
  def apply(string: String, index: Double | js.Array[Double], options: Options): js.Array[String] = js.native
}

