package typings.stormReactDiagrams.baseEntityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stormReactDiagrams.stormReactDiagramsStrings.node
  - typings.stormReactDiagrams.stormReactDiagramsStrings.link
  - typings.stormReactDiagrams.stormReactDiagramsStrings.port
  - typings.stormReactDiagrams.stormReactDiagramsStrings.point
*/
trait BaseEntityType extends js.Object

object BaseEntityType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def link: typings.stormReactDiagrams.stormReactDiagramsStrings.link = this.cast("link")
  @scala.inline
  def node: typings.stormReactDiagrams.stormReactDiagramsStrings.node = this.cast("node")
  @scala.inline
  def point: typings.stormReactDiagrams.stormReactDiagramsStrings.point = this.cast("point")
  @scala.inline
  def port: typings.stormReactDiagrams.stormReactDiagramsStrings.port = this.cast("port")
}

