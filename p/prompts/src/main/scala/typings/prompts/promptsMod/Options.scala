package typings.prompts.promptsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var onCancel: js.UndefOr[js.Function2[/* prompt */ PromptObject[String], /* answers */ js.Any, Unit]] = js.undefined
  var onSubmit: js.UndefOr[
    js.Function3[
      /* prompt */ PromptObject[String], 
      /* answer */ js.Any, 
      /* answers */ js.Array[_], 
      Unit
    ]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    onCancel: (/* prompt */ PromptObject[String], /* answers */ js.Any) => Unit = null,
    onSubmit: (/* prompt */ PromptObject[String], /* answer */ js.Any, /* answers */ js.Array[_]) => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction2(onCancel))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction3(onSubmit))
    __obj.asInstanceOf[Options]
  }
}

