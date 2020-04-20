package typings.rbx.fileMod

import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/form/file.FileVariablesOverrides, rbx.rbx/elements/form/file.FileVariablesDefaults> */
trait FileVariables extends js.Object {
  var alignments: centered | right
  var sizes: small | medium | large
}

object FileVariables {
  @scala.inline
  def apply(alignments: centered | right, sizes: small | medium | large): FileVariables = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileVariables]
  }
}

