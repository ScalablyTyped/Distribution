package typings.reactMdTypography.textMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Text` component is used to render text with the material design
  * typography styles applied.  By default, everything will be rendered in a
  * `<p>` tag with the normal paragraph styles.
  *
  * When the `type` prop is changed to another typography style, this component
  * will determine the "best" element to render the text in *unless* the
  * `component` prop is provided. The default mapping is:
  *
  * - `"headline-1" -> <h1>`
  * - `"headline-2" -> <h2>`
  * - `"headline-3" -> <h3>`
  * - `"headline-4" -> <h4>`
  * - `"headline-5" -> <h5>`
  * - `"headline-6" -> <h6>`
  * - `"subtitle-1" -> <h5>`
  * - `"subtitle-2" -> <h6>`
  * - `"body-1"     -> <p>`
  * - `"body-2"     -> <p>`
  * - `"caption"    -> <caption>`
  * - `"overline"   -> <span>`
  * - `"button"     -> <button>`
  *
  * NOTE: if the `component` prop is not `null`, this logic will be ignored and
  * the provided `component` will be used instead.
  */
@JSImport("@react-md/typography/types/Text", JSImport.Default)
@js.native
object default extends TopLevel[ForwardRefExoticComponent[TextProps with RefAttributes[TextElement]]]

