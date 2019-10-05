package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.Collator")
@js.native
class CollatorCls () extends Collator {
  def this(locales: java.lang.String) = this()
  def this(locales: js.Array[java.lang.String]) = this()
  def this(locales: java.lang.String, options: CollatorOptions) = this()
  def this(locales: js.Array[java.lang.String], options: CollatorOptions) = this()
  /* CompleteClass */
  override def compare(x: java.lang.String, y: java.lang.String): Double = js.native
  /* CompleteClass */
  override def resolvedOptions(): ResolvedCollatorOptions = js.native
}

