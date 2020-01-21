package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.puppeteer.puppeteerStrings.left
  - typings.puppeteer.puppeteerStrings.right
  - typings.puppeteer.puppeteerStrings.middle
*/
trait MouseButtons extends js.Object

object MouseButtons {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typings.puppeteer.puppeteerStrings.left = this.cast("left")
  @scala.inline
  def middle: typings.puppeteer.puppeteerStrings.middle = this.cast("middle")
  @scala.inline
  def right: typings.puppeteer.puppeteerStrings.right = this.cast("right")
}

