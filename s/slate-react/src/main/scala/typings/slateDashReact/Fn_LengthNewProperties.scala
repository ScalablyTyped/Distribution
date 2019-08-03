package typings.slateDashReact

import typings.immutable.immutableMod.List
import typings.slate.slateMod.Editor
import typings.slate.slateMod.Mark
import typings.slate.slateMod.MarkJSON
import typings.slate.slateMod.MarkProperties
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_LengthNewProperties extends js.Object {
  def apply(path: List[Double], offset: Double, length: Double, properties: String, newProperties: String): Editor = js.native
  def apply(
    path: List[Double],
    offset: Double,
    length: Double,
    properties: String,
    newProperties: Partial[Mark | MarkJSON | MarkProperties]
  ): Editor = js.native
  def apply(path: List[Double], offset: Double, length: Double, properties: MarkJSON, newProperties: String): Editor = js.native
  def apply(
    path: List[Double],
    offset: Double,
    length: Double,
    properties: MarkJSON,
    newProperties: Partial[Mark | MarkJSON | MarkProperties]
  ): Editor = js.native
  def apply(
    path: List[Double],
    offset: Double,
    length: Double,
    properties: MarkProperties,
    newProperties: String
  ): Editor = js.native
  def apply(
    path: List[Double],
    offset: Double,
    length: Double,
    properties: MarkProperties,
    newProperties: Partial[Mark | MarkJSON | MarkProperties]
  ): Editor = js.native
  def apply(path: List[Double], offset: Double, length: Double, properties: Mark, newProperties: String): Editor = js.native
  def apply(
    path: List[Double],
    offset: Double,
    length: Double,
    properties: Mark,
    newProperties: Partial[Mark | MarkJSON | MarkProperties]
  ): Editor = js.native
}

