package typings
package sparklyLib.sparklyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sparkly", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Generate sparklines `▁▂▃▅▂▇`.
  @param numbers - Numbers to create the sparkline from.
  @example
  ```
  const sparkly = require('sparkly');
  sparkly([0, 3, 5, 8, 4, 3, 4, 10]);
  //=> '▁▃▄▇▄▃▄█'
  // Specifying anything other than finite numbers will cause holes
  sparkly([0, 3, 5, '', 4, 3, 4, 10]);
  //=> '▁▃▄ ▄▃▄█'
  // Specifying an object with minimum and maximum options will change the sparkline range
  sparkly([1, 2, 3, 4, 5], {minimum: 0, maximum: 10});
  //=> '▁▂▃▄▄'
  ```
  */
  def apply(numbers: js.Array[scala.Double | sparklyLib.sparklyLibStrings.Empty]): java.lang.String = js.native
  def apply(numbers: js.Array[scala.Double | sparklyLib.sparklyLibStrings.Empty], options: Options): java.lang.String = js.native
}

