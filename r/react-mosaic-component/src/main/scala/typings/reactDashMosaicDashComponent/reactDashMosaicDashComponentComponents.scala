package typings.reactDashMosaicDashComponent

import typings.react.reactMod.ComponentType
import typings.react.reactMod.Global.JSX.LibraryManagedAttributes
import typings.reactDashMosaicDashComponent.libButtonsMosaicButtonMod.MosaicButtonProps
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicKey
import typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.additionalControlButtonText
import typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.additionalControls
import typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.className
import typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.connectDropTarget
import typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.createNode
import typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.draggable
import typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.draggedMosaicId
import typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.isOver
import typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.onDragEnd
import typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.onDragStart
import typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.path
import typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.renderPreview
import typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.renderToolbar
import typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.title
import typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.toolbarControls
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashMosaicDashComponentComponents extends reactDashMosaicDashComponentProps {
  @scala.inline
  def ExpandButton: ComponentType[MosaicButtonProps] = js.constructorOf[typings.reactDashMosaicDashComponent.libButtonsExpandButtonMod.ExpandButton].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashMosaicDashComponent.libButtonsMosaicButtonMod.MosaicButtonProps]]
  @scala.inline
  def InternalMosaicWindow[T /* <: MosaicKey */]: ComponentType[
    typings.reactDashMosaicDashComponent.libMosaicWindowMod.InternalMosaicWindowProps[T]
  ] = js.constructorOf[typings.reactDashMosaicDashComponent.libMosaicWindowMod.InternalMosaicWindow[T]].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashMosaicDashComponent.libMosaicWindowMod.InternalMosaicWindowProps[T]]]
  @scala.inline
  def Mosaic[T /* <: MosaicKey */]: ComponentType[typings.reactDashMosaicDashComponent.libMosaicMod.MosaicProps[T]] = js.constructorOf[typings.reactDashMosaicDashComponent.libMosaicMod.Mosaic[T]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashMosaicDashComponent.libMosaicMod.MosaicProps[T]]]
  @scala.inline
  def MosaicWindow[T /* <: MosaicKey */]: ComponentType[typings.reactDashMosaicDashComponent.libMosaicWindowMod.MosaicWindowProps[T]] = js.constructorOf[typings.reactDashMosaicDashComponent.libMosaicWindowMod.MosaicWindow[T]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashMosaicDashComponent.libMosaicWindowMod.MosaicWindowProps[T]]]
  @scala.inline
  def MosaicWithoutDragDropContext[T /* <: MosaicKey */]: ComponentType[typings.reactDashMosaicDashComponent.libMosaicMod.MosaicProps[T]] = js.constructorOf[typings.reactDashMosaicDashComponent.libMosaicMod.MosaicWithoutDragDropContext[T]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashMosaicDashComponent.libMosaicMod.MosaicProps[T]]]
  @scala.inline
  def MosaicZeroState[T /* <: MosaicKey */]: ComponentType[
    typings.reactDashMosaicDashComponent.libMosaicZeroStateMod.MosaicZeroStateProps[T]
  ] = js.constructorOf[typings.reactDashMosaicDashComponent.libMosaicZeroStateMod.MosaicZeroState[T]].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashMosaicDashComponent.libMosaicZeroStateMod.MosaicZeroStateProps[T]]]
  @scala.inline
  def RemoveButton: ComponentType[MosaicButtonProps] = js.constructorOf[typings.reactDashMosaicDashComponent.libButtonsRemoveButtonMod.RemoveButton].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashMosaicDashComponent.libButtonsMosaicButtonMod.MosaicButtonProps]]
  @scala.inline
  def ReplaceButton: ComponentType[MosaicButtonProps] = js.constructorOf[typings.reactDashMosaicDashComponent.libButtonsReplaceButtonMod.ReplaceButton].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashMosaicDashComponent.libButtonsMosaicButtonMod.MosaicButtonProps]]
  @scala.inline
  def Separator: ComponentType[js.Object] = js.constructorOf[typings.reactDashMosaicDashComponent.libButtonsSeparatorMod.Separator].asInstanceOf[typings.react.reactMod.ComponentType[js.Object]]
  @scala.inline
  def SourceConnectedInternalMosaicWindow: ComponentType[
    LibraryManagedAttributes[
      TypeofClassInternalMosaicWindow, 
      Pick[
        typings.reactDashMosaicDashComponent.libMosaicWindowMod.InternalMosaicWindowProps[js.Any | Double | String], 
        title | path | className | draggable | onDragEnd | onDragStart | createNode | connectDropTarget | isOver | draggedMosaicId | toolbarControls | additionalControls | additionalControlButtonText | renderPreview | renderToolbar
      ]
    ]
  ] = js.constructorOf[typings.reactDashMosaicDashComponent.libMosaicWindowMod.SourceConnectedInternalMosaicWindow].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.react.reactMod.Global.JSX.LibraryManagedAttributes[
    typings.reactDashMosaicDashComponent.TypeofClassInternalMosaicWindow, 
    typings.std.Pick[
      typings.reactDashMosaicDashComponent.libMosaicWindowMod.InternalMosaicWindowProps[js.Any | scala.Double | java.lang.String], 
      typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.title | typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.path | typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.className | typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.draggable | typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.onDragEnd | typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.onDragStart | typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.createNode | typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.connectDropTarget | typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.isOver | typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.draggedMosaicId | typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.toolbarControls | typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.additionalControls | typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.additionalControlButtonText | typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.renderPreview | typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentStrings.renderToolbar
    ]
  ]]]
  @scala.inline
  def SourceDropConnectedInternalMosaicWindow: ComponentType[LibraryManagedAttributes[js.Any, Pick[js.Any, scala.Nothing]]] = js.constructorOf[typings.reactDashMosaicDashComponent.libMosaicWindowMod.SourceDropConnectedInternalMosaicWindow].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.react.reactMod.Global.JSX.LibraryManagedAttributes[js.Any, typings.std.Pick[js.Any, scala.Nothing]]]]
  @scala.inline
  def SplitButton: ComponentType[MosaicButtonProps] = js.constructorOf[typings.reactDashMosaicDashComponent.libButtonsSplitButtonMod.SplitButton].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashMosaicDashComponent.libButtonsMosaicButtonMod.MosaicButtonProps]]
}

