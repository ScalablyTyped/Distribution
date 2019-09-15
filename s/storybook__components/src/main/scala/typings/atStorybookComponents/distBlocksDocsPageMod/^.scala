package typings.atStorybookComponents.distBlocksDocsPageMod

import typings.atEmotionStyledDashBase.atEmotionStyledDashBaseMod.StyledComponent
import typings.atStorybookTheming.distTypesMod.Theme
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components/dist/blocks/DocsPage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DocsContent: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    Pick[
      DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 254 */ js.Any
    ], 
    Theme
  ] = js.native
  /**
    * An out-of-the box documentation page for components that shows the
    * title & subtitle and a collection of blocks including `Description`,
    * and `Preview`s for each of the component's stories.
    */
  val DocsPage: FunctionComponent[DocsPageProps] = js.native
  val DocsPageWrapper: FunctionComponent[js.Object] = js.native
  val DocsWrapper: StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], js.Object, Theme] = js.native
}

