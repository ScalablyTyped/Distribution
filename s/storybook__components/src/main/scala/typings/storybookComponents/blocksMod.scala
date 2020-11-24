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
import typings.storybookComponents.previewMod.PreviewProps
import typings.storybookComponents.sourceMod.SourceProps
import typings.storybookComponents.storyMod.StoryProps
import typings.storybookComponents.tabbedArgsTableMod.TabbedArgsTableProps
import typings.storybookComponents.typesetMod.TypesetProps
import typings.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/blocks", JSImport.Namespace)
@js.native
object blocksMod extends js.Object {
  
  val ArgsTable: FC[ArgsTableProps] = js.native
  
  val ColorItem: FunctionComponent[ColorProps] = js.native
  
  val ColorPalette: FunctionComponent[js.Object] = js.native
  
  val Description: FunctionComponent[DescriptionProps] = js.native
  
  val DocsContent: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  val DocsPageWrapper: FC[js.Object] = js.native
  
  val DocsWrapper: StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], js.Object, Theme] = js.native
  
  val IconGallery: FunctionComponent[js.Object] = js.native
  
  val IconItem: FunctionComponent[IconItemProps] = js.native
  
  def NoControlsWarning(): Element = js.native
  
  /**
    * A preview component for showing one or more component `Story`
    * items. The preview also shows the source for the component
    * as a drop-down.
    */
  val Preview: FunctionComponent[PreviewProps] = js.native
  
  /**
    * Syntax-highlighted source code for a component (or anything!)
    */
  val Source: FunctionComponent[SourceProps] = js.native
  
  /**
    * A story element, either rendered inline or in an iframe,
    * with configurable height.
    */
  val Story: FunctionComponent[StoryProps with Error] = js.native
  
  val Subtitle: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    js.Object, 
    Theme
  ] = js.native
  
  val TabbedArgsTable: FC[TabbedArgsTableProps] = js.native
  
  val TableWrapper: StyledComponent[
    DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
    Compact, 
    Theme
  ] = js.native
  
  val Title: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    js.Object, 
    Theme
  ] = js.native
  
  val Typeset: FunctionComponent[TypesetProps] = js.native
  
  @js.native
  object ArgsTableError extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.storybookComponents.argsTableArgsTableMod.ArgsTableError with String] = js.native
    
    /* "Args unsupported. See Args documentation for your framework." */ val ARGS_UNSUPPORTED: typings.storybookComponents.argsTableArgsTableMod.ArgsTableError.ARGS_UNSUPPORTED with String = js.native
    
    /* "No component found." */ val NO_COMPONENT: typings.storybookComponents.argsTableArgsTableMod.ArgsTableError.NO_COMPONENT with String = js.native
  }
  
  @js.native
  class IFrame ()
    extends typings.storybookComponents.iframeMod.IFrame
  
  @js.native
  object SourceError extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.storybookComponents.sourceMod.SourceError with String] = js.native
    
    /* "There\\u2019s no story here." */ val NO_STORY: typings.storybookComponents.sourceMod.SourceError.NO_STORY with String = js.native
    
    /* "Oh no! The source is not available." */ val SOURCE_UNAVAILABLE: typings.storybookComponents.sourceMod.SourceError.SOURCE_UNAVAILABLE with String = js.native
  }
  
  @js.native
  object StoryError extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.storybookComponents.storyMod.StoryError with String] = js.native
    
    /* "No component or story to display" */ val NO_STORY: typings.storybookComponents.storyMod.StoryError.NO_STORY with String = js.native
  }
}
