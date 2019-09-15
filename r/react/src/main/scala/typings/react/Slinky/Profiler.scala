package typings.react.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.reactMod.ProfilerProps
import typings.react.reactMod.SchedulerInteraction
import typings.react.reactStrings.mount
import typings.react.reactStrings.update
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: id */
object Profiler
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.react.reactMod.^.Profiler.asInstanceOf[String | js.Object]
  def apply(
    onRender: (/* id */ String, /* phase */ mount | update, /* actualDuration */ Double, /* baseDuration */ Double, /* startTime */ Double, /* commitTime */ Double, /* interactions */ Set[SchedulerInteraction]) => Unit
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(onRender = js.Any.fromFunction7(onRender))
  
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ProfilerProps
}

