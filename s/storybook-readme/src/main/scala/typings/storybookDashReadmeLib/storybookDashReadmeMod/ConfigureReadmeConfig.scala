package typings
package storybookDashReadmeLib.storybookDashReadmeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigureReadmeConfig extends js.Object {
  var DocPreview: js.UndefOr[
    js.Function1[
      /* props */ storybookDashReadmeLib.Anon_Children, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var FooterPreview: js.UndefOr[
    js.Function1[
      /* props */ storybookDashReadmeLib.Anon_Children, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var HeaderPreview: js.UndefOr[
    js.Function1[
      /* props */ storybookDashReadmeLib.Anon_Children, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var StoryPreview: js.UndefOr[
    js.Function1[
      /* props */ storybookDashReadmeLib.Anon_Children, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var footer: js.UndefOr[java.lang.String] = js.undefined
  var header: js.UndefOr[java.lang.String] = js.undefined
}

object ConfigureReadmeConfig {
  @scala.inline
  def apply(
    DocPreview: /* props */ storybookDashReadmeLib.Anon_Children => reactLib.reactMod.ReactNs.ReactNode = null,
    FooterPreview: /* props */ storybookDashReadmeLib.Anon_Children => reactLib.reactMod.ReactNs.ReactNode = null,
    HeaderPreview: /* props */ storybookDashReadmeLib.Anon_Children => reactLib.reactMod.ReactNs.ReactNode = null,
    StoryPreview: /* props */ storybookDashReadmeLib.Anon_Children => reactLib.reactMod.ReactNs.ReactNode = null,
    footer: java.lang.String = null,
    header: java.lang.String = null
  ): ConfigureReadmeConfig = {
    val __obj = js.Dynamic.literal()
    if (DocPreview != null) __obj.updateDynamic("DocPreview")(js.Any.fromFunction1(DocPreview))
    if (FooterPreview != null) __obj.updateDynamic("FooterPreview")(js.Any.fromFunction1(FooterPreview))
    if (HeaderPreview != null) __obj.updateDynamic("HeaderPreview")(js.Any.fromFunction1(HeaderPreview))
    if (StoryPreview != null) __obj.updateDynamic("StoryPreview")(js.Any.fromFunction1(StoryPreview))
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (header != null) __obj.updateDynamic("header")(header)
    __obj.asInstanceOf[ConfigureReadmeConfig]
  }
}

