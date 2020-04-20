package typings.riotjsDomBindings.mod

import typings.std.DocumentFragment
import typings.std.HTMLCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateChunkMeta extends js.Object {
  var avoidDOMInjection: Boolean
  var children: HTMLCollection
  var fragment: DocumentFragment
}

object TemplateChunkMeta {
  @scala.inline
  def apply(avoidDOMInjection: Boolean, children: HTMLCollection, fragment: DocumentFragment): TemplateChunkMeta = {
    val __obj = js.Dynamic.literal(avoidDOMInjection = avoidDOMInjection.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateChunkMeta]
  }
}

