package typings
package saneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object saneMod {
  type AnymatchMatcher = java.lang.String | stdLib.RegExp | (js.Function1[/* repeated */ java.lang.String, scala.Boolean])
  type Watcher = SaneWatcher
}
