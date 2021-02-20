package typings.storybookComponents

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.TableHTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLHeadingElement
import typings.std.HTMLTableElement
import typings.storybookComponents.anon.Compact
import typings.storybookComponents.anon.Error
import typings.storybookComponents.anon.PickDetailedHTMLPropsHTML
import typings.storybookComponents.argsTableArgsTableMod.ArgsTableProps
import typings.storybookComponents.colorPaletteMod.ColorProps
import typings.storybookComponents.descriptionMod.DescriptionProps
import typings.storybookComponents.iconGalleryMod.IconItemProps
import typings.storybookComponents.iframeMod.IFrameProps
import typings.storybookComponents.previewMod.PreviewProps
import typings.storybookComponents.sourceMod.SourceProps
import typings.storybookComponents.storyMod.StoryProps
import typings.storybookComponents.tabbedArgsTableMod.TabbedArgsTableProps
import typings.storybookComponents.typesetMod.TypesetProps
import typings.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blocksMod {
  
  @JSImport("@storybook/components/dist/blocks", "ArgsTable")
  @js.native
  val ArgsTable: FC[ArgsTableProps] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "ArgsTableError")
  @js.native
  object ArgsTableError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.storybookComponents.argsTableArgsTableMod.ArgsTableError with String] = js.native
    
    /* "Args unsupported. See Args documentation for your framework." */ val ARGS_UNSUPPORTED: typings.storybookComponents.argsTableArgsTableMod.ArgsTableError.ARGS_UNSUPPORTED with String = js.native
    
    /* "No component found." */ val NO_COMPONENT: typings.storybookComponents.argsTableArgsTableMod.ArgsTableError.NO_COMPONENT with String = js.native
  }
  
  @JSImport("@storybook/components/dist/blocks", "ColorItem")
  @js.native
  val ColorItem: FunctionComponent[ColorProps] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "ColorPalette")
  @js.native
  val ColorPalette: FunctionComponent[js.Object] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "Description")
  @js.native
  val Description: FunctionComponent[DescriptionProps] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "DocsContent")
  @js.native
  val DocsContent: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "DocsPageWrapper")
  @js.native
  val DocsPageWrapper: FC[js.Object] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "DocsWrapper")
  @js.native
  val DocsWrapper: StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], js.Object, Theme] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "IFrame")
  @js.native
  class IFrame protected ()
    extends typings.storybookComponents.iframeMod.IFrame {
    def this(props: IFrameProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IFrameProps, context: js.Any) = this()
  }
  
  @JSImport("@storybook/components/dist/blocks", "IconGallery")
  @js.native
  val IconGallery: FunctionComponent[js.Object] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "IconItem")
  @js.native
  val IconItem: FunctionComponent[IconItemProps] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "NoControlsWarning")
  @js.native
  def NoControlsWarning(): Element = js.native
  
  /**
    * A preview component for showing one or more component `Story`
    * items. The preview also shows the source for the component
    * as a drop-down.
    */
  @JSImport("@storybook/components/dist/blocks", "Preview")
  @js.native
  val Preview: FunctionComponent[PreviewProps] = js.native
  
  /**
    * Syntax-highlighted source code for a component (or anything!)
    */
  @JSImport("@storybook/components/dist/blocks", "Source")
  @js.native
  val Source: FunctionComponent[SourceProps] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "SourceError")
  @js.native
  object SourceError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.storybookComponents.sourceMod.SourceError with String] = js.native
    
    /* "There\\u2019s no story here." */ val NO_STORY: typings.storybookComponents.sourceMod.SourceError.NO_STORY with String = js.native
    
    /* "Oh no! The source is not available." */ val SOURCE_UNAVAILABLE: typings.storybookComponents.sourceMod.SourceError.SOURCE_UNAVAILABLE with String = js.native
  }
  
  /**
    * A story element, either rendered inline or in an iframe,
    * with configurable height.
    */
  @JSImport("@storybook/components/dist/blocks", "Story")
  @js.native
  val Story: FunctionComponent[StoryProps with Error] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "StoryError")
  @js.native
  object StoryError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.storybookComponents.storyMod.StoryError with String] = js.native
    
    /* "No component or story to display" */ val NO_STORY: typings.storybookComponents.storyMod.StoryError.NO_STORY with String = js.native
  }
  
  @JSImport("@storybook/components/dist/blocks", "Subtitle")
  @js.native
  val Subtitle: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    js.Object, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "TabbedArgsTable")
  @js.native
  val TabbedArgsTable: FC[TabbedArgsTableProps] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "TableWrapper")
  @js.native
  val TableWrapper: StyledComponent[
    DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
    Compact, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "Title")
  @js.native
  val Title: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    js.Object, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "Typeset")
  @js.native
  val Typeset: FunctionComponent[TypesetProps] = js.native
}
