package typings.reactBulmaComponents

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.anon.Body
import typings.reactBulmaComponents.anon.Brand
import typings.reactBulmaComponents.anon.Column
import typings.reactBulmaComponents.anon.Divider
import typings.reactBulmaComponents.anon.Group
import typings.reactBulmaComponents.anon.GroupBulmaComponentWithoutRenderAs
import typings.reactBulmaComponents.anon.Header
import typings.reactBulmaComponents.anon.Item
import typings.reactBulmaComponents.anon.List
import typings.reactBulmaComponents.anon.Side
import typings.reactBulmaComponents.anon.TabBulmaComponent
import typings.reactBulmaComponents.anon.Text
import typings.reactBulmaComponents.anon.`0`
import typings.reactBulmaComponents.blockMod.ContentProps
import typings.reactBulmaComponents.breadcrumbMod.BreadcrumbProps
import typings.reactBulmaComponents.buttonMod.ButtonProps
import typings.reactBulmaComponents.columnsMod.ColumnGroupProps
import typings.reactBulmaComponents.componentsMod.BulmaComponent
import typings.reactBulmaComponents.componentsMod.BulmaComponentWithoutModifiers
import typings.reactBulmaComponents.componentsMod.BulmaComponentWithoutRenderAs
import typings.reactBulmaComponents.componentsMod.ElementProps
import typings.reactBulmaComponents.componentsMod.OmitKeys
import typings.reactBulmaComponents.containerMod.ContainerProps
import typings.reactBulmaComponents.dropdownMod.DropdownProps
import typings.reactBulmaComponents.formMod.CheckboxProps
import typings.reactBulmaComponents.formMod.ControlProps
import typings.reactBulmaComponents.formMod.FieldProps
import typings.reactBulmaComponents.formMod.HelpProps
import typings.reactBulmaComponents.formMod.InputFileProps
import typings.reactBulmaComponents.formMod.InputProps
import typings.reactBulmaComponents.formMod.LabelProps
import typings.reactBulmaComponents.formMod.RadioProps
import typings.reactBulmaComponents.formMod.SelectProps
import typings.reactBulmaComponents.formMod.TextareaProps
import typings.reactBulmaComponents.headingMod.HeadingProps
import typings.reactBulmaComponents.heroMod.HeroProps
import typings.reactBulmaComponents.iconMod.IconProps
import typings.reactBulmaComponents.imageMod.ImageProps
import typings.reactBulmaComponents.levelMod.LevelProps
import typings.reactBulmaComponents.messageMod.MessageProps
import typings.reactBulmaComponents.modalMod.ModalProps
import typings.reactBulmaComponents.navbarMod.NavbarProps
import typings.reactBulmaComponents.notificationMod.NotificationProps
import typings.reactBulmaComponents.paginationMod.PaginationProps
import typings.reactBulmaComponents.panelMod.PanelProps
import typings.reactBulmaComponents.progressMod.ProgressProps
import typings.reactBulmaComponents.reactBulmaComponentsStrings.article
import typings.reactBulmaComponents.reactBulmaComponentsStrings.aside
import typings.reactBulmaComponents.reactBulmaComponentsStrings.button
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.reactBulmaComponentsStrings.figure
import typings.reactBulmaComponents.reactBulmaComponentsStrings.h1
import typings.reactBulmaComponents.reactBulmaComponentsStrings.input
import typings.reactBulmaComponents.reactBulmaComponentsStrings.label
import typings.reactBulmaComponents.reactBulmaComponentsStrings.nav
import typings.reactBulmaComponents.reactBulmaComponentsStrings.p
import typings.reactBulmaComponents.reactBulmaComponentsStrings.progress
import typings.reactBulmaComponents.reactBulmaComponentsStrings.readonly
import typings.reactBulmaComponents.reactBulmaComponentsStrings.renderAs
import typings.reactBulmaComponents.reactBulmaComponentsStrings.section
import typings.reactBulmaComponents.reactBulmaComponentsStrings.select
import typings.reactBulmaComponents.reactBulmaComponentsStrings.span
import typings.reactBulmaComponents.reactBulmaComponentsStrings.table
import typings.reactBulmaComponents.reactBulmaComponentsStrings.textarea
import typings.reactBulmaComponents.sectionMod.SectionProps
import typings.reactBulmaComponents.tableMod.TableProps
import typings.reactBulmaComponents.tabsMod.TabsProps
import typings.reactBulmaComponents.tagMod.TagProps
import typings.reactBulmaComponents.tileMod.TileProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-bulma-components", "Block")
  @js.native
  val Block: BulmaComponent[ContentProps, div] = js.native
  
  @JSImport("react-bulma-components", "Box")
  @js.native
  val Box: BulmaComponent[js.Object, div] = js.native
  
  @JSImport("react-bulma-components", "Breadcrumb")
  @js.native
  val Breadcrumb: (BulmaComponent[BreadcrumbProps, nav]) & Item = js.native
  
  @JSImport("react-bulma-components", "Button")
  @js.native
  val Button: (BulmaComponent[ButtonProps, button]) & Group = js.native
  
  @JSImport("react-bulma-components", "Card")
  @js.native
  val Card: (BulmaComponent[js.Object, div]) & typings.reactBulmaComponents.anon.Content = js.native
  
  @JSImport("react-bulma-components", "Columns")
  @js.native
  val Columns: (BulmaComponent[ColumnGroupProps, div]) & Column = js.native
  
  @JSImport("react-bulma-components", "Container")
  @js.native
  val Container: BulmaComponent[ContainerProps, div] = js.native
  
  @JSImport("react-bulma-components", "Content")
  @js.native
  val Content: BulmaComponent[typings.reactBulmaComponents.contentMod.ContentProps, div] = js.native
  
  @JSImport("react-bulma-components", "Dropdown")
  @js.native
  val Dropdown: (js.Function1[
    /* props */ DropdownProps[Any] & (ElementProps[DropdownProps[Any], div]), 
    ReactElement
  ]) & Divider = js.native
  
  @JSImport("react-bulma-components", "Element")
  @js.native
  val Element: BulmaComponent[js.Object, div] = js.native
  
  @JSImport("react-bulma-components", "Footer")
  @js.native
  val Footer: BulmaComponent[js.Object, div] = js.native
  
  object Form {
    
    @JSImport("react-bulma-components", "Form")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Checkbox(props: OmitKeys[CheckboxProps & (ElementProps[CheckboxProps, input]), renderAs]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Checkbox")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("react-bulma-components", "Form.Control")
    @js.native
    def Control: BulmaComponent[ControlProps, div] = js.native
    inline def Control_=(x: BulmaComponent[ControlProps, div]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Control")(x.asInstanceOf[js.Any])
    
    @JSImport("react-bulma-components", "Form.Field")
    @js.native
    def Field: (BulmaComponent[FieldProps, div]) & Body = js.native
    inline def Field_=(x: (BulmaComponent[FieldProps, div]) & Body): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Field")(x.asInstanceOf[js.Any])
    
    @JSImport("react-bulma-components", "Form.Help")
    @js.native
    def Help: BulmaComponent[HelpProps, p] = js.native
    inline def Help_=(x: BulmaComponent[HelpProps, p]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Help")(x.asInstanceOf[js.Any])
    
    inline def Input[TValue](
      props: OmitKeys[
          InputProps[TValue] & (ElementProps[InputProps[TValue], input]), 
          renderAs | readonly
        ]
    ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Input")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("react-bulma-components", "Form.InputFile")
    @js.native
    def InputFile: BulmaComponent[InputFileProps, div] = js.native
    inline def InputFile_=(x: BulmaComponent[InputFileProps, div]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InputFile")(x.asInstanceOf[js.Any])
    
    @JSImport("react-bulma-components", "Form.Label")
    @js.native
    def Label: BulmaComponentWithoutRenderAs[LabelProps, label] = js.native
    inline def Label_=(x: BulmaComponentWithoutRenderAs[LabelProps, label]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Label")(x.asInstanceOf[js.Any])
    
    inline def Radio(props: OmitKeys[RadioProps & (ElementProps[RadioProps, input]), renderAs]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Radio")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    inline def Select[TValue](
      props: OmitKeys[
          SelectProps[TValue] & (ElementProps[SelectProps[TValue], select]), 
          renderAs | readonly
        ]
    ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Select")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    inline def Textarea(props: OmitKeys[TextareaProps & (ElementProps[TextareaProps, textarea]), renderAs | readonly]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Textarea")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  }
  
  @JSImport("react-bulma-components", "Heading")
  @js.native
  val Heading: BulmaComponent[HeadingProps, h1] = js.native
  
  @JSImport("react-bulma-components", "Hero")
  @js.native
  val Hero: (BulmaComponent[HeroProps, section]) & typings.reactBulmaComponents.anon.Footer = js.native
  
  @JSImport("react-bulma-components", "Icon")
  @js.native
  val Icon: (BulmaComponent[IconProps, span]) & Text = js.native
  
  @JSImport("react-bulma-components", "Image")
  @js.native
  val Image: BulmaComponentWithoutRenderAs[ImageProps, figure] = js.native
  
  @JSImport("react-bulma-components", "Level")
  @js.native
  val Level: (BulmaComponent[LevelProps, div]) & Side = js.native
  
  @JSImport("react-bulma-components", "Loader")
  @js.native
  val Loader: BulmaComponent[js.Object, div] = js.native
  
  @JSImport("react-bulma-components", "Media")
  @js.native
  val Media: (BulmaComponent[js.Object, article]) & `0` = js.native
  
  @JSImport("react-bulma-components", "Menu")
  @js.native
  val Menu: (BulmaComponent[js.Object, aside]) & List = js.native
  
  @JSImport("react-bulma-components", "Message")
  @js.native
  val Message: (BulmaComponent[MessageProps, article]) & Header = js.native
  
  @JSImport("react-bulma-components", "Modal")
  @js.native
  val Modal: BulmaComponentWithoutModifiers[ModalProps] & typings.reactBulmaComponents.anon.Card = js.native
  
  @JSImport("react-bulma-components", "Navbar")
  @js.native
  val Navbar: (BulmaComponent[NavbarProps, nav]) & Brand = js.native
  
  @JSImport("react-bulma-components", "Notification")
  @js.native
  val Notification: BulmaComponent[NotificationProps, div] = js.native
  
  @JSImport("react-bulma-components", "Pagination")
  @js.native
  val Pagination: BulmaComponent[PaginationProps, nav] = js.native
  
  @JSImport("react-bulma-components", "Panel")
  @js.native
  val Panel: (BulmaComponent[PanelProps, nav]) & typings.reactBulmaComponents.anon.Block = js.native
  
  @JSImport("react-bulma-components", "Progress")
  @js.native
  val Progress: BulmaComponentWithoutRenderAs[ProgressProps, progress] = js.native
  
  @JSImport("react-bulma-components", "Section")
  @js.native
  val Section: BulmaComponent[SectionProps, section] = js.native
  
  @JSImport("react-bulma-components", "Table")
  @js.native
  val Table: (BulmaComponentWithoutRenderAs[TableProps, table]) & typings.reactBulmaComponents.anon.Container = js.native
  
  @JSImport("react-bulma-components", "Tabs")
  @js.native
  val Tabs: (BulmaComponent[TabsProps, div]) & TabBulmaComponent = js.native
  
  @JSImport("react-bulma-components", "Tag")
  @js.native
  val Tag: (BulmaComponent[TagProps, span]) & GroupBulmaComponentWithoutRenderAs = js.native
  
  @JSImport("react-bulma-components", "Tile")
  @js.native
  val Tile: BulmaComponent[TileProps, div] = js.native
}
