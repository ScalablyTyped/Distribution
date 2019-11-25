package typings.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BuiltinEnabled extends js.Object {
  var builtinEnabled: Boolean
  var connector: js.UndefOr[
    js.Function4[
      /* level */ String, 
      /* category */ String, 
      /* label */ js.UndefOr[String], 
      /* content */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var level: js.UndefOr[String | Double] = js.undefined
}

object Anon_BuiltinEnabled {
  @scala.inline
  def apply(
    builtinEnabled: Boolean,
    connector: (/* level */ String, /* category */ String, /* label */ js.UndefOr[String], /* content */ js.Any) => Unit = null,
    level: String | Double = null
  ): Anon_BuiltinEnabled = {
    val __obj = js.Dynamic.literal(builtinEnabled = builtinEnabled.asInstanceOf[js.Any])
    if (connector != null) __obj.updateDynamic("connector")(js.Any.fromFunction4(connector))
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BuiltinEnabled]
  }
}

