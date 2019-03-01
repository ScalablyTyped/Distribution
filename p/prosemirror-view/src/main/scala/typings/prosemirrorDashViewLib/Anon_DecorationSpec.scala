package typings
package prosemirrorDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DecorationSpec extends js.Object {
  var onRemove: js.UndefOr[
    (js.Function1[
      /* decorationSpec */ org.scalablytyped.runtime.StringDictionary[js.Any], 
      scala.Unit
    ]) | scala.Null
  ] = js.undefined
}

object Anon_DecorationSpec {
  @scala.inline
  def apply(
    onRemove: js.Function1[
      /* decorationSpec */ org.scalablytyped.runtime.StringDictionary[js.Any], 
      scala.Unit
    ] = null
  ): Anon_DecorationSpec = {
    val __obj = js.Dynamic.literal()
    if (onRemove != null) __obj.updateDynamic("onRemove")(onRemove)
    __obj.asInstanceOf[Anon_DecorationSpec]
  }
}

