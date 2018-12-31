package typings
package revealLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/hakimel/reveal.js/#dependencies
trait RevealDependency extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var condition: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var src: java.lang.String
}

