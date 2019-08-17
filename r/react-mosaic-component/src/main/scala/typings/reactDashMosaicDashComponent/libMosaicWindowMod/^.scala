package typings.reactDashMosaicDashComponent.libMosaicWindowMod

import typings.reactDashDnd.libDecoratorsInterfacesMod.DndComponentClass
import typings.reactDashMosaicDashComponent.TypeofClassInternalMosaicWindow
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

@JSImport("react-mosaic-component/lib/MosaicWindow", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val SourceConnectedInternalMosaicWindow: DndComponentClass[
    TypeofClassInternalMosaicWindow, 
    Pick[
      InternalMosaicWindowProps[js.Any | Double | String], 
      title | path | className | draggable | onDragEnd | onDragStart | createNode | connectDropTarget | isOver | draggedMosaicId | toolbarControls | additionalControls | additionalControlButtonText | renderPreview | renderToolbar
    ]
  ] = js.native
  val SourceDropConnectedInternalMosaicWindow: DndComponentClass[js.Any, Pick[js.Any, scala.Nothing]] = js.native
}

