package typings
package prexLib.outLibCancellationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VSCodeCancellationTokenLike extends js.Object {
  val isCancellationRequested: scala.Boolean
  def onCancellationRequested(listener: js.Function0[_]): prexLib.Anon_Dispose
}

