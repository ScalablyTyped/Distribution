package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Must return null in order to fall back to a more common template or to a system default template */
type FieldCallback = js.Function1[/* renderContext */ RenderContext, String]

/** Must return null in order to fall back to a more common template or to a system default template */
type FieldInFormCallback = js.Function1[/* renderContext */ RenderContextFieldInForm, String]

/** Must return null in order to fall back to a more common template or to a system default template */
type FieldInViewCallback = js.Function1[/* renderContext */ RenderContextFieldInView, String]

type FieldTemplateMap = StringDictionary[FieldTemplateOverrides]

type FieldTemplates = StringDictionary[FieldCallback]

/** Must return null in order to fall back to a more common template or to a system default template */
type GroupCallback = js.Function1[/* renderContext */ RenderContextGroupInView, String]

type Item = StringDictionary[Any]

/** Must return null in order to fall back to a more common template or to a system default template */
type ItemCallback = js.Function1[/* renderContext */ RenderContext, String]

type RenderCallback = js.Function1[/* ctx */ RenderContext, Unit]

/** Must return null in order to fall back to a more common template or to a system default template */
type SingleTemplateCallback = js.Function1[/* renderContext */ RenderContextInView, String]
