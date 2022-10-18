package typings.storybookAddons.distTs3Dot9TypesMod

import typings.react.mod.ReactElement
import typings.storybookAddons.distTs3Dot9Mod.Addon
import typings.storybookAddons.distTs3Dot9Mod.RenderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientApiAddon[StoryFnReturnType]
  extends StObject
     with Addon {
  
  @JSName("apply")
  def apply(a: StoryApi[StoryFnReturnType], b: js.Array[Any]): Any
}
object ClientApiAddon {
  
  inline def apply[StoryFnReturnType](
    apply: (StoryApi[StoryFnReturnType], js.Array[Any]) => Any,
    render: RenderOptions => ReactElement,
    title: js.Function0[String] | String
  ): ClientApiAddon[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), render = js.Any.fromFunction1(render), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientApiAddon[StoryFnReturnType]]
  }
  
  extension [Self <: ClientApiAddon[?], StoryFnReturnType](x: Self & ClientApiAddon[StoryFnReturnType]) {
    
    inline def setApply(value: (StoryApi[StoryFnReturnType], js.Array[Any]) => Any): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
  }
}
