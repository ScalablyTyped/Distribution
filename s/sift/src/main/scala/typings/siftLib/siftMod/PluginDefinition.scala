package typings
package siftLib.siftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginDefinition[T]
  extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Function2[/* a */ T, /* b */ T, scala.Boolean | scala.Double]]

object PluginDefinition {
  @scala.inline
  def apply[T](
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Function2[/* a */ T, /* b */ T, scala.Boolean | scala.Double]] = null
  ): PluginDefinition[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PluginDefinition[T]]
  }
}

