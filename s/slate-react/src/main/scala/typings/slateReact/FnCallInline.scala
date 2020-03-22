package typings.slateReact

import typings.slate.mod.Editor
import typings.slate.mod.Inline
import typings.slate.mod.InlineJSON
import typings.slate.mod.InlineProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallInline extends js.Object {
  def apply(`inline`: String): Editor = js.native
  def apply(`inline`: Inline): Editor = js.native
  def apply(`inline`: InlineJSON): Editor = js.native
  def apply(`inline`: InlineProperties): Editor = js.native
}

