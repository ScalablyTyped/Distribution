package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SPClientTemplatesNs {
  import org.scalablytyped.runtime.StringDictionary

  /** Must return null in order to fall back to a more common template or to a system default template */
  type FieldCallback = js.Function1[/* renderContext */ RenderContext, String]
  /** Must return null in order to fall back to a more common template or to a system default template */
  type FieldInFormCallback = js.Function1[/* renderContext */ RenderContext_FieldInForm, String]
  /** Must return null in order to fall back to a more common template or to a system default template */
  type FieldInViewCallback = js.Function1[/* renderContext */ RenderContext_FieldInView, String]
  type FieldTemplateMap = StringDictionary[FieldTemplateOverrides]
  type FieldTemplates = StringDictionary[FieldCallback]
  /** Must return null in order to fall back to a more common template or to a system default template */
  type GroupCallback = js.Function1[/* renderContext */ RenderContext_GroupInView, String]
  type Item = StringDictionary[js.Any]
  /** Must return null in order to fall back to a more common template or to a system default template */
  type ItemCallback = js.Function1[/* renderContext */ RenderContext, String]
  type RenderCallback = js.Function1[/* ctx */ RenderContext, Unit]
  /** Must return null in order to fall back to a more common template or to a system default template */
  type SingleTemplateCallback = js.Function1[/* renderContext */ RenderContext_InView, String]
}
