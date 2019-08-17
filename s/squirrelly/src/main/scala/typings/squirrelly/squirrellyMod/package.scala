package typings.squirrelly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object squirrellyMod {
  import typings.std.Record

  type Blocks = Record[String, js.Function0[String]]
  type SqrlFn = js.Function2[/* options */ TemplateOptions, /* Sqrl */ js.Any, String]
  type TemplateOptions = Record[String, String | Double]
}
