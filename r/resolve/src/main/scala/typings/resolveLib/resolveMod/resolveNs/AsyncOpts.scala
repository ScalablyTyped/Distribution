package typings
package resolveLib.resolveMod.resolveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncOpts extends Opts {
  /** function to asynchronously test whether a file exists */
  var isFile: js.UndefOr[
    js.Function2[/* file */ java.lang.String, /* cb */ resolveLib.isFileCallback, scala.Unit]
  ] = js.undefined
  /** how to read files asynchronously (defaults to fs.readFile) */
  var readFile: js.UndefOr[
    js.Function2[/* file */ java.lang.String, /* cb */ resolveLib.readFileCallback, scala.Unit]
  ] = js.undefined
}

