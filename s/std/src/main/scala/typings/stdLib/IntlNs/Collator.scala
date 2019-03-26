package typings
package stdLib.IntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collator extends js.Object {
  def compare(x: java.lang.String, y: java.lang.String): scala.Double
  def resolvedOptions(): ResolvedCollatorOptions
}

@JSGlobal("Intl.Collator")
@js.native
class CollatorCls () extends Collator {
  def this(locales: java.lang.String) = this()
  def this(locales: js.Array[java.lang.String]) = this()
  def this(locales: java.lang.String, options: CollatorOptions) = this()
  def this(locales: js.Array[java.lang.String], options: CollatorOptions) = this()
  /* CompleteClass */
  override def compare(x: java.lang.String, y: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def resolvedOptions(): ResolvedCollatorOptions = js.native
}

object Collator {
  @scala.inline
  def apply(
    compare: (java.lang.String, java.lang.String) => scala.Double,
    resolvedOptions: () => ResolvedCollatorOptions
  ): Collator = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
  
    __obj.asInstanceOf[Collator]
  }
}

