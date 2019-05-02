package typings
package squirrellyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object squirrellyMod {
  type Blocks = stdLib.Record[java.lang.String, js.Function0[java.lang.String]]
  type SqrlFn = js.Function2[/* options */ TemplateOptions, /* Sqrl */ js.Any, java.lang.String]
  type TemplateOptions = stdLib.Record[java.lang.String, java.lang.String | scala.Double]
}
