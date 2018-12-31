package typings
package resolveLib.resolveMod.resolveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncOpts extends Opts {
  /** function to synchronously test whether a file exists */
  var isFile: js.UndefOr[js.Function1[/* file */ java.lang.String, scala.Boolean]] = js.undefined
  /** how to read files synchronously (defaults to fs.readFileSync) */
  var readFileSync: js.UndefOr[
    js.Function2[
      /* file */ java.lang.String, 
      /* charset */ java.lang.String, 
      java.lang.String | nodeLib.Buffer
    ]
  ] = js.undefined
}

