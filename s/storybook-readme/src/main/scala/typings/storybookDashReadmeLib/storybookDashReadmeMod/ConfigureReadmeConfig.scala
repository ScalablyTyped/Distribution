package typings
package storybookDashReadmeLib.storybookDashReadmeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigureReadmeConfig extends js.Object {
  var footer: java.lang.String
  var header: java.lang.String
  def DocPreview(props: storybookDashReadmeLib.Anon_Children): reactLib.reactMod.ReactNs.ReactNode
  def FooterPreview(props: storybookDashReadmeLib.Anon_Children): reactLib.reactMod.ReactNs.ReactNode
  def HeaderPreview(props: storybookDashReadmeLib.Anon_Children): reactLib.reactMod.ReactNs.ReactNode
  def StoryPreview(props: storybookDashReadmeLib.Anon_Children): reactLib.reactMod.ReactNs.ReactNode
}

object ConfigureReadmeConfig {
  @scala.inline
  def apply(
    DocPreview: storybookDashReadmeLib.Anon_Children => reactLib.reactMod.ReactNs.ReactNode,
    FooterPreview: storybookDashReadmeLib.Anon_Children => reactLib.reactMod.ReactNs.ReactNode,
    HeaderPreview: storybookDashReadmeLib.Anon_Children => reactLib.reactMod.ReactNs.ReactNode,
    StoryPreview: storybookDashReadmeLib.Anon_Children => reactLib.reactMod.ReactNs.ReactNode,
    footer: java.lang.String,
    header: java.lang.String
  ): ConfigureReadmeConfig = {
    val __obj = js.Dynamic.literal(DocPreview = js.Any.fromFunction1(DocPreview), FooterPreview = js.Any.fromFunction1(FooterPreview), HeaderPreview = js.Any.fromFunction1(HeaderPreview), StoryPreview = js.Any.fromFunction1(StoryPreview), footer = footer, header = header)
  
    __obj.asInstanceOf[ConfigureReadmeConfig]
  }
}

