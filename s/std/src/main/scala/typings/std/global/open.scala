package typings.std.global

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("open")
@js.native
object open extends js.Object {
  def apply(): Window | Null = js.native
  def apply(url: java.lang.String): Window | Null = js.native
  def apply(url: java.lang.String, target: java.lang.String): Window | Null = js.native
  def apply(url: java.lang.String, target: java.lang.String, features: java.lang.String): Window | Null = js.native
  def apply(
    url: java.lang.String,
    target: java.lang.String,
    features: java.lang.String,
    replace: scala.Boolean
  ): Window | Null = js.native
}

