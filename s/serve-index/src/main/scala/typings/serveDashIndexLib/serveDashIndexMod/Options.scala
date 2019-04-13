package typings
package serveDashIndexLib.serveDashIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var filter: js.UndefOr[
    js.Function4[
      /* filename */ java.lang.String, 
      /* index */ scala.Double, 
      /* files */ js.Array[File], 
      /* dir */ java.lang.String, 
      scala.Boolean
    ]
  ] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var icons: js.UndefOr[scala.Boolean] = js.undefined
  var stylesheet: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[
    java.lang.String | (js.Function2[/* locals */ Locals, /* callback */ templateCallback, scala.Unit])
  ] = js.undefined
  var view: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    filter: (/* filename */ java.lang.String, /* index */ scala.Double, /* files */ js.Array[File], /* dir */ java.lang.String) => scala.Boolean = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    icons: js.UndefOr[scala.Boolean] = js.undefined,
    stylesheet: java.lang.String = null,
    template: java.lang.String | (js.Function2[/* locals */ Locals, /* callback */ templateCallback, scala.Unit]) = null,
    view: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction4(filter))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(icons)) __obj.updateDynamic("icons")(icons)
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[Options]
  }
}

