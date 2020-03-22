package typings.slateReact

import typings.slate.mod.Annotation
import typings.slate.mod.AnnotationJSON
import typings.slate.mod.AnnotationProperties
import typings.slate.mod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(annotation: Annotation): Editor = js.native
  def apply(annotation: AnnotationJSON): Editor = js.native
  def apply(annotation: AnnotationProperties): Editor = js.native
}

