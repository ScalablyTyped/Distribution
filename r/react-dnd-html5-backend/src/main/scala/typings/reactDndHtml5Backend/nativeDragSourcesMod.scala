package typings.reactDndHtml5Backend

import typings.reactDndHtml5Backend.nativeDragSourceMod.NativeDragSource
import typings.std.DataTransfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDragSourcesMod {
  
  @JSImport("react-dnd-html5-backend/lib/NativeDragSources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createNativeDragSource(`type`: String): NativeDragSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createNativeDragSource")(`type`.asInstanceOf[js.Any]).asInstanceOf[NativeDragSource]
  @scala.inline
  def createNativeDragSource(`type`: String, dataTransfer: DataTransfer): NativeDragSource = (^.asInstanceOf[js.Dynamic].applyDynamic("createNativeDragSource")(`type`.asInstanceOf[js.Any], dataTransfer.asInstanceOf[js.Any])).asInstanceOf[NativeDragSource]
  
  @scala.inline
  def matchNativeItemType(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("matchNativeItemType")().asInstanceOf[String | Null]
  @scala.inline
  def matchNativeItemType(dataTransfer: DataTransfer): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("matchNativeItemType")(dataTransfer.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
