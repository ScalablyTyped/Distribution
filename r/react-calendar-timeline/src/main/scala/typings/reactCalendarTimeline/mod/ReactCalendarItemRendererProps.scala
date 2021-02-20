package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactCalendarItemRendererProps[CustomItem /* <: TimelineItemBase[_] */] extends StObject {
  
  def getItemProps(props: GetItemsProps): Key = js.native
  
  def getResizeProps(): ItemRendererGetResizePropsReturnType = js.native
  def getResizeProps(propsOverride: GetResizeProps): ItemRendererGetResizePropsReturnType = js.native
  
  var item: CustomItem = js.native
  
  var itemContext: ItemContext = js.native
}
