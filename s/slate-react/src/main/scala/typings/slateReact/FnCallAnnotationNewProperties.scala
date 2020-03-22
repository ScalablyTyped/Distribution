package typings.slateReact

import typings.slate.mod.Annotation
import typings.slate.mod.AnnotationJSON
import typings.slate.mod.AnnotationProperties
import typings.slate.mod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallAnnotationNewProperties extends js.Object {
  def apply(annotation: Annotation, newProperties: Annotation): Editor = js.native
  def apply(annotation: Annotation, newProperties: AnnotationJSON): Editor = js.native
  def apply(annotation: Annotation, newProperties: AnnotationProperties): Editor = js.native
}

