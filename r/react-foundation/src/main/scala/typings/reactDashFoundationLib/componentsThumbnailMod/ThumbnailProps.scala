package typings
package reactDashFoundationLib.componentsThumbnailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactLib.reactMod.ReactNs.ImgHTMLAttributes because var conflicts: className. Inlined alt, crossOrigin, decoding, height, sizes, src, srcSet, useMap, width */ trait ThumbnailProps
  extends reactDashFoundationLib.utilsMod.FlexboxPropTypes {
  var alt: js.UndefOr[java.lang.String] = js.undefined
  var crossOrigin: js.UndefOr[
    reactLib.reactLibStrings.anonymous | reactLib.reactLibStrings.`use-credentials` | reactLib.reactLibStrings.Empty
  ] = js.undefined
  var decoding: js.UndefOr[
    reactLib.reactLibStrings.async | reactLib.reactLibStrings.auto | reactLib.reactLibStrings.sync
  ] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var sizes: js.UndefOr[java.lang.String] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var srcSet: js.UndefOr[java.lang.String] = js.undefined
  var useMap: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object ThumbnailProps {
  @scala.inline
  def apply(
    FlexboxPropTypes: reactDashFoundationLib.utilsMod.FlexboxPropTypes = null,
    ImgHTMLAttributes: reactLib.reactMod.ReactNs.ImgHTMLAttributes[stdLib.HTMLImageElement] = null
  ): ThumbnailProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, FlexboxPropTypes)
    js.Dynamic.global.Object.assign(__obj, ImgHTMLAttributes)
    __obj.asInstanceOf[ThumbnailProps]
  }
}

