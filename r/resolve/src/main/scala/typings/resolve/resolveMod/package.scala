package typings.resolve

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resolveMod {
  /**
    * Callback invoked when checking if a file exists
    *
    * @param error
    * @param isFile If the given file exists
    */
  type isFileCallback = js.Function2[/* err */ Error | Null, /* isFile */ js.UndefOr[Boolean], Unit]
  /**
    * Callback invoked when reading a file
    *
    * @param error
    * @param isFile If the given file exists
    */
  type readFileCallback = js.Function2[/* err */ Error | Null, /* file */ js.UndefOr[Buffer], Unit]
  /**
    * Callback invoked when resolving asynchronously
    *
    * @param error
    * @param resolved Absolute path to resolved identifier
    */
  type resolveCallback = js.Function3[
    /* err */ Error | Null, 
    /* resolved */ js.UndefOr[String], 
    /* pkg */ js.UndefOr[PackageMeta], 
    Unit
  ]
}
