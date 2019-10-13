package typings.atStorybookComponents

import typings.atEmotionStyledDashBase.atEmotionStyledDashBaseMod.StyledComponent
import typings.atStorybookComponents.distBlocksColorPaletteMod.ColorProps
import typings.atStorybookComponents.distBlocksDescriptionMod.DescriptionProps
import typings.atStorybookComponents.distBlocksDocsPageMod.DocsPageProps
import typings.atStorybookComponents.distBlocksIconGalleryMod.IconItemProps
import typings.atStorybookComponents.distBlocksPreviewMod.PreviewProps
import typings.atStorybookComponents.distBlocksPropsTablePropsTableMod.PropsTableProps
import typings.atStorybookComponents.distBlocksSourceMod.SourceProps
import typings.atStorybookComponents.distBlocksStoryMod.StoryProps
import typings.atStorybookComponents.distBlocksTypesetMod.TypesetProps
import typings.atStorybookTheming.distTypesMod.Theme
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.TableHTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLTableElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components/dist/blocks", JSImport.Namespace)
@js.native
object distBlocksMod extends js.Object {
  @js.native
  class IFrame ()
    extends typings.atStorybookComponents.distBlocksIFrameMod.IFrame
  
  val ColorItem: FunctionComponent[ColorProps] = js.native
  val ColorPalette: FunctionComponent[js.Object] = js.native
  val Description: FunctionComponent[DescriptionProps] = js.native
  val DocsContent: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    Pick[
      DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 254 */ js.Any
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
  val IconGallery: FunctionComponent[js.Object] = js.native
  val IconItem: FunctionComponent[IconItemProps] = js.native
  /**
    * A preview component for showing one or more component `Story`
    * items. The preview also shows the source for the component
    * as a drop-down.
    */
  val Preview: FunctionComponent[PreviewProps] = js.native
  /**
    * Display the props for a component as a props table. Each row is a collection of
    * PropDefs, usually derived from docgen info for the component.
    */
  val PropsTable: FunctionComponent[PropsTableProps] = js.native
  /**
    * Syntax-highlighted source code for a component (or anything!)
    */
  val Source: FunctionComponent[SourceProps] = js.native
  /**
    * A story element, either renderend inline or in an iframe,
    * with configurable height.
    */
  val Story: FunctionComponent[StoryProps] = js.native
  val Table: StyledComponent[
    DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
    js.Object, 
    Theme
  ] = js.native
  val Typeset: FunctionComponent[TypesetProps] = js.native
  @js.native
  object PropsTableError extends js.Object {
    /* "No component found" */ val NO_COMPONENT: typings.atStorybookComponents.distBlocksPropsTablePropsTableMod.PropsTableError.NO_COMPONENT with String = js.native
    /* "Props unsupported. See Props documentation for your framework." */ val PROPS_UNSUPPORTED: typings.atStorybookComponents.distBlocksPropsTablePropsTableMod.PropsTableError.PROPS_UNSUPPORTED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.atStorybookComponents.distBlocksPropsTablePropsTableMod.PropsTableError with String
      ] = js.native
  }
  
  @js.native
  object SourceError extends js.Object {
    /* "There\\u2019s no story here." */ val NO_STORY: typings.atStorybookComponents.distBlocksSourceMod.SourceError.NO_STORY with String = js.native
    /* "Oh no! The source is not available." */ val SOURCE_UNAVAILABLE: typings.atStorybookComponents.distBlocksSourceMod.SourceError.SOURCE_UNAVAILABLE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.atStorybookComponents.distBlocksSourceMod.SourceError with String] = js.native
  }
  
  @js.native
  object StoryError extends js.Object {
    /* "No component or story to display" */ val NO_STORY: typings.atStorybookComponents.distBlocksStoryMod.StoryError.NO_STORY with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.atStorybookComponents.distBlocksStoryMod.StoryError with String] = js.native
  }
  
}

