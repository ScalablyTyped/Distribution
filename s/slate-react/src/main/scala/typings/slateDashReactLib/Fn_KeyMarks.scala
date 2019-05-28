package typings
package slateDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_KeyMarks extends js.Object {
  def apply(key: java.lang.String, offset: scala.Double, text: java.lang.String): slateLib.slateMod.Editor = js.native
  def apply(
    key: java.lang.String,
    offset: scala.Double,
    text: java.lang.String,
    marks: immutableLib.immutableMod.Set[slateLib.slateMod.Mark]
  ): slateLib.slateMod.Editor = js.native
  def apply(
    key: java.lang.String,
    offset: scala.Double,
    text: java.lang.String,
    marks: js.Array[slateLib.slateMod.Mark]
  ): slateLib.slateMod.Editor = js.native
}

