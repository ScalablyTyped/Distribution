package typings.squirrelly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Blocks = typings.std.Record[java.lang.String, js.Function0[java.lang.String]]
  type SqrlFn = js.Function2[
    /* options */ typings.squirrelly.mod.TemplateOptions, 
    /* Sqrl */ js.Any, 
    java.lang.String
  ]
  type TemplateOptions = typings.std.Record[java.lang.String, java.lang.String | scala.Double]
}
