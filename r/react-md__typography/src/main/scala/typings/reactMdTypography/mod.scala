package typings.reactMdTypography

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdTypography.srOnlyMod.SrOnlyProps
import typings.reactMdTypography.textContainerMod.TextContainerProps
import typings.reactMdTypography.textMod.TextElement
import typings.reactMdTypography.textMod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/typography", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * This component is used to create text that is only visible to screen readers.
    * If you enable the `focusable` prop, the text will become visible to all users
    * while focused.
    */
  val SrOnly: ForwardRefExoticComponent[SrOnlyProps with RefAttributes[TextElement]] = js.native
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
  val Text: ForwardRefExoticComponent[TextProps with RefAttributes[TextElement]] = js.native
  val TextContainer: ForwardRefExoticComponent[
    TextContainerProps with (RefAttributes[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
    ])
  ] = js.native
}

