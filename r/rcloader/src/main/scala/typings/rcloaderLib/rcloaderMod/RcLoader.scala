package typings
package rcloaderLib.rcloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RcLoader extends js.Object {
  def `for`(path: java.lang.String): scala.Unit = js.native
  def `for`(
    path: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* fileOpts */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

