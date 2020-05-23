package typings.std.global.Intl

import typings.std.Intl.CollatorOptions
import typings.std.Intl.ResolvedCollatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.Collator")
@js.native
class CollatorCls ()
  extends typings.std.Intl.Collator {
  def this(locales: String) = this()
  def this(locales: js.Array[String]) = this()
  def this(locales: String, options: CollatorOptions) = this()
  def this(locales: js.Array[String], options: CollatorOptions) = this()
  /* CompleteClass */
  override def compare(x: String, y: String): Double = js.native
  /* CompleteClass */
  override def resolvedOptions(): ResolvedCollatorOptions = js.native
}

