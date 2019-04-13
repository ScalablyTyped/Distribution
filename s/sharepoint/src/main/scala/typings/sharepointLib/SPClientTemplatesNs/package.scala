package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SPClientTemplatesNs {
  /** Must return null in order to fall back to a more common template or to a system default template */
  type FieldCallback = js.Function1[/* renderContext */ RenderContext, java.lang.String]
  /** Must return null in order to fall back to a more common template or to a system default template */
  type FieldInFormCallback = js.Function1[/* renderContext */ RenderContext_FieldInForm, java.lang.String]
  /** Must return null in order to fall back to a more common template or to a system default template */
  type FieldInViewCallback = js.Function1[/* renderContext */ RenderContext_FieldInView, java.lang.String]
  type FieldTemplateMap = org.scalablytyped.runtime.StringDictionary[FieldTemplateOverrides]
  type FieldTemplates = org.scalablytyped.runtime.StringDictionary[FieldCallback]
  /** Must return null in order to fall back to a more common template or to a system default template */
  type GroupCallback = js.Function1[/* renderContext */ RenderContext_GroupInView, java.lang.String]
  type Item = org.scalablytyped.runtime.StringDictionary[js.Any]
  /** Must return null in order to fall back to a more common template or to a system default template */
  type ItemCallback = js.Function1[/* renderContext */ RenderContext, java.lang.String]
  type RenderCallback = js.Function1[/* ctx */ RenderContext, scala.Unit]
  /** Must return null in order to fall back to a more common template or to a system default template */
  type SingleTemplateCallback = js.Function1[/* renderContext */ RenderContext_InView, java.lang.String]
}
