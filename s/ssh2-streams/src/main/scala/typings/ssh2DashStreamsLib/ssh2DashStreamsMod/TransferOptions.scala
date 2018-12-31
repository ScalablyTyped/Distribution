package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferOptions extends js.Object {
  /**
    * Size of each read in bytes
    */
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of concurrent reads
    */
  var concurrency: js.UndefOr[scala.Double] = js.undefined
  /**
    * Called every time a part of a file was transferred
    */
  var step: js.UndefOr[
    js.Function3[
      /* total_transferred */ scala.Double, 
      /* chunk */ scala.Double, 
      /* total */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
}

