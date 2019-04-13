package typings
package promptsLib.promptsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var onCancel: js.UndefOr[
    js.Function2[/* prompt */ PromptObject[java.lang.String], /* answers */ js.Any, scala.Unit]
  ] = js.undefined
  var onSubmit: js.UndefOr[
    js.Function3[
      /* prompt */ PromptObject[java.lang.String], 
      /* answer */ js.Any, 
      /* answers */ js.Array[_], 
      scala.Unit
    ]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    onCancel: (/* prompt */ PromptObject[java.lang.String], /* answers */ js.Any) => scala.Unit = null,
    onSubmit: (/* prompt */ PromptObject[java.lang.String], /* answer */ js.Any, /* answers */ js.Array[_]) => scala.Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction2(onCancel))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction3(onSubmit))
    __obj.asInstanceOf[Options]
  }
}

